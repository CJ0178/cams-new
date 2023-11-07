package com.cams.camsnew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cams.camsnew.model.SecMsMenuModel;
import com.cams.camsnew.service.secmsmenuservc;

@RestController
@RequestMapping("/menu")
public class secmsmenucontroller {
    @Autowired
    private secmsmenuservc srvc;

    @PostMapping("/data-dummy-menu")
    public ResponseEntity<SecMsMenuModel> addDummyMenu(@RequestBody SecMsMenuModel dummy){
        SecMsMenuModel addNew = srvc.dummyMenu(dummy);
        return new ResponseEntity<>(dummy, HttpStatus.CREATED);
    }
}
