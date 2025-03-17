public class String_Methods {
    public static void main(String args[]){
        String name="Vishakha";
        System.out.println(name);
        int value=name.length();//Length of the string
        System.out.println(value);
        String lstring=name.toLowerCase();//first small
        System.out.println(lstring);
        String ustring=name.toUpperCase();//All capital
        System.out.println(ustring);
        String nonTrimmedString="Vishakha";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,4));




    }
}
