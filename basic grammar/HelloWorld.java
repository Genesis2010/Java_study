public class HelloWorld { // helloWorld 라는 클래스를 정의한다.
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
/*
    public -> 접근 제어자로 어디에서나 접근이 가능하다!
              ex) public, private, protected 가 있다

    static -> 바로 그 부분을 실행 시켜준다. main이 가장 첫번째로 실행이 되야하기에 main 앞에는 static을 써야한다.

    void -> 함수의 리턴 값의 자료형, void는 '리턴 값이 없다'라는 의미
            ex) 정수형으로 반환 시 int, 문자열로 반환시 string

    main -> 함수(메소드)이름, 자바는 main 함수를 찾아 첫번째로 실행시키므로 꼭 이름을 main 으로 해야한다.

    String[] args -> main 함수의 매개변수(파라미터), args(변수 이름)라는 문자열 배열이다.

    3번째줄 -> System 이라는 클래스에 out 이라는 클래스 변수에 println 이라는 메소드를 호출한다
              매개변수로 Hello World 라는 문자열을 입력
              print에서 ln은 다음 줄로 넘어 간다는 뜻
*/