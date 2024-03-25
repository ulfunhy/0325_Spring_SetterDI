package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

//        TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
//        t1.getData1();
//
//        System.out.println("=========================");
//        TestBean1 t2 = ctx.getBean("t2", TestBean1.class);
//        t2.getData2();
//
//        System.out.println("=========================");
//        TestBean1 t3 = ctx.getBean("t3", TestBean1.class);
//        t3.getData3();
//
//        System.out.println("=========================");
//        TestBean1 t4 = ctx.getBean("t4", TestBean1.class);
//        t4.isData4();

        TestBean1 obj1=ctx.getBean("t1", TestBean1.class);
        System.out.println("data1:"+obj1.getData1());
        System.out.println("data2:"+obj1.getData2());
        System.out.println("data3:"+obj1.getData3());
        System.out.println("data4:"+obj1.isData4());

        ctx.close();
    }
}