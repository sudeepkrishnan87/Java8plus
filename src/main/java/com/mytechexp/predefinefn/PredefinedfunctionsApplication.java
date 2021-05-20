package com.mytechexp.predefinefn;

import com.mytechexp.predefinefn.predefinedfunctions.PredicatesEx;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PredefinedfunctionsApplication {

	
	public static void main(String[] args) {
     
		PredicatesEx fn=new PredicatesEx();
		
		// System.out.println(fn.andfileter());
		// System.out.println(fn.orfileter());
		System.out.println(fn.negatefilter());
		//SpringApplication.run(PredefinedfunctionsApplication.class, args);
	}




}
