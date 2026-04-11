import java.util.Scanner;
public class cwh_19_ps4 {
    public static void main(String[] args) {
        //Question 1
       /* int a=10;
        if (a==11) {
            System.out.println("a is 10");
        }else{
            System.out.println("a is not 10");
        }

        // Question 2
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks eng");
         m1 = sc.nextByte();
        System.out.println("enter the marks hindi");
         m2 = sc.nextByte();
        System.out.println("enter the marks Gug");
         m3 = sc.nextByte();
        float sum =(m1+m2+m3)/3.0f;
        if (sum>=40 && m1>=33 &&m2>=33 && m3>=33) {
            System.out.println("you are pass");
        }else{
            System.out.println("you are not pass");
        } */

        // //Question 3
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the income");
        float income = sc.nextFloat();
        float tax = 0;
        if(income<=2.3f){
            tax = tax + 0;
        }else if(income>=2.4 && income<=5.0){
            tax = tax + 0.05f * (income - 2.5f);
        }else if(income>5 && income<=10.0){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.20f * (income - 5f);
        }else if(income>=10.0){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10f);
        }
        System.out.println("The total tax to be paid is: " + tax);
        float income2 = income-tax;
         System.out.println("The income after tax is: " + income2);   */

        //Qustion 4 
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day number");
        String day = sc.nextLine();
        switch (day) {
            case "1":// float ma number case 1 or string  ma number case "1"
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            case "7":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }  */

        //Question 5 imp
        Scanner sc = new Scanner(System.in);
        String  wedSite = sc.next();
        if(wedSite.endsWith(".org")){
            System.out.println("This is an organizational website");
        }else if(wedSite.endsWith(".com")){
            System.out.println("This is a commercial website");
        }else{
            System.out.println("This is neither an organizational nor a commercial website");
        }

    }
}
