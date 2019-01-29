package cn.wuxi.js.lib4.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.exceptions.JedisException;

import java.util.List;

/**
 * Created by aaronhuang on 2019/1/22.
 */
public class JedisQueueUtils {

    private static Logger logger = LoggerFactory.getLogger(JedisQueueUtils.class);
    private static JedisPool jedisPool = SpringContextHolder.getBean(JedisPool.class);

    /**
     * 入队
     * @param key 键
     * @param value 值
     * @return
     */
    public static long lpush(String key, String... value) {
        long result = 0;
        Jedis jedis = null;
        try {
            jedis = getResource();
            result = jedis.lpush(key, value);
            logger.debug("lpush {} = {}", key, value);
        } catch (Exception e) {
            logger.warn("lpush {} = {}", key, value, e);
        } finally {
            returnResource(jedis);
        }
        return result;
    }

    /**
     * 查询是否存在队列中
     * @param key 键
     * @param value 值
     * @return
     */
    public static boolean isInQueue(String key, String value) {
        boolean result = false;
        Jedis jedis = null;
        try {
            jedis = getResource();
            List<String> list = jedis.lrange(key,0, -1);
            result = list.contains(value);
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            returnResource(jedis);
        }
        return result;
    }

    /**
     * 出队
     * @param key
     * @return
     */
    public static String rpop(String key) {
        String result = null;
        Jedis jedis = null;
        try {
            jedis = getResource();
            result = jedis.rpop(key);
            logger.debug("rpop {} ", key);
        } catch (Exception e) {
            logger.warn("rpop {} - {}", key, e);
        } finally {
            returnResource(jedis);
        }
        return result;
    }

    /**
     * 获取资源
     * @return
     * @throws JedisException
     */
    public static Jedis getResource() throws JedisException {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
//			logger.debug("getResource.", jedis);
        } catch (JedisException e) {
            logger.warn("getResource.", e);
            returnBrokenResource(jedis);
            throw e;
        }
        return jedis;
    }

    /**
     * 归还资源
     * @param jedis
     */
    public static void returnBrokenResource(Jedis jedis) {
        if (jedis != null) {
            jedisPool.returnBrokenResource(jedis);
        }
    }

    /**
     * 释放资源
     * @param jedis
     */
    public static void returnResource(Jedis jedis) {
        if (jedis != null) {
            jedisPool.returnResource(jedis);
        }
    }



}
