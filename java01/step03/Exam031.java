// 주제 : 같은 종류의 메모리를 여러 개 다루는 방법 - 2차원 배열1

public class Exam031 {
  public static void main(String[] args) {

    int[][] scores = new int[5][3];

    // 학생 0. 국, 영, 수 점수
    scores[0][0] = 100;
    scores[0][1] = 100;
    scores[0][2] = 100;

    // 학생 1. 국, 영, 수 점수
    scores[1][0] = 90;
    scores[1][1] = 90;
    scores[1][2] = 90;

    // 학생 2. 국, 영, 수 점수
    scores[2][0] = 80;
    scores[2][1] = 80;
    scores[2][2] = 80;

    // 학생 3. 국, 영, 수 점수
    scores[3][0] = 70;
    scores[3][1] = 70;
    scores[3][2] = 70;

    // 학생 4. 국, 영, 수 점수
    scores[4][0] = 60;
    scores[4][1] = 60;
    scores[4][2] = 60;

    System.out.println(scores[3][2]);

  }
}
