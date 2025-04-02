package Revision.CodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StrEqual {


    public static void main(String[] args) {
        compareStrings("HELLO","LLOEH");

    }
    //HELLO

    public static boolean compareStrings (String s1,String s2){
        char[] str1=s1.toCharArray();
        char[] str2=s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        String newStr="";
        String newStr2="";

        for(int i=0;i<str1.length;i++){
            newStr=newStr+str1[i];
        }

        for(int j=0;j<str2.length;j++){
            newStr2=newStr2+str2[j];
        }
        if(!s1.equalsIgnoreCase(s2)){
            return false;
        }

        return true;
    }
}
