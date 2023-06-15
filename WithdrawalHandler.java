import java.util.Scanner;

public class WithdrawalHandler {

    public static int withdrawalHandler(int currentBalance) {
        Scanner scanner = new Scanner(System.in);

        ATMSystem atm = new ATMSystem();

        int withdrawal = 0; // 出金額初期化

        if (currentBalance == 0) { // 貯金残高が0の場合
            System.out.println("残高がありません");
            atm.mainSystem();

        }

        // 出金する額を入力する
        System.out.println("ご出金額を入力してください");
        String systemInput = scanner.next();

        try {// 整数値以外が入力されている場合はエラー処理
            withdrawal = Integer.parseInt(systemInput);

            if (withdrawal == 0 || withdrawal > 500000) {
                System.out.println("1 円から 50 万円以内で入力してください");
                withdrawalHandler(currentBalance);

            }

            if (withdrawal > currentBalance) {
                System.out.println("残高が不足しています、残高は " + currentBalance + " 円です");
                withdrawalHandler(currentBalance);

            } else {
                System.out.println(withdrawal + " 円お返ししました");

            }

        } catch (NumberFormatException e) {
            System.out.println("1 円から 50 万円以内で入力してください");
            withdrawalHandler(currentBalance);
        }

        return currentBalance -= withdrawal;
    }
}
