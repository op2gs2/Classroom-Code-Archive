/*
�ǽ�4
�ۼ���: �赿��
�ۼ���: 2018.10.11
���α׷� ����: ǥ�� �Է��� �ް�, 0���� ũ�ų� ���� ����� 1. ������ -1�� ��ȯ �޴� ���α׷�
*/

#include <stdio.h> //ǥ������¶��̺귯�� �ҷ�����
int sign(int num); //�Լ��� �̸� ����

int main(int argc, char*argv[]) { //main �Լ��� ����
	int num = 0; //���� ����
	printf("���� �Է����ּ���\t"); //�Է��� ���� �޽��� ���
	scanf_s("%d", &num); //���� �ҷ����̱�
	printf("input value = %d\n", num);// ��� Ȯ��
	printf("input value sign = %d\n", sign(num));// ��� Ȯ��
	return 0; //�Լ��� ����
}

int sign(int num) { //0���� ũ�ų� ���� ����� 1. ������ -1�� ��ȯ�ϴ� �Լ�
	int result; //��� ����
	result = num >= 0 ? 1 : -1; //�񱳿��� ����
	return result; //����� ��ȯ
}