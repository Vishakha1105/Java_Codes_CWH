public class PS3 {
    public static void main(String args[]){
        //Question 1:
        String name="Harry";
        name=name.toLowerCase();
        System.out.println(name);

        //Question 2:
        String text="To Lower Case";
        text=text.replace( " ","_");
        System.out.println(text);

        //Question 3:
        String letter="Dear <|name|>,Thanks a lot!";
        letter=letter.replace(" <|name|>", " Vishakha");
        System.out.println(letter);

        //Question 4:
        String myString="This string contain double and tripple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("  "));

        //Question 5:
        String letter2="Dear Harry,\nthis java course is \nnice.";
        System.out.println(letter2);



    }

}
