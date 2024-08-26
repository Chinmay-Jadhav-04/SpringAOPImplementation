package com.AOP;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    BeanFactory factory=new ClassPathXmlApplicationContext("bean.xml");
	Bank bank=(Bank)factory.getBean("b1");
	bank.openBankAccount();
	bank.activateDebitCard();
	bank.doTransaction();
    }
}
