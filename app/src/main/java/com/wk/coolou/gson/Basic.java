package com.wk.coolou.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 汪汪汪 on 2017/8/6.
 */

public class Basic {
    //城市名
    @SerializedName("city")
    public String cityName;
    //城市对天气id
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        //天气更新时间
        @SerializedName("loc")
        public String updateTime;
    }
}
