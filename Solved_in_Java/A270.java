import java.util.Scanner;

public class A270{

    public static void main(String [] args){

       Scanner sc = new Scanner(System.in);
            
            int inp = sc.nextInt();
            int c1 = 4, c2 =inp-c1;

            while(true){

                boolean divisible1 = false, divisible2 = true;

                for(int i=2;i<c1;i++){
                    if(c1%i==0){
                        divisible1 = true;
                        break;
                    }
                }

                for(int i=2;i<c2;i++){
                    if(c2%i==0){
                        divisible2 = true;
                        break;
                    }
                }

                if(divisible1 && divisible2){
                    System.out.println(c1+" "+c2);
                    break;
                }

                else{
                    c1++ ; c2--;
                }
            }
     }
}