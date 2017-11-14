package com.dropbox.djinni.test;

import junit.framework.TestCase;

public class WeakProxyTest extends TestCase implements EchoView {
    
    private static final String ENTERED_TEXT = "Hello.";

    private EchoViewModel viewModel;
    private String displayedText;

    @Override
    protected void setUp() {
        displayedText = "";
        viewModel = EchoViewModel.create(new EchoView.WeakProxy(this));
    }

    public void testWeakProxy() {
        viewModel.didEnterText(ENTERED_TEXT);
        assertEquals(displayedText, ENTERED_TEXT);
    }

    @Override
    public void displayText(String text) {
        displayedText = text;
    }
}
