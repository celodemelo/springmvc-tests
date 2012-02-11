package br.com.marcelo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TesteController extends MultiActionController {

	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView modelAndView = new ModelAndView("lista");
		modelAndView.addObject("cliente", "marcelo");
		
		return modelAndView;
	}

}
