/**
 * Book class
 * Author : 이정광
 * 최종 수정일자 : 2024.06.13
 */

public class Book implements Comparable<Book>{
	int id;
	String title;
	String author;
	int publishedYear;
	
	// 매개변수 있는 경우 생성자
	public Book(int id, String title, String author, int year) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishedYear = year;
	}
	
	// 기본 생성자
	public Book() {
		
	}
	
	// 책 정보 조회
	public void show() {
		System.out.println("Book(id : '" + id + "', 제목 : '" + title + "', 저자 : '" + author + "', 출판년도 : " + publishedYear + ")");
	}
	
	// ID로 Book equal 판단
	@Override
	public boolean equals(Object obj) {
		Book tempBook = (Book)obj;
		return this.id == tempBook.id;
	}

	// 이진탐색 전 정렬시 오름차순으로 정렬
	@Override
	public int compareTo(Book o) {
		return this.id - o.id; // 오름차순
	}
}