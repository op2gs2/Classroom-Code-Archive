/* 
�ǽ� 1 : print_value.c
�ۼ��� : 2018.09.13
�ۼ��� : �赿��
���α׷� ���� : ����� ������ ���
*/
#include <stdio.h>

int main(int argc,  char* argv[]){
	//���� ����� ���ÿ� �ʱ�ȭ
	char  ch = 'M';
	int    iValue = 95;
	double dValue = 3.14;
	float fValue = 1.414f;

	//��¹��� ���� �Է��ϰ� ���
	printf("\n[ Print value ]\n");
	printf("char : %c \n", 'W');
	//������ ������ �Ϸ��� ���ڿ��� �Բ� ���
	printf("char variable  : %c \n", ch);
	//��¹��� ���� �Է��ϰ� ���
	printf("int value : %d \n", 20);
	//��¹��� ���� �Է��ϰ� ���
	printf("int constants formula : %d \n", 10 + 20);
	//������ ������ �Ϸ��� ���ڿ��� �Բ� ���
	printf("int variable  : %d \n", iValue);
	//��¹��� ���� �Է��ϰ� ���
	printf("double value : %f \n", 3.1415);
	//������ ������ �Ϸ��� ���ڿ��� �Բ� ���
	printf("double variable : %f \n", dValue);
	//������ ������ �Ϸ��� ���ڿ��� �Բ� ���
	printf("float variable : %f \n", fValue);
	//������ ������ �Ϸ��� ���ڿ��� �Բ� ���
	printf("int variable : %d and float variable : %f \n", iValue, fValue);

	//�Լ��� ����
	return 0;
}
