package ch07;
//접근제한자 in 자바
//public : 같은 패키지든 다른 패키지든 상관없이 어디서든 접근 가능하다. 클래스, 필드, 메서드, 생성자에 모두 사용할 수 있다.
//protected : 같은 패키지의 클래스나 다른 패키지의 상속받은 클래스에서 접근할 수 있다. 클래스에는 사용할 수 없고, 필드, 메서드, 생성자에 사용할 수 있다.
//privated : 같은 클래스에서만 접근할 수 있다. protected와 마찬가지로 필드, 메서드, 생성자에만 사용할 수 있다.

public class AccessExample {
    public void publicMethod(){
        System.out.println("public 메서드");
    }
    protected void protectedMethod(){
        System.out.println("protected 메서드");
    }
    void defaultMethod(){
        System.out.println("default 메서드");
    }
    private void privateMethod(){
        System.out.println("private 메서드");
    }
}
