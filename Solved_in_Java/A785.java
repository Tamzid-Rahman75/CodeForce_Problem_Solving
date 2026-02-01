import java.util.Scanner;

public class A785 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int faces =0;

        while(n-->0){

            String s = sc.next();
            if(s.equals("Tetrahedron")) faces+=4;
            else if (s.equals("Cube")) faces+=6;
            else if (s.equals("Octahedron")) faces+=8;
            else if (s.equals("Dodecahedron")) faces+=12;
            else if (s.equals("Icosahedron")) faces+=20;
            else faces+=0;
        }
        System.out.println(faces);
    }
}
