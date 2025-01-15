package ArraysP;

public class SlidingWindowWithOutFixedWindowsize {
    public static void main(String[] args) {
        
        int arr[]={0,0,0,0};

        //         0 1 2 3 4 5 6 7 8 9 10

        SWwinthoutFixedWindow(arr);
    }



    public static void SWwinthoutFixedWindow(int arr[]){

        int winMatches =0;
        int currentWin=0;
        
        int track =0;

        while(track < arr.length){

            if(arr[track] == 1){
                currentWin++;

                if(currentWin > winMatches){
                    winMatches = currentWin;
                }
            }

            if(arr[track] == 0){
                currentWin=0;
            }

            track++;
        }
        System.out.println("total win: "+winMatches);
    }
}
