import java.util.Scanner;

public class A151 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int friends = sc.nextInt(), bottles = sc.nextInt(), mililitre = sc.nextInt(), limes = sc.nextInt(), slices = sc.nextInt(), salt = sc.nextInt();
        int mlDrink = sc.nextInt(), saltReq = sc.nextInt(); //requires 1 slice of lime
        sc.close();
        int res = Math.min(((bottles*mililitre)/mlDrink),(limes*slices));
        res = Math.min(res, salt/saltReq);

        System.out.println(res/friends);
    }
}
