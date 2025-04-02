package Revision.CodingQuestions;

import java.util.HashMap;
import java.util.concurrent.Phaser;

public class longestSubstringwithoutRepeatingCharacters {

    public static void main(String[] args){
        String str="cadbzabcd";
        String str1="aab";
        String str2="tmmzuxt";
        System.out.println(findLongestSubStrinsg(str1));
    }



    public static int findLongestSubStrinsg(String str2){
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int currentlength=0;
        int maxLength=0;
        int i=0;
        int j=0;

        while(j<str2.length()){
            char ch=str2.charAt(j);
            if(!hashMap.containsKey(ch)){
                currentlength=currentlength+1;
                maxLength=Math.max(currentlength,maxLength);
                hashMap.put(ch,j);

            }
            else if(hashMap.containsKey(ch)){
                int x=hashMap.get(ch);
                if(i<x){
                    i=x+1;
                }
                currentlength=(j-i)+1;
                hashMap.put(ch,j);
                maxLength=Math.max(currentlength,maxLength);

            }
            j++;

        }
        return maxLength;


    }

    public static int findLongestSubString(String str){
        int maxlength=0;
        int currentLength=0;
        HashMap<Character,Integer> hashMap=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!hashMap.containsKey(ch)){
                currentLength=currentLength+1;
                if(currentLength>maxlength){
                    maxlength=currentLength;
                }
                hashMap.put(ch,i);
            }
            else if(hashMap.containsKey(ch)){
                currentLength=i-(hashMap.get(ch));
            }
        }
        return maxlength;
    }
}
