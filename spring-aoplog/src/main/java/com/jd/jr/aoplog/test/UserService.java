package com.jd.jr.aoplog.test;

/**
 * Created with IntelliJ IDEA.
 * User: yangkuan
 * Date: 15-4-12
 * Time: 下午10:58
 * To change this template use File | Settings | File Templates.
 */
public class UserService {
    public UserVo createUser(UserVo vo){
           vo.setAge(vo.getAge()+1);
        return vo;
    }
    public  UserVo getUserById(Integer id){
               UserVo userVo = new UserVo();
        userVo.setAge(19);
        userVo.setName("yangtaishou");
        return userVo;
    }
}
