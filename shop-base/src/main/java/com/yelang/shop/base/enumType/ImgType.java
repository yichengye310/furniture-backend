package com.yelang.shop.base.enumType;

/**
 * Created by zy on 2020/3/26 11:08.
 * Project FurnitureShop
 * @author zy
 * Package com.yelang.shop.base.util.constant
 * @Doc 图片类型
 */
public enum ImgType {
    //产品主图1
    PRODUCT_MAIN_IMG("main"),
    //产品附图2
    PRODUCT_ATTACH_IMG("attach"),
    //产品富文本图3
    PRODUCT_UEDIT_IMG("uedit"),
    //产品活动图4
    PRODUCT_ACTIVITY_IMG("activity"),
    //产品规格图5
    PRODUCT_SPECIFICATIONS_IMG("specifications"),
    //产品评价图6
    PRODUCT_COMMENT_IMG("comments"),
    //产品种类/系列图7
    PRODUCT_CATEGORY_ICON_IMG("category"),
    //限时抢购活动图8
    PRODUCT_LIMITED_TIME_MAIN_IMG("limitedmain"),
    //限时抢购产品附图9
    PRODUCT_LIMITED_TIME_ATTACH_IMG("limitedattach"),
    //产品主视频
    PRODUCT_MAIN_VIDEO("mainvideo"),
    //直播封面图片
    LIVE_COVER_IMG("livecover"),
    //启动页
    START_UP_IMG("startup"),
    //直播分享海报图
    LIVE_POSTERS_IMG("liveposters");


    private String typeName;

    ImgType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
