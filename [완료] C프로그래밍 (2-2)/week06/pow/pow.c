/*
�ǽ�1
�ۼ���: �赿��
�ۼ���: 2018.10.11
���α׷� ����: ǥ�� �Է��� �ް�, �� ���� ����
*/

#include <stdio.h> //ǥ������¶��̺귯�� �ҷ�����
float pow(float); //�Լ��� �̸� ����

int main(int argc, char*argv[]) { //main �Լ��� ����
	float input=0, result; //���� ����
	printf("���� �Է����ּ���\t"); //�Է��� ���� �޽��� ���
	scanf_s("%f", &input); //���� �ҷ����̱�

	result = pow(input); //�Լ� ȣ�� �� ���� ��ȯ �ޱ�
	printf("%f�� ������ %f�Դϴ�.\n", input, result); //������ ���� ���
	return 0; //�Լ��� ����
}

float pow(float num) { //�������� ����� �Լ�
	float result; //����� ����
	result = num*num; //��� ��� ����
	return result; //��� ��� ��ȯ
}