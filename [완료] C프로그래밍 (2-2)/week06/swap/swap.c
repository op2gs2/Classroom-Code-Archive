/*
�ǽ�2
�ۼ���: �赿��
�ۼ���: 2018.10.11
���α׷� ����: ǥ�� �Է��� �ް�, �� ���� �ٲ� ���
*/

#include <stdio.h> //ǥ������¶��̺귯�� �ҷ�����

void swap(int num1, int num2); //�Լ��� �̸� ����

int main(int argc, char*argv[]) { //main �Լ��� ����
	int num1 = 0, num2 = 0; //���� ����
	printf("���� �Է����ּ���\t"); //�Է��� ���� �޽��� ���
	scanf_s("%d", &num1); //���� �ҷ����̱�
	printf("���� �Է����ּ���\t"); //�Է��� ���� �޽��� ���
	scanf_s("%d",&num2); //���� �ҷ����̱�
	printf("m = %d / n = %d\n", num1, num2);// �Է°� Ȯ��
	swap(num1, num2); //�Լ� ȣ��
	return 0; //�Լ��� ����
}

void swap(int num1, int num2) { //���� ���� ������ �ٲ� ����ϴ� �Լ�
	int temp; //�ӽ� ���� ����
	temp = num1; //���� ��ȯ
	num1 = num2; //���� ��ȯ
	num2 = temp; //���� ��ȯ
	printf("m = %d / n = %d\n", num1, num2); //���� ���� ������ �ٲ� ���
}