package ch11_FileInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//FileWriter/BufferedWriter 클래스
//FIleWriter 클래스는 파일에 문자 단위로 데이터를 쓴다. 주로 텍스트 파일이나 로그 파일등 문자열 데이터를 저장할 때 사용. 단순한 파일쓰기 작업에 사용
//기본적으로 파일을 덮어쓰지만, append 모드를 사용하면 파일 끝에 데이터 추가 가능
//또한, BufferedWriter 클래스와 함께 사용하면 버퍼링 기능을 사용해 성능을 높일 수 있다.
//FileOutputStream 클래스의 메서드와 쓰는 데이터 단위만 다르고 거의 같다. 아래는 BufferedWriter 클래스에서 사용하는 메서드
//write(문자열): 전체 문자열을 버퍼에 쓴다.
//newLine(): 새 줄을 추가한다.
//flush(): 버퍼에 있는 모든 데이터를 출력

public class Main {
    public static void main(String[] args){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/temp/output.txt",true))){
            //try-with-resources 문법으로 FileWriter와 BufferedWriter 객체를 생성. try 블록이 끝나면 자동으로 스트림을 닫는다
            //FileWriter처럼 FileWriter 객체를 생성할 때 파일명과 함께 두 번째 인자로 true를 전달하면 append 모드로 열린다.
            //해당 모드에서는 기존 파일을 덮어쓰지 않고, 파일 끝에 새로운 내용을 추가.
            writer.newLine(); // 새 줄(줄 바꿈)을 파일에 추가
            writer.write("Hello, JAVA!"); //문자열을 파일에 쓴다. 위 메서드에 의해 줄 바꿈된 후 해당 문자열이 추가
            writer.newLine(); //줄 바꿈
            writer.write("This is another line."); //줄 바꿈후에 또 다른 문자열을 작성
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
