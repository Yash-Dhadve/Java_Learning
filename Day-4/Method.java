public class Method {

    int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Method c1 = new Method();
        int result = c1.add(1,2);
        System.out.println("Result: "+result);
    }
}
