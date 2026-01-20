import java.util.Scanner;

public class equal {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int t =sc.nextInt();

        while(t-->0){



            int [] arr = new int[sc.nextInt()];

            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int tempLength=0, result=0,store=-1;

            for(int i=0;i<arr.length;i++){


                int use = arr[i];

                if(store==-1){
                    store=use;
                }


                if(store==use){
                    tempLength++;
                }


                if(tempLength>result){
                    result=tempLength;
                }

                if(store !=use){
                    store=use;


                    tempLength=1;
                }

            }

        }
    }
}
