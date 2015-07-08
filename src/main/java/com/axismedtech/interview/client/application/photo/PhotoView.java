package com.axismedtech.interview.client.application.photo;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.axismedtech.interview.client.resources.AppResources;

class PhotoView extends ViewImpl implements PhotoPresenter.MyView {
    interface Binder extends UiBinder<Widget, PhotoView> {
    }

    @UiField(provided = true)
    AppResources resources;

    @Inject
    PhotoView(Binder uiBinder, AppResources resources) {
    	this.resources = resources;	
        initWidget(uiBinder.createAndBindUi(this));
    }
}