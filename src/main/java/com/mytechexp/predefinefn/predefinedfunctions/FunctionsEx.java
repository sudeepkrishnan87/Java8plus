package com.mytechexp.predefinefn.predefinedfunctions;

import java.util.function.Function;

public class FunctionsEx {

    public Integer functionFilter()
    {

    Function<String,Integer>strLength=f->f.length();
    Function<Integer,Integer>math1=f->f+f;
    Function<Integer,Integer>math2=f->(int)Math.pow(f, f);
 //Remove the commented lines to test it one by one 

   // return strLength.apply("sudeep");
    //push
   //return math1.andThen(math2).apply(2);
  return math1.compose(math2).apply(2);


    }


}
