package com.wonjeong.commnity.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	// 로그인 화면창 열기
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		return "user/login";
	}

	// 로그인정보 입력
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost() {

		return "user/login";
	}

	// 회원가입 창 열기
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "user/join";
	}
	
	//아이디 중복체크
	@ResponseBody
	@RequestMapping(value = "/chkId", method = RequestMethod.GET)
	public Map<String, Object> chkId(@RequestParam String cid) {	

		Map<String, Object> map = new HashMap<String, Object>();
		int result = service.chkId(cid);
		
		System.out.println("중복체크 :" + result);
		map.put("result", result);
		
		return map;
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserVO param) {
		
		service.join(param);
		
		return "user/join";
	}

}
