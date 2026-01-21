import java.util.Scanner;
public class binary {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String b1 = sc.next(), b2 = sc.next();
        for(int i=0;i<b1.length();i++){
            char C1 = b1.charAt(i);
            char C2 = b2.charAt(i);
            if(C1==C2){
                System.out.print(0);
            }else{
                System.out.print(1);
            }
        }
    }
}
