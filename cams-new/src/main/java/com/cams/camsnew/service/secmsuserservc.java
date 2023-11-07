package com.cams.camsnew.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cams.camsnew.model.SecMsUserModel;
import com.cams.camsnew.repo.secmsuserrepo;

@Service
public class secmsuserservc {
    @Autowired
    private secmsuserrepo repo;

    public SecMsUserModel dummyUser(SecMsUserModel dummyUser) {
        System.out.println("DUMMY USER");

        // SecMsUserModel user = new SecMsUserModel();
        // user.setuserid("AGUNARD");
        // user.setfullname("Andri G`unardi");
        // user.setactive('1');
        // user.setusercrt("INIT");
        // user.setusrupd("SYSTEM");
        // user.setdtmupd("2005-08-16T06:13:31.000Z");

        return repo.save(dummyUser);
    }

}
