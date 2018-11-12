package com.viki.redisplus.UVCount;

import redis.clients.jedis.Jedis;

// HyperLogLog  应用场景计算UV  避免了超大set的出现
public class LogCount {
    public static void main(String[] args) {
        Jedis jedis = new Jedis();
        jedis=new Jedis("192.168.91.131",6379);
        jedis.auth("123456");
        for (int i = 0; i < 1000; i++) {
            jedis.pfadd("codehole", "user" + i);
        }
        long total = jedis.pfcount("codehole");
        System.out.printf("%d %d\n", 1000, total);
        jedis.close();
    }
}
