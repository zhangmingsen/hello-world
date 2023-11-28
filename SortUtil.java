package com.example.demo.datastuc.util;

import com.example.demo.datastuc.entity.SysUser;

import java.util.HashSet;
import java.util.Set;

public class SortUtil {
    public static void main(String[] args) {
        SysUser u1 = new SysUser();
        u1.setAddress("1");
        u1.setPassword("1");
        u1.setHobby("1");
        u1.setUsername("1");
        SysUser u2 = new SysUser();
        u2.setUsername("2");
        u2.setHobby("2");
        u2.setPassword("2");
        u2.setAddress("2");
        Set<SysUser> data = new HashSet<>();
        data.add(u1);
        data.add(u2);
        data.forEach(e->{
            System.out.println(e);
        });
        u2.setUsername("33333");

        data.forEach(e->{
            System.out.println(e);
        });


//        int [] arr = {3,6,7,0,2,4};
//        quickSort(arr,0,5);
//        for(Integer array: arr){
//            System.out.println(array);
//        }
    }

    public static void quickSort(int [] arr,int start,int end){
        if(start >= end){
            return;
        }
        int base = arr[start];
        int i = start;
        int j = end;
        while (i < j){
            while(j > i && arr[j] > base){
                j--;
            }
            if(j > i){
                arr[i++] = arr[j];
            }
            while(arr[i] < base && i < j){
                i++;
            }
            if(j > i){
                arr[j--] = arr[i];
            }
        }
        arr[i] = base;
        quickSort(arr,start,i-1);
        quickSort(arr,i+1,end);


    }
}
