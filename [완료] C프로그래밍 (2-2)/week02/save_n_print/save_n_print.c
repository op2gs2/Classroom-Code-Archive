/* 
�ǽ� 4 : save_n_print.c
�ۼ��� : 2018.09.13
�ۼ��� : �赿��
���α׷� ���� : ���� ���� ������ ������ �����ϰ� ����ϴ� ���α׷�
*/

#include <stdio.h>

int main(int argv, char* argc[]) {
	int age = 128; //int�� ���� age�� 128����
	long long salary = 2500000000; //long�� ���� salary�� 2500000000����
	double pi = 3.14; //double�� ���� pi�� 3.14����
	char grade = 2; //char�� ���� grade�� 2����
	char credit = 'A'; //char�� ���� credit�� 'A'����

	printf("print age: %d\n", age); //age ���
	printf("print salary: %lld\n", salary); //salary ���
	printf("print pi: %d\n", pi); //pi ���
	printf("print grade: %d\n", grade); //grade ���
	printf("print credit: %c\n", credit); //credit ���

	//�Լ��� ����
	return 0;
}