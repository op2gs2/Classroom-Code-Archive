/*
�ǽ�7
�ۼ���: �赿��
�ۼ���: 2018.10.18
���α׷� ����: ���丮���� ����ϴ� ���α׷�
*/

#include <stdio.h> //ǥ�� ����� ���̺귯��

int isPrimeNumber(int num); //���� ��� �Լ�

int main(int argc, char* argv) { //main �Լ�
	int num, cnt, facto = 1; //�ʿ��� ���� ����
	printf("���丮�� num���� �Է��Ͻÿ� : "); //�Է��� ���� �޽��� ���
	scanf_s("%d", &num); //�Է� �ޱ�
	for (cnt = 1; cnt <= num; cnt++) { //���丮�� ����� ���� �ݺ���
		facto *= cnt; //���丮�� ���
	}

	printf("%d! = %d\n", num, facto); //���丮�� ���
	return 0; //���α׷��� ����
}