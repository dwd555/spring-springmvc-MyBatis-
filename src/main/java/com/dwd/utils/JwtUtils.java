package com.dwd.utils;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JOSEObjectType;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;

import net.minidev.json.JSONObject;



public class JwtUtils {
	/**
     * ��Կ
     */
    private static final byte[] SECRET="3d990d2276917dfac04467df11fff26d".getBytes();
    
    /**
     * ��ʼ��head���ֵ�����Ϊ
     * {
     * 		"alg":"HS256",
     * 		"type":"JWT"
     * }
     */
    private static final JWSHeader header=new JWSHeader(JWSAlgorithm.HS256, JOSEObjectType.JWT, null, null, null, null, null, null, null, null, null, null, null);
    
	/**
	 * ����token���÷���ֻ���û���¼�ɹ������
	 * 
	 * @param Map���ϣ����Դ洢�û�id��token����ʱ�䣬token����ʱ����Զ����ֶ�
	 * @return token�ַ���,��ʧ���򷵻�null
	 */
	public static String createToken(Map<String, Object> payload) {
		String tokenString=null;
		// ����һ�� JWS object
		JWSObject jwsObject = new JWSObject(header, new Payload(new JSONObject(payload)));
		try {
			// ��jwsObject ����HMACǩ��
			jwsObject.sign(new MACSigner(SECRET));
			tokenString=jwsObject.serialize();
		} catch (JOSEException e) {
			System.err.println("ǩ��ʧ��:" + e.getMessage());
			e.printStackTrace();
		}
		return tokenString;
	}
    
    
    
    /**
     * У��token�Ƿ�Ϸ�������Map����,��������Ҫ����    state״̬��   data��Ȩ�ɹ����token����ȡ������
     * �÷����ڹ������е��ã�ÿ������APIʱ��У��
     * @param token
     * @return  Map<String, Object>
     */
	public static Map<String, Object> validToken(String token) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			JWSObject jwsObject = JWSObject.parse(token);
			Payload payload = jwsObject.getPayload();
			JWSVerifier verifier = new MACVerifier(SECRET);

			if (jwsObject.verify(verifier)) {
				JSONObject jsonOBj = payload.toJSONObject();
				// tokenУ��ɹ�����ʱû��У���Ƿ���ڣ�
				resultMap.put("state", TokenState.VALID.toString());
				// ��payload����ext�ֶΣ���У���Ƿ����
				if (jsonOBj.containsKey("ext")) {
					long extTime = Long.valueOf(jsonOBj.get("ext").toString());
					long curTime = new Date().getTime();
					// ������
					if (curTime > extTime) {
						resultMap.clear();
						resultMap.put("state", TokenState.EXPIRED.toString());
					}
				}
				resultMap.put("data", jsonOBj);

			} else {
				// У��ʧ��
				resultMap.put("state", TokenState.INVALID.toString());
			}

		} catch (Exception e) {
			//e.printStackTrace();
			// token��ʽ���Ϸ����µ��쳣
			resultMap.clear();
			resultMap.put("state", TokenState.INVALID.toString());
		}
		return resultMap;
	}	
    
}
