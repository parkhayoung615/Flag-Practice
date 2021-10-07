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

		// Flag�� ��ħ��
		int flags = ONE | THREE;
		System.out.println("ONE | THREE = " + flags);

		// Ư�� Flag ���� Ȯ��
		System.out.println("THREE = " + ((flags & THREE) != 0));

		// Ư�� Flag���� �߰�
		System.out.println("TWO = " + ((flags & TWO) != 0));
		flags |= TWO;
		System.out.println("TWO = " + ((flags & TWO) != 0));

		// Ư�� Flag���� ����
		flags &= ~THREE;
		System.out.println("THREE = " + ((flags & THREE) != 0));

		// Ư�� Flag���� ���� (���Ŷ� �����)
		flags ^= TWO;
		System.out.println("TWO = " + ((flags & TWO) != 0));

		// Flag ��� ����
		flags = NONE; // 1�����
		System.out.println("flags = " + flags);
		flags |= TWO;
		System.out.println("flags = " + flags);
		flags &= ~flags; // 2�����
		System.out.println("flags = " + flags);

		// ��� �÷��� ����
		flags = ALL;
		System.out.println("ONE = " + ((flags & ONE) != 0));
		System.out.println("TWO = " + ((flags & TWO) != 0));
		System.out.println("THREE = " + ((flags & THREE) != 0));

		// ����� ����
		flags = ALL ^ ONE;
		System.out.println("ONE = " + ((flags & ONE) != 0));
		System.out.println("TWO = " + ((flags & TWO) != 0));
		System.out.println("THREE = " + ((flags & THREE) != 0));
	}
}