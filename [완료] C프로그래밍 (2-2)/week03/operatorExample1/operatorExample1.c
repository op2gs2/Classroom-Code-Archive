/* �ǽ� 2 : operatorExample1.c
�ۼ��� : 2018�� 09�� 20��
�ۼ��� : �赿��
���α׷� ���� : ���� ������ ���� ��, ��� ����
*/

#include <stdio.h> //ǥ������� �������

int main(int argc, char* argv[]) {
	int x = 2, y = 3, z = 2.4; //int�� ���� x,y,z���� �� �� ���� �ʱ�ȭ

	/*a. x++ + y++ + z*/
	int result = (x++) + (y++) + z;  //��� ��
	printf("a���� ��� : %d\n", result); //��� ���

	/*b. ++x + y / 2 * 2 - (int)z*/
	result = ++x + y / 2 * 2 - (int)z;  //��� ��
	printf("b���� ���: %d\n", result); //��� ���

	/*c. (int)z - ( x + (int)z ) % 2 + 4.0*/
	result = (int)z - (x + (int)z) % 2 + 4.0;  //��� ��
	printf("c���� ���: %d\n", result); //��� ���

	/*d. x * 6 - 2 * (3 + z) + y*/
	result = x * 6 - 2 * (3 + z) + y;  //��� ��
	printf("d���� ���: %d\n", result); //��� ���
	
	
	return 0; //�Լ��� ����

}