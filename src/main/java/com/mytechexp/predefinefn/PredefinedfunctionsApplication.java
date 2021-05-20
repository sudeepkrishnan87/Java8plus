package com.mytechexp.predefinefn;

import com.mytechexp.predefinefn.predefinedfunctions.FunctionsEx;
import com.mytechexp.predefinefn.predefinedfunctions.PredicatesEx;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PredefinedfunctionsApplication {

	
	public static void main(String[] args) {
     //Remove the comment lines and test one be one
		PredicatesEx p=new PredicatesEx();
		
		// System.out.println(p.andfileter());
		// System.out.println(p.orfileter());
		//System.out.println(p.negatefilter());

		//System.out.println(p.isEqualFilter());
		

		FunctionsEx fn=new FunctionsEx();
		System.out.println(fn.functionFilter());
		
	}




}
