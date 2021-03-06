package ggq.controller;

import com.alibaba.fastjson.JSON;
import ggq.model.Report_userinfo;
import ggq.service.ReportUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
    @Autowired
    ReportUserInfo reportUserInfo;

    @RequestMapping("/api/fake_chart_data")
    @ResponseBody
    public String test() {
        return "/html/test";
    }

    @RequestMapping("/api/reportUserInfo")
    @ResponseBody
    public String ReportInfo() {
        Report_userinfo user = reportUserInfo.getUser();
        return JSON.toJSONString(user);
    }
}
