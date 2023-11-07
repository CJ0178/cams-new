package com.cams.camsnew.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cams.camsnew.compositekey.secmsgroupck;
import com.cams.camsnew.model.SecMsGroupModel;

@Repository
public interface secmsgrouprepo extends JpaRepository<SecMsGroupModel, String>{
    
}
