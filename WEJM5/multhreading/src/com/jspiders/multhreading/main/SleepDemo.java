package com.jspiders.multhreading.main;

public class SleepDemo {
	public static void main(String[] args) {
		String msg="This is the execution of sleep()";
		
		for(int i=0; i<msg.length();i++) {
			System.out.println(msg.charAt(i));
			
			try {
				Thread.currentThread().sleep(200);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
