package ArraysP;

public class maximumSubArray {
    public static void main(String[] args) {
        int nums []= {4, 2, 1, 3, 3};
        maxAvgSubArray(nums, 2);
    }
//You are given an integer array nums consisting of n elements, and an integer k.
//Find the contiguous subarray of length k that has the maximum average value, 
//and return this value. You need to solve the problem with a time complexity of O(n)O(n).
//nums = [1, 12, -5, -6, 50, 3]
//k = 4
//The subarray [12, -5, -6, 50] has the maximum average value (12+−5+−6+50)/4=12.75(12+−5+−6+50)/4=12.75.


public static void maxAvgSubArray(int arr[],int k){

    float cvOfSubArray = 0;
    float maxValueSubArray =0;

    //assume first sum of first 3 hightest;

    for(int i=0; i<k; i++){
        cvOfSubArray = (cvOfSubArray + arr[i]);
    }

    //maxvalue
    maxValueSubArray = cvOfSubArray;

    int first =1;
    int last = first +k -1;

    while(last < arr.length){
        
       cvOfSubArray  = cvOfSubArray - arr[first-1]+ arr[last];

        if(cvOfSubArray > maxValueSubArray){
                maxValueSubArray = cvOfSubArray;
        }
        first++;
        last++;
    }


System.out.println( "max: " + maxValueSubArray/k);
}
}
