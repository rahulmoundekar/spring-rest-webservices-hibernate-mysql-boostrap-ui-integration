package com.rest.mvc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.rest.mvc.app.bean.Product;
import com.rest.mvc.app.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	/*---Add new product---*/
	@PostMapping(value = "/product/save", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public ResponseEntity<?> save(@ModelAttribute Product product, BindingResult result) {
		long id = productService.save(product);
		return ResponseEntity.ok().body("New product has been saved with ID:" + id);
	}

	/*---Get a product by id---*/
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> get(@PathVariable("id") long id) {
		Product product = productService.get(id);
		return ResponseEntity.ok().body(product);
	}

	/*---get all products---*/
	@GetMapping("/product/")
	@ResponseBody
	public ResponseEntity<List<Product>> list() {
		List<Product> products = productService.list();
		return ResponseEntity.ok().body(products);
	}

	/*---Update a product by id---*/
	@PutMapping("/product/{id}")
	public ResponseEntity<Product> update(@PathVariable("id") long id) {
		Product product = productService.update(id);
		return ResponseEntity.ok().body(product);
	}

	/*---Delete a product by id---*/
	@DeleteMapping("/product/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") long id) {
		productService.delete(id);
		return ResponseEntity.ok().body("product has been deleted successfully.");
	}
}
