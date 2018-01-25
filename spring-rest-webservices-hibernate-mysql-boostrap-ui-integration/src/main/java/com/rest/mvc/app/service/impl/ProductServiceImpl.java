package com.rest.mvc.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rest.mvc.app.bean.Product;
import com.rest.mvc.app.dao.ProductDao;
import com.rest.mvc.app.service.ProductService;

@Service
@Transactional(readOnly = true)
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;

	@Override
	public long save(Product product) {
		return productDao.save(product);
	}

	@Override
	public Product get(long id) {
		return productDao.get(id);
	}

	@Override
	public List<Product> list() {
		return productDao.list();
	}

	@Override
	public Product update(long id) {
		return productDao.update(id);
	}

	@Override
	public boolean delete(long id) {
		return productDao.delete(id);
	}

}
