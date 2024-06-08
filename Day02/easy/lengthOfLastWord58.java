public class lengthOfLastWord58 {
    public static int lengthOfLastWord(String s) {
        String[] parts = s.split(" ");
        return parts[parts.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(args[0]));
    }
}
