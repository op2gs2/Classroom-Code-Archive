/*
�ǽ�8
�ۼ���: �赿��
�ۼ���: 2018.10.18
���α׷� ����: �Ǻ���ġ ������ ����ϴ� ���α׷�
*/

#include <stdio.h> //ǥ�� ����� ���̺귯��

int isPrimeNumber(int num); //���� ��� �Լ�

int main(int argc, char* argv) { //main �Լ�
	int i; //for�� �ݺ� Ƚ��
	int n; //�Ǻ���ġ ��
	int head = 0; //��
	int mid = 0; //�߰�
	int rear = 1; //��
	int sum = 0; //�� ���

	printf("\n �Ǻ���ġ �� �Է� : "); //�Է��� ���� �޽��� ���
	scanf_s("%d", &n); //�Է� �ޱ�

	for (i = 0; i < n; i++) {
		sum += head; //���� ���
		printf("%d ", head); //���
		/*���� �̵���Ű��*/
		mid = head + rear;
		head = rear;
		rear = mid;
		
	}
	printf("\n�� �� : %d", sum); //�� ���
	return 0; //���α׷� ����
}