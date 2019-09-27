package com.example.bitskins;


import com.example.bitskins.utils.GoogleAuthenticator;

/**
 * 
 * 
 * 韬唤璁よ瘉娴嬭瘯
 * 
 * @author yangbo
 * 
 * @version 鍒涘缓鏃堕棿锛�2017骞�8鏈�14鏃� 涓婂崍11:09:23
 *
 * 
 */
public class AuthTest {
	//褰撴祴璇昦uthTest鏃跺�欙紝鎶奼enSecretTest鐢熸垚鐨剆ecret鍊艰祴鍊肩粰瀹�
	private static String secret="EBVOVPMVLD2C22LK";

	//@Test
	public void genSecretTest() {// 鐢熸垚瀵嗛挜
		 secret = GoogleAuthenticator.generateSecretKey();
		// 鎶婅繖涓猶rcode鐢熸垚浜岀淮鐮侊紝鐢╣oogle韬唤楠岃瘉鍣ㄦ壂鎻忎簩缁寸爜灏辫兘娣诲姞鎴愬姛
		String qrcode = GoogleAuthenticator.getQRBarcode("2816661736@qq.com", secret);
		System.out.println("qrcode:" + qrcode + ",key:" + secret);
	}
	/**
	 * 瀵筧pp鐨勯殢鏈虹敓鎴愮殑code,杈撳叆骞堕獙璇�
	 */
	
	public long verifyTest() {
		long code = 308861;
		long t = System.currentTimeMillis();
		GoogleAuthenticator ga = new GoogleAuthenticator();
		ga.setWindowSize(1);
		long r = ga.check_code(secret, code, t);
		System.out.println("妫�鏌ode鏄惁姝ｇ‘锛�" + r);
		return r;
	}
	
	public static void main(String [] args) {
		AuthTest t = new AuthTest();
		t.verifyTest();
	}
}