/* 
�ǽ� 3 : overflow.c
�ۼ��� : 2018.09.13
�ۼ��� : �赿��
���α׷� ���� : ������ ũ�⸦ �Ѱų� ������ �߻��ϴ� ����/��� �÷ο� Ȯ��
*/

#include <stdio.h>

int main(int argc, char* argv[]) {
	unsigned char uc = 255 + 1; //unsigned char���� uc�� �����÷ο� ����
	short s = 32767 + 1; //short���� s�� �����÷ο� ����
	float min = 1.175E-50; //float���� min�� ����÷ο� ����
	float max = 3.403E39; //float���� max�� �����÷ο� ����

	printf("%u\n", uc); //�����÷ο� �߻�
	printf("%d\n", s);		//�����÷� �߻�
	printf("%e\n", min);	//����÷� �߻�
	printf("%f\n", max);	//�����÷� �߻�

	//�Լ��� ����
	return 0;
}