class InstanceVariable{
    String name; // instance variable
    int marks;   // instance variable

    public static void main(String[] args) {
        InstanceVariable s1 = new InstanceVariable();
        InstanceVariable s2 = new InstanceVariable();

        s1.name = "Yash";
        s2.name = "Lara";

        System.out.println(s1.name); 
        System.out.println(s2.name);  
    }
}