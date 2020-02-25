public class IfElse {
    public static void main (String[] args){
        int x = 8;

        if(x<=7){
            System.out.println("x는 7보다 작다");
        } else if (x<=10){
            System.out.println("x는 10보다 작고 7보다 크다");
        } else {
            System.out.println("x는 10보다 크다");
        }
    }
}
// 실행 결과 -> x는 10보다 작고 7보다 크다
/*
    기본 문법

    if (조건1) {
        조건1 -> 참
    } else if (조건2) {
        조건1 -> 거짓
        조건2 -> 참
    } else if (조건3) {
        조건1 -> 거짓
        조건2 -> 거짓
        조건3 -> 참
    } else {
        조건1 -> 거짓
        조건2 -> 거짓
        조건3 -> 거짓
    }
 */
