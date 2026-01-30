import java.util.Scanner;

public class C4 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), idx = 0;
        String [] stored = new String[n];

        while(n-->0){

            boolean unique = true;
            String username = sc.next();

            for(int i=0;i<idx;i++){ // checking the database if the name exists

                if(stored[i].equals(username)){
                    unique= false;
                    break;
                }
            }
            int num = 0, endIdx=0; String nameWithoutNum ="";
            //hello12    48 57
            if(unique) System.out.println("OK");
            else{


                if(username.codePointAt(username.length()-1)>=48 && username.codePointAt(username.length()-1)<=57){ // detecting whether it already has a number or not

                    for(int i=0;i<username.length();i++){ //collecting the letters only, stops when encounters a number and saves that index

                        if(username.codePointAt(i)>=48 && username.codePointAt(i)<=57){
                            endIdx=i;
                            break;
                        }
                        nameWithoutNum+= username.charAt(i);
                    }

                    int multiplier =0;
                    for(int i=username.length()-1;i>=endIdx;i--){ // collecting the number
                        int temp = username.codePointAt(i) - 48;
                        num+=(int)(Math.pow(10,multiplier))*temp;
                        multiplier++;
                    }
                    num++;
                    username = nameWithoutNum+ num;
                }
                else{
                    num = 1;
                    username = username + num;
                }
                for(int i=0;i<idx;i++){ // checking the database if the newly created one exists

                    if(stored[i].equals(username)){
                        i=-1;
                        num++;
                        username = nameWithoutNum + num;
                    }
                }

                System.out.println(username);
            }
            stored[idx]=username;
            idx++;
        }
    }
}
