// 주제 : 같은 종류의 메모리를 여러 개 다루는 방법 - 배열 변수와 배열 메모리의 관계

public class Exam029 {
  public static void main(String[] args) {

    int[] scores;
    scores = new int[3];

    scores[0] = 100;
    scores[1] = 90;
    scores[2] = 80;
    // System.out.println(scores[4]);

    // scores 가 다른 배열 메모리를 가리킨다.
    scores = new int[5];

    scores[0] = 50;
    scores[1] = 20;
    scores[2] = 30;
    scores[3] = 40;
    scores[4] = 50;
    System.out.println(scores[4]);


  }
}
