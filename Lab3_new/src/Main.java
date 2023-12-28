public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Factorial factor1 = new Factorial();
        Fibonachi fibo1 = new Fibonachi();
        int n = 5;
        int a = factor1.recursionExecute(n);
        int b = factor1.cycleExecute(n);

        assert a == b : "different values";

        System.out.printf("Factorial of " + n + " = " + a + "\n");
        a = fibo1.recursionExecute(n);
        b = fibo1.cycleExecute(n);

        assert a == b : "different values";

        System.out.printf("Fibonachi number with count " + n + " = " + a + "\n");
        SumNumber sn = new SumNumber();
        n = sn.execute(7234);
        System.out.printf("Sum of number 7234 = " + n + "\n");
        SumTwoNumber stn = new SumTwoNumber();
        a = 5;
        b = 6;
        n = stn.execute(a, b, 0);
        System.out.printf("Sum of " + a + " and " + b + " = " + n + "\n");
    }
}



