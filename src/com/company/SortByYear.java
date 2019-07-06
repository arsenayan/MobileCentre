package com.company;

import java.util.Comparator;

public class SortByYear implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        if(o1.getPhoneYear()==o2.getPhoneYear()){
            return 0;
        }

        if (o1.getPhoneYear()>o2.getPhoneYear()){
            return -1;
        }

        if (o1.getPhoneYear()<o2.getPhoneYear()){
            return 1;
        }

        return 0;
    }
}
