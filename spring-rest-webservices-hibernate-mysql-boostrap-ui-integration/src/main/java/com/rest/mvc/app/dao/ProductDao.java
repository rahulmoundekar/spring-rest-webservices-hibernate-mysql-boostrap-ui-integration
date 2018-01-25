package com.rest.mvc.app.dao;

import java.util.List;

import com.rest.mvc.app.bean.Product;

public interface ProductDao {
	public long save(Product product);

	public Product get(long id);

	public List<Product> list();

	public Product update(long id);

	public boolean delete(long id);
}
