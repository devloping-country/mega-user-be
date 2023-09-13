package com.mega.biz.qr;

import com.mega.common.controller.Controller;
import com.mega.common.controller.HandlerMapping;
import com.mega.biz.qr.controller.TestController;


import java.util.HashMap;
import java.util.Map;

public class QrHandlerMapping extends HandlerMapping {

    private Map<String, Controller> mappings = new HashMap<>();

    public QrHandlerMapping() {
        mappings.put("/test.do", new TestController());
    }

    @Override
    public Controller getController(String path) {
        return mappings.get(path);
    }
}