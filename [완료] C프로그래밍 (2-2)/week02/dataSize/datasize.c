/*
�ǽ� 2: dataSize.c
�ۼ���: 2018.09.13
�ۼ���: �赿��
���α׷� ����: sizeof �����ڸ� �̿��� �� �ڷ����� ũ�� Ȯ��
*/

#include <stdio.h>

int main(int argc, char*argv[]) {
	//���� ����
	char ch = 'a'; //char�� ch������ 'a'�� ����
	int i = 65; //int�� i������ 65�� ����
	double d = 3.14; //double�� d������ 3.14�� ����

	printf("\n [THE SIZE OF DATATYPE]\n"); //���� ���
	printf("char : %d\n", sizeof(char)); //char ũ�� ���
	printf("char ch = \'A\': %d\n", sizeof(ch));//���� ch�� ũ�� ���
	printf("int : %d\n", sizeof(int));//int�� ũ�� ���
	printf("int i=65: %d\n", sizeof(i));//���� i�� ũ�� ���
	printf("short int : %d\n", sizeof(short int)); //short int�� ũ�� ���
	printf("long int : %d\n", sizeof(long int)); //long int�� ũ�� ���
	printf("float : %d\n ", sizeof(float)); //float�� ũ�� ���
	printf("double : %d\n ", sizeof(double)); //double�� ũ�� ���
	printf("double d = 3.14: %d\n", sizeof(d)); //���� d�� ũ�� ���
	printf("long double : %d\n ", sizeof(long double)); //long double�� ũ�� ���
	printf("String \'Hello\' : %d\n", sizeof("Hello")); // "Hello"�� ũ�� ���
	printf("default constant 1 : %d\n", sizeof(7)); //��� 7�� ũ�� ���
	printf("default constant 2 : %d\n", sizeof(10.12)); //��� 10.12�� ũ�� ���

	//�Լ��� ����
	return 0;
}
