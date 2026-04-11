import java.util.Scanner;
public class cwh_18_elseif {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("you are  driving the car");
        }else if( 18>age){
            System.out.println("you are not a driving the car");
        }else{
            System.out.println("driving the car is not allowed99");
        }   
        if (10>age) {
            System.out.println("goto school");
        }
    }
}
