package in.ashokit.controller.FOUR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.ONE.Product;
import in.ashokit.binding.service.TWO.ProductServiceImp;

@RestController
public class ProductController 
{
	@Autowired
	private ProductServiceImp imp;

	@GetMapping(value="/getproduct",produces= {"application/json"})
	public Product getProductById(@RequestParam ("pid") String pid)
	{
		return imp.findProductById(Integer.parseInt(pid));
	}
	
}
