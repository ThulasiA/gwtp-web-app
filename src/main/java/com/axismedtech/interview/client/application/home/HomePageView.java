package com.axismedtech.interview.client.application.home;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.axismedtech.interview.client.resources.AppResources;

public class HomePageView extends ViewImpl implements HomePagePresenter.MyView {
	
    interface Binder extends UiBinder<Widget, HomePageView> {
    }
    
    @UiField(provided = true)
    AppResources resources;

    @Inject
    HomePageView(Binder uiBinder, AppResources resources) {
    	this.resources = resources;	
        initWidget(uiBinder.createAndBindUi(this));
    }
}
