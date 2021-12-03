package com.th.ppack;


import java.io.Serializable;
 
public class Product implements Serializable {

    private static final long serialVersionUID = 100001L;
    private int pId;
    private String pName;
    private int pPrice;
    public Product(int pId, String pName, int pPrice) {
        super();
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
    }
    public int getpId() {
        return pId;
    }
    public String getpName() {
        return pName;
    }
    public int getpPrice() {
        return pPrice;
    }
    @Override
    public String toString() {
        return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
    }

 
}