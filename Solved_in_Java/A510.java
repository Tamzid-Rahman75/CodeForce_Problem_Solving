import java.util.Scanner;

public class A510 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), column = sc.nextInt();
        boolean fromLeft = true;

        for(int i=0;i<row;i++){



            for(int j=0;j<column;j++){
                if(i%2==0) System.out.print("#");
                else{
                    if(fromLeft && j != column-1) System.out.print(".");
                    else if(fromLeft && j == column-1){
                        fromLeft = false;
                        System.out.print("#");
                    }
                    else if(!fromLeft && j==0) System.out.print("#");
                    else if(!fromLeft && j<column-1) System.out.print(".");
                    else{
                        System.out.print(".");
                        fromLeft = true;
                    }
                }
            }
            System.out.println();
        }
    }
}
