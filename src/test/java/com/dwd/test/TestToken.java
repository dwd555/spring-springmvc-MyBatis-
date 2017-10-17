package com.dwd.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.dwd.utils.JwtUtils;
import com.dwd.utils.TokenState;

public class TestToken {
	private String token;
	@Test
	public void testtoken() {
		String token = null;
		Map<String, Object> payload = new HashMap<String, Object>();
		Date date = new Date();
		payload.put("uid", "291969452");// �û�id
		payload.put("iat", date.getTime());// ����ʱ��:��ǰ
		payload.put("ext", date.getTime() + 2000 * 60 * 60);// ����ʱ��2Сʱ
		token = JwtUtils.createToken(payload);
		System.out.println("�����ɵ�token�ǣ�" + token+"\n���Ͻ���token����У��");
		Map<String, Object> resultMap = JwtUtils.validToken(token);
		System.out.println("У������:" + getResult((String)resultMap.get("state")) );
		HashMap<String,String> dataobj =  (HashMap<String,String>) resultMap.get("data");
		System.out.println("��token��ȡ����payload�����ǣ�" +dataobj.toString());

	}
	@Test
	public void test2() {
		// У�����----------------------------------------------------------------------------------------------------
		String token = null;
		Map<String, Object> payload = new HashMap<String, Object>();
		Date date = new Date();
		payload.put("uid", "291969452");// �û�id
		payload.put("iat", date.getTime());// ����ʱ��
		payload.put("ext", date.getTime());// ����ʱ����ǵ�ǰ
		token = JwtUtils.createToken(payload);
		System.out.println("�����ɵ�token�ǣ�" + token+"\n���Ͻ���token����У��");
		Map<String, Object> resultMap = JwtUtils.validToken(token);
		System.out.println("У������:" + getResult((String)resultMap.get("state")) );

	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void test2_1() {
		// ��У����ڣ���payload���޹���ext�ֶ�ʱ��----------------------------------------------------------------------------------------------------
		String token = null;
		Map<String, Object> payload = new HashMap<String, Object>();
		Date date = new Date();
		payload.put("uid", "291969452");// �û�id
		payload.put("iat", date.getTime());// ����ʱ��
		token = JwtUtils.createToken(payload);
		System.out.println("�����ɵ�token�ǣ�" + token+"\n���Ͻ���token����У��");
		Map<String, Object> resultMap = JwtUtils.validToken(token);
		System.out.println("У������:" + getResult((String)resultMap.get("state")) );
		HashMap<String,String> dataobj =  (HashMap<String,String>) resultMap.get("data");
		System.out.println("��token��ȡ����payload�����ǣ�" +dataobj.toString());

	}
	@Test
	public void test3() {
		// У��Ƿ�token�����----------------------------------------------------------------------------------------------------
		String token = null;
		Map<String, Object> payload = new HashMap<String, Object>();
		Date date = new Date();
		payload.put("uid", "291969452");// �û�id
		payload.put("iat", date.getTime());// ����ʱ��
		payload.put("ext", date.getTime());// ����ʱ����ǵ�ǰ
		
		token = JwtUtils.createToken(payload);
		System.out.println("�����ɵ�token�ǣ�" + token);
		System.out.println("�������ɵ�token�ӵ������������У��");
		token = token + "YouAreSB";
		Map<String, Object> resultMap = JwtUtils.validToken(token);
		System.out.println("У������:" + getResult((String)resultMap.get("state")) );
		System.out.println("ԭ���ǣ��Ƿ�token��payload�������ܾ����м��˴۸ģ����߱���α���token��" );

	}
	@Test
	public void test4() {
		// У���쳣�����----------------------------------------------------------------------------------------------------
		String token = "123";
		System.out.println("�Һ��Ҵ�һ��token��" + token);
		Map<String, Object> resultMap = JwtUtils.validToken(token);
		System.out.println("У������:" + getResult((String)resultMap.get("state")) );
		System.out.println("ԭ���ǣ�token��ʽ���Ϸ����µĳ����쳣��");

	}
	public String getResult(String state) {
		switch (TokenState.getTokenState(state)) {
		case VALID:
			//To do somethings
			state = "��Чtoken";
			break;
		case EXPIRED:
			state = "����token";
			break;
		case INVALID:
			state = "��Ч��token";
			break;
		}
		return state;
	}

}
