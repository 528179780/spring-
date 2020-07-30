package com.sufu.spring.proxy.demo1;

/**
 * 代理角色，代理房东
 * @author sufu
 * @date 2020/7/29
 */
public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public void rent() {
        showHouse();
        host.rent();
        signContract();
    }

    /**
     * 看房子
     * @author sufu
     * @date 2020/7/29 16:25
     **/
    public void showHouse(){
        System.out.println("中介带看房子");
    }
    /**
     * 签合同
     * @author sufu
     * @date 2020/7/29 16:27
     **/
    public void signContract(){
        System.out.println("签租赁合同");
    }
}
