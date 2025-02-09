package test01;

//設問7	
//作成ファイル：crud_test/src/test07/cytech07	
//for文を使い、文字 「'あ' 〜 'ん'」 までの範囲でループを行い、文字 「'て'」 のみを出力してください。	

public class cytech07 {

	public static void main(String[] args) {
		String kana = "あいうえおかきくけこさしすせそたちつてとなにぬねのはひふへほまみむめもやゆよらりるれろわをん";
		for(int i = 0; i <= 49; i++) {
			if(i == 18) {
				System.out.println(kana.charAt(18));
			}
		}
	}

}
