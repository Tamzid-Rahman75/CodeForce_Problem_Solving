import java.util.Scanner;

public class A141 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String guest = sc.next(), host = sc.next(),comp= guest+host, scrambled = sc.next();
        char [] test = new char[scrambled.length()];

        for(int i=0;i<scrambled.length();i++) test[i]= scrambled.charAt(i);

        boolean exist = false;

        if(comp.length() != scrambled.length()) System.out.println("NO");
        else{
            for(int i=0;i<comp.length();i++){

               exist = false;

                for(int j=0;j<scrambled.length();j++){

                   if(comp.charAt(i)==test[j]){
                       exist = true;
                        test[j]='%';
                       break;
                   }
               }
               if(exist == false) break;
          }
          System.out.println(exist? "YES" : "NO");
        }
    }
}
