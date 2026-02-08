import java.util.Scanner;

public class A230 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int CharStrength = sc.nextInt(), dragons = sc.nextInt();
        int [] dragStrength = new int[dragons], bonuses = new int[dragons];

        boolean win = true;

        for(int i=0;i<dragons;i++){
            dragStrength[i]=sc.nextInt();
            bonuses[i]=sc.nextInt();
        }
        int idx = 0, temp = 0, compare=-1;

        for(int i=0;i<dragons;i++){

            compare = Integer.MAX_VALUE;
            temp = -1;

            for(idx=0;idx<dragons;idx++){

                int num = dragStrength[idx];
                if(num == -1) continue;

                if(num < compare){
                    compare=num;
                    temp = idx;
                }
            }
            
            if(dragStrength[temp]>=CharStrength){
                win = false;
                break;
            }

            else{
                CharStrength+= bonuses[temp];
                dragStrength[temp]=-1;
            }
        }
        System.out.println(win? "YES" : "NO");
    }
}
