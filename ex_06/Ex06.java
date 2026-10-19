
public class Ex06 {
    public static void sequence(int nbr) {
        if (nbr < 0) {
            return;
        }

        String current = "1";

        for (int i = 0; i <= nbr; i++) {
            System.out.println(current);

            String next = "";
            int count = 1;

            for (int j = 1; j < current.length(); j++) {
                if (current.charAt(j) == current.charAt(j - 1)) {
                    count++;
                } else {
                    next += count + "" + current.charAt(j - 1);
                    count = 1;
                }
            }

            next += count + "" + current.charAt(current.length() - 1);
            current = next;
        }
    }
}
