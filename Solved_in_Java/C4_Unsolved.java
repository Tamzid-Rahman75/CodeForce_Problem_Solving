import java.util.Scanner;
// unsolved, facing TLE
public class C4_Unsolved {
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

            //hello12    48 57
            if(unique) System.out.println("OK");

            else{

                int num = 1; String nameWithoutNum ="";

                for(int i=0;i<username.length();i++){   //collecting the letters only, stops when encounters a number and saves that index

                    if(username.codePointAt(i)>=48 && username.codePointAt(i)<=57){
                        break;
                    }
                    nameWithoutNum+= username.charAt(i);
                }

                for(int i=0;i<idx;i++){ // checking the database if the newly created one exists

                    if(stored[i].equals(nameWithoutNum+num)){
                        i=-1;
                        num++;
                    }
                }
                username = nameWithoutNum+ num;
                System.out.println(nameWithoutNum+num);

            }
            stored[idx]=username;
            idx++;
        }
    }
}
