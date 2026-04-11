public class cwh_25_ps5 {
    public static void main(String[] args) {
        // Qustion 1
        /*int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        } */
        // Qustion 2
       /* int sum =0;
        int n =4;
        for(int i =0;i<n;i++){
            sum = sum + (2*i);
        }
        // the sum of even  number is
        // 0 ,2, 4,6
        System.out.println(sum); */
        
        // Qustion 3    5,10,15,20...
        /* int n=5;
        int mul=0;
        for(int i=1;i<=10;i++){
        // System.out.println(n*i);
        System.out.printf("%d * %d = %d \n" , n, i, n*i);
        } */
        // Qustion 4 
        /*
        int n=5;
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial = factorial * i;
        }
        System.out.println(factorial); */
        // Qustion 5
        /* 
        int n=5 ,i=n, j=0;
        while (i>0) {
            i--;
            while (j<i) {
            System.out.print("*");
            j++;
            }
            System.out.print("\n");
            j=0;
        }    */
            // Qustion 6;
        int n=8;
        int sum=0;
        int mul=0;
        for(int i=1;i<=10;i++){
        // System.out.println(n*i);
       sum +=n*i;
        } 
         System.out.print(sum);
    }

}
