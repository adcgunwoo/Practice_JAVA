package ch11_FileInputOutput;
//파일 출력 작업에는 주로 FileOutputStream과 Filewriter 클래스를 사용한다.
//이번 코드는 FileOutputStream 클래스이다. 해당 클래스는 파일에 바이트 단위로 데이터를 쓴다. 주로 바이너리 데이터를 파일에 저장할 때 사용한다.
//주어진 파일 또는 FIle 객체로 지정된 파일에 데이터를 쓴다.
//FIleOutputStream 객체를 생성할 떄 지정한 파일이 존재하지 않으면 해당 파일이 자동으로 생성된다. 파일이 이미 존재하면 일반적으로 해당 파일의 내용을 덮어쓴다.
//FileOutputStream 클래스의 주요 메서드
//write(): 1바이트 데이터를 파일에 쓴다.
//write(바이트_배열): 바이트 배열의 데리터를 파일에 쓴다.
//write(바이트_배열, 위치, 길이): 바이트 배열의 지정된 위치에서부터 지정된 길이만큼의 데이터를 파일에 쓴다.
//close(): 스트림을 닫고 관련 자원을 해제한다.

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        String data = "Hello, World!"; //data 변수에 파일에 쓸 문장을 저장
        try {
            FileOutputStream fos = new FileOutputStream("D:/output.txt");
            //D:/output.txt 파일을 가리키는 FIleOutputStream 객체를 생성해 스트림을 연다
            //이 파일에 데이터를 쓸 준비가 됐고, 만약 지정한 파일이 없으면 자동으로 새로운 파일을 생성
            fos.write(data.getBytes());
            //data 변수의 문자열을 getBytes() 메서드를 사용해 바이트 배열로 변환
            //getBytes() 메서드는 기본 문자 인코딩을 사용해 문자열을 바이트 배열로 변환, String 클래스에서 제공하는 기능
            //data 변수에 저장된 문자열의 각 문자가 1바이트로 인코딩돼 바이트 배열의 요소가 됨
            fos.close();
            //try-with-resources 문법을 사용하지 않았기에 명시적으로 close() 메서드를 호출해 스트림을 닫음
            //닫지 않으면 파일이 잠겨서 다른 프로세스나 프로그램에 접근할 수 없거나 데이터가 완전히 작성되지 않을 수도 있다.
            System.out.println("Writing completed");
            //파일쓰기 작업이 성공하면 메시지를 출력해 알림
        }
        catch (IOException e){
            //try 블록에서 발생할 수 있는 IOEXception을 처리한다. 보통 파일을 쓰거나 닫을 때 문제가 발생할 가능성이 있다.
            e.printStackTrace();
        }
    }
}
