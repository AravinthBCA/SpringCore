package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

//	public String add() {
//		return "hello";
//	}
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("id",1);
		modelAndView.addObject("name","Aravinth");
		modelAndView.addObject("salary",100);
		return modelAndView;
	}
}
