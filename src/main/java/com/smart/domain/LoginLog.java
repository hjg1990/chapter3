package com.smart.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by hanjinge on 17/5/26.
 */
public class LoginLog implements Serializable {

    private int loginLogId;
    private int userId;
    private String ip;
    private Date loginDate;

    public int getLoginLogId() {
        return loginLogId;
    }

    public LoginLog setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
        return this;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public LoginLog setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

}
