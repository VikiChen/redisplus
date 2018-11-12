package com.viki.redisplus.Test;

import redis.clients.jedis.Jedis;


public class Test001 {
    private static Jedis jedis=null;
    public static void main(String[] args) {
        jedis=new Jedis("192.168.91.131",6379);
        jedis.auth("123456");
        jedis.set("jh","jsd");
        System.out.println(jedis.get("jh"));
    }
}
