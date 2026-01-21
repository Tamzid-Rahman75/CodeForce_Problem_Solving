import java.util.Scanner;
public class len {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        while(n-->0){
            int arrS= sc.nextInt();
            boolean found = bolV(arrS);
            System.out.println(found ? "YES":"NO");
        }
    }
    public static boolean bolV(int SIZE){
        Scanner sc = new Scanner(System.in);
        int [] perm = new int[SIZE];
        for(int i=0;i<perm.length;i++){
            perm[i]= sc.nextInt();
        }
        boolean res = false;
        for(int i=0;i<perm.length;i++){
            if(perm[i]==SIZE && i !=0){
                res= true;
                break;
            }
            SIZE--;
        }
        return res;
    }
}
