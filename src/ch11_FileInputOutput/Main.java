package ch11_FileInputOutput;

import javax.imageio.IIOException;
import java.io.FileInputStream;
//파일 입출력은 프로그램이 외부에 저장된 데이터를 읽거나, 프로그램의 데이터를 파일로 저장하는 작업이다.
//예를 들어, 텍스트 파일에서 데이터를 읽거나 이미지 파일을 메모리에 로드하는 작업이 입력에 해당된다.
//또한, 계산 결과를 파일에 저장하거나 로그를 파일에 기록하는 작업이 출력에 해당된다.


public class Main {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("D:/input.txt")){ //파일을 읽기 위해 FileInputStream 객체를 생성해 스트림을 연다.
            //이때 해당 파일이 존재하지 않으면 FileNotFoundException이 발생할 수 있다.
            //스트림을 열고 나면 닫아야 하는데, close() 메서드를 호출하는 대신 try-with-resources 문법을 사용해 자원을 자동으로 닫는다.
            //파일이 성공적으로 열리면 fis 변수에 FileInputStream 객체가 할당된다.
            int data; //파일에서 읽어들인 데이터르 저장하기 위해 int형 변수를 선언한다. 이 변수에 데이터를 1바이트씩 저장한다.
            while ((data = fis.read()) !=-1){ //read() 메서드를 호출해 파일에서 1바이트씩 데이터를 읽는다.
                //파일에서 더 이상 읽을 데이터가 없으면 -1을 반환한다. 파일에서 읽은 데이터를 data 변수에 저장하고, -1이 반환될 때까지 반복한다.
                System.out.println((char)data); //data 변수에 저장된 데이터를 문자로 변환(char)해 출력한다.
            }
        }
        catch (IIOException e){
            e.printStackTrace();
            //try 블록이 끝나고 파일 읽기가 완료되면 스트림은 자동으로 닫힌다. try 블록에서 발생할 수 있는 예외를 처리한다.
            //printStackTrace()는 예외가 발생했을 떄 예외가 발생한 순간부터 메서드 호출이 어떤 경로를 따라왔는지에 대한 정보를 출력한다.
            //실행결과처럼 예외가 발생한 메섣, 클래스, 소스 코드의 줄 번호가 정보에 포함된다.
        }
    }
}
