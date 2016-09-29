// 주제 : 같은 종류의 메모리를 여러 개 다루는 방법 - 배열의 특별한 속성 length

public class Exam0332 {
  public static void main(String[] args) {

    // 문자열 1차원 배열
    String[] names = {"홍길동", "임꺽정", "유관순"};

    // 문자열 2차원 배열
    String[][] names2 = {
      {"송성은", "양찬", "전도연", "김도훈", "윤인수"},
      {"백권호", "이상원", "문선애", "김용현"},
      {"유현규", "권태임", "원지선", "류세현", "이승도"},
      {"양동신", "이호형", "함지호", "문성룡"},
      {"한동수", "손덕현", "공승환", "박나현"},
      {"배철한", "유기용"}
    };

    System.out.println(names.length);
    System.out.println(names2.length);
    System.out.println(names2[0].length);

  }
}
