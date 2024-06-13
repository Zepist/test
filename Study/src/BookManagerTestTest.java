import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * BookManagerTestTest
 * Author : 이정광
 * 최종 수정일자 : 2024.06.13
 * @Order : 원하는 순서로 실행하는 어노테이션
 * @BeforeEach : 각 테스트케이스 실행 전에 미리 실행하는 어노테이션
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookManagerTestTest {
	
	private BookManagerTest Junit;
	public List<Book> bookList;

	@BeforeEach
	void setUp() throws Exception {
		bookList = new ArrayList<Book>();
		Junit  = new BookManagerTest();
	}

	@Test
	@Order(1)
	void testTestAddBook() {
		Junit.testAddBook(bookList,1,"자바 기초","Jane",2021);
		Junit.testAddBook(bookList,1,"자바 기초","Jane",2021);
		Junit.testSearchBook(bookList, 1); 
		//fail("Not yet implemented");
	}

	@Test
	@Order(2)
	void testTestSearchBook() {
		System.out.println();
		Junit.testAddBook(bookList,1,"자바 기초","Jane",2021);
		Junit.testAddBook(bookList,2,"소프트웨어 공학","Tom",2014);
		Junit.testAddBook(bookList,3,"분산 컴퓨팅","Yoon",2024);
		Junit.testSearchBook(bookList, 1);
		Junit.testSearchBook(bookList, 2);
		Junit.testSearchBook(bookList, 3);
		Junit.testSearchBook(bookList, 4);
	}

	@Test
	@Order(3)
	void testTestRemoveBook() {
		System.out.println();
		Junit.testAddBook(bookList,1,"자바 기초","Jane",2021);
		Junit.testAddBook(bookList,2,"소프트웨어 공학","Tom",2014);
		Junit.testRemoveBook(bookList, 1);
		Junit.testRemoveBook(bookList, 1);
		Junit.testSearchBook(bookList, 1);
	}
	
	@Test
	@Order(4)
	void testTestBinarySearch() {
		System.out.println();
		Junit.testAddBook(bookList,1,"자바 기초","Jane",2021);
		Junit.testAddBook(bookList,2,"소프트웨어 공학","Tom",2014);
		Junit.testAddBook(bookList,3,"분산 컴퓨팅","Yoon",2024);
		Junit.testAddBook(bookList,5,"분산 컴퓨팅2","Yoon2",2024);
		Junit.testBinarySearch(bookList, 1);
		Junit.testBinarySearch(bookList, 2);
		Junit.testBinarySearch(bookList, 3);
		Junit.testBinarySearch(bookList, 4);
		Junit.testBinarySearch(bookList, 5);
		/** 2024.06.13 권민수
		 *  존재하지 않는 Idx를 찾는 테스트 케이스가 필요함
		 *  삭제후 검색시 정상적으로 오류 메세지를 띄우는지 확인하는 테스트 케이스 추가
		 */
		Junit.testRemoveBook(bookList, 5);
		Junit.testBinarySearch(bookList, 5);
	}

}
