/*
�ǽ� 3: print_calc ������Ʈ
�ҽ� ���ϸ�: calc.c
�ۼ���: 20180906
�ۼ���: �赿��
���α׷� ����: ������ ���� ����� ����� ��� ���α׷�
*/

#include <stdio.h>

int main(int argc, char* agrv[]) {
	//����
	int a = 10, b = 3;
	float c = 10, d = 3;
	float res1, res2, res3;

	//���
	res1 = a / b;   
	res2 = c / d;
	res3 = (float)a / b; 

	//��¹�
	printf("%6.2f\n", res1);
	printf("%6.2f\n", res2);
	printf("%6.2f\n", res3);
}