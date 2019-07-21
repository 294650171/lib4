package cn.wuxi.js.lib4.modules.notify;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

import cn.wuxi.js.lib4.common.config.Global;

public class AliyunMessageSender {
	
	protected static Logger logger = LoggerFactory.getLogger(AliyunMessageSender.class);
	
    //产品名称:云通信短信API产品,开发者无需替换
    static final String product = "Dysmsapi";
    //产品域名,开发者无需替换
    static final String domain = "dysmsapi.aliyuncs.com";

    // TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
    static final String accessKeyId = "LTAIb6N7vPOKj29M";
    static final String accessKeySecret = "FEF2PHALHIRBWBZJw4J3ZtQMMjkb04";
    
    static final String signName = "无锡市住建局";
    
    static final String templateCode = "SMS_171112521";
    
    static final String msgSystem = Global.getConfig("msgSystem");
    
    /*
    TemplateParam  {'system':"四库一平台",'item':"事项信息”，'result':‘处理结果信息“}，JSON
    ${system}通知，事项信息：${item}，处理信息：${result}
         【无锡市住建局】${system}通知，事项信息：${item}，处理信息：${result}
    */


	public AliyunMessageSender() {
		// TODO Auto-generated constructor stub
	}
	
    public static SendSmsResponse sendSms(String phone, String item,String result) throws ClientException {

        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(phone);
        //必填:短信签名-可在短信控制台中找到
        request.setSignName(signName);
        //必填:短信模板-可在短信控制台中找到
        request.setTemplateCode(templateCode);
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        request.setTemplateParam("{\"system\":\""+msgSystem+"\", \"item\":\""+item+"\", \"result\":\""+result+"\"}");

        //选填-上行短信扩展码(无特殊需求用户请忽略此字段)
        //request.setSmsUpExtendCode("90997");

        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
        //request.setOutId("yourOutId");

        //hint 此处可能会抛出异常，注意catch
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
        
        logger.debug("sms response, code:{}, message:{}",sendSmsResponse.getCode(), sendSmsResponse.getMessage());

        return sendSmsResponse;
    }

}
