package sushu;

import java.util.Scanner;//������������

public class Shuchusushu {
	// java�������ڷ�����
	public static void main(String[] args) {
		System.out.println("\n");
		System.out.println("**********��ӭʹ����������ѯʱ��**********:");
		System.out.println("\n");

		/* �������岢����ֵ */
		int firstDay;
		int years, months;
		int days_1 = 0, days_2 = 0, sum_1 = 0, sum_2 = 0, sum = 0;
		boolean inputYear;
		Scanner sc = new Scanner(System.in);

		/* ������� */
		System.out.println("�������ѯ���:");
		years = sc.nextInt();

		/* �ж��Ƿ������� */
		if ((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)) {
			System.out.print("\n" + years + "������" + ",");
			inputYear = true;
		} else {
			System.out.print("\n" + years + "��ƽ��" + ",");
			inputYear = false;
		}

		/* ������ʼ�굽��ֹ��֮���������� */
		for (int i = 1900; i < years; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				days_1 = 366;
			} else {
				days_1 = 365;
			}
			sum_1 += days_1;
		}
		System.out.println(1900 + "����" + years + "�깲��" + sum_1 + "��");

		/* ������� */
		System.out.print("\n");
		System.out.println("����������·�:");// �Ӽ��̽����·�;
		months = sc.nextInt();

		/* ���������·ݵ���ʼ��ݵ����� */
		for (int j = 1; j < months; j++) {
			if (j == 2) {
				if (inputYear = true) {
					sum_2 += 29;// �������29�죻
				} else {
					sum_2 += 28;// ƽ�����28�죻
				}
			} else if (j == 4 || j == 6 || j == 9 || j == 11) {
				sum_2 += 30; // 4��6��9��11����30�죻
			} else {
				sum_2 += 31; // �����·ݶ�Ϊ30�죻
			}
		}

		/* �ж�ÿ�µ����� */
		if (months == 2) {
			if (inputYear) {
				days_2 = 29;
			} else {
				days_2 = 28;
			}

		} else if (months == 4 || months == 6 || months == 9 || months == 11) {
			days_2 = 30;
		} else {
			days_2 = 31;
		}

		sum = sum_1 + sum_2;// �����ܹ�����
		System.out.print("\n");
		System.out.println(1900 + "��" + years + "��" + months + "�µ׹���" + sum
				+ "��");

		System.out.print("\n");
		System.out.println("������" + "\t����һ" + "\t���ڶ�" + "\t������" + "\t������"
				+ "\t������" + "\t������" + "\n");
		int temp = sum % 7;// ������·ݵĵ�һ��ʹ���ڼ���
		firstDay = temp;// ������������0��ʾ,����һ��������������1~6��ʾ��

		for (int k = 0; k < firstDay; k++) {
			System.out.print("\t"); // ���������һ�еĿո�����
		}

		for (int m = 1; m <= days_2; m++) {
			System.out.print(m + "\t");
			if ((sum + m) % 7 == 0) {
				System.out.print("\n");// ÿ7�죬���һ�����У�
			}
		}
	}
}
