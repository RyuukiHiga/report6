import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int user = Player();

		int AI = jankenEnemy();

		String result = judgeJanken(user,AI);

		showResult(user, AI, result);

        
        int user2 = Player2();

		int AI2 = attimuiteEnemy();

		String result2 = judgekao(user2,AI2);

		//showResult2(user2, AI2, result2);
	}

	public static int Player() {

		Scanner stdin = new Scanner(System.in);

		while(true) {

			System.out.println("ジャンケンポン");
			System.out.print("(グー：0，チョキ：1、パー：2)　");

			if(stdin.hasNextInt()) {
				int number = stdin.nextInt();

				if(number<=-1 || number >=3) {
					System.out.println("エラー入力し直してください");
					continue;

				}else {
					return number;
				}
			}else {
				System.out.println("エラー入力し直してください");
				stdin.next();
			}
		}
	}

	public static int jankenEnemy() {

		Random random = new Random();
		return random.nextInt(3);
	}

	public static String judgeJanken(int user,int AI) {

		String[][] janken= {
				{"あいこ","勝ち","負け"},
				{"負け","あいこ","勝ち"},
				{"勝ち","負け","あいこ"}};

		return janken[user][AI];
	}
    
	public static void showResult(int user,int AI,String result) {
		String[] janken= {"グー","チョキ","パー"};
		System.out.println("あなたの手:"+janken[user]+",コンピュータの手:"+janken[AI]);
		System.out.println("結果："+result);

	}

    
    public static int Player2() {

		Scanner stdin = new Scanner(System.in);

		while(true) {

			System.out.println("あっち向いてホイ");
			System.out.print("(上：0、下：1、左：2、右：3)　");

			if(stdin.hasNextInt()) {
				int number = stdin.nextInt();

				if(number<=-1 || number >=4) {
					System.out.println("エラー入力し直してください");
					continue;

				}else {
					return number;
				}
			}else {
				System.out.println("エラー入力し直してください");
				stdin.next();
			}
		}
	}

	public static int attimuiteEnemy() {

		Random random = new Random();
		return random.nextInt(4);
	}
    public static String judgekao(int user2,int AI2) {

		String[][] attimuite= {
				{"勝ち","負け","負け","負け"},
				{"負け","勝ち","負け","負け"},
				{"負け","負け","勝ち","負け"},
				{"負け","負け","負け","勝ち",}};

		return attimuite[user2][AI2];

    /* 
    public static void showResult2(int user2,int AI2,String result2) {
		String[] attimuite= {"上","下","左","右"};
		System.out.println("あなたの向き:"+attimuite[user2]+",コンピュータの向き:"+attimuite[AI2]);
		System.out.println("結果："+result2);

	}*/
    
}
}
