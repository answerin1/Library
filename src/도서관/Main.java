package 도서관;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //도서관 객체 생성
        Library library = new Library();

        //책 객체 생성
        Book bookA = new Book("어린왕자","생텍쥐페리",true);
        Book bookB = new Book("신데렐라", "샤를 페로",false);
        Book bookC = new Book("라푼젤","그림 형제",true);
        Book bookD = new Book("인어공주","안데르센",true);

        //도서관에서 책 추가
        library.addBook(bookA);
        library.addBook(bookB);
        library.addBook(bookC);
        library.addBook(bookD);

        //도서관에서 책 제거 : bookD
        library.removeBook(bookD);

        //도서관의 모든책 출력(books에 있다)

       // String b = "다빈"; 직접 선언
        // int a = 1;

        List<Book> books = library.getBooks(); // 기능(메서드)를 통해 속성 가져오기


        // 책을 다 꺼낼 때 까지

//        int index = 0; //초기값
//        // index += 1;
//        // index = index + 1;
//
//        while (index < books.size()) { //반복조건식
//            books.get(index);
//            index = index + 1; //증감식
//        }

        // for (초기값;반복조건식;증감식)
        // 책A 제목 : 어린왕자, 저자 : 생텍쥐페리 , 대여여부 : 가능
        // 책B 제목 : 신데렐라, 저자 : xxx, 대여여부 : 가능

        for (int i = 0; i < books.size(); i = i + 1) {
            Book book = books.get(i);

            String title = book.getTitle();
            String author = book.getAuthor();
            boolean isAvailable = book.getIsAvailable();

            System.out.println("책 제목 : " + title);
            System.out.println("책 저자 : " + author);
            System.out.println("책 대여 여부 : " + isAvailable);
        }


        //도서관에서 책 대여

        String bookATitle = bookA.getTitle();

        library.borrowBook(bookATitle, bookA.getIsAvailable());

        library.borrowBook(bookB.getTitle(), bookB.getIsAvailable());


//        System.out.println("책A 제목 : " + bookATitle);
//        System.out.println("대여 여부 : " + bookA.getIsAvailable());

        // 어린왕자 책 대여 되었습니다.

        //도서관에서 책 반납
        library.returnBook(bookC.getTitle(), bookC.getIsAvailable());

    }
}
