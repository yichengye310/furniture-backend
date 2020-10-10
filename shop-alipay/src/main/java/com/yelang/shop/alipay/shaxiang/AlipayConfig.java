package com.yelang.shop.alipay.shaxiang;

public class AlipayConfig {
 
	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016103000778556";
 
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCXobfprnyfkGUCPP8OE+So3d4rbx6YOSOnZ+VnsQq9pSHGGC5BPwOP9VfblL02AN2lhYG6tc7NWLvnXa3O+pzJZ6LOtAv4MzMS2rJn8updsHXhnclOYJK4TRDc0TiuVo6zpdp1n87Y34wyE3Dj+1HPFf9UmTQEAOG3bXwrctELBXec+SSrxiOtVR9yiOXYyd1oB2mOUCWcoW2BUXWy55O3H11ObTqSIfqxbv1YaOmfXEIUHla1mV6ImRvK78BK9T2pMNL2ElCIJTtiapojLkWFKKkV7mn3//dX4jNqq0k6bPrQLid7Rd1q2Dlfq1NqzgEMP84M+kv+dCTNKwHnIovrAgMBAAECggEAGLB1ULBfjF+ngsDJytIEZlaR6UKTmbecDZMGMGcMV6q+oBGp3mfTPap2HsPONy/W5y+g2vTlclwjZF3FgjEePFEKmluIo2Y6x7QiXniYHp8v4oedkox491ddCodqkkB3xdqYgpR9yqRDoJe3xvdR78UmKPE1Hf3Cwuop0K1GSmPeV9TiCBJ+KRzgJXZf9gU2HvwvdSUo54iNO6lJI8wId052Ythz01XN0uvRfQ0W2lILWg9ZUjfirbfny7LuB+1QLr5SbDVv8bz+8kTwa8vBTLElzAtxEyvMnkn2JoNQbfS89eF8iWYrI9SC+s5GKdvwex/DMgPQH8fMxP54MMFKQQKBgQDFYCUYJLb7KJCjxiNJRngDQdlPDjn6MOC8rZyb+VTsjJsKAw059ihMJPSABiboMTkiMB5Gal0JQTDE4EBuXorc2DHDZVrqqn3+0CBiO+7TqE+4fvX+gfi1QO7p1scM6mHDvu/+uEvWkwk+w21NXlZFmPaA1t3XhaT8tuZw7OO+ywKBgQDEq1iTCsDM7uxrsBQz2Dkjh9ZJ34dtKVxYWIcthVeI4dolWIBlqUx+DAsRp/wyPZVZm9Ic+Ju4iT8vFBMaGgND9Gr3CNbGA7osJ980jRByEWAW01kfIiMwGEemjXN1c3MMA5Tl4SnZsYEimC6M93lIjzqo7nO6acsKgw7S35SjYQKBgAfOZakuyo3kbNQNYhfj0ZtPX2jhByn+BOVxeGAy3Ej+xqL+u+cu9SkNzR3DIIbOa5QOkyP10Pgsu+ENfX7f/l39rvoraA0f8RvC34UDGc8FOSHy44fNXCjPCKP2+qhoHLXBN3y7jURPTG5PDGOi94aJJjaySNPdVUkpcrPEqr1BAoGAX9GDlBB3IuF9OnJNRX0hSZhS5ScM2jh+j2SCZ8FBhqVTHULjO6Siaf8AHZgUnX23mDL8ybSuWdg0eoFzVRI7aQ5aVwVtbog+WmkKrJXV311rzXMnRq3hKvuJXTIpgJ3A/ad5Eg8DztZWrj4q3+9qndl6oPecVsRYckSsIj1gM8ECgYEAi5eA6hENP2qCBgEVxmNg52z/u0vw4oQXkOx8LbTTjiKZsgWShaoNmuqPSr8od/hXYtYAoYpKKy3OvVi1qXUCZPXsXhNhCa0MtqPLjGNswSlsW8Ek7BFskEEt34hielZQAlC20yFgAGF4T1MUmbEuu19Hzo4VWHje7MjYKgdvpM4=";
 
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAl6G36a58n5BlAjz/DhPkqN3eK28emDkjp2flZ7EKvaUhxhguQT8Dj/VX25S9NgDdpYWBurXOzVi7512tzvqcyWeizrQL+DMzEtqyZ/LqXbB14Z3JTmCSuE0Q3NE4rlaOs6XadZ/O2N+MMhNw4/tRzxX/VJk0BADht218K3LRCwV3nPkkq8YjrVUfcojl2MndaAdpjlAlnKFtgVF1sueTtx9dTm06kiH6sW79WGjpn1xCFB5WtZleiJkbyu/ASvU9qTDS9hJQiCU7YmqaIy5FhSipFe5p9//3V+IzaqtJOmz60C4ne0Xdatg5X6tTas4BDD/ODPpL/nQkzSsB5yKL6wIDAQAB";
 
	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost/alipay.trade.page.pay-JAVA-UTF-8/notify_url";
 
	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	/*public static String return_url = "http://localhost/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";*/
    public static String return_url = "http://localhost:8080/alipay/callback/return_sult";
	// 签名方式，注意这里，如果步骤设置的是RSA则用RSA
	public static String sign_type = "RSA2";
 
	// 字符编码格式
	public static String charset = "UTF-8";
 
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
 
 
}