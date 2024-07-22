package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // Object -> Integer 다운캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // Object -> String 다운캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달
        integerBox.set("문자100");
        Integer integer1 = (Integer) integerBox.get();
        System.out.println("integer1 = " + integer1);
    }
}
