/*
�ۼ���: �赿��
�ۼ���: 2018.10.04
���α׷� ����: 
������ ��������
�ҵ漼�� ����ϴ� �Լ��� 
�ֹμ��� ����ϴ� �Լ���
����Ḧ ����ϴ� �Լ���
�ҵ�, �ֹ�, ����Ḧ ������ ���� ����ϴ� �Լ���
�̷���� ���α׷�
*/

#include <stdio.h> //ǥ������¶��̺귯�� �ҷ�����
double getIncomeTax(double salary); //�Լ��� ����
double getLocalinhabitantsTax(double IncomeTax); //�Լ��� ����
double getInsurance(double salary); //�Լ��� ����
double getPay(double salary, double IncomeTax, double LocalinhabitantsTax, double Insurance); //�Լ��� ����

int main(int argc, char* argv[]) {
	double salary; //�޿� ���� ����
	double IncomeTax; //�ҵ漼 ���� ����
	double LocalinhabitantsTax; //�ֹμ� ���� ����
	double Insurance; //����� ���� ����
	double Pay; //���� ���޾� ���� ����

	printf("�� �޿��� �Է��ϼ��� : "); //�Է��� ���� �޽��� ���
	scanf_s("%lf", &salary); //�Է� �ޱ�
	printf(">> �ѱ޿�(+) : %d(��)\n", (int)salary); //�Է� ���� ���� ���

	IncomeTax = getIncomeTax(salary); //�Լ��� ȣ���ϰ� ��ȯ�� ���� ����
	printf(">> �ҵ漼(-) : %d(��)\n", (int)IncomeTax); //����� ���� ���

	LocalinhabitantsTax = getIncomeTax(IncomeTax); //�Լ��� ȣ���ϰ� ��ȯ�� ���� ����
	printf(">> �ֹμ�(-) : %d(��)\n", (int)LocalinhabitantsTax); //����� ���� ���
	 
	Insurance = getInsurance(salary); //�Լ��� ȣ���ϰ� ��ȯ�� ���� ����
	printf(">> �����(-) : %d(��)\n", (int)Insurance); //����� ���� ���

	Pay = getPay(salary, IncomeTax, LocalinhabitantsTax, Insurance); //�Լ��� ȣ���ϰ� ��ȯ�� ���� ����
	printf(">> ���޾�    : %d(��)\n", (int)Pay); //����� ���� ���

	return 0;
}

double getIncomeTax(double salary) { //�޿��� 10%�� ����Ͽ� ��ȯ
	double result; //��� ���� ���� ����
	result = salary * ((double)10 / 100); //����ϱ�
	return result; // ��� ��� ��ȯ
}
double getLocalinhabitantsTax(double IncomeTax) { //�ҵ漼�� 10%�� ����Ͽ� ��ȯ
	double result; //��� ���� ���� ����
	result = IncomeTax * ((double)10 / 100); //����ϱ�
	return result; // ��� ��� ��ȯ
}
double getInsurance(double salary) { //�޿��� 5.89%�� ������ ���
	double result; //��� ���� ���� ����
	result = salary * ((double)5.89 / 100); //����ϱ�
	return result; // ��� ��� ��ȯ
}
double getPay(double salary, double IncomeTax,
	double LocalinhabitantsTax, double Insurance) { //������ ���� ���� �޿����� ���� ��ȯ
	double result; //��� ���� ���� ����
	result = salary - (IncomeTax+ LocalinhabitantsTax+ Insurance); //����ϱ�
	return result; // ��� ��� ��ȯ
}

