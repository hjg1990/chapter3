package com.smart.dao;

import com.smart.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by hanjinge on 17/5/26.
 */

@Repository
public class LoginLogDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //保存登陆日志SQL
    private final static String INSERT_LOGIN_LOG_SQL= "INSERT INTO t_login_log (user_id,ip,login_datatime) VALUES(?,?,?)";

    public void insertLoginLog(LoginLog loginLog) {
        System.out.println("loginLog.getUserId()="+loginLog.getUserId());
        System.out.println("loginLog.getIp()="+loginLog.getIp());
        System.out.println("loginLog.getLoginDate()="+loginLog.getLoginDate());
        Object[] args = {loginLog.getUserId(), loginLog.getIp(),
                loginLog.getLoginDate() };
        jdbcTemplate.update(INSERT_LOGIN_LOG_SQL,args);
    }

}
