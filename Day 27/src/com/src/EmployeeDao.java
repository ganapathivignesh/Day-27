package com.src;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class EmployeeDao {
	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	public int saveEmployee(Employee e)
	{
		String sql="insert into employee1 values("+e.getEid()+",'"+e.getEname()+"','"+e.getAddres()+"')";
		return jdbctemplate.update(sql);		
	}
	
	public int deleteEmployee(Employee e)
	{
		String sql="delete from employee1 where eid="+s.getEid();
		return jdbctemplate.update(sql);		
	}
	
	public List<Employee> getAllEmployees(){
		
	String sql="select * from employee1";
	return jdbctemplate.query(sql, new RowMapper<Student>() {

		@Override
		public Student mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			
			Employee e1 =new Employee();
			e1.setEid(rs.getInt(1));
			e1.setEname(rs.getString(2));
			e1.setAddres(rs.getString(3));
			
			return e1;
		}
		
		
	});
	}

}
