package test01;
import java.time.Instant;

//設問4	
//作成ファイル：crud_test/src/test04/cytech04	
//設問3の内容をswitch文で行いなさい。	

public class cytech04 {

	public static void main(String[] args) {
		long now = Instant.now().getEpochSecond();
			switch((int) (now % 2)) {
				case 0:
					System.out.println("偶数です。");
					break;
				case 1:
					System.out.println("奇数です。");
					break;
				default:
					System.out.println("不正な値です。");
					break;
			}

	}

}
