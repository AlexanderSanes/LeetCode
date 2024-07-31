public class canWinNim292 {

    public static boolean canWinNim(int n) {
        if (n % 4 == 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canWinNim(Integer.parseInt(args[0])));
    }
}


/*
1 - WIN
2 - WIN
3 - WIN
4 - LOSE
5 - WIN
6 - WIN
7 - WIN
8 - LOSE
9 - WIN
10 - WIN
11 - WIN
12
 */