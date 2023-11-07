package com.cams.camsnew.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cams.camsnew.model.SecMenuOfGroupModel;
import com.cams.camsnew.repo.secmenuofgrouprepo;

@Service
public class secmenuofgroupservc {
    @Autowired
    private secmenuofgrouprepo repo;
    
    public SecMenuOfGroupModel dummyMenuOfGroup(SecMenuOfGroupModel dummyMenuOfGroup) {
        System.out.println("DUMMY MENU OF GROUP");

        return repo.save(dummyMenuOfGroup);
    }
}
