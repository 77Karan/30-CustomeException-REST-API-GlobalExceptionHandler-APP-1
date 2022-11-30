package in.ashokit.binding.service.TWO;

import org.springframework.stereotype.Service;

import in.ashokit.binding.CustomeException.THREE.NoProductFoundException;
import in.ashokit.binding.ONE.Product;

@Service
public class ProductServiceImp implements ProductService
{

	public Product findProductById(Integer pid)
	{
		if(pid==101)
		{
			return new Product("101","Rod Jhonson",400.00);
		}
		else
		{
			throw new NoProductFoundException("Hi Sorry No product");
		}
	}
	

}
