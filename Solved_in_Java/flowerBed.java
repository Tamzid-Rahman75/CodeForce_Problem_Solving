import java.util.Scanner;
public class flowerBed {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), B = sc.nextInt();
        double res=0;
        int [] Bflower = new int[t];
        int [] totalF = new int[t];

        for(int i=0;i<t;i++){
            Bflower[i]= sc.nextInt();
            totalF[i]=sc.nextInt();
        }

        for(int i=0;true;i++){
            if(i==t){
                i=0;
            }
            if(B==0){
                break;
            }
            if(Bflower[i] != totalF[i]){

                Bflower[i]++;
                totalF[i]++;
                B--;
            }
        }
        for(int i =0;i<t;i++){
            res+= (double)Bflower[i]/totalF[i];
        }

        System.out.println(res/t);

    }
}
