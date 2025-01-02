public class Demo3 {
    public static int getMax(int x, int y){
        if(x>y){
            return x;
        } else{
            return y;
        }
    }
    public static void main(String[] args) {
        int x=10;
        int y=15;
        System.out.println(getMax(x, y));
    }
}
