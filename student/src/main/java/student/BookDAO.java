package student;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDAO {
	JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();

	public void insert(Book book) {
		String sql = "insert into book(id,name) values(?,?)";
		Object[] params = { book.getId(), book.getName() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of records inserted:" + rows);
	}
	
	public List<Book> list()
	{
		String sql="select id,name from book";
		List<Book> list=jdbcTemplate.query(sql, (rse,row)->
		{
			Book book=new Book();
			book.setId(rse.getInt("id"));
			book.setName(rse.getString("name"));
		return book;	
		});
		return list;
	}

}
