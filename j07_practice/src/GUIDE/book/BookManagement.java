package GUIDE.book;

import java.util.Scanner;

public class BookManagement {

	// 문자열 입력
	Scanner scanLine = new Scanner(System.in);
	// 선택번호 입력
	Scanner scanSelectnum = new Scanner(System.in);
	
	// 도서목록
	Book[] books = new Book[100];
	// 프로그램 실행 flag
	boolean isRun = true;
	// 메인 메뉴 선택 번호
	int selectNo = 0;
	// 도서관리 번호
	int count=1;	

	public BookManagement(){
		run();
	}
	
	public void run() {
		while(isRun) {
			System.out.println("===================================================");
			System.out.println("1.도서등록 | 2. 도서목록 | 3.도서수정 | 4.도서삭제 | 5. 종료");
			System.out.println("===================================================");
			selectNo = getSelectNum("번호를 선택하세요 > ");
			
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
			
			} // end switch1
		} // end while
	} // end run method
	
	// 프로그램 종료
	public void terminate() {
		isRun = false;
		System.out.println("프로그램 종료");
	}

	// 도서 등록
	public void  registerBook() {
		System.out.println("1. 도서등록");
		String title = getData("등록할 도서의 책 제목을 입력해주세요.");
		String author = getData("등록할 도서의 저자를 입력해주세요.");
		//			0	1		2	3...99
		// books [null][null][null][null][null]
		for(int i = 0; i < books.length; i++) {
			if(books[i] == null) {
				// 아직 책이 등록되지 않은 항목
				books[i] = new Book(count++, title, author);
				System.out.println("등록 완료");
				// count++;
				/*
				books[i] = new Book();
				books[i].title = title;
				books[i].author = author;
				books[i].num = count;
				// 다음에 등록될 도서의 관리번호 1증가
				count++;
				*/
				break; // 빈자리 찾아서 책이 등록완료 되었다면 반복문 즉시 종료
			}
		} // end for : books 배열 순회
	}
	
	// 도서 목록 출력
	public void selectBook() {
		System.out.println("2. 도서목록");
		for(Book book : books) {
			if(book != null) {
			String info = book.toString();
			System.out.println(info);
			} // end if null check
		} // end for
	} // end selectBook method
	// 도서 정보 수정
	public void updateBook() {
		System.out.println("3. 도서수정");
		int bookNum = getSelectNum("수정하실 책의관리 번호를 입력해주세요.");
		
		// 책 목록에서 관리번호가 일치하는 책정보를 반환
		Book updateBook = findBook(bookNum);
		
		// 관리번호가 일치하는 책이 존재하지 않음.
		if(updateBook == null) {
			System.out.println("잘못된 번호입니다.");
			return; // updateBook() 종료
		}
		
		// 관리번호가 일치하는 책이 존재할 때 실행
		System.out.println(updateBook.toString());
		
		// 책정보 수정을 위한 sub menu
		boolean isUpdate = true;
		while(isUpdate) {
			System.out.println("===============================");
			System.out.println("1. 제목수정 |2. 저자수정 |3. 수정완료");
			System.out.println("===============================");
			
			int no = getSelectNum("번호 입력 > ");
			
			switch(no) {
				case 1 :
					System.out.println("제목 수정");
					String title = getData("수정할 제목 입력. ");
					// 새로 입력 받은 책 제목으로 책 제목 정보 수정
					updateBook.title = title;
					break;
				case 2 :
					System.out.println("저자 수정");
					String author = getData("수정할 저자 이름 입력. ");
					updateBook.author = author;
					break;
				case 3 :
					System.out.println("수정 완료");
					// update while문의 반복문 탈출 flag를 false로 변경하여 수정 반복문 탈출
					isUpdate = false;
					break;
				default :
					System.out.println("등록된 메뉴가 아닙니다");
			} // end menu switch
		} // end update while
		
	} // end updateBook method
	
	// 도서 목록에서 책 정보 삭제
	public void deleteBook() {
		System.out.println("4. 도서삭제");
		// 삭제할 도서의 도서관리번호를 저장하는 변수
		int bookNum = getSelectNum("삭제할 도서의 관리 번호를 입력해주세요. ");
		for(int i = 0; i < books.length; i++) {
			if(books[i] != null && books[i].num == bookNum) {
				// 삭제하고자 하는 도서 관리번호가 일치하는 책이 저장된 위치
				// books[i]
				books[i] = null;
				System.out.println("삭제 완료");
				break;
			}
		} // end for : books배열 순회
		
	} // end deletBook method
	
	// 책 정보 출력
	public void printBookInfo(Book b) {
		System.out.println(b.toString());
	}
	
	// 도서관리번호로 책 정보 찾기
	// 매개변수로 도서관리 번호를 전달받아
	// books 배열에 등록된 Book 객체 중에 일치하는 관리번호를 가진 책정보 반환
	public Book findBook(int num) {
		for(int i = 0; i < books.length; i++) {
			if(books[i] != null&& books[i].num == num) {
				// books배열에 도서관리번호가 일치하는 책을 찾았다면
				// findBook()을 호출한 위치에 해당 도서를 반환
				return books[i];
			}
		} // end for : books 배열 순회
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
		return scanSelectnum.nextInt();
	}
		
	public static void main(String[] args) {
		new BookManagement();
	}

}
