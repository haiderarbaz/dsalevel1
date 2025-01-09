import java.util.*;

public class Cuboid{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter length, breadth and height of cuboid: ");
        double l=scn.nextDouble();
        double b=scn.nextDouble();
        double h=scn.nextDouble();

        double TSA=2*((l*b)+(b*h)+(l*h));
        double LSA=(2*h)*(l+b);
        double volume=l*b*h;
        double perimeter=4*(l+b+h);
        double diagonals=Math.sqrt((l*l)+(b*b)+(h*h));

        System.out.println("Total surface area of Cuboid: " +TSA);
        System.out.println("Lateral surface area of Cuboid: " +LSA);
        System.out.println("Volume of Cuboid: " +volume);
        System.out.println("Perimeter of Cuboid: " +perimeter);
        System.out.println("Diagonals of Cuboid: " +diagonals);

        scn.close();
    }
}