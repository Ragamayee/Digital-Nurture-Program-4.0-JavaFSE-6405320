package com.example.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;


public class libraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
BookService bookService = context.getBean("bookService", BookService.class);
System.out.println(bookService.getBookName());

	}

}
