package Revision.CodingQuestions;

import java.util.*;

public class ArrayDuplicates {
    public static void main(String[] args){
        int[] arr={2,3,1,2,3};
        System.out.println(findDuplicates(arr));
        System.out.println(findDuplicatesoptimized(arr));

    }

    public static List<Integer> findDuplicatesoptimized(int[] arr){
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
             list.add(0,arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
        return list;


    }

    public static List<Integer> findDuplicates(int[] arr){

        HashMap<Integer,Integer> hashMap=new LinkedHashMap<>();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else{
                hashMap.put(arr[i],1);
            }
        }

        Iterator<Integer> it=hashMap.keySet().iterator();
        while(it.hasNext()){
            int key=it.next();
            int val=hashMap.get(key);
            if(val>1){
                list.add(0,key);
            }
        }
        return list;
    }
}
