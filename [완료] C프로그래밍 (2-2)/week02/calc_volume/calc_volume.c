/*
�ǽ� 6 : calc_volume.c
�ۼ��� : 2018.09.13
�ۼ��� : �赿��
���α׷� ���� : cost��� �̸��� ������ ���
*/

#include <stdio.h>

int main(int argv, char* argc[]) {
	/*�ʺ� , ���� , ���̸� ������ ���� & �� ����*/
	int width = 2; //�ʺ� ���� ���� �� �ʱ�ȭ
	int height = 3; //���� ���� ���� �� �ʱ�ȭ
	int deepness = 2; //���� ���� ���� �� �ʱ�ȭ

	/*���� ���*/
	int volume = width * height * deepness;

	/*���� �� ���*/
	printf("�ʺ� %d ���� %d ���� %d�� ���Ǵ� %d�Դϴ�.\n", width, height, deepness, volume);

	/*�Լ��� ����*/
	return 0;
}