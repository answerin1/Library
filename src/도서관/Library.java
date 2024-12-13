package 도서관;

import java.util.ArrayList;
import java.util.List;

public class Library {
    //속성
    private List<Book> books;

    //생성자
    public Library() {
        books = new ArrayList<>();
    }

    //기능
    // 도서관에 책 한 권 추가
    public void addBook(Book book) {
        books.add(book);
    }

    // 도서관에 책목록(전체)을 가져오는 행위 ... getter!!!
    public List<Book> getBooks() {
        return books;
    }


    // 도서관에서 책 제거
    public void removeBook(Book book) {
        books.remove(book);
    }

    // 도서관에서 책 이름으로 검색
    // for문 : (초기값; 조건식; 증감식)
    // 향상된 for문 : (변수타입 변수이름 : 배열이름)

    public Book searchByTitle(String title) {
        for (Book book : books) {
            String foundBookTitle = book.getTitle();
            if (foundBookTitle.equals(title)) {
                return book;
            }
        }
        return null;
    }

    // 도서관에 모든 책 조회
    // 접근제어자 - 반환자료형/타입 - 함수명(매개변수) {}
    public List<Book> viewAllBooks() {
        return books;
        // 모든 책이 저장된 books 리스트를 반환
    }

    //도서관에서 책 대여 (+ 어떤책???)
    public void borrowBook(String title, boolean isAvailable) {
        if (isAvailable) {
            System.out.println(title + "책 대여 되었습니다.");

        } else {
            System.out.println(title + "책 대여 불가능 합니다.");

        }
    }
// 대여가 가능한 상태(true) = 도서관에 책이 있다!!
// 반납 : 도서관에 책이 없다!! -> 그래야 반납이 가능하다


    //도서관에서 책 반납
    public void returnBook(String title, boolean isAvailable) {
        if (!isAvailable) {
            System.out.println(title + "책 반납 되었습니다.");
        }
     }
}








