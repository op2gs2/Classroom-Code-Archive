/*
�ǽ�6
�ۼ���: �赿��
�ۼ���: 2018.10.18
���α׷� ����: ������� ���ÿ� ���� ������ �����ϴ� ���� ���α׷�
*/

#include <stdio.h> //ǥ�� ����� ���̺귯��

int printMenu(void); //�޴� ��� �Լ�

int main(int argc, char* argv) { //main �Լ�
	int num1=0, num2=0; //�ǿ�����
	int select; //�޴� ���� ����
	select = -1; //-1�� �ʱ�ȭ
	do {
		select = printMenu(); //�޴����� ��� �Է��ϴ� �Լ� ȣ��

		switch (select) { //�޴� ���� ����
		case 1: //��� ���� �Է� �ްų�
			printf("����� ���� �Է��ϼ��� : ");
			scanf_s("%d", &num1);
			printf("����� ���� �Է��ϼ��� : ");
			scanf_s("%d", &num2);
			break;

		case 2: //���ϰų�
			printf("��� : %d\n", (num1 + num2));
			break;

		case 3: //���ų�
			printf("��� : %d\n", (num1 - num2));
			break;

		case 4: //���ϰų�
			printf("��� : %d\n", (num1 * num2));
			break;

		case 5: //�����ų�
			printf("��� : %d\n", (num1 / num2));
			break;

		case 6: //������
			printf("�����մϴ�\n");
			break;

		default: //�޴� ���� �߸� �Է� �Ǿ� ������ �ƿ� ���ο� ���� �䱸��
			printf("�޴��� �ٽ��ѹ� �Է����ּ���.\n");
			break;
		}
	} while (select!=6); //�޴� ���� 6�� �ƴϸ� ������ �ٽ� �ݺ�
	return 0; //���α׷� ����
}

int printMenu(void) { //�޴� ��� �Լ�
	int menu; //�޴� �� ����
	menu = -1; //�ʱ�ȭ
	/*�޴� ���*/
	printf("1. �����Է�\n");
	printf("2. ���ϱ�\n");
	printf("3. ����\n");
	printf("4. ���ϱ�\n");
	printf("5. ������\n");
	printf("6. ����\n");
	printf(">>�޴����� : ");
	scanf_s("%d", &menu); //�޴� ���� �Է� �ޱ�
	return menu; //�޴� �� ���
}