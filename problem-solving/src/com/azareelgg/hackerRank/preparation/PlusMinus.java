package com.azareelgg.hackerRank.preparation;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus{

    public static void main(String[] args){
        List<Integer> input = new ArrayList<>();
        input.add(-4);
        input.add(3);
        input.add(-9);
        input.add(0);
        input.add(4);
        input.add(1);
        plusMinus(input);

    }

    //https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
    public static void plusMinus(List<Integer> arr) {
        DecimalFormat df = new DecimalFormat("0.000000");
        
        int pos = 0, neg = 0, zero = 0;

        for(Integer i:arr){
            if(i > 0){
                pos++;
            }else if(i < 0){
                neg++;
            }else{
                zero++;
            }
        }
        System.out.println(df.format(new BigDecimal(pos).divide(new BigDecimal(arr.size()), MathContext.DECIMAL128)));
        System.out.println(df.format(new BigDecimal(neg).divide(new BigDecimal(arr.size()), MathContext.DECIMAL128)));
        System.out.println(df.format(new BigDecimal(zero).divide(new BigDecimal(arr.size()), MathContext.DECIMAL128)));

    }

}