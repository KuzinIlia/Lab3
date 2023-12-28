public class Factorial {
    public Factorial() {
    }

    public int recursionExecute(int n) {
        int result = 1;
        if (n != 1 && n != 0) {
            if (n < 0) {
                System.out.print("Error\n");
                return 0;
            } else {
                result = n * recursionExecute(n - 1);
                return result;
            }
        } else {
            return result;
        }
    }

    public int cycleExecute(int n) {
        int result = 1;
        if (n < 0) {
            System.out.print("Error\n");
            return 0;
        } else {
            for(int i = 0; n > 0; --n) {
                result = n * result;
            }

            return result;
        }
    }
}
