/*
�ǽ� 8 : calc_Square_area.c
�ۼ��� : 2018.09.13
�ۼ��� : �赿��
���α׷� ���� : ����, ���� ���� �Է� �޾� �簢���� ���� ���
*/

#include <stdio.h>

int main(int argv, char*argc[]) {
	/*����, ���� ���� ����*/
	int horizontal; //���� ����
	int Vertical; //���� ����

	/*����, ���� �� �Է�*/
	printf_s("���� ���� �Է����ּ���: "); //�Է��� ���� �ȳ��� ���
	scanf_s("%d", &horizontal);	//���� �� �Է�

	printf_s("���� ���� �Է����ּ���: "); //�Է��� ���� �ȳ��� ���
	scanf_s("%d", &Vertical); //���� �� �Է�

	/*�簢���� ���� ���*/
	int squ_area = horizontal * Vertical; //�簢���� ���� ���

	/*�� ���α׷��� �� ���*/
	printf_s("����: %d, ����: %d\n", horizontal, Vertical);
	printf_s("�簢���� ����: %d\n", squ_area);

	/*�Լ��� ����*/
	return 0;
}
