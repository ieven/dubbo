package com.alibaba.dubbo.demo.consumer;

import com.creditease.monitorframework.fat.dubbo.IMyDubboService;

public class TestAction {

    private IMyDubboService service;

    public void start() {

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.sayHello(i + "");
            try {
                Thread.sleep(2 * 1000);
            }
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
