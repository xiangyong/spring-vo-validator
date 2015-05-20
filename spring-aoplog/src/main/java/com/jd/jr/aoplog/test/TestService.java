package com.jd.jr.aoplog.test;

public class TestService {
    public String excute(String id){
        System.out.println("-----------------"+id);
          return id+"test";
    }
}
