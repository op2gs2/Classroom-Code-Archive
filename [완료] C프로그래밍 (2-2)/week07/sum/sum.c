/*
�ǽ�1
�ۼ���: �赿��
�ۼ���: 2018.10.18
���α׷� ����: ¦���� Ȧ�� �׸��� ������ ���ϴ� ���α׷�
*/

#include <stdio.h> //ǥ�� ����� ���̺귯��

int sum(int, int);

int main(int argc, char* argv) { //main �Լ�
	int num; //���� ����� ������ ���� ����

	/*���� �Է¹ޱ�*/
	printf("���� ����� ������ ���� �Է��ϼ��� : "); //�Է��� ���� �޽��� ���
	scanf_s("%d", &num); //�Է� �ޱ�
	
	/*��� ������ֱ�*/
	printf("1���� %d������ \n",num); //�޽��� ���
	printf("\t¦���� �� : %d\n", sum(num, 2)); //¦���� ���� ���
	printf("\tȦ���� �� : %d\n", sum(num, 1)); //Ȧ���� ���� ���
	printf("\t���� : %d\n", sum(num, 0)); //���� ���
	return 0; //���α׷� ����
}

int sum(int num, int select) { //¦�� / Ȧ�� / ������ ���ϴ� �Լ�
	int cnt; //for���� ���� Ƚ�� ���� ����
	int result; //��� ��� ���� ����
	result = 0; //������ ������ ���� ������ 0���� �ʱ�ȭ
	switch (select) {
	case 2: //¦���� ���� ���
		for (cnt = 1; cnt <= num; cnt++) { //�ݺ��� �̿�
			if (cnt % 2 == 0) { //¦�� �� ���
				result += cnt; //������ ���� ����
			}
		}
		return result; //����� ��ȯ
	case 1: //Ȧ���� ���� ���
		for (cnt = 1; cnt <= num; cnt++) { //�ݺ��� �̿�
			if (cnt % 2 != 0) { //Ȧ�� �� ���
				result += cnt; //������ ���� ����
			}
		}
		return result; //����� ��ȯ
	case 0: //������ ���
		for (cnt = 1; cnt <= num; cnt++) { //�ݺ��� �̿�
			result += cnt; //������ ���� ����
		}
		return result; //����� ��ȯ
	default:
		printf("Ÿ�� �Է��� �߸� �Ǿ����ϴ�. �ٽ� �Է����ּ���.");
		return 0;

	}
}