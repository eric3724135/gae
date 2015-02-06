package gae.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import gae.domain.Product;
import gae.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> getProducts() {
		System.out.println("getProducts");
		List<Product> result = new ArrayList<Product>();
		result.add(new Product("1", "產品一號",
				"產品一號的很多特色色色產品一號的很多特色色色，產品一號的很多特色色色，產品一號的很多特色色色。",
				"/res/img/slide-01.jpg","這是副標題！！！！"));
		result.add(new Product("2", "產品二號",
				"特色色色產品一號的很多特色色色，產品一號的很多特色色色，產品一號的很多特色色色。",
				"/res/img/slide-02.jpg","這是副標題！！！！"));
		result.add(new Product("3", "產品三號",
				"產品一號的很多特色色色產品，產品一號的很多特色色色。",
				"/res/img/slide-03.jpg","這是副標題！！！！"));

		

		return result;
	}
}
