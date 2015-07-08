package com.axismedtech.interview.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

public interface AppResources extends ClientBundle {
	
	interface Style extends CssResource {        
        String logo();
        
        String row();
        
        String section();
		
		String rowimg();
        
    }

    @Source("css/style.css")
    Style style();

	@Source("images/book.jpg")
    ImageResource logo();

	@Source("images/photohobby.jpg")
    ImageResource photo();
}
