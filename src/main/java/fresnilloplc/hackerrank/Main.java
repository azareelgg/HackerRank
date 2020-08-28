/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fresnilloplc.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Luis Valenzuela
 */
public class Main {
    public static void main(String[] args){
        List<String> l = new ArrayList<>();
        l.add("4");
        l.add("lamp");
        l.add("lamp");
        l.add("tv");
        l.add("lamp");
        l.add("4");
        l.add("4");
        l.add("lamp");
        System.out.println(""+deviceNamesSystem(l));
        
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        /*
        System.out.println(""+sumArray(a));
        
        int[] socks = new int[]{10,20,20,10,10,30,50,10,20};
        int[] clouds = new int[]{0,0,1,0,0,1,0};
        
        System.out.println("zapatos: "+sockMerchant(socks.length, socks));
        System.out.println("clouds : "+jumpingOnClouds(clouds));
        */
        
        System.out.println(""+max(a));
    }
    
    public static int sumArray(int[] ar){
        int j = 0;
        for(int i = 0; i<ar.length; i++){
            j += ar[i];
        }
        return j;
    }
    
    public static List<String> deviceNamesSystem(List<String> devicenames) {
        List<String> ret= new ArrayList<>();
        devicenames.forEach((device) -> {
            if(!ret.contains(device)){
                ret.add(device);
            }else{
                ret.add(device+(getLastDevice(ret, device)));
            }
        });
        return ret;
    }
    
    public static int getLastDevice(List<String> devicenames, String device){
        int ret = 1; 
        for(int i = 1; i<= devicenames.size(); i++){
            if(devicenames.contains(device+i)){
                ret = i+1; 
            }
        }
        return ret;
    }
    
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        Integer[] res=new Integer[]{0,0};
        for(int i=0; i<a.size(); i++){
            if(a.get(i) > b.get(i)){
                res[0]++;
            }else if(b.get(i) > a.get(i)){
                res[1]++;
            }
        }
        return Arrays.stream(res).collect(Collectors.toList());
    }
    
    static int sockMerchant(int n, int[] ar) {
        
        Map<Integer, Integer> map = new HashMap<>();
        Integer tmp;
        for(int i = 0; i < ar.length; i++){
            
            if(map.containsKey(ar[i])){
                tmp = map.get(ar[i]);
                map.put(ar[i], ++tmp);
            }else{
                map.put(ar[i], 1);
            }
        }
        int ret = 0;
        System.out.println("map.size(): "+map.size());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println("key: "+key+" value: "+val+" mod: "+((val+1)%2));
            if(val % 2 == 0){
                ret += val/2;
            }else if((val+1) % 2 == 0){
                ret += Math.ceil((val-1)/2);
            }
        }
        return ret;
    }
    
    static int countingValleys(int n, String s) {
        
        int seaLevel = 0, valleys=0;
        for (char c : s.toCharArray()) {
            if(c == 'U'){
                seaLevel++;
            }else if(c == 'D'){
                seaLevel--;
            }
            if(seaLevel == 0 && c == 'U')
                valleys++;
        }
        return valleys;
    }
    
    static int jumpingOnClouds(int[] c) {
        int res = 0;
        int jump = 0;
        for(int i = 0; i<c.length; i++, jump++){
            
            if(i == 0){
                //jump++;
            }else{
                if(c[i] == c[i-1] || jump > 2){
                    res++;
                    //jump=0;
                    if(res > 1 && c[i] == c[i-1] && c[i] == c[i-2] && jump > 2){
                        res--;
                        jump = 0;
                    }
                    jump = 0;
                }else{
                    //jump++;
                }
            }
        }
        return res;

    }
    
    static int max(final int[] arr) {
        int r = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > r)
                r = arr[i];
        }
        return r;
    }
    
}
