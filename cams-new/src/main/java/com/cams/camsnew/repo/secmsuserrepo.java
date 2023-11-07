package com.cams.camsnew.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cams.camsnew.model.SecMsUserModel;

@Repository
public interface secmsuserrepo extends JpaRepository<SecMsUserModel, String>{
    
}
