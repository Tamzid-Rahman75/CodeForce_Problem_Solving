import java.util.Scanner;

public class C2200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test-->0){

            int n = sc.nextInt();
            String s = sc.next();
            char [] str = new char[n];

            for(int i=0;i<n;i++) str[i]= s.charAt(i);

            for(int i=0;i<n;i++){

                if(str[i]=='*') continue;
                int idx = -1;

                for(int j=i+1;j<n;j++){

                    if(str[j]=='*') continue;
                    idx = j;
                    break;
                }

                if(idx == -1) continue;

                if(str[i]==str[idx]){

                    str[i] = '*'; str[idx] = '*';
                    i=-1;
                }
            }
            boolean flag = true;

            for(int i=0;i<n;i++){
                if(str[i] != '*'){
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "YES":"NO");
        }
        sc.close();
    }
}