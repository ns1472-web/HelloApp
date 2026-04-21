public class uc6{
public static void main(String[] args) {

        StringBuilder nameBuilder = new StringBuilder();

        int count = 0;

        for (String name : args) {

            nameBuilder.append(name);

            if (count < args.length - 1) {
                nameBuilder.append(", ");
            }

            count++;
            nameBuilder.append(name).append(", ");
        }

        System.out.println("Hello, " + nameBuilder.toString() + "!");
        String names = nameBuilder.substring(0, nameBuilder.length() - 2);

        System.out.println("Hello, " + names + "!");
    }

}