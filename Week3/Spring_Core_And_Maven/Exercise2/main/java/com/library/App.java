package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;
public class App {
  public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

      // Get the BookService bean
      BookService bookService = (BookService) context.getBean("bookService");

      // Use the service
      bookService.addBook("Harry Potter And The Sorceres Stone");
      bookService.addBook("Harry Potter And The Cursed Child");
      bookService.getBooks();
  }
}
