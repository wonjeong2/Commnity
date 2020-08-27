package com.wonjeong.commnity.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	public int chkId(String cid);
	public UserVO join(UserVO param);
}
