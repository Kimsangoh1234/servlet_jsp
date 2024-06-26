package com.example.demoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;
//Bean : 스프링이 만들고 관리하는 표시
@Controller // -> 요청/응답을 받는 표시 스프링에서 Controller로 작성하라 명시되어 있음
@Slf4j
public class IndexController {

	@GetMapping("cafe/cafe-index") //주소창에서 back과 front가 만나는 주소 (만남의 장소 위치)
	public String cafeMainMethod() {
		log.info("cafe index 메인으로 이동");
		return "cafe/cafe-index"; // html 파일 위치 
	}
	
	//blog-index로 이동하는 GetMapping 만들기
	@GetMapping("blog/blog-index") //주소창에서 back과 front가 만나는 주소 (만남의 장소 위치)
	public String blog() {
		log.info("blog index 메인으로 이동");
		return "blog/blog-index"; // html 파일 위치 
	}
	
	//blog-board로 이동하는 getMapping 만들기 blog/blog-board
	@GetMapping("blog/blog-board") //주소창에서 back과 front가 만나는 주소 (만남의 장소 위치)
	public String blogBoardMethod() {
		log.info("blog board 메인으로 이동");
		return "blog/blog-board"; // html 파일 위치 
	}
	
	//cafe-board로 이동하는 getMapping 만들기 cafe/cafe-board
	@GetMapping("cafe/cafe-board") //주소창에서 back과 front가 만나는 주소 (만남의 장소 위치)
	public String cafeBoardMethod() {
		log.info("cafe board 메인으로 이동");
		return "cafe/cafe-board"; // html 파일 위치 
	}
	
}
