package User.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import User.UserEntity.User;
import User.UserServices.UserService;
import antlr.collections.List;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping("/registrationPage")
	public ModelAndView showRegistrationPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
	
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		ModelAndView modelAndView = new ModelAndView();
		int result = service.save(user);
		modelAndView.addObject("result","User Created With Id "+result);
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
	
	@RequestMapping("getUsers")
	public String getUser(ModelMap model) {
		java.util.List<User> users = service.getUsers();
		model.addAttribute("users",users);
		return "displayUsers";
	}
	
	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	
}
