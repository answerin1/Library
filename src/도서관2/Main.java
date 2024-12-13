package 도서관2;

import com.sun.jdi.connect.Connector;
import 도서관2.Library;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // List<Book> books = new ArrayList<>(); //초심자 코스
        // Library library = new Library(books);

        // 도서관 객체 생성
        Library library = new Library(); //ㅋㅋ 유진님 초록 / 다빈 주황 / 하영님 보라 / 수호님 노랑

        // 책 객체 생성 (4개)
        Book bookA = new Book("팀장님등장", "강유진", true); // 어디게쎼여
        Book bookB = new Book("하영님짱짱걸", "이하영", true); //평점 : 5점 노벨문학상
        Book bookC = new Book("수호님정신체리", "이수호", true); // 평점 0점
        Book bookD = new Book("나는코딩왕!", "정답인", true);   // 정"답"


        //도서관에서 책 추가 add...

        // 유진
        library.addBook(bookA);
        library.addBook(bookB);
        library.addBook(bookC);
        library.addBook(bookD);


        //도서관에서 책 제거
        library.removeBook(bookA);
        library.removeBook(bookB);
        library.removeBook(bookC);
        library.removeBook(bookD);
        // 빨리 저랑 스프링 가요 같이 과제합시다,,,....❤️,......
        //가취가욥 멘토님.......❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️

        //도서관의 모든책 출력
        // 라이브러리 클래스 기능들을 활용합시다.,...,....

//        //while문
//        List<Book> findAll = library.getBooks();
//        int i = 0;
//        while (i < findAll.size()) {
//            Book bookAll = findAll.get(i);
//            bookAll.detailBookInfo();
//            i++;
//        }
//
//
//        //for문
//        List<Book> findAllBooks = library.getBooks(); {
//            for(int i = 0; i < findAllBooks.size(); i++) {
//                Book book1 = findAllBooks.get(i);
//                book1.detailBookInfo();
//            }
//        }
//
//
//        //향상된 for문
        List<Book> SearchAllBooks = library.getBooks();
//        for (Book book : SearchAllBooks) {
//            book.detailBookInfo();
//        }

//        ~.stream().forEach(book -> {book.detailBookInfo();});
        //스트림+람다
        SearchAllBooks.stream()
                .forEach(book -> {
                    book.detailBookInfo();
        });


        //도서관에서 책 반납
        // 해당 메서드 매개변수 잘 확인
        // 유진 책A  반납
        library.returnBook(bookA.getTitle(), bookA.getIsAvailable());

        // 수호 책B 반납
        library.returnBook(bookB.getTitle(), bookB.getIsAvailable());

        // 다빈 책C 반납 다빈님 고수다 고수고수고수 고수를 고수한다
        library.returnBook(bookC.getTitle(), bookC.getIsAvailable());

    }
//    근데 다들 객체 만드는거랑
//            클래스만 드는거랑
//                    메소드 만드는거
//                            객체를 참조해서 메서드 쓴느거
//            이렇게만 할 줄 알면 스프링 쌉가능..

}
//감사합니다 여러분 함께해주신러분 하영님 너무 너무 감사합니다

//하: 하나만 딱 말할게요
//영: 영원히 같이 갑시다.
//
//        하 : 늘같은 하영님
//        영 : 원한 저의 멘토가 되어 주십시오
//
//        하 : 하하하 웃음만 나는 자바 코드이지만
//        영 : 시원찮은 실력임에도 도움주셔서 무한 감사,,,,
//
//        -김다빈 배상- ????????뭐임????이행시에요??ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
//여기잇는 들분으느 전부 제가 자료를 드린 분들입니다!
//자료를 다 보세요
//주말동안
//        그럼 다 가능하다
//
//이행시 지렸다 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//
//가ㅣㅁ사감ㄱ사합니다 하영님 최
//        고의 선생님
//                제 몸값 월 70000만원입니다
//                하: 하염없이 감사합니다
//        영: 영원히 감사합니다빈다빈~~
// 수호님 잘가요^^
//하영님 유진님 프라이빗~~~~~
// 여러분 제가 하영님이 오시는 이번주 일요일까지 다 해오세요 알게ㅐㅅ죠
// 자자 여러분 이제 이걸 전부 작성하시면 됩니다^^