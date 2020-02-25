public class Switch {
    public static void main (String[] args){

        /*
            A+ : 100
            A  : 90~99
            B+ : 80~89
            B  : 70~79
            C+ : 60~69
            C  : 50~59
            F  : 0~49
         */

        int score = 97; // 점

        String grade; // 학점

        switch (score / 10) {
            case 10 :
                grade = "A+";
                break;
            case 9 :
                grade = "A";
                break;
            case 8 :
                grade = "B+";
                break;
            case 7 :
                grade = "B";
                break;
            case 6 :
                grade = "C+";
                break;
            case 5 :
                grade = "C";
                break;
            default :
                grade = "F";
                break;
        }

        System.out.println("학점 : " + grade);

        switch (grade) {
            case "A+" :
            case "A"  :
            case "B+" :
                System.out.println("참 잘했어요!");
                break;
            case "B"  :
            case "C+" :
            case "C"  :
                System.out.println("좀 더 노력해봐요!");
                break;
            case "F"  :
                System.out.println("Fail입니다.");
                break;
            default :
                System.out.println("다시 수강하셔야 합니다.");
                break;
        }
    }
}
/*
    switch 문

    switch (변수 or 식) {
        case 경우 1 :
            실행 1
            break;

        case 경우 2 :
            실행 2
            break;

        default :
            기본 실행
    }
 */
