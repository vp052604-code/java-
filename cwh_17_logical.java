public class cwh_17_logical {
    public static void main(String[] args) {
        //logical op  f=false t = true
        // "and" f && t = f
        // t && f = f
        // f && f = f
        // t && t = t
        boolean a = true;
        boolean b = false;
        // if (a && b) {
        // System.out.println("yes");            
        // }else{
        //     System.out.println("no");
        // }

        // "or"  f=false t = true
        // f || f = f
        // t || f = t
        // f || t = t
        // t || t = t
        // if (a || b) {
        //     System.out.println("yes");
        // }else{
        //     System.out.println("No");
        // }

        //" not" 
        // !t=f
        //!f=f
        System.out.println("not(a)is ");         
        System.out.println(!a);         
        System.out.println("not(b)is ");
        System.out.println(!b);
    }
}
