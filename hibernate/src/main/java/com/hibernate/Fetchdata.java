package com.hibernate;
import java.util.*;  
import javax.persistence.TypedQuery;  

import java.util.Iterator;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Fetchdata {
      
        public static void main(String[] args) {    
                
            StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
            Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
              
            SessionFactory factory=meta.getSessionFactoryBuilder().build();  
            Session session=factory.openSession();  
         
            TypedQuery query=session.createQuery("from Owner");    
            List<Owner> list=query.getResultList();    

                
            Iterator<Owner> itr=list.iterator();    
            while(itr.hasNext()){    
                Owner q=itr.next();    
                System.out.println("hello jiii");
                System.out.println("owner Name: "+q.getOid()+q.getName()+q.getPhoneno());    
                    
                //printing answers    
                // ArrayList<Shop> list1=new ArrayList<Shop>();  
                List<Shop> list1=q.getShops();    
                Iterator<Shop> itr2=list1.iterator();    
               while(itr2.hasNext())  
               {  
              Shop a=itr2.next();  
                    System.out.println(a.getOid()+":"+a.getShopname());  
                }    
            }  
            session.close();    
            System.out.println("success");    
        }    
        }    

