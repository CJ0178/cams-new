package com.cams.camsnew.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cams.camsnew.compositekey.secmemberofgroupck;
import com.cams.camsnew.model.SecMemberOfGroupModel;
import com.cams.camsnew.model.SecMsGroupModel;

@Repository
public interface secmemberofgrouprepo extends JpaRepository<SecMemberOfGroupModel, secmemberofgroupck>{
    
}
