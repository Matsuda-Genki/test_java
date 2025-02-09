package test01;
import java.time.Instant;

//設問3	
//作成ファイル：crud_test/src/test03/cytech03	
//「Instant.now().getEpochSecond()」を使用し、1970年1/1 00:00:00から現在まで何秒たったかの値を取得し	
//取得した値によって以下の出し分けをif文を使って条件を分けて出力をさせてください。	
//偶数→偶数です	
//奇数→奇数です	

public class cytech03 {

	public static void main(String[] args) {
		long now = Instant.now().getEpochSecond();
			if(now % 2 ==0) {
				System.out.println("偶数です。");
			}else if(now % 2 != 0){
				System.out.println("奇数です。");
			}else {
				System.out.println("不正な値です。");
			}
	}

}
