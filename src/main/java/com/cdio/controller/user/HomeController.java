package com.cdio.controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdio.dao.AccountDao;
import com.cdio.dao.ProductDao;
import com.cdio.entity.Account;
import com.cdio.entity.Product;
import com.cdio.service.AccountService;

@Controller
public class HomeController {
	@Autowired
	ProductDao pdao;
	@Autowired
	AccountService accservice;
	
	@Autowired
	AccountDao dao;
	@RequestMapping("/home/index")
	public String home(Model model) {
		List<Product> list = pdao.findByAllDis();
		model.addAttribute("item1", list);
		List<Product> list1 = pdao.findByAllSpe();
		model.addAttribute("item2", list1);
		List<Product> list2 = pdao.getTop10();
		model.addAttribute("item3", list2);
	
		return "user/home/index";
	}

}
