package student;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {
	public static DataSource getDataSource() { 		 
				BasicDataSource ds = new BasicDataSource(); 
				ds.setDriverClassName("com.mysql.cj.jdbc.Driver"); 
				ds.setUsername("root"); 		 
				ds.setPassword("root");
				ds.setUrl("jdbc:mysql://localhost:3306/college1"); 
				return ds; 
			} 

		public static JdbcTemplate getJdbcTemplate() { 
		JdbcTemplate jt = new JdbcTemplate(); 
		jt.setDataSource(getDataSource()); 
		return jt; 
		}
}
		 

		 

		 

		 
		 



