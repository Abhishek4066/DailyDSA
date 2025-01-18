package ArraysP;

public class vowels {
    public static void main(String[] args) {
        

        String name = "Abhishek";

        name =name.toLowerCase();

        char [] ch = name.toCharArray();
        char [] vo ={'a','e','i','o','u'};
        int right =0;
        int left =0;
        int counter =0;

        while(right < ch.length){

            if(ch[right] == vo[left]){
                counter++;
            }
            left++;
            right++;
        }

        System.out.println("count : "+ counter);
    }
}
