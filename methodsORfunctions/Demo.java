public class Demo {

    public static void fun(){
        System.out.println("Inside Fun()");
    }
    public static void main(String[] args) {
        System.out.println("Before Call");
        fun();
        System.out.println("After Call");
    }
}
