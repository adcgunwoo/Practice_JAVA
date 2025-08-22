package ch10_Set;
//Set 인터페이스 : 집합 자료구조를 정의한 인터페이스이다. 중복 요소를 허용하지 않으며, 요소들의 순서가 정해져있지 않다.
//HashSet : Set 인터페이스의 대표적인 구현 클래스, 부하율(0.75)
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple"); //add(요소) 집합에 요소를 추가, 해당 요소가 이미 존재하면 추가되지 않는다.
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("집합 상태 :"+fruits);
        fruits.add("Apple");
        System.out.println("집합 크기 : "+fruits);
        System.out.println("Banana가 있는가?: "+fruits.contains("Banana")); //집합에 요소가 있는지 여부를 반환
        System.out.println("Banana가 삭제됐는가?: "+fruits.remove("Banana")); //삭제됐는가? 보다는 삭제한다. 하지만 출력은 0또는1
        //remove(요소) 지정된 요소를 집합에서 삭제한다.
        System.out.println("Banana가 있는가?: "+fruits.contains("Banana"));
        System.out.println("집합이 비어 있는가?: "+fruits.isEmpty());
        System.out.println("집합 요소: ");
        Iterator<String> iterator=fruits.iterator(); //fruits 객체로 iterator()를 호출해 반복자(iterator)를 생성
        while (iterator.hasNext()){ //반복자를 이용해 HashSet에 있는 모든 요소를 출력, HashSet에 있는 요소를 순회하기 위해 while문 사용
            //hasNext() 메서드는 다음 요소가 있는지 확인하고, 있으면 true를 반환
            System.out.println(iterator.next()); 
        }
        //iterator() 집합 요소들을 순회할 수 있는 반복자를 반환한다.
        fruits.clear();
        System.out.println("최종 집합 크기: "+fruits.size());
        System.out.println("집합이 비어 있는가?: "+fruits.isEmpty());
    }
}
