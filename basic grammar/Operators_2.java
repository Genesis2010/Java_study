public class Operators_2 {
    public static void main(String args[]){
        // 불린 연산자 - and
        System.out.println("true && true -> " + (true && true)); // true
        System.out.println("true && false -> " + (true && false)); // false
        System.out.println("false && true -> " + (false && true)); // false
        System.out.println("false && false -> " + (false && false)); // false

        // 불린 연산자 - or
        System.out.println("true || true -> " + (true || true)); // true
        System.out.println("true || false -> " + (true || false)); // true
        System.out.println("false || true -> " + (false || true)); // true
        System.out.println("false || false -> " + (false || false)); // false

        // 불린 연산자 - not
        System.out.println("!true -> " + !true); // false
        System.out.println("!false -> " + !false); // true

        // 단항 연산자 - --,++(감소,증가)
        int x = 2;

        System.out.println(-x); // -2
        System.out.println(++x); // 3
        System.out.println(x--); // 3
        System.out.println(x); // 2
    }
}

/*
    and 연산자는 둘다 참일경우(true) 참(true)이고
    or 연산자는 둘중에 하나라도 참일경우(true) 참(true)이다.
    not 연산자는 값을 반대로 바꿔주는 것이다
    단항 연산자는 변수 앞에 붙어있을땐 처리를 하고 저장, 뒤에 있을땐 그 줄을 다 마치고 가장 나중에 처리를 한다 
 */