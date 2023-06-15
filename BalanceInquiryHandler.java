public class BalanceInquiryHandler{

    public static void balanceInquiryHandler(int currentBalance){

        int balance = currentBalance;

        if (balance > 0) {
            System.out.println("残高は " + balance + " 円です");
        } else {
            System.out.println("残高がありません");
        }
    }
}