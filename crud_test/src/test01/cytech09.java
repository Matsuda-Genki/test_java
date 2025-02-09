package test01;

//設問9
//多次元配列を使用し、下記のように出力をしてください。
//5人の学生の4つの科目の点数を格納した2次元配列を作成し、各学生の科目ごとの点数をfor文を使って表示してください。
//＊科目は「国語、数学、理科、社会」とする。
//＊点数に指定はないです。

public class cytech09 {

	public static void main(String[] args) {
		int [][] scores = {
				{79, 58 , 67, 39},
				{44, 82 , 59, 67},
				{75, 51 , 74, 69},
				{76, 82 , 59, 66},
				{91, 80 , 82, 95}
		};
		
		String[] subjects = {"国語","数学","理科","社会"};

		for(int i = 0; i < scores.length; i++) {
			System.out.println("学生" + (i + 1) + "の点数:");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.println("  " + subjects[j] + ": " + scores[i][j]);
			}
			System.out.println();
		}
		
	}

}
