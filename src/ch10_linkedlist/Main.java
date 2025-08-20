package ch10_linkedlist;
//Linkedlist는 데이터를 삽입하거나 삭제하기 쉽다. 하지만 인덱스로 특정 위치에 접근하려면 순차적으로 탐색해야 해서 Arraylist 보다 느리다.
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        //LinkedList의 형태 LinkedList 클래스도 마찬가지로 3가지임
        // LinkedList<자료형> 변수명 = new LinkedList<>();
        // List<자료형> 변수명 = new LinkedList<>();
        // LinkedList<자료형> 변수명 = new LinkedList<>(다른_컬렉션_변수);
        list.addFirst("Apple"); //리스트의 첫 번째 위치에 요소를 추가한다.
        list.addLast("Banana"); //리스트의 마지막 위치에 요소를 추가한다.
        list.push("Cherry"); //리스트의 앞부분에 요소를 추가한다.(원래 있던  Apple 앞에 추가됨)
        System.out.println("리스트 상태 : "+list); //리스트 전체를 반환 [요소, 요소]의 형태를 띈다.
        System.out.println("첫 번째 요소: "+list.getFirst()); //리스트의 첫번째 요소를 반환
        list.pop(); //리스트의 첫번째 요소를 삭제하고 반환
        System.out.println("리스트 상태: "+list);
        list.removeLast(); //리스트의 마지막 요소를 삭제하고 반환
        System.out.println("리스트 상태: "+list);
        list.addLast("Durian"); //리스트의 마지막 위치에 요소를 추가
        System.out.println("리스트 상태: "+list);
        list.pop(); //리스트의 첫번째 요소를 삭제하고 반환
        System.out.println("리스트 상태: "+list);
        System.out.println("첫 번째 요소:"+list.getFirst()); //리스트의 첫번째 요소를 반환
        System.out.println("최종 리스트: "+list);
    }
}
