package com.example.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;


public class libraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
BookService bookService = (BookService) context.getBean("bookService");
bookService.addBook("To Kill a Mockingbird");
}

}
