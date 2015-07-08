package com.axismedtech.interview.client.application.read;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.axismedtech.interview.client.resources.AppResources;

class ReadView extends ViewImpl implements ReadPresenter.MyView {
    interface Binder extends UiBinder<Widget, ReadView> {
    }

    @UiField(provided = true)
    AppResources resources;

    @Inject
    ReadView(Binder uiBinder, AppResources resources) {
    	this.resources = resources;	
        initWidget(uiBinder.createAndBindUi(this));
    }
}