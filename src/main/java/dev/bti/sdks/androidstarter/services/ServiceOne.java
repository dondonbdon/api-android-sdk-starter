package dev.bti.sdks.androidstarter.services;

import dev.bti.sdks.androidstarter.models.One;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;

public interface ServiceOne extends Service {

    @GET("two")
    Call<One> get();

    @GET("two")
    Call<Void> post();

    @PUT("two")
    Call<Void> put();

    @DELETE("two")
    Call<Void> delete();

}

