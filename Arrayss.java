public class Arrayss {
    public static void main(String[] args) {
        /*classroom of 500 students-You have to store marks of 500 students
        You have 2 options:
        1.Create 500 variables
        2.Use Arrays
     */
        int [] marks;
        marks=new int [5];//Memory Allocation
        marks[0]=100;
        marks[1]=60;
        marks[2]=70;
        marks[3]=90;
        marks[4]=86;
        System.out.println(marks[4]);

        //Declaration,memory allocation and intialization together
        //We cant take marks as new for same thing
        int [] marks1 = {98,45,79,99,88};
        System.out.println(marks1[2]);

    }
}
