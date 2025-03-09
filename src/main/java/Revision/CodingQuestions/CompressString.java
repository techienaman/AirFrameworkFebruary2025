package Revision.CodingQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CompressString {
    public static void main(String[] args){
        String str="aaabbccca" ;
        System.out.println(compressString(str));
        //output 4a2b3c
    }


    public static String compressString(String str){
        String compressedStrings="";
        HashMap<Character,Integer> hashMap=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hashMap.containsKey(ch)){
                hashMap.put(ch,hashMap.get(ch)+1);
            }
            else{
                hashMap.put(ch,1);
            }
        }

        Iterator<Character> it=hashMap.keySet().iterator();
        while(it.hasNext()){
            char ch1=it.next();
            int val=hashMap.get(ch1);
            compressedStrings=compressedStrings+String.valueOf(val)+ch1;
        }
        return compressedStrings;

    }
}
