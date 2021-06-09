package com.mytechexp.predefinefn.predefinedfunctions;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierEx {
    public Date getTodaysDate()
    {
        Supplier<Date> date=()->new Date();
        return date.get();
    }

    public String passKey(int size)
    {
        String passkey="";
        Supplier<Integer> code=()->(int)(Math.random()*10);
        for(int i=0;i<size;i++)
            passkey+=code.get();
        return passkey;
    }
}
