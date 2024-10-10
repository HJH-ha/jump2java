package 연습_상속인터페이스;

import java.util.ArrayList;

public class InterfaceReview {
    public static void main(String[] args) {
        Sounding dog = new Dog();
        Sounding baby = new Baby();
        Sounding tiger = new Tiger();
        Sounding robot = new Robot();
//        Dog dog = new Dog();
//        Baby baby = new Baby();
//        Tiger tiger = new Tiger();
//        Robot robot = new Robot();
        //ArrayList 에 넣기
        ArrayList<Sounding> list = new ArrayList<Sounding>();
        list.add(dog);
        list.add(baby);
        list.add(tiger);
        list.add(robot);
        //각각 소리 내기
        for (Sounding s : list) {
            s.sound();
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).sound();

        }

    }
}

interface Sounding{
    void sound();
}
class Dog implements Sounding{
    @Override
    public void sound() {
        System.out.println("Dog: 멍멍!");
    }
}
class Baby implements Sounding{
    @Override
    public void sound() {
        System.out.println("Baby: 응애~");
    }
}
class Tiger implements Sounding{
    @Override
    public void sound() {
        System.out.println("Tiger: 어흥!");
    }
}
class Robot implements Sounding{
    @Override
    public void sound() {
        System.out.println("Robot: 삐빕!");
    }
}