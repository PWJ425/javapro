package com.neued.test;


import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class mytest {
    public static void main(String[] args) {
        List arrayList=new ArrayList();
        List linkedList=new LinkedList();
        Date startarray=new Date();
     for (int i=0;i<=1000000;i++){
         arrayList.add(i);
     }
        Date endarray=new Date();
        System.out.println("ArrayList添加用时="+(endarray.getTime()-startarray.getTime()));
        Date startlinked=new Date();
        for (int i=0;i<=1000000;i++){
           linkedList.add(i);
        }
        Date endlinked=new Date();
        System.out.println("LinkedList添加用时="+(endlinked.getTime()-startlinked.getTime()));
    }
}
