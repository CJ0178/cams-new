package com.cams.camsnew.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cams.camsnew.model.SecMsMenuModel;

@Repository
public interface secmsmenurepo extends JpaRepository<SecMsMenuModel, String> {
    
}
