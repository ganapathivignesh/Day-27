package com.src;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
@RequestMapping("./reg")
	public String display(Model m)
	{
	m.addAttribute("cust", new Customer());
		return "success";
	}

@RequestMapping("./success")
public String display1(@Valid@ModelAttribute("cust")Customer c,BindingResult br,Model m)
{
	
	if(br.hasErrors()) {
		return "success";
		
	}
	else
	{
		m.addAttribute("customer",c);
		return "display";
	}

}



}
