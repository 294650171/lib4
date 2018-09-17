/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.cert.web;

import cn.wuxi.js.lib4.common.config.Global;
import cn.wuxi.js.lib4.common.mapper.JsonMapper;
import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.common.web.BaseController;
import cn.wuxi.js.lib4.crawler.mohurd.bean.PublicityItem;
import cn.wuxi.js.lib4.crawler.mohurd.bean.QualitySuperPublicityDetail;
import cn.wuxi.js.lib4.crawler.service.PresalePermitCrawler;
import cn.wuxi.js.lib4.crawler.service.StructureDeclarationCrawler;
import cn.wuxi.js.lib4.modules.cert.entity.CorpCert;
import cn.wuxi.js.lib4.modules.cert.service.CorpCertService;
import cn.wuxi.js.lib4.modules.crawler.entity.PresalePermitPub;
import cn.wuxi.js.lib4.modules.sys.entity.Result;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 无锡住建局 >> 公告公示 >> 质监公示
 */
@Controller
@RequestMapping(value = "${adminPath}/hcbpub/")
public class HCBPubController extends BaseController {

    @Autowired
    private StructureDeclarationCrawler crawler;

    @Autowired
    private PresalePermitCrawler presalePermitCrawler;


    @RequestMapping(value = "zjcrawler")
    @ResponseBody
    public String zjcrawler(HttpServletRequest request,
                            HttpServletResponse response, Model model) {

        logger.debug("begin to zjcrawler :");
        Result result = new Result();
        try {
            crawler.start();
        } catch (Exception e) {
            result.setMsg(e.getMessage());
        }

        return JsonMapper.getInstance().toJson(result);
    }

    @RequestMapping(value = "presalePermitCrawler")
    @ResponseBody
    public String presalePermitCrawler(HttpServletRequest request,
                                       HttpServletResponse response, Model model) {

        logger.debug("begin to presalePermitCrawler :");
        Result result = new Result();
        try {
            presalePermitCrawler.start();
        } catch (Exception e) {
            result.setMsg(e.getMessage());
        }

        return JsonMapper.getInstance().toJson(result);
    }

    @RequestMapping(value = "presalePermitSingle")
    @ResponseBody
    public String presalePermitSingle(HttpServletRequest request,
                                      HttpServletResponse response, Model model) {
        String url = request.getParameter("url");
        //url = "http://js.wuxi.gov.cn" + url;
        logger.info("begin to presalePermitSingle :" + url);
        Result result = new Result();
        presalePermitCrawler.crawlerSingle(url);

        return JsonMapper.getInstance().toJson(result);
    }


}