import java.util.Scanner;
public class chat {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String helo = sc.next();
        String test = "hello";
        String dump = "";
        int idx=0;
        for(int i=0;i<helo.length();i++){
            char C = helo.charAt(i);
            if(test.charAt(idx)==C){
                dump+=C;
                idx++;
            }
            if(idx==5){
                break;
            }
        }
        System.out.println(dump.equals("hello") ? "YES" : "NO");
    }
}
