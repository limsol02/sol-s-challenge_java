package Javaexp.z01_project.vo;

import java.util.ArrayList;

public class Library {
	
	ArrayList <Book> books = new ArrayList<Book>();
	
	 public void addBook(Book book) {
	        books.add(book);
	    }
	
	public void showBookInfo() {
		
		for(Book book : books){
		
		System.out.println("등록된 책 이름 : "+book.getName());
		}
		}
	public boolean searchBook(String title) {
        for (Book book : books) {
            if (book.getName().equals(title)) {
                return true;
            }
        } 
        return false;
    }
}
