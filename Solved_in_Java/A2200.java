import java.util.Scanner;

public class A2200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test-->0){
            
            int players = sc.nextInt(), temp = Integer.MIN_VALUE, res = 0;
            int [] dishes = new int[players];

            for(int i=0;i<players;i++){

                dishes[i]= sc.nextInt();

                if(temp<dishes[i]) temp = dishes[i];

            }
            for(int i=0;i<players;i++){
                if(temp==dishes[i]) res++;
            }
            System.out.println(res);

        }
        sc.close();
    }
}
