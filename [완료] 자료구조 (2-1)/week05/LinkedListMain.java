import java.util.*;

public class LinkedListMain {
    public static void main(String args[]) {

        //1~5번 문제를 위한 리스트 정의
        System.out.println("L1=(kim,Lee,Park) 연결리스트");
        LinkedList L1 = new LinkedList(); // 객체 생성하기
        L1.addLastNode("Kim");
        L1.addLastNode("Lee");
        L1.addLastNode("Park");
        // 1번 문제
        System.out.println("1번 문제");
        L1.addFirstNode("Cho");
        L1.printList();
        // 2번 문제
        System.out.println("2번 문제");
        L1.addLastNode("Yoo");
        L1.printList();
        // 3번 문제
        System.out.println("3번 문제");
        L1.replaceNode("Kim", "Song");
        L1.printList();
        // 4번 문제
        System.out.println("4번 문제");
        L1.deleteLastNode();
        L1.printList();
        // 5번 문제
        System.out.println("5번 문제");
        System.out.println("노드의 갯수: " + L1.getNumberOfNode());
        L1.printList();

        //6번 문제
        System.out.println("6번 문제");
        LinkedList L3 = new LinkedList(); // 객체 생성하기
        Random rnd = new Random();
        int cnt = rnd.nextInt(10) + 1; //정수의 갯수

        //랜덤 값으로 값을 정한뒤 노드에 넣어주기
        for (int i = 0; i < cnt; i++) {
            int num = rnd.nextInt(1000);
            String str = Integer.toString(num);
            L3.addLastNode(str);
        }
        //L3에 있는 합을 구한뒤(L3.getSum()) 횟수만큼 나누기(평균 구하기)
        System.out.printf("이 연결리스트의 평균은 %d입니다.\n",(L3.getSum()/cnt));

        //7번 문제
        System.out.println("7번 문제");
        LinkedList L4 = new LinkedList(); // 객체 생성하기
        int cnt1 = rnd.nextInt(10) + 1;//정수의 갯수 지정

        //랜덤 값으로 값을 정한뒤 노드에 넣어주기
        for (int i = 0; i < cnt1; i++) {
            int num = rnd.nextInt(1000);
            String str = Integer.toString(num);
            L4.addLastNode(str);
        }
        //L4에 있는 최대값을 특정 함수(L4.getMax())를 이용해 구하기
        System.out.println("이 연결리스트의 최대값은"+L4.getMax() +"입니다.");

        //8, 9번 문제를 위한 연결리스트 정의
        LinkedList L5 = new LinkedList();
        L5.addLastNode("Kim");
        L5.addLastNode("Lee");
        L5.addLastNode("Park");
        L5.addLastNode("Yoo");

        //8번 문제(Shift)
        System.out.println("8번 문제(Shift)");
        System.out.println("바뀐 연결리스트");
        L5.Shift();
        L5.printList();
        //9번 문제(reverse)
        System.out.println("9번 문제(reverse)");
        System.out.println("연결리스트 역순");
        L5.reverse();
        L5.printList();

    }
}

