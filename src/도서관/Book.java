package 도서관;

public class Book {
    //속성 (변수, 항상 프라이벳으로 막아둔다)
    private String title;
    private String author;
    private boolean isAvailable;

    //생성자(조립설명서, 필요에 따라)
    public Book (String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

        //기능(메서드 == 함수)
        //책 제목 조회
        public String getTitle() {
        return this.title;
        }

        // 책 대여여부 조회
        public boolean getIsAvailable() {
        return this.isAvailable;
        }

        //책 대여여부 설정
        public void setIsAvailable(boolean flag) {
        this.isAvailable = flag;
        }

        //책 상세 정보 출력
        public void printBookInfo() {
            System.out.println("책 이름은 " + this.title + "입니다.");
            System.out.println("대여 여부는 " + this.isAvailable + "입니다.");
        }

}

