package practice_05.book;

import java.util.Scanner;

public class BookManagement {
	
	// 문자열 입력
	private Scanner scanLine = new Scanner(System.in);
	// 선택번호 입력
	private Scanner scanSelectnum = new Scanner(System.in);
	
	// 도서목록
	private static Book[] books = new Book[100];
	// 프로그램 실행 flag
	private boolean isRun = true;
	// 메인 메뉴 선택 번호
	private int selectNo = 0;
	// 도서관리 번호
	private int count = 1;	

	public BookManagement(){}
	
	public void run() {
		while(isRun) {
			System.out.println("===================================================");
			System.out.println("1.도서등록 | 2. 도서목록 | 3.도서수정 | 4.도서삭제 | 5. 종료");
			System.out.println("===================================================");
			selectNo = getSelectNum("번호를 선택하세요>");
			
			switch(selectNo) {
				case 1 :
					registerBook();
					break;
				case 2 :
					selectBook();
					break;
				case 3 :
					updateBook();
					break;
				case 4 : 
					deleteBook();
					break;
				case 5 : 
					terminate();
					break;	
				default : 
					System.out.println("등록된 메뉴가 아닙니다.");
			}
		}
	}
	
	// 프로그램 종료
	public void terminate() {
		this.isRun = false;
		System.out.println("프로그램 종료");
	}

	// 도서 등록 메서드
	public void  registerBook() {
	    System.out.println("1. 도서등록");
	    // 사용자로부터 도서 제목과 저자를 입력받음
	    String title = getData("등록할 도서의 제목을 입력해 주세요 >");
	    String author = getData("등록할 도서의 저자를 입력해 주세요 >");
	    // 새로운 도서 객체 생성
	    Book newBook = new Book(count++, title, author);
	    // 배열에 도서 추가 (count - 1은 배열 인덱스)
	    books[count - 2] = newBook;
	    System.out.println("도서가 등록되었습니다.");
	}

	// 도서 목록 출력 메서드
	public void selectBook() {
	    System.out.println("2. 도서목록");
	    // 등록된 모든 도서 출력
	    for (int i = 0; i < count - 1; i++) {
	        // 배열 요소가 null이 아닌 경우에만 출력
	        if (books[i] != null) {
	            System.out.println(books[i]);
	        }
	    }
	}
	
	// 도서 정보 수정
	public void updateBook() {
		System.out.println("3. 도서수정");
		int bookNum = getSelectNum("수정 하실 책의 관리번호를 입력해주세요.");
		Book book = findBook(bookNum);
		if (book != null) {
			String title = getData("수정할 도서의 새로운 제목을 입력해주세요.");
			String author = getData("수정할 도서의 새로운 저자를 입력해주세요.");
			book.setTitle(title);
			book.setAuthor(author);
			System.out.println("도서 정보가 수정되었습니다.");
		} else {
			System.out.println("해당 도서가 존재하지 않습니다.");
		}
	}
	
	// 도서 목록에서 책 정보 삭제
	public void deleteBook() {
		System.out.println("4. 도서삭제");
		int bookNum = getSelectNum("삭제할 도서의 관리번호를 입력해주세요.");
		boolean found = false;
		for (int i = 0; i < count - 1; i++) {
			if (books[i].getNum() == bookNum) {
				found = true;
				for (int j = i; j < count - 1; j++) {
					books[j] = books[j + 1];
				}
				count--;
				System.out.println("도서가 삭제되었습니다.");
				break;
			}
		}
		if (!found) {
			System.out.println("해당 도서가 존재하지 않습니다.");
		}
	}
	
	// 도서관리번호로 책 정보 찾기
	public Book findBook(int num) {
		for (int i = 0; i < count - 1; i++) {
			if (books[i].getNum() == num) {
				return books[i];
			}
		}
		return null;
	}
	
	// 사용자에게 메시지를 전달 받아 출력하고 문자열 값 받아 반환
	String getData(String message) {
		System.out.println(message);
		return scanLine.nextLine();
	}
	
	// 번호 선택 받기
	int getSelectNum(String message) {
		System.out.println(message);
		if(!scanSelectnum.hasNextInt()) {
			System.out.println("숫자를 입력해주세요.");
			scanSelectnum.next();
			return 0;
		}
		return scanSelectnum.nextInt();
	}
		
}
