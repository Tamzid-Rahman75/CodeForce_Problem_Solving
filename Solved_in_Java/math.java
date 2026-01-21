import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char [] use= new char[S.length()];
        for(int i=0;i<S.length();i++){
            use[i]=S.charAt(i);
        }//3+2+1
        for(int i =0; i<S.length(); i+=2){
            for(int j=i+2;j<S.length();j+=2){
                if(use[i]>use[j]){
                    char temp=use[i];
                    use[i]=use[j];
                    use[j]=temp;
                }
            }
        }
        for(int i=0;i<S.length();i++){
            System.out.print(use[i]);
        }
    }
}