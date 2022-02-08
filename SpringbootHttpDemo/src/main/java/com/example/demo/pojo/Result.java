package com.example.demo.pojo;

public class Result {


    private String weaid;
    private String cityid;
    private String area_1;
    private String area_2;
    private String area_3;
    private RealTime realTime;

    public void setWeaid(String weaid) {
        this.weaid = weaid;
    }
    public String getWeaid() {
        return weaid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }
    public String getCityid() {
        return cityid;
    }

    public void setArea_1(String area_1) {
        this.area_1 = area_1;
    }
    public String getArea_1() {
        return area_1;
    }

    public void setArea_2(String area_2) {
        this.area_2 = area_2;
    }
    public String getArea_2() {
        return area_2;
    }

    public void setArea_3(String area_3) {
        this.area_3 = area_3;
    }
    public String getArea_3() {
        return area_3;
    }

    public void setRealTime(RealTime realTime) {
        this.realTime = realTime;
    }
    public RealTime getRealTime() {
        return realTime;
    }

    @Override
    public String toString() {
        return "Result{" +
                "weaid='" + weaid + '\'' +
                ", cityid='" + cityid + '\'' +
                ", area_1='" + area_1 + '\'' +
                ", area_2='" + area_2 + '\'' +
                ", area_3='" + area_3 + '\'' +
                ", realTime=" + realTime +
                '}';
    }
}