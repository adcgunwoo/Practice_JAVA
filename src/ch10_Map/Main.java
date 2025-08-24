package ch10_Map;
//Map 인터페이스 : Map은 키와 값의 한 쌍으로 이루어진 자료구조를 정의한 인터페이스이다. Map 인터페이스는 하나의 키에 하나의 값을 매핑해
//항목(entry)으로 저장한다. 키는 고유해야 하지만, 값은 중복될 수 있다. 같은 키로 값을 저장하면 기존 값을 덮어쓴다.
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

//HashMap 클래스 : 가장 많이 사용되는 Map 인터페이스의 구현 클래스. 키와 값을 한 쌍으로 저장하는 해시 테이블 기반 구조
//키를 기반으로 한 데이터 검색, 십입, 삭제가 매우 빠르다. 대량의 데이터를 다룰 때 효율적이다.
//키와 값의 순서를 보장하지 않으므로 데이터를 저장한 순서와 조회할 때 순서가 다를 수 있음
//HasMap<자료형, 자료형> map = new HashMap<>([용량, 부하율]);   객체생성 방법
//키와 값을 한 쌍으로 저장하므로 자료형은 2개, 자료형이 같을 필요는 X
//HashSet과 같이 용량을 지정할 수 있고 지정하지 않으면 기본 용량(16)으로 생성됨. 기본 부하율은 0.75

public class Main {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple",10); //put(키, 값): 지정된 키와 값을 맵에 추가, 해당 키가 이미 존재하면 기존 값을 새로운 값으로 대체
        map.put("Banana", 15);
        map.put("Cherry", 20);
        map.put("Durian", 25);
        System.out.println("Apple의 수량: "+map.get("Apple")); //get(키): 지정된 키에 매핑된 값을 반환한다. 키가 맴에 없으면 null을 반환할 수 있다.
        map.remove("Banana"); //remove(키): 지정된 키에 매핑된 항목을 맴에서 삭제
        System.out.println("맵 상태: "+map);
        System.out.println("Cherry가 있는가? "+map.containsValue(10)); //containsValue(값): 지정된 값이 맴에 하나 이상의 키로 매핑돼 있는지 확인
        Set<String> keys = map.keySet(); //keySet(): 맴에 포함된 모든 키를 Set형으로 반환!!!
        System.out.println("모든 키: "+keys);
        Collection<Integer> values = map.values(); //values(): 맴에 포함된 모든 값을 Collection형으로 반환
        System.out.println("모든 값: "+values);
    }
}
