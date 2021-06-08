package com.mytechexp.predefinefn;

import com.mytechexp.predefinefn.predefinedfunctions.ConsumerEx;
import com.mytechexp.predefinefn.predefinedfunctions.FunctionsEx;
import com.mytechexp.predefinefn.predefinedfunctions.PredicatesEx;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PredefinedfunctionsApplication {

	
	public static void main(String[] args) {
     //Remove the comment lines and test one be one

		//Predicate Block
		/*PredicatesEx p=new PredicatesEx();
		
		 System.out.println(p.andfileter());
		System.out.println(p.orfileter());
		System.out.println(p.negatefilter());

		System.out.println(p.isEqualFilter());*/


		//Function Block

		/*FunctionsEx fn=new FunctionsEx();
		System.out.println(fn.functionFilter());*/

		//Consumer Block

		ConsumerEx consumer=new ConsumerEx();
		consumer.consumerTest("Sudeep", "Krishnan");
		
	}




}
