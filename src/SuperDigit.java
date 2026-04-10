import java.util.Scanner;

public class SuperDigit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNext()) return;
            String n = sc.next();
            if (!sc.hasNextLong()) return;
            long k = sc.nextLong();

            long sumN = 0;
            for (char c : n.toCharArray()) {
                sumN += Character.getNumericValue(c);
            }

            long totalSum = sumN * k;
            System.out.println(superDigit(totalSum));
        }
    }

    private static long superDigit(long x) {
        if (x < 10) return x;
        long sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return superDigit(sum);
    }
}
