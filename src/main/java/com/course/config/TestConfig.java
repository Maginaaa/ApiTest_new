package com.course.config;


import java.util.HashMap;
import java.util.Map;

public class TestConfig {

    /**
     * 数据库链接配置
     */
    public static String DB_IP = "10.106.14.176";
    public static String DB_PORT = "3306";
    public static String DB_BASE_NAME = "wconcept_api_test";
    public static String DB_USERNAME = "root";
    public static String DB_PASSWORD = "root";

    /**
     * 配置链接超时时间
     * 单位 s
     */
    public static int connectTimeout = 30;  //链接超时
    public static int writeTimeout = 30;   //写入超时
    public static int readTimeout = 30;   //读取超时

    /**
     * 全局变量
     */
    public static Map<String,String> map = new HashMap<String,String>();
    public static void setMap(Map map) {
        map.put("KoreaDirectId","451748");        //韩国直邮商品id
        map.put("KoreaDirectSimpleId","451741");       //韩国直邮商品simple_id

    }
}
