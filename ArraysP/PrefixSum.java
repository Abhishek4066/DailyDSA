package ArraysP;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        prefix(arr);
    }

    public static void prefix(int arr[]){


        int prefix[] = new int [arr.length];

        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++){

            prefix[i] = prefix[i-1]+arr[i];
        }
        ReverseArray.printLoop(prefix);
    }


}
