package com.axismedtech.interview.client.gin;

import javax.inject.Inject;

import com.axismedtech.interview.client.resources.AppResources;

public class ResourceLoader {
	@Inject
	ResourceLoader(AppResources resources) {
		 resources.style().ensureInjected();
        
    }

}
