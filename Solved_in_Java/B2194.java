import java.util.Scanner;

public class B2194 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test-->0){

            int Nbanks = sc.nextInt(), transfer = sc.nextInt(), credit = sc.nextInt();
            int TargetIDX = 0, MostLeftover=Integer.MIN_VALUE;
            int [] banks= new int[Nbanks];


            for(int i=0;i<Nbanks;i++) {

                banks[i]= sc.nextInt();

                if(banks[i]%transfer >= MostLeftover%transfer) {
                    TargetIDX = i;
                    MostLeftover = banks[i];
                }
            }
            int addTo = 0;
            for(int i=0;i<Nbanks;i++){

                if(i==TargetIDX) continue;
                addTo += banks[i]/transfer;
            }
            
            System.out.println(banks[TargetIDX]+(addTo*credit));
        }
        sc.close();
    }
}
