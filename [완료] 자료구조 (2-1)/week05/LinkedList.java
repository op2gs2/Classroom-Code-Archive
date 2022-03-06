public class LinkedList {
    // 공통적으로 쓰일 필드 지정
    private ListNode head;
    private ListNode p;

    // 생성자
    public LinkedList() {

    }

    //리스트 마지막에 노드를 추가하는 함수
    public void addLastNode(String x){
        ListNode newNode= new ListNode(); //객체 생성
        newNode.data=x;
        newNode.link=null;
        if(head==null){//공백리스트
            head=newNode;
            return; // void이므로 return 할 것이 없음
        }
        ListNode p=head; //첫번째원소의 주소
        while(p.link!=null){ //마지막 원소를 찾는다
            p=p.link;
        }
        p.link=newNode; //마지막 원소의 링크부분에 새로이 찍은 객체의 주소를 삽입
    }

    //리스트를 출력해주는 함수
    public void printList() {

        System.out.print("(");
        //노드 방문 코드를 이용해 출력을 하고 있음
        p = head;
        while (p != null) {
            System.out.print(p.data);//p가 가리키는 데이터 출력
            p = p.link;//다음 노드를 가리키게 함
            if (p != null) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }

    //노드 앞에 새로운 노드를 붙여줌
    public void addFirstNode(String x) {
        //리스트 앞에 붙일 노드를 생성해줌
        ListNode newNode = new ListNode(); // 객체생성
        newNode.data = x;
        newNode.link = head;

        if(head==null){//공백리스트
            head=newNode;
            return; // void이므로 return 할 것이 없음
        }

        head = newNode;//새로운 노드를 앞에 붙여줌

    }

    //리스트의 갯수를 세어주는 함수
    public int getNumberOfNode() {
        //카운트 변수 초기화
        int cnt = 1;
        //노드방문 코드를 통해 카운트 변수를 세어줌
        while (p != null) {
            p = p.link;
            cnt++;
        }
        //카운트 값만 반환함
        return cnt;

    }

    //리스트내 특정노드의 값을 다른 값으로 대체 시키는 함수
    public void replaceNode(String x, String y) {
        //x, 기존에 있는 값의 위치를 찾는 코드
        // 카운트 변수를 이용해 위치를 기록함.
        p = head;
        int cnt = 0;
        while (p.data.equalsIgnoreCase(x) != true) {
            if (p.data.equalsIgnoreCase(x) == true) { // 해당하는 값이 있을 경우 탈출
                break;
            }
            p = p.link;
            cnt += 1;
        }

        //y, 기존의 값이 있는 위치에 새로운 값을 대입하는 함수
        //for문과 카운트 변수를 이용해 해당 위치까지 이동한 후에 새로운 값(y)을 대입함
        p = head;
        for (int i = 0; i < cnt; i++) {
            p = p.link;
        }
        p.data = y;

    }

    //리스트의 마지막 노드를 없애는 함수
    public void deleteLastNode() {
        // 마지막까지 이동한 후에
        ListNode p = head;
        int cnt = 0;
        while (p != null) {
            p = p.link;
            cnt++;
        }

        //마지막에서 2번째 전것을 가리키게 하고 널 값을 집어넣음
        p = head;
        for (int i = 0; i < (cnt - 2); i++) {
            p = p.link;
        }
        p.link = null;
    }

    //여기까지가 원래 파일에 있던 함수
    //밑으로는 문제 해결을 위해 새로 정의한 함수들임.

    //리스트에 있는 값의 합을 구하는 함수
    public int getSum() {
        int sum = 0;//누적합 변수 선언과 동시에 초기화
        p = head;
        // 노드 방문 코드를 이용해 값을 가져옴
        //가져온 값을 정수로 변환 한뒤, 누적합을 함
        while (p != null) {
            String str = p.data;
            int num = Integer.parseInt(str);
            sum += num;
            p = p.link;
        }
        return sum;
    }

    //리스트에 있는 값의 최대값을 구하는 함수
    public int getMax() {
        //들어가 있는 값은 최소한 0보다 크므로 -1로 초기화
        int max = -1;
        p = head;
        // 노드 방문 코드를 이용해 값을 가져옴
        //가져온 값을 정수로 변환 한뒤, max와 비교해서 크면 max에 대입함
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

    //모든 노드를 오른쪽으로 옮기는 함수
    //마지막까지 이동한 뒤에 p가 마지막일때 이동시켜줌
    public void Shift() {
        ListNode L = head;
        p = L;

        ListNode c = L.link;
        while (c.link != null) {
            p = c;
            c = c.link;
        }
        c.link = L; // 마지막 노드의 null부분에 첫번째 원소주소저장
        p.link = null; // 마지막에서 두번째 노드 주소에 null저장
        L = c; // L에 첫번째 원소의 주소인 C저장
        head = L;

    }

    //모든 노드의 순서를 바꾸어주는 함수
    public void reverse() {
        ListNode p = head; // 역순으로 변환시킬 리스트
        ListNode q = null; // 역순으로 만들 노드
        ListNode r = null; // 역순으로 변환된 리스트

        while (p != null) { //끝으로 갈때 까지 순서를 바꿈
            r = q;
            q = p;
            p = p.link;
            q.link = r;
        }
        head = q;
    }
}
