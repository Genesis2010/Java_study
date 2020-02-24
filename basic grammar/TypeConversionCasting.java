public class TypeConversionCasting { // 형 변환
    public static void main(String[] args){

        int x = 5 ;
        double y = x;
        // double형이 int형보다 범위가 더 넓으므로 형 변환이 가능하다.

        /*
        double a = 3.14;
        int b = a;

        double형인 변수 a를 int형인 변수 b에 값을 저장할수 없다. (int형이 범위가 더 작기 떄문이다)
        */

        double a = 3.14;
        int b = (int) a; // 타입캐스팅을 통해 강제적으로 형변환을 시켜 저장이 가능하다.
        System.out.println(b); // 3 (소수 부분이 버려지게 된다)

        int c = 9;
        int d = 5;
        System.out.println(c / d); // 1
        System.out.println((double) c / d); // 1.8
        // 정확히 소수 부분까지 계산을 원한다면 타입캐스팅을 이용한다
    }
}
/*
    타입 캐스팅 (Type Casting)
        -> 변수 앞에 '(자료형) 변수명'처럼 적어주면 큰 범위에서 작은 범위, 작은 범위에서 큰 범위로 형변환이 가능하다.
           큰 범위에서 작은 범위로 변환시 데이터의 손실이 있을 수 있다.
 */
