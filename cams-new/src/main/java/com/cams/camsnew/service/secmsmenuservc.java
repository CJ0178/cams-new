package com.cams.camsnew.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cams.camsnew.model.SecMsMenuModel;
import com.cams.camsnew.repo.secmsmenurepo;

@Service
public class secmsmenuservc {
    @Autowired
    private secmsmenurepo repo;

    public SecMsMenuModel dummyMenu(SecMsMenuModel dummyMenu) {
        System.out.println("DUMMY MENU");

        return repo.save(dummyMenu);
    }

}
