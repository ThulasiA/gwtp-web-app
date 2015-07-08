package com.axismedtech.interview.client.application.photo;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class PhotoModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(PhotoPresenter.class, PhotoPresenter.MyView.class, PhotoView.class, PhotoPresenter.MyProxy.class);
    }
}