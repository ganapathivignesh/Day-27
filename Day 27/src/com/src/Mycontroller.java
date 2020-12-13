package com.src;

public class Mycontroller {

	@Autowired
	EmployeeDAO edao;
	@RequestMapping("/")
	public String facePage()
	{
		return "index";
	}
	@RequestMapping("/register")
	public String registering(@RequestParam("eid")String eid,@RequestParam("ename")String ename,@RequestParam("eaddres")String eaddres,Model m)
	{
		Employee e=new Employee();
		e.setEid(Integer.parseInt("eid"));
		e.setEname("ename");
		e.setEaddres("eaddres");
		
		edao.SaveEmployee(e);
		List<Employee> l=edao.getallEmployee();
		m.addAttribute("li", l);
		
		return "display";
	}

	@RequestMapping("/delete")
	public String deleteemployee(@RequestParam("eid")String eid,@RequestParam("ename")String ename,@RequestParam("eaddres")String eaddres,Model m)
	{
		Employee e=new Employee();
		e.setEid(Integer.parseInt(eid));
		edao.deleteEmployee(e);
		List<Employee> l=edao.getallEmployee();
		m.addAttribute("li", l);
		
		return "display";
		
	}
}
