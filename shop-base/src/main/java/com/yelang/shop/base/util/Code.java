package com.yelang.shop.base.util;

import java.math.BigDecimal;

/**
 * Created by 朱燕 on 2017/9/7.
 */
public interface Code {
    /*常用状态*/
    Integer ERROR_OPERATION = 2;
    Integer SUCCESS = 1;
    Integer FAILED = 0;
    Integer ERROR = -1;
    String DELETE_TRUE = "1";
    String DELETE_FALSE = "0";

    /*鉴权失败编码*/
    Integer AUTH_ERROR_CODE = 2;
    Integer AUTH_FAIL_CODE = 1005;
    String AUth_ERROR_MSG = "鉴权失败！";
    String AUth_MSG = "用户验证失败！";
    String AUth_EXP_MSG = "Token过期！";

    /*返回信息*/
    String NULL_STR = "";
    String ERROR_MSG = "操作异常！";
    String DELETE_SUCC_MSG = "删除成功！";
    String DELETE_FAIL_MSG = "删除失败！";
    String SAVE_SUCC_MSG = "保存成功！";
    String SAVE_FAIL_MSG = "保存失败！";
    String UPDATE_SUCC_MSG = "更新成功！";
    String UPDATE_FAIL_MSG = "更新失败！";
    String FIND_SUCC_MSG = "查询成功！";
    String FIND_FAIL_MSG = "查询失败！";
    String HUIGFU_MSG = "汇付链接！";
    String IS_BID_LOAN_MSG = "已放款!";
    String UPLOAD_SUCC_MSG = "上传成功！";
    String UPLOAD_FAIL_MSG = "上传失败！";


    String READ_ERROR_MSG = "表格式有误!";
    String READ_FAIL_MSG = "读取失败!";
    String READ_INF_MSG = "数据异常!";
    String SAVE_INF_MSG = "存储成功!";
    String NUMBER_FULL_MSG = "人数已满！";

    String IS_IDCARD = "请输入正确的身份证号！";
    String IS_EXIST_APPLICATION = "正在申请中";
    String IS_EXIST_PERMISSION = "已拥有该权限";
    String IS_EXIST_POSITION="该职位已存在";
    String NOT_EXIST_TEAM_MSG = "该团队不存在！";
    String NOT_EXIST_BID_MSG = "该项目不存在！";
    String NOT_EXIST_CUST_MSG = "客户不存在！";
    String NOT_EXIST_USER_MSG = "用户不存在！";
    String NOT_EXIST_XDZY_MSG = "该客户经理不存在！";
    String IS_EXIST_TEAM_MSG="该团队已存在";
    String NOT_EXIST_DEPARTMENT_MSG = "该部门不存在！";
    String IS_EXIST_DEPARTMENT_MSG = "该部门已存在！";
    String IS_EXIST_ACCOUNT_MSG = "该帐号已注册！";
    String NOT_EXIST_ACCOUNT_MSG = "该帐号可以注册！";
    String IS_EXIST_MSG = "该手机号已注册！";
    String NOT_EXIST_MSG = "该手机号可以注册！";
    String LOGIN_REFUSED_MSG = "用户名或密码不正确！";
    String LOGIN_FAIL_MSG = "登录失败！";
    String AUTH_ERROR_MSG = "手机验证码不正确！";
    String TEL_USED_MSG="该手机号已被认证!";
    String IDENTITY_USED_MSG="该身份证号已被认证!";
    String ALTER_SUCC_MSG = "修改成功！  ";
    String ALTER_FAIL_MSG = "修改失败！";
    String VERSION_NEW_MSG = "发现新版本，立即更新！";
    String VERSION_NO_NEW_MSG = "已是最新版本！";
    String SAVE_ID_HAVEN ="此会员已存在!";
    String AMOUNT_TOO_LARGE ="投资金额大于总金额！";
    String SUCCESSFUL_INVESTMENT="投资成功！";
    String WITHDRAW_TOO_LARGE="提现金额大于总金额！";
    String TRANSFER_TOO_LARGE="转让超出！";
    String INSUFFICIENT_AMT_MSG="可用余额不足!";
    String ERROR_IDENTITY_CARD="请输入正确的身份证号！";
    String WORDS_ARE_TOO_ABSTRUSE= "您说的话太深奥了，俺听不懂~";

    /*时间格式*/
    String YYYY_MM_DD = "yyyy-MM-dd";
    String YYYY_MM_DD_SLASH = "yyyy/MM/dd";
    String YYYY_MM_DD_HH_MM_SLASH = "yyyy/MM/dd HH:mm";
    String YYYYMMDD = "yyyyMMdd";
    String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
    String DD_HH_MM = "HH:mm:ss";

    /*排序及分页*/
    String ASC = "ASC";
    String DESC = "DESC";
    Integer defaultPageSize = 20;

    /*类型字段*/
    Integer OLD_MAN = 1;
    Integer YOUNG_MAN = 2;
    Integer MERCHANT = 3;
    String GENDER_MAN = "男";
    String GENDER_WOMAN = "女";
    String USER_TYPE_OLD = "old";
    String USER_TYPE_YOUNG = "young";

    /*字节型，数字*/
    Byte TRUE = 1;

    Byte FALSE = 0;
    Byte ZERO = 0;
    Byte ONE = 1;
    Byte TWO = 2;
    Byte THREE = 3;
    Byte FOUR = 4;
    /*整型数*/
    Integer INT_ZERO = 0;

    Integer INT_ONE = 1;
    Integer INT_TWO = 2;
    Integer INT_THREE = 3;
    String UNDER_SCORE = "_";

    Long LONG_ZERO = 0L;
    Long LONG_ONE = 1L;
    Long LONG_TWO = 2L;

    BigDecimal BD_ZERO = BigDecimal.valueOf(0);

    /*推送状态及返回信息*/
    String PUSH_FAIL = "发送失败,请稍候再试！";

}
