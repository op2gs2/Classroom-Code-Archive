/*
�ǽ�4
�ۼ���: �赿��
�ۼ���: 2018.10.18
���α׷� ����: ������ �־��� ������ ����ϴ� ���α׷�
*/

#include <stdio.h> //ǥ�� ����� ���̺귯��

int calc(int num); //���� ��� �Լ�

int main(int argc, char* argv) { //main �Լ�
	int num; //��� �� �� ����
	printf("������ ���? :"); //�Է��� ���� �޽��� ���
	scanf_s("%d", &num); //�Է� �ޱ�

	printf("��� ��� : %d\n", calc(num)); //��� ��� ���

	return 0; //���α׷� ����
}

int calc(int num) { //���� ��� �Լ�
	int cnt; //�ݺ� Ƚ��
	int result; //���� �� ����
	result = 0; //0���� �ʱ�ȭ
	for (cnt = 1; cnt <= num; cnt++) { //�ݺ���
		result += (cnt*cnt) + 1; //������ ����
	}
	return result; //������ ��� ��ȯ
}