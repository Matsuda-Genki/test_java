package test01;

//設問2	
//作成ファイル：crud_test/src/test02/cytech02	
//下記の変数2つを宣言し、2つの変数を用いて次の結果を変数に代入し、出力してください。	
//1）int number1 = 10;	
//2）int number2 = 50;	
//	
//加算(足し算)	
//減算(引き算)	
//乗算(掛け算)	
//除算(割り算)	
//剰余算(割り算の余り)	

public class cytech02 {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 50;
		
		int add = number1 + number2;
		int sub = number1 - number2;
		int mul = number1 * number2;
		int div = number1 / number2;
		int rem = number1 % number2;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);
	}

}
