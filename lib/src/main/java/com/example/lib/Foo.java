package com.example.lib;

import org.webrtc.EglBase;

public class Foo {
    private EglBase eglBase;
    private Bar bar;

    public void init() {
        bar = new Bar();
        bar.init();
    }

    public class Bar {
        public void init() {
            eglBase = EglBase.create();
        }
    }
}
