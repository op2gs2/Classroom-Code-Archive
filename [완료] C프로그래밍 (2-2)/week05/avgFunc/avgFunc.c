/*
�ۼ���: �赿��
�ۼ���: 2018.10.04
���α׷� ����: ��հ��� ����ϴ� �Լ��� ��հ��� ����ϴ� �Լ��� ����� �̸� Ȱ���ϴ� ���α׷�
*/

#include <stdio.h> //ǥ������¶��̺귯�� �ҷ�����

double getAverage(double num1, double num2); //�Լ��� ����
void printResult(double result); //�Լ��� ����

int main(int argc, char* argv[]) { //�����Լ��� ����
	double num1, num2, result; // ���� ����� �����ϴ� �Լ� ����
	printf("�� �Ǽ����� �Է��ϼ��� : "); //�Է��� �ޱ� ���� �޽��� ���
	scanf_s("%lf %lf", &num1, &num2,2); // �Է��� �޴� �κ�

	result = getAverage(num1, num2); //�Լ��� ȣ���ϰ� ��ȯ �� ���� ����

	printResult(result); // ����� ���� �Լ��� �Ѱ���
	return 0; //�Լ��� ����
}

double getAverage(double num1, double num2) { //����� ����ϴ� �Լ�
	double func_result = (num1 + num2) / 2; //��հ��� ����ϰ� ����
	return func_result; //����� ���� ��ȯ
}

void printResult(double result) { //��� ���� ����ϴ� �Լ�
	printf("�� �Ǽ� ��� : %lf\n", result); //���� ���
	return 0; //�Լ��� ����
}