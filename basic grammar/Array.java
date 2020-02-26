public class Array {
    public static void main(String[] args){
        int[] intArray = new int[5];

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;

        System.out.println(intArray[1]); // 실행결과 : 2

        /*
        for(int i = 0; i<5; i++){
            System.out.print(intArray[i]); // 실행결과 : 1,2,3,4,5
        }
        */

        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i]); // 실행결과 : 1,2,3,4,5
        }

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1; // 배열에 다른 배열의 값을 저장 시킬 수 있다. (앨리어싱이라고 부름)

        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]); // 실행결과 : 1,2,3,4,5
        }
    }
}
/*
    배열 생성 방법

    int[] intArray = new int[5];  -> 선언과 동시에 비어있는 배열 생성

    int[] intArray = {1,2,3,4,5}; -> 선언과 동시에 값을 저장, 자동으로 크기가 5인 배열 생

    for문 종결제어식의 차이점 -> 위의 for문에서 i < 5는 전체배열의 수가 5개인지 100개중에서 5개만 필요한지 모른다
 */
