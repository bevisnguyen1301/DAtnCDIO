package com.cdio.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdio.dao.AccountDao;
import com.cdio.dao.CategoryDao;
import com.cdio.dao.ProductDao;
import com.cdio.entity.Account;
import com.cdio.entity.Category;
import com.cdio.entity.Product;
import com.cdio.entity.Trademark;
import com.cdio.service.AccountService;
import com.cdio.service.CategoryService;
import com.cdio.service.ProductService;
@Controller
public class CategoryAdminController {
	@Autowired
	CategoryService categoryService;
	@Autowired
	CategoryDao cdao;
	
//	@RequestMapping("category/list")
//	public String home(Model model) {
//		List<Category> list = categoryService.findAll();
//		model.addAttribute("items", list);
//		return "admin/category/list";
//	}
//	@RequestMapping("/category/edit")
//	public String edit(Model model , @RequestParam("category_id") Integer category_id) {
//		Category cat = cdao.findById(category_id).get();
//		model.addAttribute("cat",cat);
//		return "admin/category/edit";
//	}
//	@RequestMapping("/category/delete/{category_id}")
//	public String delete(@PathVariable("category_id") Integer category_id) {
//		categoryService.delete(category_id);
//		return "redirect:/category/list";
//	}
	@RequestMapping("/admin/category/list")
	public String home(Model model) {
		
		return "admin/category/index";
	}
	
}
