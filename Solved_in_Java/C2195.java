import java.util.Scanner;

public class C2195 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        
        while(test-->0){

            int n = sc.nextInt(), Operations=0;
            int [] diceRoll = new int[n];

            for(int i=0;i<n;i++) diceRoll[i]= sc.nextInt();

            for(int i=1;i<n;i++){

                if((diceRoll[i] == diceRoll[i-1]) || (diceRoll[i] == 7-diceRoll[i-1])){

                    if(i<n-1){
                        diceRoll[i]= getnum(diceRoll[i-1], diceRoll[i+1]);
                        i++;
                    }
                    else{
                        for(int j=1;j<=6;j++){

                            if(j != diceRoll[i] && j != 7 - diceRoll[i]){
                                diceRoll[i] = j; break;
                            }
                        }
                    }
                    Operations++;
                }

            }

            System.out.println(Operations);

        }
        sc.close();
    }
    public static int getnum(int prev , int nxt){

        int ret = 0;

        for(int i=1;i<=6;i++){

            if((i != prev) && (i != 7-prev) && (i != nxt) && (i != 7-nxt)){
                ret = i; break;
            }

        }
        return ret;
    }
}
