package 도서관2;

import java.util.ArrayList;
import java.util.List;

public class Library {

    // 책목록(books): ArrayList
    // 속성
    List<Book> books; // 선언

// 생성자 (클래스와 이름이 같다!)
//책 목록 초기화 필요

//    public Library(List<Book> book) { // 책 목록을 외부에서 가지고 올거냐 ... 스프링에서 많이 쓰인다
//        this.books = book;
//    } DI 의존성 주입

    public Library() { // 기본 생성자다
        this.books = new ArrayList<>(); //초기화 (갹체가 생성될 때 마다 여기서 바로 만들거냐 -> 내부)
    }
    // 기능(메서드) 범위 반환타입 메서드명(매개변수타입 매개변수명) { 메서드 동작 }
    //도서관에 책 추가
    // 도서관 어디에 추가..?
    // 책 객체를 외부 만들어서 가져올까 내부에서 만들까

    public void addBook(Book book) { // remove에 있는 book과 이름만 같을뿐 다른 것이다
        books.add(book); // 책 목록이 있는 곳에 책 한 권을 넣고 싶다.
    }

    // 도서관에 책목록(전체) 가져오기
    public List<Book> getBooks() {
        return this.books;
    }

    //도서관에서 책 제거
    public void removeBook(Book book) {
        books.remove(book);
    }

    //도서관에서 책 이름으로 검색
    public Book searchBook(String title) {
        // Book book;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) // 책목록 중에서 i번째 책을 가지고 올거야, 그 i번째 책 제목을 가지고 오려 get 사용, 매개변수 제목과 같은지 검사
                // book = books.get(i);                    // 일치하면, i번재 책을 반환(보내주었다).
                return books.get(i);
        }

// 위 if문 식을 풀어쓰면   Book book1 = books.get(i)
//    String title1 = book1.getTitle();
//    boolean isTrue = title1.equals(title);

        // 향상된 for문(forEach) === 리스트와 같이 목록 중 정보를 가지고 오는 경우 많이 쓰인다 (ex.검색) (int i=0; i<books.size(); i++) 생략가능
        /*for (Book book1 : books) {
            String title1 = book1.getTitle();
            if (title1.equals(title)) {
                return book1;
            }
        }*/
        return null;
    }

    //도서관에 모든 책 조회
    public List<Book> findAllBooks() {
        return this.books;
    }

    //도서관에서 책 대여

//    책을 빌리다를 영어로는 "borrow", "lend", "rent" 등으로 표현할 수 있습니다.

    //대여를 한다? 도서관에 책이 있어야 한다 = ture ,, 도서관에 책이 없으면(false) 책 대여 불가~~~
    public void rentBook(String title, boolean isAvailable) {
        if (isAvailable) { //만약 대여 가능하다면, 대여 가능합니다. 출력
            System.out.println(title + "책 대여 가능합니다.");
        } else {
            System.out.println(title + "책 대여 불가능 합니다.");
        }
    }

    //도서관에서 책 반납
    //반납의 전제는 도서관에 책이 없는 상태여야 한다,, 도서관에 책이 있는데 반납하러 올 순 없자나,,,, 그렇다면..????
//    책을 반납하는 것은 영어로 "return"이라고 합니다

    public void returnBook(String title, boolean isAvailable) {
        if (!isAvailable) {
            System.out.println(title + " 책이 반납 되었습니다.");
        } else {
            System.out.println("오류 입니다.");
        }
    }
}
