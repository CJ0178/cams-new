package com.cams.camsnew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cams.camsnew.model.SecMsUserModel;
import com.cams.camsnew.service.secmsuserservc;

@RestController
@RequestMapping("/user")
public class secmsusercontroller {
    @Autowired
    private secmsuserservc srvc;

    @PostMapping("/data-dummy-user")
    public ResponseEntity<SecMsUserModel> addDummyUser(@RequestBody SecMsUserModel dummy){
        SecMsUserModel addNew = srvc.dummyUser(dummy);
        return new ResponseEntity<>(dummy, HttpStatus.CREATED);
    }
}
