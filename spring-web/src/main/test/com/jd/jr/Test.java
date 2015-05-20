package com.jd.jr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: yangkuan
 * Date: 15-4-16
 * Time: 上午12:12
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    //private static Pattern INDEX_PATTERN = Pattern.compile("\\[(\\d+)\\]\\.?");


    private static Pattern INDEX_PATTERN1 = Pattern.compile("(\\d+)");

    private static Pattern INDEX_PATTERN = Pattern.compile("\\[(\\d+)\\]\\.?");
    public static void main(String[] args){
        String[] result  = INDEX_PATTERN.split("index[0].id");
            for (String str:result){
                System.out.println(str);
            }
        Matcher matcher = INDEX_PATTERN.matcher("index[0].id");
        System.out.println(matcher.find());
        while(matcher.find()){
            System.out.println(matcher.start());
        }

        String[] result1  = INDEX_PATTERN1.split("index[0].id");
        for (String str:result1){
            System.out.println(str);
        }
        Matcher matcher1 = INDEX_PATTERN1.matcher("index[122].id");
        boolean flag = matcher1.find();

        System.out.println(matcher1.group(1));
         StringBuffer sb = new StringBuffer();
        int i=0;
        while(flag){
            i++;
            matcher1.appendReplacement(sb, "");
            System.out.println("第"+i+"次匹配后sb的内容是："+sb);
//继续查找下一个匹配对象
            flag = matcher1.find();
        }

    }

}
