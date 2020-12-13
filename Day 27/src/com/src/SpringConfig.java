package com.src;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@EnableWebMvc
@ComponentScan(basePackages="com.src")
@Configuration
public class SpringConfig extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setViewClass(JstlView.class);
		vr.setPrefix("/WEB-INF/jsp/");
		vr.setSuffix(".jsp");
		return vr;
	}
	
	@Bean
	public EmployeeDAO edao()
	{
		EmployeeDAO edao=new EmployeeDAO();
		edao.setJdbctemplate(jdbctemplate());
		
		return edao;
		
	}
	
	@Bean
	public JdbcTemplate jdbctemplate()
	{
		JdbcTemplate jdbctemplate =new JdbcTemplate();
		jdbctemplate.setDataSource(ds());
		
		return jdbctemplate;
		
	}
	
	@Bean
	public DriverManagerDataSource ds()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/sample1");
		ds.setUsername("root");
		ds.setPassword("root123");
		
		return ds;
		
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		configurer.enable();
	}
	
}
