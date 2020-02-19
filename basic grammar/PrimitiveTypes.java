public class PrimitiveTypes {
    public static void main(String args[]){

        // 숫자형(정수형: int, long / 소수형: float, double)
        // 정수 기본형 int , 소수 기본형 double
        byte x = 127;
        // byte y = 128; (byte 범위를 벗어나므로 오류가 난다)

        long y = 123454545L;
        // long을 사용하기 위해선 값 뒤에 L, l 을 붙여야한다. 1과 l이 혼동 될 수 있으니 대문자 L을 권장

        float z = 3.14f;
        // float를 사용하기 위해선 값 뒤에 f를 붙여야한다.


        // boolean -> 참(true), 거짓(false)
        boolean a = true;
        a = false;

        // 글자형(char: 글자 하나를 저장, 작은따옴표 안에 글자를 적는다)
        char b = 'B';

        // 문자열(String: 여러 글자를 저장, 큰따옴표 안에 글자를 적는다)
        String c = "안녕하세요!";


    }
}

/*
    byte    -> 8bits (-128 ~ 127)
    short   -> 2bytes (-32768 ~ 32767)
    int     -> 4bytes (-2^31 ~ 2^31-1)
    long    -> 8bytes (-2^63 ~ 2^63-1)
    float   -> 4bytes
    double  -> 8bytes
    char    -> 2bytes
    boolean -> 2bytes

    소수형 float 와 double의 차이점
     -> 둘다 소수를 저장 할 수 있지만 double이 float보다 더 정밀하게 값을 저장할 수 있다

    String의 특이점
     -> 자료형이 아니라 클래스이다. 클래스를 변수의 형처럼 적고 선언한다.
 */