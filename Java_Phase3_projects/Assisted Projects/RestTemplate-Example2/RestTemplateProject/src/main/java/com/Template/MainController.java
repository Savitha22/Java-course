package com.Template;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController //@Controller @ResponseBody
public class MainController {

		@GetMapping("/info") //@RequestMapping(value="/info", method="get")
        public Product display() {
        	RestTemplate resttemplate=new RestTemplate();
        	Product p=resttemplate.getForObject("http://localhost:8081/productinfo", Product.class);
        	//return p.toString();
        	return p;
		}
           
        
}