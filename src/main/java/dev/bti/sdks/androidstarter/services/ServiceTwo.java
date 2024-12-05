package dev.bti.sdks.androidstarter.services;

import dev.bti.sdks.androidstarter.models.Two;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;

public interface ServiceTwo extends Service {

    @GET("two")
    Call<Two> get();

    @GET("two")
    Call<Void> post();

    @PUT("two")
    Call<Void> put();

    @DELETE("two")
    Call<Void> delete();

}

