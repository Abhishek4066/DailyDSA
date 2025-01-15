package ArraysP;

public class SlidingWindow {
    public static void main(String[] args) {
        int arr[]={100,2,3,45,5,6,7};
        SlidingWindowImp(arr, 3);
     
    }



    public static void SlidingWindowImp(int arr[],int windowSize){

            int maxMoney=0;
            int currentWindowMoney=0;

            for(int i=0;i<windowSize; i++){

                currentWindowMoney = currentWindowMoney + arr[i];
            }

            maxMoney = currentWindowMoney;

            int firstElement =1;
            int lastWindowElement = firstElement + windowSize -1;

            while(lastWindowElement < arr.length){

                currentWindowMoney = currentWindowMoney - arr[firstElement-1] + arr[lastWindowElement];

                if(currentWindowMoney > maxMoney){
                    maxMoney = currentWindowMoney;
                }

                 lastWindowElement++;
                 firstElement++;
            }
            System.out.println("Max Money: "+ maxMoney);
    }
}
