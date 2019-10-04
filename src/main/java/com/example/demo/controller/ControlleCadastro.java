package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.controller.model.Professor;
import com.example.demo.controller.resposity.CrudRepository;

@Controller
public class ControlleCadastro {
	@Autowired
	CrudRepository crudRepository;
	CrudRepository crud;

	
	@RequestMapping("cad")
	public String cadastrar(){
		return "cadastro"; 
	}
	
	@GetMapping("/cad")
	public String getCadastro(Model model)	 {	
		model.addAttribute("professor", crudRepository.findAll());
		return "cadastro";
	}
	
	@PostMapping("/cadastro")
	public String salvar(Professor professor) {
		crudRepository.save(professor);
		return "redirect:/index";
	}
		
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		crudRepository.deleteById(id);
		return "redirect:/index";
		
	}
}
	