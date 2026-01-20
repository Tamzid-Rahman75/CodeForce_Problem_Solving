import java.util.Scanner;
public class ez {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int opinion = sc.nextInt();
        boolean easy = true;
        for(int i =0;i<opinion;i++){
            int c = sc.nextInt();
            if(c==1){
                easy=false;
            }
        }
        System.out.println(easy ? "EASY" : "HARD");
    }
}
