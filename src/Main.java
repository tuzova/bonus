public class Main {
    public static void main(String[] args) {
        int account = 185;
        int credit = 1_999;
        //short version:
        //int total = credit > 1_000 ? account + credit + (credit/100) : account + credit;
        int total;
        if (credit > 1_000) {
            total = account + credit + (credit/100);
        } else {
            total = account + credit;
        }
        System.out.println(total);
        }
}
