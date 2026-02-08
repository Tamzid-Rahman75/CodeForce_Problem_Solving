import java.util.Scanner;

public class A443 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char [] alp = new char[26]; int idx =0;
// 97 122
        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);
            if(s.codePointAt(i)<97 || s.codePointAt(i)>122) continue;
            boolean unique = true;
            for(int j=0;j<idx;j++){

                if(alp[j]==c){
                    unique = false;
                    break;
                }
            }
            if(unique){
                alp[idx]=c;
                idx++;
            }
        }
        System.out.println(idx);
    }
}
