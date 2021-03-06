package com.highrock.threads;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
@Scope("prototype")
public class BusinessThread implements Runnable {
    private  String acceptStr;

    public BusinessThread() {

    }

    public  BusinessThread(String acceptStr){
        this.acceptStr=acceptStr;
    }

    public String getAcceptStr() {
        return acceptStr;
    }

    public void setAcceptStr(String acceptStr) {
        this.acceptStr = acceptStr;
    }

    @Override
    public void run() {
    //业务操作
        System.out.println("多线程已经处理订单插入系统,订单号"+acceptStr);

    }
}
