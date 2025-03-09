package Revision.CodingQuestions;

public class FindSecondHighestNumber {

    public static void main(String[] args) {
        String str="str1025rts";
        System.out.println(findSecondHighestNumber(str));
        System.out.println(findSecondLowestElement(str));
    }
    /*
    ASCII value-> 48-57 for Numbers
    ASCII value-97-122
    ASCII value 65-90
     */


    public static int findSecondLowestElement(String str){
        int ch=-1;
        int lowest=Integer.MAX_VALUE;
        int secondLowest=Integer.MAX_VALUE;

        for(int i=0;i<str.length();i++){
            ch=(int)str.charAt(i);
            if(ch>=48 && ch<=57 && ch<lowest){
                secondLowest=lowest;
                lowest=ch;
            }
            else if(ch>=48 && ch<=57 && ch<secondLowest && ch>lowest)
                secondLowest=ch;
        }
        return secondLowest-48;

    }
    public static int findSecondHighestNumber(String str){
        int ch=-1;
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            ch=(int)str.charAt(i);
            if(ch>48 && ch<57 && ch>highest){
                secondHighest=highest;
                highest=ch;
            }
            else if(ch>48 && ch<57 && ch>secondHighest && ch<highest){
                secondHighest=ch;
            }


        }
        return secondHighest-48;
    }
}
