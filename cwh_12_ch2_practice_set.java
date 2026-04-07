import java.util.Scanner;
public class cwh_12_ch2_practice_set {

    public static void main(String[] args) {
                // Question 1
        float a = 7 / 4 * 9 / 2;
        // System.out.println(a);//4.0 falls in int and than

        float b = 7 / 4f * 9 / 2f; //f
        // System.out.println(b);//7.875 true float value

                // Question 2
        
        char grade = 'A';
        grade = (char)(grade + 8);
       // System.out.println(grade);//I

        //Decrypting the grade
        grade = (char)(grade - 8);
        //System.out.println(grade);//A

                // Question 3
        // Scanner sc = new Scanner(System.in);n
        //System.out.println("enter the number");
        // int i = sc.nextInt();
       // System.out.println(i);
       // System.out.println(i>5);

                // Question 4
        boolean ch =(('v'*'v' - 'u'* 'u')/(2*'a'*'s')) !=0;
        // System.out.println(ch); //false
    }
}