import java.util.Scanner;

public class DUBSTEP {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        String inp = sc.next();
        String test = "WUB";
        String res="";
        boolean gap= false;
        int bal=0;

        for(int i=0;i<inp.length();i++){

            String store="";
            for(int j=i;j<3+i && j<inp.length();j++){
                char C = inp.charAt(j);
                store+=C;
                bal=j;
            }
            if(store.equals(test)){
                i=bal;
                if(gap){
                    res+=" ";
                    gap=false;
                }
            }else{
                res+=inp.charAt(i);
                gap=true;
            }
        }
        System.out.println(res);
    }
}
