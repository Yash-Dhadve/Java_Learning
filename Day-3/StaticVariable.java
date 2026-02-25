public class StaticVariable {
    static int count = 0; // static variable

    StaticVariable(){
        count++;
    }

    public static void main(String[] args) {
        StaticVariable s1 = new StaticVariable();
        StaticVariable s2 = new StaticVariable();
        StaticVariable s3 = new StaticVariable();
        
        System.out.println(StaticVariable.count);
    }
}
