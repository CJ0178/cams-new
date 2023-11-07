package com.cams.camsnew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cams.camsnew.model.SecMemberOfGroupModel;
import com.cams.camsnew.service.secmemberofgroupservc;

@RestController
@RequestMapping("/member-of-group")
public class secmemberofgroupcontroller {
    @Autowired
    private secmemberofgroupservc srvc;
    
    @PostMapping("/data-dummy-member")
    public ResponseEntity<SecMemberOfGroupModel> addDummyUser(@RequestBody SecMemberOfGroupModel dummy){
        SecMemberOfGroupModel addNew = srvc.dummyMemberOfGroup(dummy);
        return new ResponseEntity<>(dummy, HttpStatus.CREATED);
    }
}
