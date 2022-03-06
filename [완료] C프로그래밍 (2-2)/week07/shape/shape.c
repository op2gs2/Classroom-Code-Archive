/*
�ǽ�2
�ۼ���: �赿��
�ۼ���: 2018.10.18
���α׷� ����: �簢��, �����簢��, �̵�簢��, ���ﰢ���� ����ϴ� ���α׷�
*/

#include <stdio.h> //ǥ�� ����� ���̺귯��

void printRect(int height, int width); //�簢�� ����Լ�
void printRightAngleTriangle(int height, int width); //���� �ﰢ�� ����Լ�
void printIsoscelesTriangle(int height, int width); //�̵ �ﰢ�� ����Լ�
void printInvertedTriangle(int height, int width); //���ﰢ�� ����Լ�

int main(int argc, char* argv) { //main �Լ�
	int height; //������ ���� ���� ����
	int width; //������ ���� ���� ����

	/*�Է� �ޱ�*/
	printf("������ ���� : "); //�Է��� ���� �޽��� ���
	scanf_s("%d", &height); //�Է� �ޱ�

	printf("������ �ʺ� : "); //�Է��� ���� �޽��� ���
	scanf_s("%d", &width); //�Է� �ޱ�

	/*��� �ϱ�*/
	printf("�簢��\n");
	printRect(height, width); //�簢�� ���
	printf("���� �ﰢ��\n");
	printRightAngleTriangle(height, width); //���� �ﰢ�� ���
	printf("�̵ �ﰢ��\n");
	printIsoscelesTriangle(height, width); //�̵ �ﰢ�� ���
	printf("���ﰢ��\n");
	printInvertedTriangle(height, width); //���ﰢ�� ���

	return 0; //���α׷� ����
}

void printRect(int height, int width) { //�簢�� ����Լ�
	int cnt_height; //������ �ݺ� Ƚ���� ����
	int cnt_width; //������ �ݺ�Ƚ���� ����

	for (cnt_height = 0; cnt_height < height; cnt_height++) { //���� ����
		for (cnt_width = 0; cnt_width < width; cnt_width++) { //�ʺ� ����
			printf("*"); //�� ���
		}
		printf("\n"); //����
	}
}
void printRightAngleTriangle(int height, int width) { //���� �ﰢ�� ����Լ�
	int cnt_height; //������ �ݺ� Ƚ���� ����
	int cnt_width; //������ �ݺ�Ƚ���� ����

	int cnt_plus; //���� �ݺ����� ���� �ݺ�Ƚ���� ����
	cnt_plus = 1; //1�� �ʱ�ȭ

	for (cnt_height = 0; cnt_height < height; cnt_height++) { //���� ����
		for (cnt_width = 1; cnt_width <= cnt_plus; cnt_width++) { //�ʺ� ����
			printf("*"); //�� ���
		}
		cnt_plus++; //���� �ݺ�Ƚ�� �߰�
		printf("\n"); //����
	}
}
void printIsoscelesTriangle(int height, int width) { //�̵ �ﰢ�� ����Լ�
	int cnt_height; //������ �ݺ� Ƚ���� ����
	int cnt_width; //������ �ݺ�Ƚ���� ����

	int cnt_plus; //���� �ݺ����� ���� �ݺ�Ƚ���� ����
	cnt_plus = 1; //1�� �ʱ�ȭ

	int cnt_empty; //��ĭ�� ����ϴ� �ݺ����� �ݺ� Ƚ�� ����
	int cnt_minus_empty; //��ĭ�� ����ϴ� �ݺ����� ���� �ݺ�Ƚ���� ����
	cnt_minus_empty = (height-1); //(height-1)�� �ʱ�ȭ

	for (cnt_height = 0; cnt_height < height; cnt_height++) { //���� ����
		for (cnt_empty = 1; cnt_empty <= cnt_minus_empty; cnt_empty++) { //��ĭ ����
			printf(" "); //��ĭ ���
		}
		cnt_minus_empty--; //�ݺ�Ƚ�� 1����
		for (cnt_width = 1; cnt_width <= cnt_plus; cnt_width++) { //�ʺ� ����
			printf("*"); //�� ���
			
		}
		cnt_plus += 2; //�ݺ� Ƚ�� 2����
		printf("\n"); //����
	}
}
void printInvertedTriangle(int height, int width) { //���ﰢ�� ����Լ�
	int cnt_height; //������ �ݺ� Ƚ���� ����
	int cnt_width; //������ �ݺ�Ƚ���� ����

	int cnt_minus; //���� �ݺ����� ���� �ݺ�Ƚ���� ����
	cnt_minus = (width+2); //1�� �ʱ�ȭ

	int cnt_empty; //��ĭ�� ����ϴ� �ݺ����� �ݺ� Ƚ�� ����
	int cnt_plus_empty; //��ĭ�� ����ϴ� �ݺ����� ���� �ݺ�Ƚ���� ����
	cnt_plus_empty = 0; //1�� �ʱ�ȭ

	for (cnt_height = 0; cnt_height < height; cnt_height++) { //���� ����
		for (cnt_empty = 1; cnt_empty <= cnt_plus_empty; cnt_empty++) { //��ĭ ����
			printf(" "); //��ĭ ���
		}
		cnt_plus_empty++; //�ݺ� Ƚ�� 1����
		
		for (cnt_width = 1; cnt_width <= cnt_minus; cnt_width++) { //�ʺ� ����
			printf("*"); //�� ���
		}
		cnt_minus -= 2; //�ݺ� Ƚ�� 2 ����
		printf("\n"); //����
	}
}
