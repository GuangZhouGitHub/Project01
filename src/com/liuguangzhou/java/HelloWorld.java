package com.liuguangzhou.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");//command+d  复制一行
        System.out.println("Hello World");// 运行程序control+R
//        synchronized ()  command+/ 单行注释

        Date hus = new Date();//option +回车 导包  纠错
        // shift+f6替换名字
        //command+shift+U  大小写切换
        System.out.println(hus.equals(""));
        List array=new ArrayList<>();
//        array.add();  command+p 提示方法的参数

        //option+command+L 格式化代码
// option +command +左 tap切换
    }

    /*public static  void  hh(){

    }*/

//    command+X  删除行
//shift option 上下  上下移动

    public  static  void  qq(){
        try {
            FileInputStream fileInputStream=new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //包代码块 option+command+T
    }
//查找文件  两下shift
//control+H 查看类的继承关系

//option+command+U查看类的结构图

    //shift command H 查询方法的多重重新结构图 method hiercharchy

    //option command+M 抽取方法

    //command+E 查看最近修改的代码

    //command+W 关闭当前文件

    //command shift V 最近复制过的东西


    //command shift H 可以看到方法在哪调用过

}
