package ch10_generics;

public class Main {
    public static void main(String[] args){
        Box box=new Box(); //새로운 Box 객체 생성
        box.setContent("Hello World!");
        Integer number = (Integer)box.getContent();
        System.out.println(number);
    }
}
//에러 발생!
//setContent 에서 Object형으로 저장되는데, getContent에서 Object형의 값을 반환하는데, 이를 Integer형으로 변환하려 하였다.
//그러나 content 필드에 저장된 값은 String이다. String객체를 Integer형으로 형변환할 수 없으므로 실행하면 ClassCastException 예외가 발생
//타입 안정성이 보장되지 않는 상황이다. 타입안전성은 프로그래밍언어에서 데이터의 자료형이 예상하지 못한 방식으로 변환되거나
//잘못된 자료형의 데이터가 사용되는 것을 방지하는 성질을 의미한다.
