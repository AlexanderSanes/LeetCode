public class convertToTitle168 {

    public static String convertToTitle(int columnNumber) {
        final String alfabet = "ZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder res = new StringBuilder();
        int n = columnNumber;
        while (n > 26) {
            res.insert(0, alfabet.charAt(n % 26));
            if (n % 26 == 0)
                n--;
            n /= 26;
        }
        res.insert(0, alfabet.charAt(n));
        return res.toString();
    }

    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        System.out.println(convertToTitle(n));
    }
}
