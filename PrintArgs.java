public class PrintArgs {

    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("Didn't work chief. Try it like this: java PrintArgs <arguments>");
        } else {    
            for(String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
