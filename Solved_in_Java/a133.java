import java.util.Scanner;

public class a133 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        boolean res = false;
        String s = sc.next();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='H' || c=='Q' || c=='9' || c=='+'){
                res= true;
                break;
            }
        }
        System.out.println(res ? "YES" : "NO");
    }
}
