package com.zl.blockCA.net.dao;

public class toCarequest {

    //公钥
    private String publicKey;

    //设备信息
    private String name;


    public String getName() {
        return name;
    }
    public String getPublicKey() {
        return publicKey;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

}
