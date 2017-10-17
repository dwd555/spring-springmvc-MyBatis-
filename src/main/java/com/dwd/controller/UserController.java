package com.dwd.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dwd.dao.BookUserMapper;
import com.dwd.pojo.BookUser;
import com.dwd.utils.JwtUtils;
import com.dwd.utils.ResponseData;

@RestController
public class UserController {
	
	@Autowired
	BookUserMapper bookuser;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ResponseData login(@RequestParam Long phone,@RequestParam String password) {
		BookUser user=bookuser.login( phone,password);
		if(user==null) {
			ResponseData responsedata=ResponseData.userNotFound();
			return responsedata;
		}
		String token = null;
		Map<String, Object> payload = new HashMap<String, Object>();
		Date date = new Date();
		payload.put("uid", user.getUid());// �û�id
		payload.put("iat", date.getTime());// ����ʱ��:��ǰ
		payload.put("ext", date.getTime() + 2000 * 60 * 60);// ����ʱ��2Сʱ
		token = JwtUtils.createToken(payload);
		System.out.println("�����ɵ�token�ǣ�" + token);
		ResponseData responsedata=ResponseData.ok();
		responsedata.putDataValue("token", token);
		return responsedata;
	} 
}
