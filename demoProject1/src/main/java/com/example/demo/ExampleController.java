package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {
	/* 요청 주소 매핑하는 방법
	 * 1) RequestMapping("주소")
	 * 
	 * 2) GetMapping("주소") : Get(조회) 방식 요청 매핑
	 * 	  @PostMapping@("주소") : Post(삽입) 방식 요청 매핑	  
	 * 	  @putMapping("주소") : Put(수정)방식 요청 매핑		  - form js a 태그 요청 불가
	 *    @DeleteMapping("주소") : DELETE (삭제) 방식 요청 매핑 - form js a 태그 요청 불가
	 * */
	@GetMapping("example") //   /example Get 방식 요청 매핑
	public String exampleMethod() {
		return "example";
	}
}