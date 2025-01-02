public class Demo1 {
    public static void fun2(){
        System.out.println("Inside fun2()");
    }
    public static void fun1(){
        System.out.println("fun1() Begin");
        fun2();
        System.out.println("fun1() Ends");
    }
    public static void main(String[] args) {
        System.out.println("Main Begins");
        fun1();
        System.out.println("Main Ends");
    }
}
