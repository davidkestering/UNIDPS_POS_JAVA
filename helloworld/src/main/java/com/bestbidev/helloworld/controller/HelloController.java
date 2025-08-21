package com.bestbidev.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bestbidev.helloworld.controller.service.IMessageService;

@RestController
public class HelloController {
	
	@Autowired
	@Qualifier("v2")
	private IMessageService service;
	
	@GetMapping("/hello")
	public String sayHello() {
		return service.sayCustomMessage("Hello World");
	}
	
	/*@GetMapping("/produtos")
	public Produto getProduto() {
		Produto p = new Produto();
		p.setId(12345);
		p.setNome("Computador");
		p.setPreco(1500.0);
		
		return p;
	}
	
	@PostMapping("/produtos")
	public String addNewProduct(@RequestBody Produto p) {
		System.out.println("Produto recebido");
		System.out.println(p.getId()+"/"+p.getNome()+"/"+p.getPreco());
		return "ok";
	}*/

}
