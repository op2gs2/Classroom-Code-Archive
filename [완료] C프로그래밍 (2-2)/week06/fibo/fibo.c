/*
�ǽ�6
�ۼ���: �赿��
�ۼ���: 2018.10.11
���α׷� ����: �Ǻ���ġ�� �ݺ�Ƚ���� �Է� �ް�, ������� ����ϴ� ���α׷�
*/

#include <stdio.h> //ǥ������¶��̺귯�� �ҷ�����
long long fibo(long long value); //�Լ��� �̸� ����

int main(int argc, char*argv[]) { //main �Լ��� ����
	long long value = 0, result = 0; //���� ����
	printf("�ݺ�Ƚ���� �Է����ּ���\t"); //�Է��� ���� �޽��� ���
	scanf_s("%lld", &value); //���� �ҷ����̱�
	//value -= 1; //����� �����ֱ� ���� ���� ����
	result = fibo(value-1); //�Լ��� ȣ���ϰ� ���� ��ȯ �ޱ�
	printf("%lld��° �Ǻ���ġ ������ ���� : %lld\n", value, result);// ��� Ȯ��
	return 0; //�Լ��� ����
}

long long fibo(long long value) { //�Ǻ���ġ ������ ���ϴ� �Լ�
	if (value <= 1) { //���� 1���� ũ�� 
		return value; //�ش� ���� ��ȯ
	}
	//if (value == 1) { //���� 1�̸� 
		//return 1;//1 ��ȯ
	//}
	return fibo(value-1) + fibo(value -2); //�Ǻ���ġ ���� ����
}