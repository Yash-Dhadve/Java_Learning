// Create class Student with private marks.
// Do not allow marks < 0 or > 100.

class Student{
    String sName;
    private int marks;

    Student(String sName){
        this.sName = sName;
    }

    public void setMarks(int marks){
        if(marks <= 100 && marks >= 0){
            this.marks = marks;
            System.out.println("Marks updated successfully.");
        } else {
            System.out.println("Invalid Marks!");
        }
    }

    public int getMarks(){
        return marks;
    }
}
public class Main2 {

    public static void main(String[] args) {
        Student s1 = new Student("Yash");

        System.out.println("Student Name: "+s1.sName+", Marks: "+s1.getMarks());
        s1.setMarks(85);
        System.out.println("Student Name: "+s1.sName+", Marks: "+s1.getMarks());
        s1.setMarks(120);
    }
    
}
