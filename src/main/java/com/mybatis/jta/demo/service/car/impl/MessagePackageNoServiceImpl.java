package com.mybatis.jta.demo.service.car.impl;

import com.mybatis.jta.demo.dao.car_impl.MessagePackageNoDao;
import com.mybatis.jta.demo.entity.car.MessagePackageNo;
import com.mybatis.jta.demo.mapper.car.MessagePackageNoMapper;
import com.mybatis.jta.demo.service.car.MessagePackageNoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 消息包编号表 服务实现类
 * </p>
 *
 * @author liangxifneg
 */
@Service
public class MessagePackageNoServiceImpl  implements MessagePackageNoService {
    //@Autowired
    //private MessagePackageNoMapper messagePackageNoMapper;

    @Autowired
    private MessagePackageNoDao messagePackageNoDao ;


    public void insert(MessagePackageNo messagePackageNo){
        messagePackageNo.setCreateTime(null);
        messagePackageNoDao.insert(messagePackageNo);
    }
}