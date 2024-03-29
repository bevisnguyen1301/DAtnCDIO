package com.cdio.rest.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdio.dao.CommentDao;
import com.cdio.entity.Account;
import com.cdio.entity.Comment;
import com.cdio.entity.Favorite;
import com.cdio.service.CommentService;
import com.cdio.service.FavoriteService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/comments")
public class CommentRestController {
	@Autowired
	CommentService cmtservice;
	
	@Autowired
	CommentDao dao;
	
	@Autowired
	HttpServletRequest request;
	
	@GetMapping("{product_id}")
	public List<Comment> getalll(@PathVariable("product_id") Integer product_id) {
		return cmtservice.findbyProduct_Id(product_id);
	}
	
	
	@PostMapping()
	public Comment create(@RequestBody Comment commentData) {
		return cmtservice.Create(commentData);
	}
	

	@PutMapping("{comment_id}")
	public Comment update(@PathVariable("comment_id") Integer comment_id , @RequestBody Comment commentData) {
		return cmtservice.Update(commentData);
	}
	
	@DeleteMapping("{comment_id}")
	public void delteteCMT(@PathVariable("comment_id") Integer comment_id) {
		dao.deleteById(comment_id);
	}
}
