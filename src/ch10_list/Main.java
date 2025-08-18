package ch10_list;
//List 인터페이스의 특징 : 삽입된 순서를 유지, 중복을 허용(같은 값의 요소를 여러번 추가 가능),
// 각 요소를 가리키는 인덱스가 있고, 이를 통해 요소에 접근 가능함(인덱스는 0부터 시작), 크기가 변경될 수 있음(요소를 추가하거나 삭제함으로써)
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple"); //add(요소) : 리스트의 끝에 요소를 추가하는 메서드, 첫번째로 삽입된 요소는 첫번째 인덱스(0)에 저장됨
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list.get(1)); // get(인덱스) 저장된 인덱스에 있는 요소를 반환함 getter 함수와 비슷
        list.set(1,"Durian"); //set(인덱스, 요소) 지정된 인덱스의 요소를 새로운 요소로 바꾼다.
        list.remove(0); //remove(인덱스) 지정된 인덱스의 요소를 새로운 요소를 삭제
        System.out.println("리스트 크기 : "+list.size()); //리스트의 요소의 개수를 반환
        System.out.println("리스트가 비었는가? "+list.isEmpty()); //리스트가 비어있는지 확인
        //그 외 clear() : 리스트의 모든 요소를 삭제, contains(요소) : 지정한 요소가 리스트에 포함되어 있는지 확인
    }
}
