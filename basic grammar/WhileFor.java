public class WhileFor {
    public static void main (String[] args) {

        int i = 1;
        int sum1 = 0;

        while(i <= 5){
            sum1 = sum1 + i;
            i++;
        }
        System.out.println("while 총 합계: " + sum1); // 총 합계: 15
        /*
            반복 순서
            i : 1->2->3->4->5->6
            sum1 : 0->1->3->6->10->15
        */

        int sum2 = 0;

        for(int j = 1; j<= 5; j++){
            sum2 += j;
        }
        System.out.println(sum2); // 15
        /*
            반복 순서
            j : 1->2->3->4->5->6
            sum2 : 0->1->3->6->10->15
        */
    }
}
/*
    while 문

    while ( 조건 ) { // 조건은 참, 거짓 (불린형)
        반복 수행 -> 다른 조건을 걸어 break을 이용해 중간에 빠져나올 수 있다.
    }



    for 문

    for ( 초기화 ; 종결제어식 ; 증감제어식 ) {
        반복 수행
    }
    초기화 ex) int i = 1;
    종결 제어식 ex) i < 10, i <=j
    증감 제어식 ex) i++, i = i+1

    언제 for 문을 작성하는가? -> for 문 안에서만 사용할 반복 변수가 필요하다면 초기화를 통해 작성이 가능
                            반복 횟수가 정해져 있을때, 배열 등 내용을 하나씩 저장할 경우
 */
