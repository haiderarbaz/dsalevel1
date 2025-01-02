class Points0{
    int x;
    int y;
}

public class Point0 {
    public static void main(String[] args) {
        Points p = new Points();
        p.x=5;
        p.y=10;
        fun(p);
        System.out.println(p.x + " " + p.y);
    }

    public static void fun(Points p){
        p=new Points();
        p.x=10; p.y=10;
    }
}
