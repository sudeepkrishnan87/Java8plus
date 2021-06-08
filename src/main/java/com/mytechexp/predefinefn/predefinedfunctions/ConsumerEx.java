package com.mytechexp.predefinefn.predefinedfunctions;

import java.util.function.Consumer;

public class ConsumerEx {

    public void consumerTest(String a,String b) {

        Consumer<String> consumer = c -> System.out.println(c);

        Consumer<String> consumer2= c->System.out.print("Full name is :"+ a+" ");

        consumer.accept(a);
        consumer.accept(b);
        
        consumer2.andThen(consumer).accept(b);
    }

}
