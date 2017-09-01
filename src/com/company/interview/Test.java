package com.company.interview;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by zhaomingming-s on 2017/8/30.
 */
public class Test {
    public static void main(String[] args){
        Test t = new Test();
        int[] arr = t.combine(new int[]{1,3,5},new int[]{0},new int[]{8,6});
        for (int n:arr){
            System.out.println(n);
        }

    }

    private int getSum(int[] array){
        int sum =0 ;
        for (int i = 0; i < array.length ; i++) {
            if((i+1)%5==0||(i+1)%7==0){
                sum+=array[i];
            }
        }
        return sum;
    }

    private int[] combine(int[] ...arrs){
        int count = 0 ;
        for (int[] arr: arrs){
            count += arr.length;
        }

        int[] retArr = new int[count];
        int index = 0 ;
        for (int[] arr:arrs){
            for (int n:arr){
                retArr[index] = n;
                index ++;
            }
        }
        return retArr;
    }

}
