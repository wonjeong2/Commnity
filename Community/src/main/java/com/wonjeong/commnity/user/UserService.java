package com.wonjeong.commnity.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wonjeong.commnity.common.MyUtils;

@Service
public class UserService {
	
	@Autowired
	private UserMapper mapper;
	
	public int chkId(String cid) {
		
		int result = 0;		
		result = mapper.chkId(cid);
		
		return result;
	}
	
	
	public void join(UserVO param) {
		
		String salt = MyUtils.gensalt();
		String hashPw = MyUtils.hashPassword(param.getCpw(), salt);
		
		param.setCpw(hashPw);
		param.setSalt(salt);
		
		mapper.join(param);
	}
}
