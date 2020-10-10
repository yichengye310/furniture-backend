package com.yelang.shop.base.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author quweizhe
 * @time 2017/2/13 1:14.
 * Project lw4Home
 * Package com.homebase.util
 * @doc
 */
public class BaseUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseUtils.class);

    /**
     * 加密方法
     *
     * @param password 明文密码
     * @return 加密后的大写字符串
     */
    public static String encryptPassword(String password) {
        return DigestUtils.md5Hex(password).toUpperCase();
    }

    /**
     * 检验返回字段是否为null,为null赋值为空串,使Gson可序列化该字段
     *
     * @param str
     * @return
     */
    public static String getStr(String str) {
        return str == null ? Code.NULL_STR : str;
    }

    /**
     * 日期类型转成String
     *
     * @param date
     * @param patten
     * @return
     */
    public static String dateCastToString(Date date, String patten) {
        return date == null ? Code.NULL_STR : DateFormatUtils.format(date, patten);
    }
    /**
     * 日期类型转成String
     *
     * @param date
     * @param patten
     * @return
     */
    public static String dateCastToString(Date date, String patten,String replace) {
        return date == null ? replace : DateFormatUtils.format(date, patten);
    }


    /**
     * 设置排序字段
     *
     * @param order
     * @param defaultValue
     * @return
     */
    public static String getOrder(String order, String defaultValue) {
        return order == null ? defaultValue : order;
    }

    /**
     * 随机获取maxNumber以内的整数
     *
     * @param maxNumber
     * @return
     */
    public static Integer getRandom(Integer maxNumber) {
        Random random = new Random();
        Integer result = random.nextInt(maxNumber);
        if (result == 0) {
            getRandom(maxNumber);
        }
        return result;
    }

    /**
     * 安全截取字符串
     *
     * @param str
     * @param length
     * @return
     */
    public static String getSubStr(String str, Integer length) {
        if (StringUtils.isNotBlank(str)) {
            if (str.length() > length) {
                return str.substring(0, length);
            } else {
                return str;
            }
        }
        return Code.NULL_STR;
    }

    /**
     * list元素去重
     *
     * @param list
     * @return
     */
    public static List distinctList(List list) {
        HashSet h = new HashSet(list);
        list.clear();
        list.addAll(h);
        return list;
    }

    /**
     * 将对象转换成Json字符串
     *
     * @param o
     * @return
     */
    public static String toJson(Object o) {
        Gson gson = new Gson();
        return gson.toJson(o);
    }

    /**
     * long转换成String
     *
     * @param number
     * @return
     */
    public static String longCastString(Long number) {
        if (number == null) {
            return Code.NULL_STR;
        }
        String str = String.valueOf(number);
        return str;
    }

    /**
     * 检查输入参数，是否为null
     *
     * @param str
     * @return
     */
    public static String inspectStr(String str) {
        if (StringUtils.isNotBlank(str)) {
            return str.trim();
        }
        return null;
    }


    /**
     * 根据出生日期获取年龄
     *
     * @param birthday
     * @return
     */
    public static Integer getAge(Date birthday) {
        Integer age = 0;
        if (birthday != null) {
            Calendar cal = Calendar.getInstance();
            int nowYear = cal.get(Calendar.YEAR);
            cal.setTime(birthday);
            int bornYear = cal.get(Calendar.YEAR);
            age = nowYear - bornYear;
        }
        return age;
    }

    /**
     * json字符串转换成Long类型的list
     *
     * @param json
     * @return
     */
    public static List<Long> jsonCastToLongList(String json) {
        Gson gson = new Gson();
        List<Long> returnObject = gson.fromJson(json, new TypeToken<List<Long>>() {
        }.getType());
        return returnObject;
    }

    /**
     * Json字符串转换成String类型的list
     *
     * @param json
     * @return
     */
    public static List<String> jsonCastToStringList(String json) {
        Gson gson = new Gson();
        List<String> returnObject = gson.fromJson(json, new TypeToken<List<String>>() {
        }.getType());
        return returnObject;
    }

    /**
     * Json字符串转换成Integer类型的list
     * @param json
     * @return
     */
    public static List<Integer> jsonCastToIntegerList(String json) {
        Gson gson = new Gson();
        List<Integer> returnObject = gson.fromJson(json, new TypeToken<List<Integer>>() {
        }.getType());
        return returnObject;
    }


    /**
     * 使用身份证号解析性别
     *
     * @param identityCard
     * @return 1男 0女
     */
    public static Byte resolveGender(String identityCard) {
        if (StringUtils.isBlank(identityCard)) {
            return null;
        }
        String gender = StringUtils.substring(identityCard, 16, 17);
        if (Integer.valueOf(gender) % 2 == 0) {
            return Code.ZERO;
        }
        return Code.ONE;
    }


    /**
     * 获取客户端IP
     *
     * @param request
     * @return
     */
    public static String getIp(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        if (StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
            //多次反向代理后会有多个ip值，第一个ip才是真实ip
            int index = ip.indexOf(",");
            if (index != -1) {
                return ip.substring(0, index);
            } else {
                return ip;
            }
        }
        ip = request.getHeader("X-Real-IP");
        if (StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
            return ip;
        }
        return request.getRemoteAddr();
    }

    /**
     * 生成JSON字符串:单个key
     * @param key
     * @param value
     * @return
     */
    public static String getJson(String key,String value) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("{\"");
        buffer.append(key);
        buffer.append("\":\"");
        buffer.append(value);
        buffer.append("\"}");
        return buffer.toString();
    }

    /**
     * 生成JSON字符串:多个key
     * @param map (key,value)
     * @return
     */
    public static String getJsonWithMap(Map<String,String> map) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("{\"");
        for (String s : map.keySet()) {
            buffer.append(s);
            buffer.append("\":\"");
            buffer.append(map.get(s));
            buffer.append("\",\"");
        }
        buffer.delete(buffer.lastIndexOf("\",\""), buffer.length());
        buffer.append("\"}");
        return buffer.toString();
    }

    /**
     * json转List<String>
     * @param jsonStr 如"[2,3,4,5]"
     * @return
     */
    public static List<String> jsonToStrArray(String jsonStr){
        String str = jsonStr.replaceAll(" +","");// 去空格
        String strSub = str.substring(1,str.length()-1);
        String strArray[] = strSub.split(",");
        List<String> rowIdList = Arrays.asList(strArray);
        return rowIdList;
    }

}
