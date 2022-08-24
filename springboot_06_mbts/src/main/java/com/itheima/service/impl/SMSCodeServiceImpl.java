package com.itheima.service.impl;

import com.itheima.dao.SMSCode;
import com.itheima.service.SMSCodeService;
import com.itheima.utils.UtilsCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    private UtilsCode utilsCode;

    @Override
    @CachePut(value = "smsCode",key = "#tele")
    public String sendCodeToSMS(String tele) {
        return utilsCode.generator(tele);
    }

    @Override
    public Boolean checkCode(SMSCode smsCode) {
        String code = smsCode.getCode();
        String cacheCode = utilsCode.get(smsCode.getTele());
        return code.equals(cacheCode);

    }
}
