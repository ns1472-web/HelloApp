public class uc5 {
    public static void main(String[] args) {
       
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        
        StringBuilder nameBuilder = new StringBuilder();
        
        for (int i = 0; i < args.length; i++) {
            nameBuilder.append(args[i]);

            
            if (i < args.length - 1) {
                nameBuilder.append(", ");
            }
        }

      
        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}