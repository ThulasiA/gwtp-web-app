package com.axismedtech.interview.client.application.read;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.axismedtech.interview.client.application.ApplicationPresenter;
import com.axismedtech.interview.client.place.NameTokens;

public class ReadPresenter extends Presenter<ReadPresenter.MyView, ReadPresenter.MyProxy>  {
    public interface MyView extends View  {
    }
    
    @NameToken(NameTokens.read)
    @ProxyCodeSplit
    public interface MyProxy extends ProxyPlace<ReadPresenter> {
    }

    @Inject
    ReadPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
        
    }
    
    
}