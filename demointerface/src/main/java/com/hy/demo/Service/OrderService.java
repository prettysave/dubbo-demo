package com.hy.demo.Service;

import com.hy.demo.bean.UserAddress;

import java.util.List;

public interface OrderService {

    /**
     * 初始化订单
     *
     * @param userid
     */
    public List<UserAddress> initOrder(String userid);
}
