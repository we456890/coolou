package com.wk.coolou.util;

import android.text.TextUtils;

import com.wk.coolou.db.City;
import com.wk.coolou.db.County;
import com.wk.coolou.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by 汪汪汪 on 2017/8/6.
 */

public class Utility {
    /**
     * 解析和处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces = new JSONArray(response);
                for (int i=0;i<allProvinces.length();i++){
                    JSONObject privinceObject = allProvinces.getJSONObject(i);
                    Province province=new Province();
                    province.setProvinceName(privinceObject.getString("name"));
                    province.setProvinceCode(privinceObject.getInt("id"));
                    province.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handleCityResponse(String response,int provinceId){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allCitys = new JSONArray(response);
                for (int i=0;i<allCitys.length();i++){
                    JSONObject CityObject = allCitys.getJSONObject(i);
                    City city=new City();
                    city.setCityName(CityObject.getString("name"));
                    city.setCityCode(CityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handleCountyResponse(String response,int cityId){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allCountys = new JSONArray(response);
                for (int i=0;i<allCountys.length();i++){
                    JSONObject CityObject = allCountys.getJSONObject(i);
                    County county=new County();
                    county.setCountyName(CityObject.getString("name"));
                    county.setWeatherId(CityObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
}
