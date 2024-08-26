package com.AOP;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;



@Aspect
public class TrackBankOp {
	
	   @Pointcut("execution(* Bank.*(..))")  
	public void openBankAccount() {}

	//@Before("openBankAccount()")
	   @After("openBankAccount()")
		public void myShopping(JoinPoint jp) {
			System.out.println("This is advice method ");
	}
}