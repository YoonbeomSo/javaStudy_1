
public class BitOperating {

	public static void main(String[] args) {
		
		byte a = 5; //0000 0101
		byte b = 3; //0000 0011
		
		//비트곱(and)
		System.out.println(a & b);  //0000 0001 >> 1
		
		//비트함(or)
		System.out.println(a | b);  //0000 0111 >> 7
		
		//배타적 논리합(xor)
		System.out.println(a ^ b);  //0000 0110 >> 6
		
		//비트 이동 연산자 (<<, >>)
		int c = 192;                   //00000000 00000000 00000000 11000000 >> 192
		System.out.println(c << 3);    //00000000 00000000 00000110 00000000 >> 192 * 2^3 = 1536 

	}

}
