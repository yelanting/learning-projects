import axios from "axios";

export const get = function (url, params = null) {
    let response = null;
    console.log("get请求:", url, params);
    axios.get(url, params).then((res) => {
        response = res;
        console.log("res:", res, ",response:", response);
    });
    console.log(response);
    return response;
}

export const post = function (url, data = null) {
    axios.post(url, data).then((res) => {
        return res;
    })
}