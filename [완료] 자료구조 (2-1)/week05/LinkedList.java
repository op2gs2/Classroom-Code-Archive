public class LinkedList {
    // ���������� ���� �ʵ� ����
    private ListNode head;
    private ListNode p;

    // ������
    public LinkedList() {

    }

    //����Ʈ �������� ��带 �߰��ϴ� �Լ�
    public void addLastNode(String x){
        ListNode newNode= new ListNode(); //��ü ����
        newNode.data=x;
        newNode.link=null;
        if(head==null){//���鸮��Ʈ
            head=newNode;
            return; // void�̹Ƿ� return �� ���� ����
        }
        ListNode p=head; //ù��°������ �ּ�
        while(p.link!=null){ //������ ���Ҹ� ã�´�
            p=p.link;
        }
        p.link=newNode; //������ ������ ��ũ�κп� ������ ���� ��ü�� �ּҸ� ����
    }

    //����Ʈ�� ������ִ� �Լ�
    public void printList() {

        System.out.print("(");
        //��� �湮 �ڵ带 �̿��� ����� �ϰ� ����
        p = head;
        while (p != null) {
            System.out.print(p.data);//p�� ����Ű�� ������ ���
            p = p.link;//���� ��带 ����Ű�� ��
            if (p != null) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }

    //��� �տ� ���ο� ��带 �ٿ���
    public void addFirstNode(String x) {
        //����Ʈ �տ� ���� ��带 ��������
        ListNode newNode = new ListNode(); // ��ü����
        newNode.data = x;
        newNode.link = head;

        if(head==null){//���鸮��Ʈ
            head=newNode;
            return; // void�̹Ƿ� return �� ���� ����
        }

        head = newNode;//���ο� ��带 �տ� �ٿ���

    }

    //����Ʈ�� ������ �����ִ� �Լ�
    public int getNumberOfNode() {
        //ī��Ʈ ���� �ʱ�ȭ
        int cnt = 1;
        //���湮 �ڵ带 ���� ī��Ʈ ������ ������
        while (p != null) {
            p = p.link;
            cnt++;
        }
        //ī��Ʈ ���� ��ȯ��
        return cnt;

    }

    //����Ʈ�� Ư������� ���� �ٸ� ������ ��ü ��Ű�� �Լ�
    public void replaceNode(String x, String y) {
        //x, ������ �ִ� ���� ��ġ�� ã�� �ڵ�
        // ī��Ʈ ������ �̿��� ��ġ�� �����.
        p = head;
        int cnt = 0;
        while (p.data.equalsIgnoreCase(x) != true) {
            if (p.data.equalsIgnoreCase(x) == true) { // �ش��ϴ� ���� ���� ��� Ż��
                break;
            }
            p = p.link;
            cnt += 1;
        }

        //y, ������ ���� �ִ� ��ġ�� ���ο� ���� �����ϴ� �Լ�
        //for���� ī��Ʈ ������ �̿��� �ش� ��ġ���� �̵��� �Ŀ� ���ο� ��(y)�� ������
        p = head;
        for (int i = 0; i < cnt; i++) {
            p = p.link;
        }
        p.data = y;

    }

    //����Ʈ�� ������ ��带 ���ִ� �Լ�
    public void deleteLastNode() {
        // ���������� �̵��� �Ŀ�
        ListNode p = head;
        int cnt = 0;
        while (p != null) {
            p = p.link;
            cnt++;
        }

        //���������� 2��° ������ ����Ű�� �ϰ� �� ���� �������
        p = head;
        for (int i = 0; i < (cnt - 2); i++) {
            p = p.link;
        }
        p.link = null;
    }

    //��������� ���� ���Ͽ� �ִ� �Լ�
    //�����δ� ���� �ذ��� ���� ���� ������ �Լ�����.

    //����Ʈ�� �ִ� ���� ���� ���ϴ� �Լ�
    public int getSum() {
        int sum = 0;//������ ���� ����� ���ÿ� �ʱ�ȭ
        p = head;
        // ��� �湮 �ڵ带 �̿��� ���� ������
        //������ ���� ������ ��ȯ �ѵ�, �������� ��
        while (p != null) {
            String str = p.data;
            int num = Integer.parseInt(str);
            sum += num;
            p = p.link;
        }
        return sum;
    }

    //����Ʈ�� �ִ� ���� �ִ밪�� ���ϴ� �Լ�
    public int getMax() {
        //�� �ִ� ���� �ּ��� 0���� ũ�Ƿ� -1�� �ʱ�ȭ
        int max = -1;
        p = head;
        // ��� �湮 �ڵ带 �̿��� ���� ������
        //������ ���� ������ ��ȯ �ѵ�, max�� ���ؼ� ũ�� max�� ������
        while (p != null) {
            String str = p.data;
            int num = Integer.parseInt(str);
            if (max < num) {
                max = num;
            }
            p = p.link;
        }
        return max;
    }

    //��� ��带 ���������� �ű�� �Լ�
    //���������� �̵��� �ڿ� p�� �������϶� �̵�������
    public void Shift() {
        ListNode L = head;
        p = L;

        ListNode c = L.link;
        while (c.link != null) {
            p = c;
            c = c.link;
        }
        c.link = L; // ������ ����� null�κп� ù��° �����ּ�����
        p.link = null; // ���������� �ι�° ��� �ּҿ� null����
        L = c; // L�� ù��° ������ �ּ��� C����
        head = L;

    }

    //��� ����� ������ �ٲپ��ִ� �Լ�
    public void reverse() {
        ListNode p = head; // �������� ��ȯ��ų ����Ʈ
        ListNode q = null; // �������� ���� ���
        ListNode r = null; // �������� ��ȯ�� ����Ʈ

        while (p != null) { //������ ���� ���� ������ �ٲ�
            r = q;
            q = p;
            p = p.link;
            q.link = r;
        }
        head = q;
    }
}
