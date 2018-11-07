package com.kg.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Log {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        LoginDao dao = (LoginDao) ctx.getBean("edao");

        int out1 = dao.savelogin(new Login(1, "Poorna", "Chandru"));

        int out2 = dao.updatelogin(new Login(3, "Poorna", "1209"));

        int out3 = dao.deletelogin(new Login(8, "", ""));

        System.out.println("Data Inserted::::" + out1);
        System.out.println("Data Updated:::::" + out2);
        System.out.println("Data Deleted:::::" + out3);

    }

}
