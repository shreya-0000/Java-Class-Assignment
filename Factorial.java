public record Factorial() {
    public static int fac(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact =fact* i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int result = fac(5);
        System.out.println("Factorial of 5" + " is: " + result);
    }

}
