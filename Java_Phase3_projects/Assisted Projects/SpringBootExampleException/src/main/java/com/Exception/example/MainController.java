package com.Exception.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping(value="/Hello" ,method=RequestMethod.GET)
	@ResponseBody
	public String message() {
		return "Hello All";
	}
	@RequestMapping(value="/product/{id}", method=RequestMethod.GET)
	@ResponseBody
	public String getProduct(@PathVariable("id") String id) {
		if(id.equals("1"))
			throw new ProductException();
		else
			return "Product found";
	}

}
