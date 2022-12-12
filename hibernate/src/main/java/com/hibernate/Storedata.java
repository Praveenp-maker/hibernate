package com.hibernate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Storedata {    
public static void main(String[] args) {    
     
    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
    Session session=factory.openSession();  
      
    Transaction t=session.beginTransaction();    
        
    Shop ans1=new Shop();    
 
    ans1.setOid(5);    
    ans1.setShopid(7);
    ans1.setShopname("emi");
    ans1.setRating(5);

    Shop ans2=new Shop();    
 
    ans2.setOid(2);    
    ans2.setShopid(6);
    ans2.setShopname("JIV");
    ans2.setRating(5);

  
        
    ArrayList<Shop> list1=new ArrayList<Shop>();    
    list1.add(ans1);    
 
        
    ArrayList<Shop> list2=new ArrayList<Shop>();    
    list2.add(ans2);    
   
        
    Owner question1=new Owner();    
    question1.setName(" Java");    
    question1.setOid(9);  
    question1.setPhoneno(6788);  
        
 
    session.persist(question1);    
  
        
    t.commit();    
    session.close();    
    System.out.println("success");    
}    
}   

