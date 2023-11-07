package com.cams.camsnew.compositekey;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.cams.camsnew.model.SecMsGroupModel;
import com.cams.camsnew.model.SecMsMenuModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode
@Embeddable
public class secmenuofgroupck implements Serializable{
//	private SecMsGroupModel group;
//	private SecMsMenuModel menu;
	
    @ManyToOne()
    @JoinColumns({
            @JoinColumn(name = "groupid", referencedColumnName = "groupid"),
            @JoinColumn(name = "applicationid", referencedColumnName = "applicationid")
    })
    private SecMsGroupModel group;
	
    @OneToOne()
    @JoinColumn(name = "menuid", referencedColumnName = "menuid")
    private SecMsMenuModel menu;
}
