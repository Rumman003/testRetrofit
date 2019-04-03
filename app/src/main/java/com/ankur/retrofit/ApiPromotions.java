package com.ankur.retrofit;

import android.os.Build;
import android.support.annotation.RequiresApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiPromotions {
    public static final String Base_url = "https://test-api.obhai.com";
    public  static Retrofit retrofit = null;

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static Retrofit getApiClient(){
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(Base_url).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
