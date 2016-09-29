// 연습 : 변수 연습하기
/*
다음에 주어진 값을 변수에 저장하고, 다음과 같이 변수를 출력하라.

이름 : 홍길동
나이 : 28
키 : 178.5
몸무게 : 85.2
이메일 : hong@test.com
직장인 여부 : 예 또는 아니오 에서 예!
영어 수준 : B(초심자), J(보통), M(전문가) 에서 B(초심자)!
자기소개 :
안녕하세요.
개발자를 꿈꾸는 홍길동입니다.
다같이 열심히 해요!
*/
class Test02 {
  public static void main(String[] args) {
    String name = "홍길동";
    int age = 28;
    double height = 178.5;
    double weight = 85.2;
    String email = "hong@test.com";
    boolean job = true;
    char englishlevel = 'B';
    String intro = "안녕하세요.\n개발자를 꿈꾸는 홍길동입니다.\n다같이 열심히 해요!";

    System.out.printf("이름 : %s\n", name);
    System.out.printf("나이 : %d\n", age);
    System.out.printf("키 : %f\n", height);
    System.out.printf("몸무게 : %f\n", weight);
    System.out.printf("이메일 : %s\n", email);
    System.out.printf("직장인 여부 : %b\n", job);
    System.out.printf("영어 수준 : %c\n", englishlevel);
    System.out.println("자기 소개 :");
    System.out.printf("%s\n", intro);
  }

}
