/* �ǽ� 3 : operatorExample3.c
�ۼ��� : 2018�� 09�� 20��
�ۼ��� : �赿��
���α׷� ���� : Ű���� �Է� & ���׽� ���
*/

#include <stdio.h> //ǥ������� �������

int main(int argc, char* argv[]) {
	int value_x = 0; //�������� �� ���� ����

	puts("x�� ���� �Է����ּ���."); //���� �Է� �ޱ� ���� �޽��� ���
	scanf_s("%d", &value_x); //������ ���� �Է� �ޱ�

	int result = (((value_x * value_x - 4)*(value_x * value_x - 10 * value_x + 21)) + 100); // ���׽��� ����Ͽ� ������ ����
	printf("���׽��� ���� %d �Դϴ�. \n", result); //�� ������ ����� ���� ���

	return 0; //�Լ��� ����
}