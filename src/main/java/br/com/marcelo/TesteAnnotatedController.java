package br.com.marcelo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/annotations/*")
public class TesteAnnotatedController {

	@RequestMapping
    public ModelAndView add() {
    	ModelAndView modelAndView = new ModelAndView("lista");
		modelAndView.addObject("cliente", "pedro");
		
		return modelAndView;
    }
	
	@RequestMapping
    public ModelAndView remove() {
    	ModelAndView modelAndView = new ModelAndView("lista");
		modelAndView.addObject("cliente", "remove");
		
		return modelAndView;
    }
}
