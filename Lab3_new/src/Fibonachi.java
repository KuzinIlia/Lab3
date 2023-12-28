public class Fibonachi {
        public Fibonachi() {
        }

        public int recursionExecute(int n) {
            return n <= 1 ? n : recursionExecute(n - 2) + recursionExecute(n - 1);
        }

        public int cycleExecute(int n) {
            if (n <= 1) {
                return n;
            } else {
                int result = 0;
                int prev = 0;
                int current = 1;

                for(int i = 1; i < n; ++i) {
                    result = current + prev;
                    prev = current;
                    current = result;
                }

                return result;
            }
        }
    }
