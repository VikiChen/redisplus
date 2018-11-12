package com.viki.redisplus.DistributedLock;

import redis.clients.jedis.Jedis;

public class Test001 {

    public static void main(String[] args) {
        Jedis jedis = new Jedis();
        jedis=new Jedis("192.168.91.131",6379);
        jedis.auth("123456");
        RedisWithReentrantLock redis = new RedisWithReentrantLock(jedis);
        System.out.println(redis.lock("codehole"));
        System.out.println(redis.lock("codehole"));
        System.out.println(redis.unlock("codehole"));
        System.out.println(redis.unlock("codehole"));
    }
}
