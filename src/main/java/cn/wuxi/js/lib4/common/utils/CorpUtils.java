package cn.wuxi.js.lib4.common.utils;

/**
 * Created by aaronhuang on 2019/1/22.
 */
public class CorpUtils {

    /**
     * 统一社会信用代码转换成十位组织机构代码
     * @param tyshxydm
     * @return
     */
    public static String getZzjgdm(String tyshxydm) {
        String result = null;
        if(StringUtils.isNotEmpty(tyshxydm) && tyshxydm.length() == 18){
            result = tyshxydm.substring(8,16) + "-" + tyshxydm.substring(16,17);
        }
        return result;
    }

//    public static void main(String[] args) {
//        String str = "91210112001598155k";
//        String result = getZzjgdm(str);
//        System.out.print(result);
//    }


}
