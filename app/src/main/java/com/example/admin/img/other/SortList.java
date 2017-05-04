package com.example.admin.img.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by admin on 2017/3/23.
 */

public class SortList {

    private ArrayList<Integer> sort(Integer... integers){
        ArrayList<Integer> mArrayList =new ArrayList<>();
        Collections.addAll(mArrayList, integers);
        Collections.sort(mArrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(o2)){
                    return 0;
                }
                return o1>o2?1:-1;
            }
        });
        return mArrayList;
    }

}
