// 주제 : 같은 종류의 메모리를 여러 개 다루는 방법 - 배열 위치(index) 지정

public class Exam028 {
  public static void main(String[] args) {

    int[] scores;
    scores = new int[3];

    scores[0] = 100;
    scores[1] = 90;
    scores[2] = 80;
    // scores[3] = 70;

    System.out.println(scores[0]);
    System.out.println(scores[1]);
    System.out.println(scores[2]);


  }
}
