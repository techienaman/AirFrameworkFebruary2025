package Revision.CodingQuestions;

import java.util.HashMap;

public class LongestSubstring {

    public static void main(String[] args){
        String str="cadbzabcd";
        System.out.println(findLongestSubString(str));
    }

    public static int findLongestSubString(String str){
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int maxLength=0;
        int currentlength=0;
        int i=0;
        int j=0;
        while(j<str.length()){
            char ch=str.charAt(j);
            if(!hashMap.containsKey(ch)){
                currentlength=currentlength+1;
                maxLength=Math.max(currentlength,maxLength);
                hashMap.put(ch,j);
            }
            else if(hashMap.containsKey(ch)){
                int x=hashMap.get(ch);
                if(x>i){
                    i=x+1;
                    currentlength=(j-i)+1;
                    maxLength=Math.max(currentlength,maxLength);
                    hashMap.put(ch,j);


                }

            }
            j++;
        }
        return maxLength;
    }
}
