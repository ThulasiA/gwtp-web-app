package com.axismedtech.interview.client.application.read;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ReadModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ReadPresenter.class, ReadPresenter.MyView.class, ReadView.class, ReadPresenter.MyProxy.class);
    }
}