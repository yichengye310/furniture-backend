package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class AliLiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AliLiveExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andLiveIDIsNull() {
            addCriterion("liveID is null");
            return (Criteria) this;
        }

        public Criteria andLiveIDIsNotNull() {
            addCriterion("liveID is not null");
            return (Criteria) this;
        }

        public Criteria andLiveIDEqualTo(Integer value) {
            addCriterion("liveID =", value, "liveID");
            return (Criteria) this;
        }

        public Criteria andLiveIDNotEqualTo(Integer value) {
            addCriterion("liveID <>", value, "liveID");
            return (Criteria) this;
        }

        public Criteria andLiveIDGreaterThan(Integer value) {
            addCriterion("liveID >", value, "liveID");
            return (Criteria) this;
        }

        public Criteria andLiveIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("liveID >=", value, "liveID");
            return (Criteria) this;
        }

        public Criteria andLiveIDLessThan(Integer value) {
            addCriterion("liveID <", value, "liveID");
            return (Criteria) this;
        }

        public Criteria andLiveIDLessThanOrEqualTo(Integer value) {
            addCriterion("liveID <=", value, "liveID");
            return (Criteria) this;
        }

        public Criteria andLiveIDIn(List<Integer> values) {
            addCriterion("liveID in", values, "liveID");
            return (Criteria) this;
        }

        public Criteria andLiveIDNotIn(List<Integer> values) {
            addCriterion("liveID not in", values, "liveID");
            return (Criteria) this;
        }

        public Criteria andLiveIDBetween(Integer value1, Integer value2) {
            addCriterion("liveID between", value1, value2, "liveID");
            return (Criteria) this;
        }

        public Criteria andLiveIDNotBetween(Integer value1, Integer value2) {
            addCriterion("liveID not between", value1, value2, "liveID");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andIsOpenLocationIsNull() {
            addCriterion("isOpenLocation is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenLocationIsNotNull() {
            addCriterion("isOpenLocation is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenLocationEqualTo(Short value) {
            addCriterion("isOpenLocation =", value, "isOpenLocation");
            return (Criteria) this;
        }

        public Criteria andIsOpenLocationNotEqualTo(Short value) {
            addCriterion("isOpenLocation <>", value, "isOpenLocation");
            return (Criteria) this;
        }

        public Criteria andIsOpenLocationGreaterThan(Short value) {
            addCriterion("isOpenLocation >", value, "isOpenLocation");
            return (Criteria) this;
        }

        public Criteria andIsOpenLocationGreaterThanOrEqualTo(Short value) {
            addCriterion("isOpenLocation >=", value, "isOpenLocation");
            return (Criteria) this;
        }

        public Criteria andIsOpenLocationLessThan(Short value) {
            addCriterion("isOpenLocation <", value, "isOpenLocation");
            return (Criteria) this;
        }

        public Criteria andIsOpenLocationLessThanOrEqualTo(Short value) {
            addCriterion("isOpenLocation <=", value, "isOpenLocation");
            return (Criteria) this;
        }

        public Criteria andIsOpenLocationIn(List<Short> values) {
            addCriterion("isOpenLocation in", values, "isOpenLocation");
            return (Criteria) this;
        }

        public Criteria andIsOpenLocationNotIn(List<Short> values) {
            addCriterion("isOpenLocation not in", values, "isOpenLocation");
            return (Criteria) this;
        }

        public Criteria andIsOpenLocationBetween(Short value1, Short value2) {
            addCriterion("isOpenLocation between", value1, value2, "isOpenLocation");
            return (Criteria) this;
        }

        public Criteria andIsOpenLocationNotBetween(Short value1, Short value2) {
            addCriterion("isOpenLocation not between", value1, value2, "isOpenLocation");
            return (Criteria) this;
        }

        public Criteria andLiveWayIsNull() {
            addCriterion("liveWay is null");
            return (Criteria) this;
        }

        public Criteria andLiveWayIsNotNull() {
            addCriterion("liveWay is not null");
            return (Criteria) this;
        }

        public Criteria andLiveWayEqualTo(Short value) {
            addCriterion("liveWay =", value, "liveWay");
            return (Criteria) this;
        }

        public Criteria andLiveWayNotEqualTo(Short value) {
            addCriterion("liveWay <>", value, "liveWay");
            return (Criteria) this;
        }

        public Criteria andLiveWayGreaterThan(Short value) {
            addCriterion("liveWay >", value, "liveWay");
            return (Criteria) this;
        }

        public Criteria andLiveWayGreaterThanOrEqualTo(Short value) {
            addCriterion("liveWay >=", value, "liveWay");
            return (Criteria) this;
        }

        public Criteria andLiveWayLessThan(Short value) {
            addCriterion("liveWay <", value, "liveWay");
            return (Criteria) this;
        }

        public Criteria andLiveWayLessThanOrEqualTo(Short value) {
            addCriterion("liveWay <=", value, "liveWay");
            return (Criteria) this;
        }

        public Criteria andLiveWayIn(List<Short> values) {
            addCriterion("liveWay in", values, "liveWay");
            return (Criteria) this;
        }

        public Criteria andLiveWayNotIn(List<Short> values) {
            addCriterion("liveWay not in", values, "liveWay");
            return (Criteria) this;
        }

        public Criteria andLiveWayBetween(Short value1, Short value2) {
            addCriterion("liveWay between", value1, value2, "liveWay");
            return (Criteria) this;
        }

        public Criteria andLiveWayNotBetween(Short value1, Short value2) {
            addCriterion("liveWay not between", value1, value2, "liveWay");
            return (Criteria) this;
        }

        public Criteria andPushUrlIsNull() {
            addCriterion("pushUrl is null");
            return (Criteria) this;
        }

        public Criteria andPushUrlIsNotNull() {
            addCriterion("pushUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPushUrlEqualTo(String value) {
            addCriterion("pushUrl =", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotEqualTo(String value) {
            addCriterion("pushUrl <>", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlGreaterThan(String value) {
            addCriterion("pushUrl >", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pushUrl >=", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlLessThan(String value) {
            addCriterion("pushUrl <", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlLessThanOrEqualTo(String value) {
            addCriterion("pushUrl <=", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlLike(String value) {
            addCriterion("pushUrl like", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotLike(String value) {
            addCriterion("pushUrl not like", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlIn(List<String> values) {
            addCriterion("pushUrl in", values, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotIn(List<String> values) {
            addCriterion("pushUrl not in", values, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlBetween(String value1, String value2) {
            addCriterion("pushUrl between", value1, value2, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotBetween(String value1, String value2) {
            addCriterion("pushUrl not between", value1, value2, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andRtmpUrlIsNull() {
            addCriterion("rtmpUrl is null");
            return (Criteria) this;
        }

        public Criteria andRtmpUrlIsNotNull() {
            addCriterion("rtmpUrl is not null");
            return (Criteria) this;
        }

        public Criteria andRtmpUrlEqualTo(String value) {
            addCriterion("rtmpUrl =", value, "rtmpUrl");
            return (Criteria) this;
        }

        public Criteria andRtmpUrlNotEqualTo(String value) {
            addCriterion("rtmpUrl <>", value, "rtmpUrl");
            return (Criteria) this;
        }

        public Criteria andRtmpUrlGreaterThan(String value) {
            addCriterion("rtmpUrl >", value, "rtmpUrl");
            return (Criteria) this;
        }

        public Criteria andRtmpUrlGreaterThanOrEqualTo(String value) {
            addCriterion("rtmpUrl >=", value, "rtmpUrl");
            return (Criteria) this;
        }

        public Criteria andRtmpUrlLessThan(String value) {
            addCriterion("rtmpUrl <", value, "rtmpUrl");
            return (Criteria) this;
        }

        public Criteria andRtmpUrlLessThanOrEqualTo(String value) {
            addCriterion("rtmpUrl <=", value, "rtmpUrl");
            return (Criteria) this;
        }

        public Criteria andRtmpUrlLike(String value) {
            addCriterion("rtmpUrl like", value, "rtmpUrl");
            return (Criteria) this;
        }

        public Criteria andRtmpUrlNotLike(String value) {
            addCriterion("rtmpUrl not like", value, "rtmpUrl");
            return (Criteria) this;
        }

        public Criteria andRtmpUrlIn(List<String> values) {
            addCriterion("rtmpUrl in", values, "rtmpUrl");
            return (Criteria) this;
        }

        public Criteria andRtmpUrlNotIn(List<String> values) {
            addCriterion("rtmpUrl not in", values, "rtmpUrl");
            return (Criteria) this;
        }

        public Criteria andRtmpUrlBetween(String value1, String value2) {
            addCriterion("rtmpUrl between", value1, value2, "rtmpUrl");
            return (Criteria) this;
        }

        public Criteria andRtmpUrlNotBetween(String value1, String value2) {
            addCriterion("rtmpUrl not between", value1, value2, "rtmpUrl");
            return (Criteria) this;
        }

        public Criteria andFlvUrlIsNull() {
            addCriterion("flvUrl is null");
            return (Criteria) this;
        }

        public Criteria andFlvUrlIsNotNull() {
            addCriterion("flvUrl is not null");
            return (Criteria) this;
        }

        public Criteria andFlvUrlEqualTo(String value) {
            addCriterion("flvUrl =", value, "flvUrl");
            return (Criteria) this;
        }

        public Criteria andFlvUrlNotEqualTo(String value) {
            addCriterion("flvUrl <>", value, "flvUrl");
            return (Criteria) this;
        }

        public Criteria andFlvUrlGreaterThan(String value) {
            addCriterion("flvUrl >", value, "flvUrl");
            return (Criteria) this;
        }

        public Criteria andFlvUrlGreaterThanOrEqualTo(String value) {
            addCriterion("flvUrl >=", value, "flvUrl");
            return (Criteria) this;
        }

        public Criteria andFlvUrlLessThan(String value) {
            addCriterion("flvUrl <", value, "flvUrl");
            return (Criteria) this;
        }

        public Criteria andFlvUrlLessThanOrEqualTo(String value) {
            addCriterion("flvUrl <=", value, "flvUrl");
            return (Criteria) this;
        }

        public Criteria andFlvUrlLike(String value) {
            addCriterion("flvUrl like", value, "flvUrl");
            return (Criteria) this;
        }

        public Criteria andFlvUrlNotLike(String value) {
            addCriterion("flvUrl not like", value, "flvUrl");
            return (Criteria) this;
        }

        public Criteria andFlvUrlIn(List<String> values) {
            addCriterion("flvUrl in", values, "flvUrl");
            return (Criteria) this;
        }

        public Criteria andFlvUrlNotIn(List<String> values) {
            addCriterion("flvUrl not in", values, "flvUrl");
            return (Criteria) this;
        }

        public Criteria andFlvUrlBetween(String value1, String value2) {
            addCriterion("flvUrl between", value1, value2, "flvUrl");
            return (Criteria) this;
        }

        public Criteria andFlvUrlNotBetween(String value1, String value2) {
            addCriterion("flvUrl not between", value1, value2, "flvUrl");
            return (Criteria) this;
        }

        public Criteria andM3u8UrlIsNull() {
            addCriterion("m3u8Url is null");
            return (Criteria) this;
        }

        public Criteria andM3u8UrlIsNotNull() {
            addCriterion("m3u8Url is not null");
            return (Criteria) this;
        }

        public Criteria andM3u8UrlEqualTo(String value) {
            addCriterion("m3u8Url =", value, "m3u8Url");
            return (Criteria) this;
        }

        public Criteria andM3u8UrlNotEqualTo(String value) {
            addCriterion("m3u8Url <>", value, "m3u8Url");
            return (Criteria) this;
        }

        public Criteria andM3u8UrlGreaterThan(String value) {
            addCriterion("m3u8Url >", value, "m3u8Url");
            return (Criteria) this;
        }

        public Criteria andM3u8UrlGreaterThanOrEqualTo(String value) {
            addCriterion("m3u8Url >=", value, "m3u8Url");
            return (Criteria) this;
        }

        public Criteria andM3u8UrlLessThan(String value) {
            addCriterion("m3u8Url <", value, "m3u8Url");
            return (Criteria) this;
        }

        public Criteria andM3u8UrlLessThanOrEqualTo(String value) {
            addCriterion("m3u8Url <=", value, "m3u8Url");
            return (Criteria) this;
        }

        public Criteria andM3u8UrlLike(String value) {
            addCriterion("m3u8Url like", value, "m3u8Url");
            return (Criteria) this;
        }

        public Criteria andM3u8UrlNotLike(String value) {
            addCriterion("m3u8Url not like", value, "m3u8Url");
            return (Criteria) this;
        }

        public Criteria andM3u8UrlIn(List<String> values) {
            addCriterion("m3u8Url in", values, "m3u8Url");
            return (Criteria) this;
        }

        public Criteria andM3u8UrlNotIn(List<String> values) {
            addCriterion("m3u8Url not in", values, "m3u8Url");
            return (Criteria) this;
        }

        public Criteria andM3u8UrlBetween(String value1, String value2) {
            addCriterion("m3u8Url between", value1, value2, "m3u8Url");
            return (Criteria) this;
        }

        public Criteria andM3u8UrlNotBetween(String value1, String value2) {
            addCriterion("m3u8Url not between", value1, value2, "m3u8Url");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andProductsIsNull() {
            addCriterion("products is null");
            return (Criteria) this;
        }

        public Criteria andProductsIsNotNull() {
            addCriterion("products is not null");
            return (Criteria) this;
        }

        public Criteria andProductsEqualTo(String value) {
            addCriterion("products =", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsNotEqualTo(String value) {
            addCriterion("products <>", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsGreaterThan(String value) {
            addCriterion("products >", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsGreaterThanOrEqualTo(String value) {
            addCriterion("products >=", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsLessThan(String value) {
            addCriterion("products <", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsLessThanOrEqualTo(String value) {
            addCriterion("products <=", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsLike(String value) {
            addCriterion("products like", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsNotLike(String value) {
            addCriterion("products not like", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsIn(List<String> values) {
            addCriterion("products in", values, "products");
            return (Criteria) this;
        }

        public Criteria andProductsNotIn(List<String> values) {
            addCriterion("products not in", values, "products");
            return (Criteria) this;
        }

        public Criteria andProductsBetween(String value1, String value2) {
            addCriterion("products between", value1, value2, "products");
            return (Criteria) this;
        }

        public Criteria andProductsNotBetween(String value1, String value2) {
            addCriterion("products not between", value1, value2, "products");
            return (Criteria) this;
        }

        public Criteria andLimitProductsIsNull() {
            addCriterion("limitProducts is null");
            return (Criteria) this;
        }

        public Criteria andLimitProductsIsNotNull() {
            addCriterion("limitProducts is not null");
            return (Criteria) this;
        }

        public Criteria andLimitProductsEqualTo(String value) {
            addCriterion("limitProducts =", value, "limitProducts");
            return (Criteria) this;
        }

        public Criteria andLimitProductsNotEqualTo(String value) {
            addCriterion("limitProducts <>", value, "limitProducts");
            return (Criteria) this;
        }

        public Criteria andLimitProductsGreaterThan(String value) {
            addCriterion("limitProducts >", value, "limitProducts");
            return (Criteria) this;
        }

        public Criteria andLimitProductsGreaterThanOrEqualTo(String value) {
            addCriterion("limitProducts >=", value, "limitProducts");
            return (Criteria) this;
        }

        public Criteria andLimitProductsLessThan(String value) {
            addCriterion("limitProducts <", value, "limitProducts");
            return (Criteria) this;
        }

        public Criteria andLimitProductsLessThanOrEqualTo(String value) {
            addCriterion("limitProducts <=", value, "limitProducts");
            return (Criteria) this;
        }

        public Criteria andLimitProductsLike(String value) {
            addCriterion("limitProducts like", value, "limitProducts");
            return (Criteria) this;
        }

        public Criteria andLimitProductsNotLike(String value) {
            addCriterion("limitProducts not like", value, "limitProducts");
            return (Criteria) this;
        }

        public Criteria andLimitProductsIn(List<String> values) {
            addCriterion("limitProducts in", values, "limitProducts");
            return (Criteria) this;
        }

        public Criteria andLimitProductsNotIn(List<String> values) {
            addCriterion("limitProducts not in", values, "limitProducts");
            return (Criteria) this;
        }

        public Criteria andLimitProductsBetween(String value1, String value2) {
            addCriterion("limitProducts between", value1, value2, "limitProducts");
            return (Criteria) this;
        }

        public Criteria andLimitProductsNotBetween(String value1, String value2) {
            addCriterion("limitProducts not between", value1, value2, "limitProducts");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("userType is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("userType is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Short value) {
            addCriterion("userType =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Short value) {
            addCriterion("userType <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Short value) {
            addCriterion("userType >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("userType >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Short value) {
            addCriterion("userType <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Short value) {
            addCriterion("userType <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Short> values) {
            addCriterion("userType in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Short> values) {
            addCriterion("userType not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Short value1, Short value2) {
            addCriterion("userType between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Short value1, Short value2) {
            addCriterion("userType not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andLiveTitleIsNull() {
            addCriterion("liveTitle is null");
            return (Criteria) this;
        }

        public Criteria andLiveTitleIsNotNull() {
            addCriterion("liveTitle is not null");
            return (Criteria) this;
        }

        public Criteria andLiveTitleEqualTo(String value) {
            addCriterion("liveTitle =", value, "liveTitle");
            return (Criteria) this;
        }

        public Criteria andLiveTitleNotEqualTo(String value) {
            addCriterion("liveTitle <>", value, "liveTitle");
            return (Criteria) this;
        }

        public Criteria andLiveTitleGreaterThan(String value) {
            addCriterion("liveTitle >", value, "liveTitle");
            return (Criteria) this;
        }

        public Criteria andLiveTitleGreaterThanOrEqualTo(String value) {
            addCriterion("liveTitle >=", value, "liveTitle");
            return (Criteria) this;
        }

        public Criteria andLiveTitleLessThan(String value) {
            addCriterion("liveTitle <", value, "liveTitle");
            return (Criteria) this;
        }

        public Criteria andLiveTitleLessThanOrEqualTo(String value) {
            addCriterion("liveTitle <=", value, "liveTitle");
            return (Criteria) this;
        }

        public Criteria andLiveTitleLike(String value) {
            addCriterion("liveTitle like", value, "liveTitle");
            return (Criteria) this;
        }

        public Criteria andLiveTitleNotLike(String value) {
            addCriterion("liveTitle not like", value, "liveTitle");
            return (Criteria) this;
        }

        public Criteria andLiveTitleIn(List<String> values) {
            addCriterion("liveTitle in", values, "liveTitle");
            return (Criteria) this;
        }

        public Criteria andLiveTitleNotIn(List<String> values) {
            addCriterion("liveTitle not in", values, "liveTitle");
            return (Criteria) this;
        }

        public Criteria andLiveTitleBetween(String value1, String value2) {
            addCriterion("liveTitle between", value1, value2, "liveTitle");
            return (Criteria) this;
        }

        public Criteria andLiveTitleNotBetween(String value1, String value2) {
            addCriterion("liveTitle not between", value1, value2, "liveTitle");
            return (Criteria) this;
        }

        public Criteria andCoverImageIsNull() {
            addCriterion("coverImage is null");
            return (Criteria) this;
        }

        public Criteria andCoverImageIsNotNull() {
            addCriterion("coverImage is not null");
            return (Criteria) this;
        }

        public Criteria andCoverImageEqualTo(String value) {
            addCriterion("coverImage =", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotEqualTo(String value) {
            addCriterion("coverImage <>", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageGreaterThan(String value) {
            addCriterion("coverImage >", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageGreaterThanOrEqualTo(String value) {
            addCriterion("coverImage >=", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageLessThan(String value) {
            addCriterion("coverImage <", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageLessThanOrEqualTo(String value) {
            addCriterion("coverImage <=", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageLike(String value) {
            addCriterion("coverImage like", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotLike(String value) {
            addCriterion("coverImage not like", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageIn(List<String> values) {
            addCriterion("coverImage in", values, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotIn(List<String> values) {
            addCriterion("coverImage not in", values, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageBetween(String value1, String value2) {
            addCriterion("coverImage between", value1, value2, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotBetween(String value1, String value2) {
            addCriterion("coverImage not between", value1, value2, "coverImage");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIDEqualTo(Integer value) {
            addCriterion("userID =", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThan(Integer value) {
            addCriterion("userID >", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThan(Integer value) {
            addCriterion("userID <", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDIn(List<Integer> values) {
            addCriterion("userID in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampIsNull() {
            addCriterion("createdTimestamp is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampIsNotNull() {
            addCriterion("createdTimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampEqualTo(Long value) {
            addCriterion("createdTimestamp =", value, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampNotEqualTo(Long value) {
            addCriterion("createdTimestamp <>", value, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampGreaterThan(Long value) {
            addCriterion("createdTimestamp >", value, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampGreaterThanOrEqualTo(Long value) {
            addCriterion("createdTimestamp >=", value, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampLessThan(Long value) {
            addCriterion("createdTimestamp <", value, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampLessThanOrEqualTo(Long value) {
            addCriterion("createdTimestamp <=", value, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampIn(List<Long> values) {
            addCriterion("createdTimestamp in", values, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampNotIn(List<Long> values) {
            addCriterion("createdTimestamp not in", values, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampBetween(Long value1, Long value2) {
            addCriterion("createdTimestamp between", value1, value2, "createdTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTimestampNotBetween(Long value1, Long value2) {
            addCriterion("createdTimestamp not between", value1, value2, "createdTimestamp");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}