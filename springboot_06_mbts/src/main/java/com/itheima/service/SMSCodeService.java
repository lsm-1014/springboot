package com.itheima.service;

import com.itheima.dao.SMSCode;

public interface SMSCodeService {
    public String sendCodeToSMS(String tele);

    public Boolean checkCode(SMSCode code);
}
