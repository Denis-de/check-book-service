package com.exemle.storebookservice.controller;

import com.exemle.storebookservice.model.RemotePropertyField;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestControlle
public class StoreBookServiceController {
    private RemotePropertyField field;

    public StoreBookServiceController(RemotePropertyField field) {
        this.field = field;
    }
    @GetMapping(value = "/getRemoteField")
    public String getRemotePropertyField() {
        return "Data: " + field.getField();
    }
}
