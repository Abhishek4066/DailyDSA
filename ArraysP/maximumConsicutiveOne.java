package ArraysP;

public class maximumConsicutiveOne {
    
public static void main(String[] args) {
    int nums[]= {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1,0,0};
    maxConsicutive(nums, 2);
}
// Given a binary array nums and an integer k, return the maximum number 
// of consecutive 1s in the array if you can flip at most k 0s.(leetcode 1004)
// nums = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0]
// k = 2
// You can flip up to 2 zeros. After flipping the two zeros at indices 3 and 4, the array becomes:
// [1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0]
// The longest sequence of 1s is 6.

public static void maxConsicutive(int arr[], int k){

   int pointer1=0;
   int pointer2=0;
   int maxConsi=0;
   int countZero=0;
    int length=0;
   while(pointer2 < arr.length){

        if(arr[pointer2]==0){
            countZero++;
        }

        while(countZero > k){

            if(arr[pointer1]==0){
                countZero--;
            }
            pointer1++;
            
        }

        length = pointer2 - pointer1 +1;

        if(length > maxConsi){
            maxConsi = length;
        }

    pointer2++;
   }
    
    System.out.println("max: "+maxConsi);
}
}
