package com.hy.demo.Service;

import com.hy.demo.bean.UserAddress;

import java.util.List;

/**
 * @Auther: heyong
 * @Date: 2020/2/17 18:06
 * @Description:
 */
public interface UserService {

    /**
     * 根据用户ID返回所有的收获地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
