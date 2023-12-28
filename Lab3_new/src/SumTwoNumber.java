public class SumTwoNumber {
        public SumTwoNumber() {
        }

        public int execute(int a, int b, int sum) {
            if (a < 1 && b < 1) {
                return sum;
            } else {
                return a < 1 ? execute(a, b - 1, sum + 1) : execute(a - 1, b, sum + 1);
            }
        }
    }
