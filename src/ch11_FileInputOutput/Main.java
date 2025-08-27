package ch11_FileInputOutput;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
//FileReader/BufferedReader 클래스
//FileReader 클래스는 파일에서 문자 단위로 데이터를 읽어오는 데 사용한다. 주로 텍스트 파일을 읽을 때 사용
//FileReader 클래스는 성능 개선을 위해 BufferedReader 클래스도 함께 사용
//BufferedReader 클래스는 버퍼를 사용해 데이터를 한 번에 읽고, 한 줄 단위로 데이터를 처리하는 기능을 제공
//FileReader 클래스는 FileInputStream 클래스의 메서드와 읽어오는 데이터 단위만 다르고 거의 같다. 추가로 아래는 BufferedReader 클래스에서 사용하는 메서드

//readLine(): 한 줄을 읽어 문자열로 반환. 더 이상 읽을 줄이 없으면 null을 반환
//ready(): 입력 스트림에서 읽을 준비가 됐는지, 즉 버퍼에 읽을 데이터가 있는지 확인
//close(): 스트림을 닫고, 관련된 시스템 자원을 모두 해제, try-with-resources 문법을 사용하면 이 메서드는 자동으로 호출


public class Main {
    public static void main(String[] args){
        try (BufferedReader br = new BufferedReader(new FileReader("D:/input.txt"))){
            //D:/input.txt 파일을 읽기 위해 FileReader 객체를 생성해 스트림을 연다.
            //FileReader 객체를 인자로 받아 BufferReader 객체를 생성한다.
            //BufferedReader 객체는 스트림을 감싸서 FIleReader 객체가 읽어온 데이터를 BufferedReader 객체의 버퍼에 저장한다.
            //데이터는 버퍼 크기만큼 한 번에 읽는다.
            //try-with-resources 문법으로 스트림을 자동으로 닫는다.
            String line; //읽어들인 텍스트 한 줄을 저장할 line 변수를 선언한다.
            while ((line = br.readLine()) != null) {
                //readLine() 메서드로 BufferedReader 객체의 버퍼에서 텍스트를 한 줄씩 읽어와 line 변수에 저장
                //더 이상 읽을 줄이 없으면 null을 반환
                System.out.println(line); //읽어들인 텍스트 한 줄을 출력한다.
            }
        }
        catch (IIOException e){
            //try-with-resources 문법에 의해 try 블록이 끝나면 스트림이 자동으로 닫힌다.
            //try 블록에서 발생할 수 있는 예외를 처리한다. 파일이 존재하지 않거나 접근 권한이 없으면 예외가 발생할 수 있다.
            e.printStackTrace();
        }
    }
}

//try-with-resources 문법
//자바 7 버전부터 도입된 문법으로, 사용한 자원을 자동으로 안전하게 닫아주는 기능이다.
//이 문법을 사용하면 close() 메서드로 명시적으로 닫지 않아도 자원이 자동으로 닫힌다.
//메모리 낭비를 방지할 수 있다. 또한 코드의 안정성과 가독성이 향상된다.

//try (지원_클래스 변수 = new 자원 클래스()) {
//   지원 사용 코드
// }
//catch(예외_클래스 변수) {
//   예외 처리 코드
// }  형식은 이렇다. try 블록에서 자원을 선언하고 초기화한다.
//자원은 세미콜론으로 구분해 여러 개 선언할 수 있다. 성언된 자원은 블록이 끝나면 자동으로 닫힌다.
