package com.yyb.day7.oop;

public class Book {

    String id;
    String name;
    double price;

    public void show() {
        System.out.println("编号为:" + id
                + ", 书名为:" + name
                + ", 价格为:" + price);
    }

}
