package ArraysP;
// Write a function twoSum that takes an array of integers 
// nums and an integer target. The function should return the indices of
//  the two numbers in the array that add up to the target.
public class TwoSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target = 5;
        twoSumsol(arr, target);
    }

    public static void twoSumsol(int arr[],int target){
        
        for(int i=0; i< arr.length; i++){

            
            for(int j=0; j<arr.length;j++){

                if(arr[i]+arr[j] == target){
                    System.out.println("indices: "+ i+","+j);
                    return;
                }
            }

        }
    }

}
