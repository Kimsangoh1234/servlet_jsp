package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class IndexController {
	//1번 테스트 메서드를 이용해서 test.html로 무사히 이동하는지 확인하는 메서드 작성
	
	@RequestMapping("test")
	public String testMethod() {
		
		log.info("테스트 페이지 이동");
		return "test";
	}
	
	//홈페이지로 이동하는 코드
	@RequestMapping("home")
	public String homeMethod() {
		log.info("홈페이지로 이동 확인");
		return "index";		
	}
	
}
