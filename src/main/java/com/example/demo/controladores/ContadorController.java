package com.example.demo.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContadorController 
{
	@RequestMapping(value="/your_server", method=RequestMethod.GET)
	public String index(HttpSession session)
	{
		if (session.getAttribute("count") == null) 
		{
			session.setAttribute("count", 1);
		}
		else 
		{
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
		}
		
		return "index.jsp";
	}
	
	@RequestMapping(value="/your_server/counter", method=RequestMethod.GET)
	public String contador(HttpSession session)
	{
		if (session.getAttribute("count") == null) 
		{
			session.setAttribute("count", 0);
		}
		return "contador.jsp";
	}
	
	@RequestMapping(value="/new_page", method=RequestMethod.GET)
	public String newPage(HttpSession session)
	{
		if (session.getAttribute("count") == null) 
		{
			session.setAttribute("count", 2);
		}
		else 
		{
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount = currentCount+2;
			session.setAttribute("count", currentCount);
		}
		
		return "pagina2.jsp";
	}
	
	@RequestMapping(value="/reset", method=RequestMethod.GET)
	public String reset(HttpSession session)
	{
		session.setAttribute("count", 0);
		return "redirect:/your_server/counter";
	}
	
}
