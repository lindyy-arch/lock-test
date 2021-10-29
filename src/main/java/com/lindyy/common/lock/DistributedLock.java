package com.lindyy.common.lock;

/**
 * @author lindyy
 * @Description
 * @created 2018/12/29 19:07
 */
public interface DistributedLock {
    /**
     * 获取锁
     * @author lindyy
     * @return 锁标识
     */
    String acquire();

    /**
     * 释放锁
     * @author lindyy
     * @param indentifier
     * @return
     */
    boolean release(String indentifier);
}
