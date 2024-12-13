package 도서관2;

public class Book {

    //속성
//    제목(title)
// 접근 제어자 + 반환형(타입명) + 변수명 + (매개변수)
    private String title;

//    저자(author)
    private String author;

//    대여여부(isAvailable)
    private boolean isAvailable;


    //생성자
    //1. 클래스명과 같아야 한다.

//    제목(title)
    // 저자(author)
    // 대여여부(isAvailable)

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable; // 객체 생성시 들어갈 데이터 값
    }


    //기능 (메소드, 함수)
//    책 제목 조회
    public String getTitle() {
        return title;
    }

//    책 대여여부 조회
    public boolean getIsAvailable() {
        return isAvailable;
    }

//    책 대여여부 설정 : 대여여부의 데이터값만 바뀌니까 반환할 필요가 없다(괄호 안에는 타입과 변수명을 적어주어야 한다).
    public void setIsAvailable(boolean flag) { // 설정할 데이터 값
        this.isAvailable = flag; // 설정한 데이터 값
    }

//    책 상세 정보 출력 (책 객체의 정보 출력)
    public void detailBookInfo(){ // ()는 외부(다른 클래스)에서 들어올 값들을 명시
        System.out.println("책 제목은 " + this.title);
        System.out.println("책 저자는 " + this.author);
    }

}
