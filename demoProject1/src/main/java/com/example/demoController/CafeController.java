package com.example.demoController;

import com.example.demo.model.dto.CafeDTO;

public class CafeController {
	public String cafeIndexComment(CafeDTO cafeDTO) {
		
		CafeDTO cd = new CafeDTO();
		cd.getCafeCommentName();
		cd.getCafeCommentOpinion();
		
		cd.setCafeCommentName("넣어줄값 = 나중에 db연결에서 전달해줄 값 넣어줄 것");
		cd.setCafeCommentOpinion("넣어줄 값 = 나중에 db연결에서 전달해줄 값 넣어줄 것");
		return"";
	}
}
