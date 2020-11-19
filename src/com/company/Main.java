package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] arr={9,7,8,7,7,8,4,4,6,8,8,7,6,8,8,9,2,6,0,0,1,10,8,6,3,3,5,1,10,9,0,7,10,0,10,4,1,10,6,9,3,6,0,0,2,7,0,6,7,2,9,7,7,3,0,1,6,1,10,3};
        Arrays.sort(arr);
        int x = arr.length / 20;
        double sum=0;
        for (int i = x; i < arr.length - x; i++) {
            sum = sum + arr[i];
        }
        double mean=sum/(arr.length-2*x);
        System.out.println(mean);
    }
}
