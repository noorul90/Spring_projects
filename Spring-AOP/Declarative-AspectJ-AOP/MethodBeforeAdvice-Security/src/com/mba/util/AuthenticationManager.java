package com.mba.util;

public class AuthenticationManager {
	private ThreadLocal<Credential> credStore;
	
	private AuthenticationManager(){
		credStore = new ThreadLocal<Credential>();
	}
	
	public void login(String uname,String pwd){
		Credential cred = new Credential(uname, pwd);
		credStore.set(cred);
	}
	
	public void logout(){
		credStore.set(null);
	}
	
	public boolean isAuthenticate(){
		Credential cred=null;
		cred = credStore.get();
		if(cred != null){
			if(cred.getUname().equals("John") && cred.getPwd().equals("welcome")){
				return true;
			}
		}
		return false;
		
	}
	
	public String getLoggedinUser(){
		Credential creds=null;
		creds = credStore.get();
		if(creds == null){
			System.out.println("user not available");
		}
		return creds.getUname();
	}

}