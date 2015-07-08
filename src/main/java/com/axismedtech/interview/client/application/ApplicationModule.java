package com.axismedtech.interview.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.axismedtech.interview.client.application.home.HomePagePresenter;
import com.axismedtech.interview.client.application.home.HomePageView;
import com.axismedtech.interview.client.application.home.HomeModule;
import com.axismedtech.interview.client.application.read.ReadModule;
import com.axismedtech.interview.client.application.photo.PhotoModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        
		install(new PhotoModule());
		install(new ReadModule());
		install(new HomeModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
        
        
    }
}
