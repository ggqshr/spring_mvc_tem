package ggq.service;

import ggq.mapper.Report_userinfoMapper;
import ggq.model.Report_userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ReportUserInfo")
public class ReportUserInfoImpl implements ReportUserInfo{
    @Autowired
    private Report_userinfoMapper report_userinfoMapper;

    @Override
    public Report_userinfo getUser() {
        return report_userinfoMapper.select();
    }
}
