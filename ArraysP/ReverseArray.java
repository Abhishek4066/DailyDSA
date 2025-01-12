package ArraysP;

public class ReverseArray {
public static void main(String[] args) {
    int arr[] ={1,23,45,6,4,2,56};
    reverseArray(arr);
    printLoop(arr);
}

public static void reverseArray(int arr[]){
    int p1 = 0;
    int p2 = arr.length-1;

    while (p1 < p2) { 
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;

        p1++;
        p2--;
    }

}

public static void printLoop(int arr[]){

    for(int i=0; i<arr.length; i++){

        System.out.print(arr[i] + " ,");
    }
}
}