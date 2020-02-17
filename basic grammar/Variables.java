public class Variables {
    public static void main(String args[]){
        int age; // 변수 선언
        age = 24;

        int num = 22; // 변수와 값을 같이 선언 할 수 있다.

        age = num; // 다른 변수의 값을 넣을 수 있다.
        age = age + 2; // int형 변수이기 때문에 변수명으로 연산이 가능하다.

        System.out.print("Hello I'm ");
        System.out.print(age);
        System.out.println(".");
    }
}
/*
    int age -> int 는 자료형(data type), age는 변수명이다.

    변수명 규칙 -> 대소문자를 구분 ex) Age, age (다른 변수!)

                숫자로 시작 불가 ex) 1age

                자바 예약어 사용불가 ex) class, static

                특수기호는 ' _ ', ' $ ' 외에 사용불가 ex) @age (x), _age(o)
                    $는 주로 자동 생성되는 변수명으로 사용,
                    _는 주로 상수 이름에 사용

                변수명은 '카멜 케이스' 기법으로 정하는게 좋다
                    첫번째 단어는 소문자로 두번째 단어는 대문자로 적는다. ex) myAge
*/