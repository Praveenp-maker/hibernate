package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

import javax.persistence.*;  
import java.util.List;    

@Entity
@Table (name="owner")
public class Owner {
    @Id 
    @GeneratedValue(strategy=GenerationType.TABLE)
    private int oid;  

    private String name;
    private int phoneno;
    
    @OneToMany(cascade = CascadeType.ALL)  
@JoinColumn(name="oid")  
@OrderColumn(name="type")  
private List<Shop> shops;  

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getOid() {
        return oid;
    }
    public void setOid(int oid) {
        this.oid = oid;
    }
    public int getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }
    public List<Shop> getShops() {
        return shops;
    }
    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }
   
   
   
}
