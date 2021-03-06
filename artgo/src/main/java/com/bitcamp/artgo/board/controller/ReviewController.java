package com.bitcamp.artgo.board.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.bitcamp.artgo.board.model.ReviewDto;
import com.bitcamp.artgo.board.service.ReviewService;
import com.bitcamp.artgo.member.model.MemberDto;



/**
* 파일명: ReviewController.java
* 설 명: 리뷰 컨트롤러
* 작성일: 2019. 1. 11.
* 작성자: 한 범 석
*/
@RestController
@RequestMapping(value="exhibit/", produces="application/json;charset=UTF-8")
public class ReviewController {
	
	@Autowired
	ReviewService reviewService;

	@RequestMapping(value="review.do/{exno}", method=RequestMethod.GET)
	public @ResponseBody String list(@PathVariable(value="exno") int exno) {
	  return reviewService.getReviewList(exno);
	}
	
	
	@RequestMapping(value="review.do", method=RequestMethod.POST)
	public @ResponseBody String write(@RequestBody ReviewDto reviewDto, HttpSession session) {
		MemberDto memberDto = (MemberDto) session.getAttribute("userInfo");
		if(memberDto==null) {
		  return "redirect:/member/login.do";
		}
		reviewDto.setMno(memberDto.getMno());
		
		if(reviewService.writeReview(reviewDto)>0) {
		  
		}
		return reviewService.getReviewList(reviewDto.getExno());
	}
	
	@RequestMapping(value="review/{rno}/{exno}", method=RequestMethod.GET)
	public @ResponseBody String list(@PathVariable(value="rno") int rno, @PathVariable(value="exno") int exno) {
		return "review/list.do";
	}
	
	@RequestMapping(value="review/{rno}", method=RequestMethod.PUT)
	public @ResponseBody String modify(@PathVariable(value="rno") int rno, @RequestBody ReviewDto reviewDto, HttpSession session) {
		MemberDto memberDto = (MemberDto) session.getAttribute("userInfo");
		if(memberDto != null) {
			int cnt = reviewService.modifyReview(reviewDto);
		}
		return "review/list.do";
	}
	
	@RequestMapping(value="review/{rno}", method=RequestMethod.DELETE)
	public @ResponseBody String delete(@PathVariable(value="rno") int rno) {
		reviewService.deleteReview(rno);
		
		return "";
	}
}

