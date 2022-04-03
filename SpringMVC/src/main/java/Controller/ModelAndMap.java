package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DTO.User;

@Controller
public class ModelAndMap {
	
	@RequestMapping("/registrationPag")
	public String showRegistrationPage() {
		return "userReg";
	}
	
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user,ModelMap model) {
		System.out.println(user);
		System.out.println("ModelAndMap");
		model.addAttribute("user",user);
		return "regResult";
	}
	
}
