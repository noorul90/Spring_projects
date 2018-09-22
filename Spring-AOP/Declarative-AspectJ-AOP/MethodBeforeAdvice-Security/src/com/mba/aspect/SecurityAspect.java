package com.mba.aspect;

import org.aspectj.lang.JoinPoint;

import com.mba.util.AuthenticationManager;


public class SecurityAspect {
	private AuthenticationManager am;

	public SecurityAspect(AuthenticationManager am) {
		this.am = am;
	}

	 /* in case of Declarative AspectJ AOP we can declare multiples advice methods within
	 same Aspect class like the following, but in Programatic AOP approach method will be fixed(only one)
	 because this method is overridden method */
	
	public void audit(JoinPoint jp){
		String methodName=null;
		Object[] args=null;
		
		methodName = jp.getSignature().getName();
		args = jp.getArgs();
		//logic to execute before target class method get executed
		System.out.println(methodName + "(" + args[0] + ")" + " has been called by User: "+am.getLoggedinUser());
		//at this poin controle automatically goes to target class method
	}
	
	public void authenticate(JoinPoint jp) throws IllegalAccessException{
		String methodName=null;
		methodName = jp.getSignature().getName();
		System.out.println("entered int: " +methodName);
		
		//performed authentication
		if(am.isAuthenticate()==false){
			throw new IllegalAccessException("Invalid username/password");
		}
		
	}

}
