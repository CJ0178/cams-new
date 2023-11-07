package com.cams.camsnew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cams.camsnew.model.SecMenuOfGroupModel;
import com.cams.camsnew.service.secmenuofgroupservc;

@RestController
@RequestMapping("/menu-of-group")
public class secmenuofgroupcontroller {
    @Autowired
    private secmenuofgroupservc srvc;
    
    @PostMapping("/data-dummy-menu")
    public ResponseEntity<SecMenuOfGroupModel> addDummyUser(@RequestBody SecMenuOfGroupModel dummy){
        SecMenuOfGroupModel addNew = srvc.dummyMenuOfGroup(dummy);
        return new ResponseEntity<>(dummy, HttpStatus.CREATED);
    }
}
