package com.ankur.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("/get_all_promotion")
    Call<List<detailsOfPromo>> getdetailsOfPromo();

    public class anotherMethod(){

    }


    public  class AddedNew(){

    }

}
