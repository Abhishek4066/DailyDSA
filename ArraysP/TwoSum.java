package ArraysP;
// Write a function twoSum that takes an array of integers 
// nums and an integer target. The function should return the indices of
public class TwoSum {
    public static void main(String[] args) {
        int arr[]={0,2,3,4,8,6};
        int target = 5;
        TPTwosum(arr, target);
    }

    public static void twoSumsol(int arr[],int target)
    {
        
        for(int i=0; i< arr.length; i++){

            
            for(int j=0; j<arr.length;j++){

                if(arr[i]+arr[j] == target){
                    System.out.println("indices: "+ i+","+j);
                    return;
                }
            }

        }
    }

    public static void TPTwosum(int arr[],int target){
        int f=0;
        int j=arr.length-1;

        for(int i=0; i<arr.length; i++){

            int sum = arr[f] + arr[j];

            if(sum > target){
                j--;
            }
            if(sum<target){
                f++;
            }

            if(sum==target){
                System.out.println("indexces are:" + f+","+j);
            }
        }
    }

}
