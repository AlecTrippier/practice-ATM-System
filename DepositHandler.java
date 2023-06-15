import java.util.Scanner;

public class DepositHandler {

    private static Scanner scanner = new Scanner(System.in); // scannerインスタンス

    public static int depositHandler(int currentBalance) {

        

        int deposit = 0;


        do {
            System.out.println("ご入金額を入力してください");
            String systemInput = scanner.next(); // 文字列の入力を受け付ける
            if (systemInput.matches("[1-9]|[1-9][0-9]{1,5}|1[0-9]{6}|2000000")) { // 1〜200万までの数値かどうか判定する
                deposit = Integer.parseInt(systemInput); // 文字列型から整数値型に変換して代入する

                System.out.println(deposit + " 円お預かりしました");
                break; // ループを抜ける
            } else {
                System.out.println("1 円から 200 万円以内で入力してください");
            }
        } while (true);


        return currentBalance += deposit;
    }

}
