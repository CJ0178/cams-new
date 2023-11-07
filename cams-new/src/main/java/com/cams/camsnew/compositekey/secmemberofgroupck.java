package com.cams.camsnew.compositekey;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.cams.camsnew.model.SecMsGroupModel;
import com.cams.camsnew.model.SecMsUserModel;

//import lombok.EqualsAndHashCode;

@Embeddable
//@EqualsAndHashCode
public class secmemberofgroupck implements Serializable{

	@ManyToOne
//	@GeneratedValue(strategy=GenerationType.AUTO)
    @JoinColumns({
        @JoinColumn(name = "groupid", referencedColumnName = "groupid"),
        @JoinColumn(name = "applicationid", referencedColumnName = "applicationid")
    })
    private SecMsGroupModel group;

    @OneToOne
//    @GeneratedValue(strategy=GenerationType.AUTO)
    @JoinColumn(name = "userid", referencedColumnName = "userid")
    private SecMsUserModel user;
    
	public secmemberofgroupck() {
		super();
	}

	public secmemberofgroupck(SecMsGroupModel group, SecMsUserModel user) {
		super();
		this.group = group;
		this.user = user;
	}

	public SecMsGroupModel getGroup() {
		return group;
	}

	public void setGroup(SecMsGroupModel group) {
		this.group = group;
	}

	public SecMsUserModel getUser() {
		return user;
	}

	public void setUser(SecMsUserModel user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(group, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		secmemberofgroupck other = (secmemberofgroupck) obj;
		return Objects.equals(group, other.group) && Objects.equals(user, other.user);
	}
    
    
    
}
