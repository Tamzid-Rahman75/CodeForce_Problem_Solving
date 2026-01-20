import java.util.Scanner;
public class lnum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String test = sc.next();
        int l=0;
        for(int i=0;i<test.length();i++){
            char C = test.charAt(i);
            if(C=='4' || C=='7'){
                l++;
            }
        }
        if(l==4 || l==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
