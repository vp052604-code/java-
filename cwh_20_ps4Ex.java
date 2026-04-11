import java.util.Scanner;

public class cwh_20_ps4Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // rock ,paper and scissor
        System.out.println("enter the you1 ");
        String you1 = sc.nextLine();
        System.out.println("enter the you2 ");
        String you2 = sc.nextLine();
      

        if (you1.equals("rock") && you2.equals("scissor") && you1.equals("paper") && you2.equals("Rock")
                && you1.equals("scissors") && you2.equals("paper")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
