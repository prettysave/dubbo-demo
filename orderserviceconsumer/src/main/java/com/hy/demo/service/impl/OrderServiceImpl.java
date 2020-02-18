package com.hy.demo.service.impl;

import com.hy.demo.Service.OrderService;
import com.hy.demo.Service.UserService;
import com.hy.demo.bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: heyong
 * @Date: 2020/2/17 18:20
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    public void initOrder(String userId) {
        System.out.println("initOrder 进来了");
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress address : addressList){
            System.out.println(address.getUserAddress());
        }
    }
}
