package dev.bti.sdks.androidstarter.client;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.bti.hacia.common.Config;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.time.Instant;

public class ProviderApiClient {
    private static final String BASE_URL = String.format(" http://%s/api/v1/", Config.GetInstance().getServerAddress());
    private static Retrofit retrofit;

    public static <T> T GetInstance(Class<T> t) {

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Instant.class, new InstantTypeAdapter())
                .create();

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }

        return retrofit.create(t);
    }
}

