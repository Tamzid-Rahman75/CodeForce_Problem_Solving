import java.util.Scanner;

public class A466 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int rides = sc.nextInt(), StRides = sc.nextInt(),PRcost = sc.nextInt(), STcost = sc.nextInt();
        sc.close();

        int P1 = rides*PRcost;
        int P2 = (int)(Math.ceil((double)rides/StRides)*STcost);
        int P3 = (rides%StRides)*PRcost + (rides/StRides)*STcost;

        System.out.println(Math.min(P1, Math.min(P2, P3)));
    }
}
