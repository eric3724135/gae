package gae.conntroller;

import gae.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexConntroller {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "index")
	public String index(Model m) {
		System.out.println("index");
		m.addAttribute("products", productService.getProducts());
		return "index";
	}
	
	@RequestMapping(value = "/")
	public String index2(Model m) {
		System.out.println("index");
		m.addAttribute("products", productService.getProducts());
		return "index";
	}

}
