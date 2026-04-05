import java.util.Scanner;
public class ch1_ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the name");
        // String name = sc.next(); //user name
        // System.out.println("hello " + name); 

        System.out.println("enter the number");
        boolean bool = sc.hasNextInt();
        System.out.println(bool);


    }
}