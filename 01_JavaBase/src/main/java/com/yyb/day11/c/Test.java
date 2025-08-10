package com.yyb.day11.c;

import com.yyb.day11.a.Student;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.eat();

        // 使用全类名创建对象 : 包名 + 类名
        com.yyb.day11.b.Student stu2 = new com.yyb.day11.b.Student();
        stu2.sleep();
    }
}
