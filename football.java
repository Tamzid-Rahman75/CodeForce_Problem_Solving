import java.util.Scanner;
public class football {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String player = sc.next();
        int zeroCount=0,oneCount=0;
        for(int i = 0 ;i<player.length();i++){

            char C = player.charAt(i);
            if(C=='0'){
                zeroCount++;
                oneCount=0;
            }
            if(C=='1'){
                oneCount++;
                zeroCount=0;
            }
            if(zeroCount >6 || oneCount>6){
                break;
            }
        }
        System.out.println(zeroCount>6 || oneCount>6 ? "YES" : "NO");
    }
}
