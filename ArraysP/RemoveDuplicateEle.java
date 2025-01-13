package ArraysP;

public class RemoveDuplicateEle {
public static void main(String[] args) {
    int arr[]={1,1,2,2,3,4,4,5,6,7,8,9};
    withWhileLoop(arr);
    ReverseArray.printLoop(arr);
    
}

public static void removeDupli(int arr[]){
    int first =0;
    for(int second=1; second<arr.length;second++){
        
    
        if(arr[first] != arr[second]){
            
            first++;
            arr[first]= arr[second];
            
        }
    }
    System.out.println("sum"+first);
}

public static void withWhileLoop(int arr[]){

    int i=0;
    int j=1;

    while(j<arr.length){
        
        if(arr[i]!=arr[j]){

            i++;
            arr[i]=arr[j];
        }
        j++;
    }
    System.out.println("ele: "+i);
}



}
