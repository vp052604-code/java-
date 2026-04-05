import java.util.Scanner;
public class Ex1 {
    public static void main(String[] arges){
        Scanner sc = new Scanner(System.in);
        System.out.println("sub1");
        int a = sc.nextInt();

        System.out.println("sub2");
        int b = sc.nextInt();

        System.out.println("sub3");
        int c = sc.nextInt();

        int sum = (a+b+c);
        System.out.println(sum); 
        int percentage = sum/3;
        System.out.println(percentage); 
    }
}
