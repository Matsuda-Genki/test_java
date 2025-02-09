package test01;

//設問8
//作成ファイル：crud_test/src/test08/cytech08
//for文を2回だけしようし、以下の出力結果を再現しなさい。  
//0
//00
//000

public class cytech08 {

	public static void main(String[] args) {
		for(int i = 0; i <  3; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("0");
			}
			System.out.println();
		}

	}

}
