package com.design.mvvm.api;

import com.design.mvvm.api.bean.BaseRespBean;
import com.design.mvvm.api.bean.CartoonBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface StoneCartoonAPIService {


    /**
     * 获取漫画列表内容
     *
     * @return
     */
    @GET("zhoushuhuizhan/list")
    Call<BaseRespBean<CartoonBean>> get_cartoon_list(@Query("user_name") String userName);

}
