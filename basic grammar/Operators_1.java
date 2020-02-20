public class Operators_1 {
    public static void main(String args[]){

        // 문자열 연산
        String x = "Hello" + "World";
        System.out.println(x); // Hello World

        System.out.println("Hello I'm " + 24 + "." ); // Hello I'm 24.

        // 숫자 연산
        int a = 9;
        int b = 5;
        System.out.println(a + "+" + b + "=" + (a+b)); // 14
        System.out.println(a + "-" + b + "=" + (a-b)); // 4
        System.out.println(a + "*" + b + "=" + (a*b)); // 45
        System.out.println(a + "/" + b + "=" + (a/b)); // 1
        System.out.println(a + "%" + b + "=" + (a%b)); //4

        // 비교 연산자

        System.out.println(5 + ">" + 3 + "->" + (5>3)); // true
        System.out.println(5 + "<" + 3 + "->" + (5<3)); // false
        System.out.println(5 + ">=" + 3 + "->" + (5>=3)); // true
        System.out.println(5 + "<=" + 3 + "->" + (5<=3)); // false
        System.out.println(5 + "==" + 3 + "->" + (5==3)); // false
        System.out.println(5 + "!=" + 3 + "->" + (5!=3)); // true

    }
}

/*
    15번째줄 -> / 는 몫을 구하는 연산자로써 계산 결과 1이 나온다
              원래 정확한 몫은 1.8이지만 a,b 둘다 정수형으로써 정수 값 1 만 나오고
              두개의 변수중 하나라도 소수형(float, double)으로 작성하면 1.8이 나온다.

    22,23 번째 줄 -> 크거나 같다(이상)는 >= , 작거나 같다(이하)는 <=으로 '='를 붙여주어야 한다
    24번째 줄 -> 같다의 표시는 '=' 이 아니라 '=='으로 작성해야한다.
    25번째 줄 -> 같지 않다의 표시는 '!='으로 느낌표를 붙여주어야 한다.

    문자열과 숫자를 더하면 숫자는 자동으로 문자열로 바뀌고 문자열과 불린형을 더하면 문자열로 바뀐다

    문자열 안에 큰따옴표("")를 사용하고 싶다면 역슬래쉬(\)를 적어야 한다
     -> System.out.println("철수가 얘기한다 \"안녕하세요!\" ");  -> 철수가 얘기한다 "안녕하세요!"

    그 밖에도 문자열안에 쓰이는 것들이 있는데 이스케이 문자라고 한다
     -> \t (탭), \b (백스페이스), \n (줄바꿈,새로운줄), \r (줄바꿈,커서를 맨 앞으로 이동), \
 */
