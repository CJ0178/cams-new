package com.cams.camsnew.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cams.camsnew.model.SecMsGroupModel;
import com.cams.camsnew.repo.secmsgrouprepo;

@Service
public class secmsgroupservc {
    @Autowired
    private secmsgrouprepo repo;

    public SecMsGroupModel dummyGroup(SecMsGroupModel dummyGroup) {
        System.out.println("DUMMY GROUP");

        return repo.save(dummyGroup);
    }
}
