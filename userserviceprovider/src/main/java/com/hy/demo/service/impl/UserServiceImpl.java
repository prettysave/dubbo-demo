package com.hy.demo.service.impl;

import com.hy.demo.Service.UserService;
import com.hy.demo.bean.UserAddress;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: heyong
 * @Date: 2020/2/17 18:07
 * @Description:
 */
public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "这是地址1", "1", "大壮1", "号码1", "是");
        UserAddress address2 = new UserAddress(2, "这是地址2", "1", "大壮2", "号码2", "否");
        return Arrays.asList(address1, address2);
    }
}
