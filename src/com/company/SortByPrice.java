package com.company;

import java.util.Comparator;

public class SortByPrice implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        if(o1.getPhonePrice()==o2.getPhonePrice()){
            return 0;
        }

        if (o1.getPhonePrice()>o2.getPhonePrice()){
            return -1;
        }

        if (o1.getPhonePrice()<o2.getPhonePrice()){
            return 1;
        }

        return 0;
    }
}
