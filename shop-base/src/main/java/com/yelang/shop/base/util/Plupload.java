package com.yelang.shop.base.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
@Data
public class Plupload {
	
	/** 文件临时名(打文件被分解时)或原名 */
	private String name;
	/** 总的块数 */
	private int chunks = -1;
	/** 当前块数（从0开始计数） */
	private int chunk = -1;
	/** HttpServletRequest对象，不能直接传入进来，需要手动传入 */
	private HttpServletRequest request;
	/** 保存文件上传信息，不能直接传入进来，需要手动传入 */
	private MultipartFile multipartFile;

	private List<MultipartFile> multipartFiles;

	public Map<String, String> uploadImgToOSS(MultipartFile file,String typeName) throws IOException{
		Map<String, String> ret = new HashMap<String, String>();
		setMultipartFile(file);
		String fileUrl = OSSUtil.uploadImgByInstream(getMultipartFile().getInputStream(), getMultipartFile().getOriginalFilename(),typeName);
		ret.put("fileUrl", fileUrl);
		ret.put("fileName", fileUrl.replace(OSSUtil.ALIYUN_PATH, ""));
		return ret;
	}
}
