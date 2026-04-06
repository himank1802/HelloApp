public class UC5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder sb = new StringBuilder();
            boolean first = true;
            for (String name : args) {
                if (!first) {
                    sb.append(", ");
                }
                sb.append(name);
                first = false;
            }
            System.out.println("Hello, " + sb.toString() + "!");
        }
    }
}