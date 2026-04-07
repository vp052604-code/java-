public class cwh_14_string_methods {
    public static void main(String[] args) {
        String name = "Vishnu";
        // System.out.println(name);
        // System.out.println(name.indexOf('h')); //3
        // System.out.println(name.toLowerCase());  //vishnu
        // System.out.println(name.toUpperCase()); //VISHNU
        // System.err.println(name.replace('V', 'v'));

        String trimString = "  pavan  ";
        // System.err.println(trimString);//  pavan
        // System.err.println(trimString.trim());//pavan

        String name2 = "Parle";
        // System.out.println(name2.substring(2));//rle
        // System.out.println(name2.substring(0,4));//Parl

        System.out.println(name.startsWith("Vis"));//true
        System.out.println(name.endsWith("Vis"));//false
        System.out.println(name.charAt(2));//s
        System.out.println(name.indexOf('h'));//3
    }
}