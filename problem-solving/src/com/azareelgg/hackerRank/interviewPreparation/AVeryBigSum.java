package com.azareelgg.hackerRank.interviewPreparation;

import java.util.List;

public class AVeryBigSum{

    public static void main(String[] args){
        System.out.println("Hello BigSum " + aVeryBigSum(null));

    }

    public static long aVeryBigSum(List<Long> ar) {
        Long ret = Long.valueOf("0");

        for(Long l:ar){
            ret += l;
        }

        return ret;
    }

}