/*
�ǽ� 7 : scanfExample.c
�ۼ��� : 2018.09.13
�ۼ��� : �赿��
���α׷� ���� : �ڷ����� ���� scanf ���������� ���
*/
#include <stdio.h>

int main()
{
	/*���� ����*/
	short    s; //short �� ���� s ����
	long     l; //long �� ���� l ����
	unsigned u; //unsigned �� ���� u ����

	/*�� ������ ���� �� �Է� �ޱ�*/
	printf_s("Enter a short number : "); //�Է��� �ޱ� ���� �ȳ��� ���
	scanf_s("%hd", &s); //short�� �Է�(�����)
	printf_s("Enter a long number : "); //�Է��� �ޱ� ���� �ȳ��� ���
	scanf_s("%ld", &l); //long�� �Է�(�����)
	printf_s("Enter an unsigned number : "); //�Է��� �ޱ� ���� �ȳ��� ���
	scanf_s("%u", &u); //unsigned�� �Է�(�����)

	/*�Է� ���� �� ���*/
	printf("\n%hd %ld %u \n", s, l, u);

	/*�Լ��� ����*/
	return 0;
}