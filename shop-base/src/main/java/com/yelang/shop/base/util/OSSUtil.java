package com.yelang.shop.base.util;

import com.aliyun.oss.ClientConfiguration;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.common.auth.CredentialsProvider;
import com.aliyun.oss.common.auth.CredentialsProviderFactory;
import com.aliyun.oss.model.ObjectMetadata;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OSSUtil {
	// 相关信息
	private static String ACCESS_KEY_ID = "LTAI4Fvz3RpQoeDe33Knxut2";
	private static String ACCESS_KEY_SECRET = "nAFVRjpABpqNhxJPzfR9NxM5valBFT";
	// 图片上传路径配置
	private static String HOST = "https://ylwhcm.oss-cn-shanghai.aliyuncs.com/";
	private static String BUCKET_NAME = "ylwhcm";
	private static String FOLDER = "amms/images";
	public final static String ALIYUN_PATH = HOST + BUCKET_NAME + "/" + FOLDER;
	private static String END_POINT = "oss-cn-shanghai.aliyuncs.com";

	private static OSSClient client;

	public static void main(String[] args) {
		createClient();
		boolean ret = client.doesBucketExist(BUCKET_NAME);
		System.out.println(ret);
	}

	public static void createClient() {
		if (client == null) {
			try {
				CredentialsProviderFactory factory = new CredentialsProviderFactory();
				CredentialsProvider credsProvider = factory.newDefaultCredentialProvider(ACCESS_KEY_ID, ACCESS_KEY_SECRET, null);
				ClientConfiguration config = new ClientConfiguration();
				client = new OSSClient(END_POINT, credsProvider, config);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static String buildFileName(String fileNameOrSuffix)
			throws Exception {
		if (ValidateUtil.isBlank(fileNameOrSuffix)) {
			throw new Exception("文件格式错误");
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Date date = new Date();
		String stuff = fileNameOrSuffix.lastIndexOf(".") < 0 ? ("." + fileNameOrSuffix)
				: fileNameOrSuffix;
		String key = "/" + dateFormat.format(date) + stuff;
		return key;
	}

	/**
	 * 文件流上传
	 * @param is
	 * @param fileNameOrSuffix
	 * @return
	 */
	public static String uploadImgByInstream(InputStream is,
											 String fileNameOrSuffix,String typeName) {
		try {
			createClient();
			// 上传需要的bucket是否存在
			if (!client.doesBucketExist(BUCKET_NAME)) {
				throw new Exception("阿里云上的文件夹（bucket）" + BUCKET_NAME
						+ "不存在，请联系管理员");
			}
			String filePath = BUCKET_NAME + "/" + FOLDER + "/"+ typeName
					+ buildFileName(fileNameOrSuffix);
			ObjectMetadata objectMeta = new ObjectMetadata();
			// 可以在metadata中标记文件类型
			objectMeta.setContentType("image/*");
			client.putObject(BUCKET_NAME, filePath, is, objectMeta);
			filePath = HOST + filePath;
			return filePath;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
