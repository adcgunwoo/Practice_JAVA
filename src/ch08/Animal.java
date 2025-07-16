package ch08;

public class Animal {

    String name; //이름
    int age; //나이

    //메서드
    public void eat(){
        System.out.println(name+"이(가) 밥을 먹습니다.");
    }
    public Animal(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("이름 : " + this.name + ", 나이 : "+ this.age);
    }

}
