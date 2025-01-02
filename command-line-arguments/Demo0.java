public class Demo0 {
    public static void main(String[] args) {
        if(args.length>0){
            System.out.print("Arguments are: ");
            for(String x:args){
                System.out.print(x + " ");
            }
        } else{
            System.out.println("No args");
        }
    }
}
