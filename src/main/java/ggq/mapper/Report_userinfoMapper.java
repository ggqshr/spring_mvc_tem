package ggq.mapper;

import ggq.model.Report_userinfo;

public interface Report_userinfoMapper {
    int insert(Report_userinfo record);

    int insertSelective(Report_userinfo record);

    Report_userinfo select();
}