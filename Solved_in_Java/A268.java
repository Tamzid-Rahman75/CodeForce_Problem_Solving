import java.util.Scanner;

public class A268 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int teams = sc.nextInt(), matched = 0;
        int [] home = new int[teams], away = new int[teams];

        for(int i=0;i<teams;i++){
            home[i]= sc.nextInt();
            away[i]= sc.nextInt();
        }

        for(int i=0;i<teams;i++){

            for(int j=0;j<teams;j++){
                if(home[i]==away[j]) matched++;
            }
        }
        System.out.println(matched);
        sc.close();
    }
}