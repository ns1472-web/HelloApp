public class UC4 {

    public static void main(String[] args) {

        String name;
        String names;

        if (args.length > 0) {
            name = args[0];

            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {

                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }

            }

            names = nameBuilder.toString();

        } else {
            name = "World";

            names = "World";

        }

        System.out.println("Hello, " + name + "!");
        System.out.println("Hello, " + names + "!");

    }

}