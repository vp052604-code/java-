public class cwh_15_ps3 {
    public static void main(String[] args) {
        // Question 1
        String name ="Vishnu";
        System.out.println(name.toLowerCase());//vishnu
        //Question 2
        String text = "my  name is vishnu";
        System.out.println(text.replace(" ", "_"));//my__name_is_vishnu
        //Question 3
        String letter =" Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "vishnu");
        System.out.println(letter);//Dear vishnu, Thanks a lot
        //Question 4
        String str = "my name is vishnu";
        System.err.println(str.indexOf(" "));//2
        System.err.println(str.indexOf("  "));//-1
        //Question 5
        String txt ="my name \n\t is vishnu";
        System.out.println(txt);
        // my name 
        // is vishnu
    } 
}
