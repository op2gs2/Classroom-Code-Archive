/*
�ǽ�3
�ۼ���: �赿��
�ۼ���: 2018.10.18
���α׷� ����: 0�� �ƴ� ������ �Է� �ɶ� ���� �հ� ����� ����ϴ� ���α׷�
*/

#include <stdio.h> //ǥ�� ����� ���̺귯��

double average(int total, int count); //��� ��� �Լ�

int main(int argc, char* argv) { //main �Լ�
	int total; //������ ��� ���� ����
	total = 0; //0���� �ʱ�ȭ
	int count; //�ݺ� Ƚ�� ���� ����
	count = 0; //0���� �ʱ�ȭ
	int num; //������ �Է� �޴� ����
	do {
		printf("���� �Է� : "); //�Է��� ���� �޽��� ���
		scanf_s("%d", &num); //�Է� �ޱ�
		if (num == 0) {//�Է� ���� 0�� �ƴϸ� ����
			printf("-> ����\n"); //���Ḧ �˸��� �޽��� ���
			break; //�ݺ��� ����
		}

		total += num; //������ ���
		count++; //�ݺ� Ƚ�� ����

		printf("-> ��: %d  ���: %lf\n", total, average(total, count)); //��� ���
	} while (1); //���� �ݺ���

	return 0; //���α׷� ����
}

double average(int total, int count) { //��� ��� �Լ�
	return (double)total / count; //��� �� ��ȯ
}