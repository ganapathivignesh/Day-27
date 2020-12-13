package com.src;

public class WebServletConfig implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		
		
		AnnotationConfigWebApplicationContext webctx=new AnnotationConfigWebApplicationContext();
		webctx.register(SpringConfiguration.class);
		webctx.setServletContext(arg0);
		//arg0.addListener(new ContextLoaderListener(webctx));
		
		ServletRegistration.Dynamic servlet=arg0.addServlet("dispatcher", new DispatcherServlet(webctx));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
		
	}
}
