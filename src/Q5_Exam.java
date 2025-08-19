public class Q5_Exam {
    public static void main(String[]args){

                int start = 51;
                int end = 99;

                int count = 0;
                int sum = 0;

                for (int num = start; num <= end; num++) {     // Not dono by me --- chatgpt
                    if (isPrime(num)) {
                        count++;
                        sum += num;
                    }
                }

                System.out.println("Number of prime numbers between 50 and 100: " + count);
                System.out.println("Sum of prime numbers between 50 and 100: " + sum);
            }

            // Function to check if a number is prime
            private static boolean isPrime(int n) {
                if (n <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }



    }


