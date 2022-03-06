import java.util.*;

public class LinkedListMain {
    public static void main(String args[]) {

        //1~5�� ������ ���� ����Ʈ ����
        System.out.println("L1=(kim,Lee,Park) ���Ḯ��Ʈ");
        LinkedList L1 = new LinkedList(); // ��ü �����ϱ�
        L1.addLastNode("Kim");
        L1.addLastNode("Lee");
        L1.addLastNode("Park");
        // 1�� ����
        System.out.println("1�� ����");
        L1.addFirstNode("Cho");
        L1.printList();
        // 2�� ����
        System.out.println("2�� ����");
        L1.addLastNode("Yoo");
        L1.printList();
        // 3�� ����
        System.out.println("3�� ����");
        L1.replaceNode("Kim", "Song");
        L1.printList();
        // 4�� ����
        System.out.println("4�� ����");
        L1.deleteLastNode();
        L1.printList();
        // 5�� ����
        System.out.println("5�� ����");
        System.out.println("����� ����: " + L1.getNumberOfNode());
        L1.printList();

        //6�� ����
        System.out.println("6�� ����");
        LinkedList L3 = new LinkedList(); // ��ü �����ϱ�
        Random rnd = new Random();
        int cnt = rnd.nextInt(10) + 1; //������ ����

        //���� ������ ���� ���ѵ� ��忡 �־��ֱ�
        for (int i = 0; i < cnt; i++) {
            int num = rnd.nextInt(1000);
            String str = Integer.toString(num);
            L3.addLastNode(str);
        }
        //L3�� �ִ� ���� ���ѵ�(L3.getSum()) Ƚ����ŭ ������(��� ���ϱ�)
        System.out.printf("�� ���Ḯ��Ʈ�� ����� %d�Դϴ�.\n",(L3.getSum()/cnt));

        //7�� ����
        System.out.println("7�� ����");
        LinkedList L4 = new LinkedList(); // ��ü �����ϱ�
        int cnt1 = rnd.nextInt(10) + 1;//������ ���� ����

        //���� ������ ���� ���ѵ� ��忡 �־��ֱ�
        for (int i = 0; i < cnt1; i++) {
            int num = rnd.nextInt(1000);
            String str = Integer.toString(num);
            L4.addLastNode(str);
        }
        //L4�� �ִ� �ִ밪�� Ư�� �Լ�(L4.getMax())�� �̿��� ���ϱ�
        System.out.println("�� ���Ḯ��Ʈ�� �ִ밪��"+L4.getMax() +"�Դϴ�.");

        //8, 9�� ������ ���� ���Ḯ��Ʈ ����
        LinkedList L5 = new LinkedList();
        L5.addLastNode("Kim");
        L5.addLastNode("Lee");
        L5.addLastNode("Park");
        L5.addLastNode("Yoo");

        //8�� ����(Shift)
        System.out.println("8�� ����(Shift)");
        System.out.println("�ٲ� ���Ḯ��Ʈ");
        L5.Shift();
        L5.printList();
        //9�� ����(reverse)
        System.out.println("9�� ����(reverse)");
        System.out.println("���Ḯ��Ʈ ����");
        L5.reverse();
        L5.printList();

    }
}

