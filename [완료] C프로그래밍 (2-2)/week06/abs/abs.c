/*
�ǽ�5
�ۼ���: �赿��
�ۼ���: 2018.10.11
���α׷� ����: ǥ�� �Է��� �ް�, �� ���� ���� ���� ����ϴ� ���α׷�
*/

#include <stdio.h> //ǥ������¶��̺귯�� �ҷ�����
int abs(int num); //�Լ��� �̸� ����

int main(int argc, char*argv[]) { //main �Լ��� ����
	int num = 0; //���� ����
	printf("���� �Է����ּ���\t"); //�Է��� ���� �޽��� ���
	scanf_s("%d", &num); //���� �ҷ����̱�
	printf("input value = %d\n", num);// ��� Ȯ��
	printf("abs value = %d\n", abs(num));// ��� Ȯ��
	return 0; //�Լ��� ����
}

int abs(int num) { //�Է¹��� ���� ������ ��ȯ�ϴ� �Լ�
	int result; //��� ����
	result = num >= 0 ? num : (num*-1); //���밪 ���
	return result; //����� ��ȯ
}