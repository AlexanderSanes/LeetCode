public class addDigits258 {

    public static int sumOfDigits(int num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }
    public static int addDigits(int num) {
        int sum = num;
        while (sum / 10 > 0) {
            sum = sumOfDigits(sum);
        }
        return sum;
    }
    public static int constantComplexityAddDigits(int num) {
        if (num == 0)
            return 0;
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        System.out.println(constantComplexityAddDigits(Integer.parseInt(args[0])));
    }
}
