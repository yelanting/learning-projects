import * as HttpUtil from "./HttpUtil";
import axios, { AxiosResponse } from "axios";

import * as WeatherInterfaces from "./WeatherInterface";
import * as WeatherConst from "./WeatherConst";
import * as Global from "./Global";

export const weatherInfoApiBaseGet = function (url: string, params) {
    let fullUrl = WeatherConst.BASE_WEATHER_URL + url + "?key=" + Global.APP_KEY;
    console.log(fullUrl);
    axios.get(fullUrl, {
        params: params
    }).then((res: AxiosResponse<WeatherInterfaces.IWeatherResponse>) => {
        console.log(res.data);
        return res.data;
    }).catch((error) => {
        console.error("请求出错", error);
    });
}

export const weatherInfoApiBasePost = function (url, data = null) {
    let fullUrl = WeatherConst.BASE_WEATHER_URL + url + "?key=" + Global.APP_KEY;
    return HttpUtil.post(fullUrl, data);
}


export const getWheatherOfCity = function (city: string) {
    let url = "/weatherInfo";
    let params = { "city": city }
    return weatherInfoApiBaseGet(url, params);
}

getWheatherOfCity("杭州");