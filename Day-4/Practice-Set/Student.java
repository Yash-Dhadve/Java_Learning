// Create class Student with method displayDetails().

public class Student {
    private String stName;
    private int std;
    private int rollNo;

    Student(String stName, int std, int rollNo){
        this.stName = stName;
        this.std = std;
        this.rollNo = rollNo;
    }

    void displayDetails(){
        System.out.println("Student Name: " + stName);
        System.out.println("Standard: " + std);
        System.out.println("Roll No.: " + rollNo);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Yash", 10, 1);

        s1.displayDetails();
    }
}
