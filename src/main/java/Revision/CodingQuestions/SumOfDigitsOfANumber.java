package Revision.CodingQuestions;

public class SumOfDigitsOfANumber {

    public static void main(String[] args){
        int n=1234;
        System.out.println(sumOfDigitsOfNumber(n));
    }

    public static int sumOfDigitsOfNumber(int n){
        if(n==0){
            return 1;
        }
        return n%10*sumOfDigitsOfNumber(n/10);
    }
}
