
package cn.wuxi.js.lib4.modules.sys.web;

import cn.wuxi.js.lib4.common.web.BaseController;
import cn.wuxi.js.lib4.modules.sys.security.SystemAuthorizingRealm.Principal;
import cn.wuxi.js.lib4.modules.sys.utils.UserUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 密码找回Controller
 *
 * @author aaronhuang
 * @version 2019-02-11
 */
@Controller
public class ResetPasswordController extends BaseController {

    @RequestMapping(value = "${adminPath}/resetpassword", method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response, Model model) {


        return "modules/sys/sysLogin";
    }

    @RequestMapping(value = "${adminPath}/resetpassword", method = RequestMethod.POST)
    public String loginFail(HttpServletRequest request, HttpServletResponse response, Model model) {
        Principal principal = UserUtils.getPrincipal();


        return "modules/sys/sysLogin";
    }


}
