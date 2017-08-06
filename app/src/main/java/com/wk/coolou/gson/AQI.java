package com.wk.coolou.gson;

/**
 * Created by 汪汪汪 on 2017/8/6.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        
        public String aqi;
        //pm2.5
        public String pm25;
    }
}
