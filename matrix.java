import java.util.Scanner;

public class matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int upp=0,low=0;
        String test =sc.nextLine();
        for(int i =0;i<test.length();i++){
            char c = test.charAt(i);
            int ascii = (int)c;
            if(ascii<=90 && ascii>=65){
                upp++;
            }else{
                low++;
            }
        }
        if(low>=upp){
            System.out.println(test.toLowerCase());
        }else{
            System.out.println(test.toUpperCase());
        }

    }
}
