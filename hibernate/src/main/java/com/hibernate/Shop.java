package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.*;  
   
@Entity  
@Table(name="shop")
public class Shop {
    @Id  
    @GeneratedValue(strategy=GenerationType.TABLE) 
    private int shopid;
    private int oid; 

private String shopname;
private int rating;
public int getOid() {
    return oid;
}
public void setOid(int oid) {
    this.oid = oid;
}
public int getShopid() {
    return shopid;
}
public void setShopid(int shopid) {
    this.shopid = shopid;
}
public String getShopname() {
    return shopname;
}
public void setShopname(String shopname) {
    this.shopname = shopname;
}
public int getRating() {
    return rating;
}
public void setRating(int rating) {
    this.rating = rating;
}


}
