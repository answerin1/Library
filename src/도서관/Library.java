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
//    도서관에 책 추가
    public void addBook(Book book) {
        books.add(book);
    }

    //    도서관에서 책 제거
    public void removeBook(Book book) {
        books.remove(book);
    }

    //    도서관에서 책 이름으로 검색
    // for문 : (초기값; 조건식; 증감식)
    // 향상된 for문 : (변수타입 변수이름 : 빼열이름)

    public Book searchByTitle(String title) {
        for (Book book : books) {
            String foundBookTitle = book.getTitle();
            if (foundBookTitle.equals(title)) {
                return book;
            }
        }
        return null;
    }
    //    도서관에 모든 책 조회(getter??)
//    접근제어자 반환자료형(타입) 함수명 (매개변수)
    public  {
        return book;
    }

    //    도서관에서 책 대여(isavailable??)



//    도서관에서 책 반납(???return..?)
}







