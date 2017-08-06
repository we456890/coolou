package com.wk.coolou.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 汪汪汪 on 2017/8/6.
 */

public class City extends DataSupport {
    private int id;
    //城市名字
    private String cityName;
    //城市代号
    private int cityCode;
    //所属省的id
    private int provinceId;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
