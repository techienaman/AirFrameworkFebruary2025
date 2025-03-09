package Revision.CodingQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class ProgramToRemoveDuplicateCharactersFromString {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println(removeDuplicateCharactersFromString(str));
        System.out.println(removeDuplicates(str));
    }

    //UsingHashMap
    public static String removeDuplicates(String str){
        String output="";
        char[] ch=str.toCharArray();
        HashMap<Character,Integer> hashMap=new LinkedHashMap<>();
        for(int i=0;i<ch.length;i++){
            if(hashMap.containsKey(ch)){
                hashMap.put(ch[i],hashMap.get(ch)+1);
            }
            else{
                hashMap.put(ch[i],1);
            }
        }
        Iterator<Character> it=hashMap.keySet().iterator();
        while (it.hasNext()) {
            char ch1=it.next();
            int val=hashMap.get(ch1);
            if(val==1){
                output=output+ch1;
            }

        }
        return output;


    }



    public static String removeDuplicateCharactersFromString(String str){
        String output="";
       char[] ch= str.toCharArray();
       for(int i=0;i<ch.length;i++){
           if(output.contains(String.valueOf(ch[i]))){
               continue;

           }
           else{
               output=output+ch[i];
           }
       }
       return output;
    }
}
