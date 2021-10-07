package work;

public class FlagTest {

	private static final int NONE = 0;
	private static final int ONE = 1;
	private static final int TWO = ONE << 1;
	private static final int THREE = ONE << 2;
	private static final int ALL = ONE | TWO | THREE;

	public static void main(String[] args) {

		System.out.println("NONE = " + NONE);
		System.out.println("ONE = " + ONE);
		System.out.println("TWO = " + TWO);
		System.out.println("THREE = " + THREE);

		// Flag의 합침값
		int flags = ONE | THREE;
		System.out.println("ONE | THREE = " + flags);

		// 특정 Flag 값을 확인
		System.out.println("THREE = " + ((flags & THREE) != 0));

		// 특정 Flag값을 추가
		System.out.println("TWO = " + ((flags & TWO) != 0));
		flags |= TWO;
		System.out.println("TWO = " + ((flags & TWO) != 0));

		// 특정 Flag값을 제거
		flags &= ~THREE;
		System.out.println("THREE = " + ((flags & THREE) != 0));

		// 특정 Flag값을 반전 (제거랑 비슷함)
		flags ^= TWO;
		System.out.println("TWO = " + ((flags & TWO) != 0));

		// Flag 모두 제거
		flags = NONE; // 1번방법
		System.out.println("flags = " + flags);
		flags |= TWO;
		System.out.println("flags = " + flags);
		flags &= ~flags; // 2번방법
		System.out.println("flags = " + flags);

		// 모든 플래그 적용
		flags = ALL;
		System.out.println("ONE = " + ((flags & ONE) != 0));
		System.out.println("TWO = " + ((flags & TWO) != 0));
		System.out.println("THREE = " + ((flags & THREE) != 0));

		// 몇개빼고 적용
		flags = ALL ^ ONE;
		System.out.println("ONE = " + ((flags & ONE) != 0));
		System.out.println("TWO = " + ((flags & TWO) != 0));
		System.out.println("THREE = " + ((flags & THREE) != 0));
	}
}