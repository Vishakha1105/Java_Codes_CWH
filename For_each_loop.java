public class For_each_loop {
    public static void main(String[] args) {
        int [] marks={98,45,79,99,80};
        System.out.println("Length of the array is:"+marks.length);//Length of the array
        float [] marks1={98.6f,90.0f,78.8f,56.4f,12.5f};
        System.out.println(marks1[4]);
        String [] students={"Onkar","Vishakha","Ankita","Shubham_Dada"};
        System.out.println(students[0]);
        System.out.println(students.length);
        //Displaying the array

        System.out.println("Printing array elements using for loop of marks:");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);

        }

        //Displaying the array elements using in the reverse order
        System.out.println("Array elemnts of the array marks in reverse order:");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);

        }
        //For each loop
        //Diplaying the array marks using for each loop:
        System.out.println("Printing array elements of marks array using for each loop:");
        for(int element:marks){
            System.out.println(element);

        }

    }
}
