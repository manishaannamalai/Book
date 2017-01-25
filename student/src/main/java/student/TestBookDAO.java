package student;

import java.util.List;

public class TestBookDAO {

	public static void main(String[] args) {
		BookDAO bookDAO=new BookDAO();
		Book book=new Book();
		book.setId(5);
		book.setName("dbms");
		//bookDAO.insert(book);
		List<Book> list=bookDAO.list();
		for(Book b:list)
		{
			System.out.println(b);
		}

	}

}
