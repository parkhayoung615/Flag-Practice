package work;

public class FlagData {
	public static void main(String args[]) {
		System.out.println("2 << 3 = " + (2 << 3));
		System.out.println("16 >> 3 = " + (16 >> 3));
		System.out.println("-16 >> 3 = " + (-16 >> 3));
		System.out.println("-16 >>> 3 = " + (-16 >>> 3));
//		2 << 3 = 16
//		16 >> 3 = 2
//		-16 >> 3 = -2
//		-16 >>> 3 = 536870910
		
		/*
		비트 연산자와 플래그를 함께 써야 할 듯?
		플래그를 쓸 때 정보를 담아야 할 것 같음 주로 true/false
		
		true = 1
		false = 0
		
		이렇게
		
		login =  0111
		첫 번째 자리 : 로그인/비로그인? t/f (이걸로 뒤에 정보가 날라가느냐 안 날라가느냐 갈림)
		두 번째 자리 : 성별이 남자인가? t/f
		세 번쨰 자리 : 키가 160이 넘는가? t/f
		네 번째 자리 : 비밀번호를 5번 이상 틀렸는가?
		
		이런 식으로 미리 주석처리 해두고 다른 사람(미래의 나)가 알아볼 수 있게 써두는 것도 중요할 듯
		
		*/
		
		int CONDITION = 101;
		int count = 1;
		int sum = 0;
		while(true) {
			if(count<CONDITION) {
				sum += count;
			}else {
				break;
			}
			count++;
		}
		System.out.println("sum = "+sum);
		// sum = 5050
		// 아직 이해가 좀 덜 가는 듯 싶다...
		// 볼만한 강의를 시험 끝나고 찾아봐야 할 듯
	}
}
