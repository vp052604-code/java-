public class cwh_24_break_continue {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("hello java"+i);
            if (i==2) {
                System.out.println("end the loop");
                //break;
                continue;
            }
        }
    }
}
