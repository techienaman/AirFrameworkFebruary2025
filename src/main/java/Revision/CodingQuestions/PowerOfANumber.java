package Revision.CodingQuestions;

public class PowerOfANumber {
    public static void main(String[] args){
        int input=2;
        int power=5;
        System.out.println(findPowerOfANumber(input,power));
    }

    public static int findPowerOfANumber(int n,int x){

        if(x==0){
            return 1;
        }
        return n*findPowerOfANumber(n,x-1);
    }


}
