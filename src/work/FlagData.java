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
		��Ʈ �����ڿ� �÷��׸� �Բ� ��� �� ��?
		�÷��׸� �� �� ������ ��ƾ� �� �� ���� �ַ� true/false
		
		true = 1
		false = 0
		
		�̷���
		
		login =  0111
		ù ��° �ڸ� : �α���/��α���? t/f (�̰ɷ� �ڿ� ������ ���󰡴��� �� ���󰡴��� ����)
		�� ��° �ڸ� : ������ �����ΰ�? t/f
		�� ���� �ڸ� : Ű�� 160�� �Ѵ°�? t/f
		�� ��° �ڸ� : ��й�ȣ�� 5�� �̻� Ʋ�ȴ°�?
		
		�̷� ������ �̸� �ּ�ó�� �صΰ� �ٸ� ���(�̷��� ��)�� �˾ƺ� �� �ְ� ��δ� �͵� �߿��� ��
		
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
		// ���� ���ذ� �� �� ���� �� �ʹ�...
		// ������ ���Ǹ� ���� ������ ã�ƺ��� �� ��
	}
}
