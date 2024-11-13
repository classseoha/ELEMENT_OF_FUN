
public class lottoNumber {

	public static void main(String[] args) {
		
		System.out.print("이번 주 로또 번호: ");
		
		int lotto1 = 0;
		lotto1 = (int)(Math.random() * (45-1+1) + 1);
		System.out.print(lotto1 + ", ");
		
		int lotto2 = 0;
		lotto2 = (int)(Math.random() * (45-1+1) + 1);
		System.out.print(lotto2 + ", ");
		
		int lotto3 = 0;
		lotto3 = (int)(Math.random() * (45-1+1) + 1);
		System.out.print(lotto3 + ", ");

		int lotto4 = 0;
		lotto4 = (int)(Math.random() * (45-1+1) + 1);
		System.out.print(lotto4 + ", ");
		
		int lotto5 = 0;
		lotto5 = (int)(Math.random() * (45-1+1) + 1);
		System.out.print(lotto5 + ", ");
		
		int lotto6 = 0;
		lotto6 = (int)(Math.random() * (45-1+1) + 1);
		System.out.print(lotto6);
	}

}
