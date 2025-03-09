package Revision.CodingQuestions;

public class KadanesAlgorithm {
    public static void main(String[] args){
        int[] arr={2, 3, -8, 7, -1, 2, 3};
        System.out.println(kadanesAlgorithm(arr));
    }

    public static int kadanesAlgorithm(int[] arr){
        int currentMax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currentMax=currentMax+arr[i];
            if(currentMax<0){
                currentMax=0;

            }
            else if(currentMax>max){
                max=currentMax;
            }
        }
        return max;
    }
}
