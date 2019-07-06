package com.company;

import java.util.Comparator;

public class SortByRam implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        if(o1.getPhoneRam()==o2.getPhoneRam()){
            return 0;
        }

        if (o1.getPhoneRam()>o2.getPhoneRam()){
            return -1;
        }

        if (o1.getPhoneRam()<o2.getPhoneRam()){
            return 1;
        }

        return 0;
    }
}
