package com.liuguangzhou.java;

import com.liuguangzhou.com.Demo;

import java.util.ArrayList;

public class TemplatesTest {
    //prsf   private static final demo在module下 需要添加依赖  option+回车
    //iml文件中会有一个依赖关系

    private static final Demo demo=new Demo();

    //psf   public static final  变形psfi  psfs

    //模版设置在setting- editor- Live templates里面 可以更改  还有  generol--postfix complrtion里面不可以更改

    //mian方法  main  -or-  psvm

    public static void main(String[] args) {

        //sout 输出
        System.out.println("hello");
        //变形 soutp  soutm soutv xxx.sout
        System.out.println("args = [" + args + "]");//soutp  输出形参
        System.out.println("TemplatesTest.main");//soutm 输出方法名
        int num=10;
        System.out.println("num = " + num);//soutv 输出变量就近原则

        System.out.println(num);//num.sout



        //fori   for循环
        for (int i = 0; i < 9; i++) {

        }
        //变形  iter增强for循环  itar普通循环


        for (String arg : args) {

        }

        //list.for  生成for循环
        ArrayList arrayList=new ArrayList();
        arrayList.add("123");
        arrayList.add(456);
        arrayList.add(987);

        for (Object o : arrayList) {

        }

        //lits.fori  正序
        for (int i = 0; i < arrayList.size(); i++) {
            
        }

        
        //list.forr 倒序
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            
        }


        //ifn 判断是否是null
        if (arrayList == null) {

        }

        //inn 不等于null
        if (arrayList != null) {

        }
        //xx.nn xx.null


    }

}
