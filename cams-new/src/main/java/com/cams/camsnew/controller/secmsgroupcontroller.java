package com.cams.camsnew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cams.camsnew.model.SecMsGroupModel;
import com.cams.camsnew.model.SecMsMenuModel;
import com.cams.camsnew.service.secmsgroupservc;

@RestController
@RequestMapping("/group")
public class secmsgroupcontroller {
    @Autowired
    private secmsgroupservc srvc;

    @PostMapping("/data-dummy-group")
    public ResponseEntity<SecMsGroupModel> addDummyGroup(@RequestBody SecMsGroupModel dummy){
        SecMsGroupModel addNew = srvc.dummyGroup(dummy);
        return new ResponseEntity<>(dummy, HttpStatus.CREATED);
    }    
}
