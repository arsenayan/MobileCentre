package com.company;

import java.util.Comparator;

public class SortByModel implements Comparator<Model> {
    @Override
    public int compare(Model o1, Model o2) {
        if(o1.==o2.getPhoneYear()){
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
