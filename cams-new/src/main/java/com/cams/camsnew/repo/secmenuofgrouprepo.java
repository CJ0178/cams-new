package com.cams.camsnew.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cams.camsnew.compositekey.secmenuofgroupck;
import com.cams.camsnew.model.SecMenuOfGroupModel;
import com.cams.camsnew.model.SecMsGroupModel;

@Repository
public interface secmenuofgrouprepo extends JpaRepository<SecMenuOfGroupModel, secmenuofgroupck>{
    
}
