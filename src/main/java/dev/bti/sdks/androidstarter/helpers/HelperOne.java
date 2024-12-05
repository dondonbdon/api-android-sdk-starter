package dev.bti.sdks.androidstarter.helpers;


import dev.bti.sdks.androidstarter.client.CallHandler;
import dev.bti.sdks.androidstarter.client.ProviderApiClient;
import dev.bti.sdks.androidstarter.models.One;
import dev.bti.sdks.androidstarter.services.ServiceOne;

public class HelperOne {
    private final ServiceOne service;

    public HelperOne() {
        this.service =  ProviderApiClient.GetInstance(ServiceOne.class);
    }

    public CallHandler<One> get() {
        return new CallHandler<>(service.get());
    }

    public CallHandler<Void> post() {
        return new CallHandler<>(service.post());
    }

    public CallHandler<Void> put() {
        return new CallHandler<>(service.put());
    }

    public CallHandler<Void> delete() {
        return new CallHandler<>(service.delete());
    }
}
