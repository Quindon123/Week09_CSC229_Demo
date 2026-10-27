
/**
 * Homework09
 * Finds the first triangle number with over 100 divisors.
 *
 * @author MoaathAlrajab
 */
public class Homework09 {

    public static void main(String[] args) {

        int triangleNumber = 0;
        int number = 1;

        // Keep searching until a triangle number
        // has more than 100 divisors.
        while (true) {

            // Generate the next triangle number
            triangleNumber += number;

            int divisorCount = 0;

            // Count divisors efficiently
            for (int i = 1; i * i <= triangleNumber; i++) {

                if (triangleNumber % i == 0) {

                    // A divisor usually has a matching pair
                    if (i * i == triangleNumber) {
                        divisorCount++;
                    } else {
                        divisorCount += 2;
                    }
                }
            }

            // Check if the triangle number has
            // more than 100 divisors
            if (divisorCount > 100) {

                System.out.println(
                    "Triangle Number: " + triangleNumber
                );

                System.out.println(
                    "Number of Divisors: " + divisorCount
                );

                break;
            }

            number++;
        }
    }
}

