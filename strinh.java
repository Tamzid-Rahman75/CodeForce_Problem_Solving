import java.util.Locale;
import java.util.Scanner;
public class strinh {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String use = t.toLowerCase();
        for(int i=0;i<t.length();i++){
            char C = use.charAt(i);
            if(C=='A' || C=='E' || C=='I' || C=='O' || C=='U' || C=='a'|| C=='e' || C=='i' || C=='o' || C=='u' || C=='Y'|| C=='y'){
                continue;
            }else{
                System.out.print("."+C);
            }
        }
    }
}
