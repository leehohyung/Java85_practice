/*문제
1) 배열이 등비수열인지 여부를 확인한다.
2) 배열 데이터 예:
int[] list = {1, 4, 16, 64, 256};
3) 출력 예:
{1, 4, 16, 64, 254} : 등비수열이다.
{1, 4, 16, 32, 128} : 등비수열이 아니다.
*/


public class Test18 {
  public static void main(String[] args) {
    //int[] list = {1, 4, 16, 64, 256}; // 등비수열이다.
    int[] list = {1, 4, 16, 32, 128}; // 등비수열이 아니다.

    // 등비수열 여부 검사
    boolean result = true; // 기본 값은 등비수열 true로 설정
    for (int i = 2; i < list.length; i++) {
      // 등비수열이 아니면, result를 false로 설정한다.
      if (list[0] * list[i] != list[i-1] * list[1]) {
        result = false;
        break;
      }
    }

    // 등비수열 검사 결과 출력
    System.out.print("{");
    for (int i = 0; i < list.length; i++) {
      if (i > 0)
        System.out.print(", ");
      System.out.print(list[i]);
    }
    /* 방법1
    System.out.printf("} : %s\n",
      (result ? "등비수열입니다." : "등비수열이 아닙니다."));
    */
    //방법2
    if (result) {
      System.out.println("} : 등비수열입니다.");
    } else {
      System.out.println("} : 등비수열이 아닙니다.");
    }
  }

}




/**/
