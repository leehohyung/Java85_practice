// 연습 : 변수 연습하기4 - 배열 활용
/*
다음에 주어진 값을 변수에 저장하고, 다음과 같이 변수를 출력하라.

이름 : 홍길동
국어 : 100
영어 : 90
수학 : 80
과학 : 70
사회 : 80
음악 : 90
미술 : 100

     이름  국어  영어  수학  과학  사회  음악  미술


*/



class Test05 {
  public static void main(String[] args) {
    String[] names = {"홍길동", "임꺽정", "유관순"};


    // 1차원 배열 활용
    int[] scores0 = {100, 90, 80, 70, 80, 90, 100};
    int[] scores1 = {100, 90, 80, 70, 80, 90, 100};
    int[] scores2 = {100, 90, 80, 70, 80, 90, 100};

    // 2차원 배열 활용
    int[][] scores3 = {
      {100, 90, 80, 70, 80, 90, 100},
      {100, 90, 80, 70, 80, 90, 100},
      {100, 90, 80, 70, 80, 90, 100}
    };


  }

}
