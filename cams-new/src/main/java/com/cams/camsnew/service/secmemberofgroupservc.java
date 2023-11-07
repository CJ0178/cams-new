package com.cams.camsnew.service;

import org.hibernate.id.IdentifierGenerationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cams.camsnew.model.SecMemberOfGroupModel;
import com.cams.camsnew.repo.secmemberofgrouprepo;

@Service
public class secmemberofgroupservc {
    @Autowired
    private secmemberofgrouprepo repo;
    
    public SecMemberOfGroupModel dummyMemberOfGroup(SecMemberOfGroupModel dummyMemberOfGroup) throws IdentifierGenerationException{
        System.out.println("DUMMY MEMBER OF GROUP");

        return repo.save(dummyMemberOfGroup);
    }
}
