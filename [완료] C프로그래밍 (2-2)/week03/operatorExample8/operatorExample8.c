/*
�ǽ� 8 : operatorExample8.c
�ۼ��� : 2018�� 09�� 20��
�ۼ��� : �赿��
���α׷� ���� :  �޿��� �Է¹޾� �ҵ漼�� �ֹμ��� ����Ḧ ������ �޿��� ����ϴ� ���α׷�
*/

#include <stdio.h> //ǥ������� �������

int main(int argc, char* argv[]) {
	double salary = 0; //�޿� ����
	double income_tax = 0; //�ҵ漼 ����
	double resident_tax = 0; //�ֹμ� ����
	double insurance = 0; //���� ����
	double real_salary = 0; //���� �޿� ���޾�
	
	/*�Է¹ޱ�*/
	puts("�� �޿��� �Է��ϼ��� : ");
	scanf_s("%lf", &salary);

	/*����ϱ�*/
	income_tax = salary *(10.0 / 100.0); //�ҵ漼 = �޿��� 10%�� �ش��ϴ� ��
	resident_tax = income_tax *(10.0 / 100.0); // �ֹμ� = �ҵ漼�� ���� 10%�� �ش��ϴ� ��
	insurance = salary * (589.0 / 10000.0); //����� = �޿��� 5.89% 
	real_salary = salary - (income_tax + resident_tax + insurance); //���� �޿����� �޿����� �ҵ�,�ֹμ��� ����Ḧ ������ ��

	/*����ϱ�*/
	printf(">> �ѱ޿�(+)  : %lf\n", salary); //�޿��� ���� ���
	printf(">> �ҵ漼(-)  : %lf\n", income_tax); //�ҵ漼�� ���� ���
	printf(">> �ֹμ�(-)  : %lf\n", resident_tax); //�ֹμ��� ���� ���
	printf(">> �����(-)  : %lf\n", insurance); //����ῡ ���� ���
	printf(">> ���޾�  : %lf\n", real_salary); //���޾׿� ���� ���

	return 0; //�Լ� ����
}