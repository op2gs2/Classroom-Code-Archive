/*
�ǽ�3
�ۼ���: �赿��
�ۼ���: 2018.10.11
���α׷� ����: ǥ�� �Է��� �ް�, 1. ū ���� ã�� ��� 2. ���� ���� ã�� ���
*/

#include <stdio.h> //ǥ������¶��̺귯�� �ҷ�����
int big(int num1, int num2); //�Լ��� �̸� ����
int small(int num1, int num2); //�Լ��� �̸� ����

int main(int argc, char*argv[]) { //main �Լ��� ����
	int num1, num2; //���� ����
	printf("���� �Է����ּ���\t"); //�Է��� ���� �޽��� ���
	scanf_s("%d", &num1); //���� �ҷ����̱�
	printf("���� �Է����ּ���\t"); //�Է��� ���� �޽��� ���
	scanf_s("%d", &num2); //���� �ҷ����̱�
	printf("ū ���� %d ���� ���� %d\n", big(num1, num2), small(num1, num2)); //�� ��� �� ���
	return 0; //�Լ��� ����
}

int big(int num1, int num2) { //ū ���� ��ȯ
	int result; //��� ���� ����
	result = num1 > num2 ? num1 : num2; //�� ���� ����
	return result; //��� ��ȯ
}
int small(int num1, int num2) { //���� ���� ��ȯ
	int result; //��� ���� ����
	result = num1 < num2 ? num1 : num2; //�� ���� ����
	return result; //��� ��ȯ
}