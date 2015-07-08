package com.axismedtech.interview.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.axismedtech.interview.Project";
    }

    public void testSandbox() {
        assertTrue(true);
    }
}
