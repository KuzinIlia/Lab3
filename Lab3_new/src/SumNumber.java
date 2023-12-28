public class SumNumber {
        public SumNumber() {
        }

        public int execute(int n) {
            int sum = 0;
            if (n < 10) {
                sum += n;
                return sum;
            } else {
                sum = n % 10 + execute(n / 10);
                return sum;
            }
        }
    }
