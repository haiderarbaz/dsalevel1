//Non-primitive data types

class Points{
    int x;
    int y;
}

public class Point{

    public static void fun(Points p){
        p.x=10;
        p.y=10;
    }
    public static void main(String[] args) {
        Points p=new Points();
        p.x=5;
        p.y=10;
        fun(p);
        System.out.println(p.x + " " + p.y);
    }
}

