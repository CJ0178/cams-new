package com.cams.camsnew.model;

import org.hibernate.annotations.CollectionId;

import com.cams.camsnew.compositekey.secmemberofgroupck;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="sec_memberofgroup")

public class SecMemberOfGroupModel implements Serializable {
//    @Id
//    @ManyToOne()
//    @JoinColumns({
//            @JoinColumn(name = "groupid", referencedColumnName = "groupid"),
//            @JoinColumn(name = "applicationid", referencedColumnName = "applicationid")
//    })
//    private SecMsGroupModel group;
	@EmbeddedId
	private secmemberofgroupck id;

//    @Id
//    @OneToOne()
//    @JoinColumn(name = "userid",  referencedColumnName = "userid")
//    private SecMsUserModel user;

    @Column(length = 10)
    private String usrupd;
    private Date dtmupd;
    
    public SecMemberOfGroupModel() {
    }
    

    public SecMemberOfGroupModel(secmemberofgroupck id, String usrupd, Date dtmupd) {
		super();
		this.id = id;
		this.usrupd = usrupd;
		this.dtmupd = dtmupd;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SecMemberOfGroupModel other = (SecMemberOfGroupModel) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "SecMemberOfGroupModel [id=" + id + ", usrupd=" + usrupd + ", dtmupd=" + dtmupd + "]";
	}

    public String getusrupd() {
        return usrupd;
    }

    public void setusrupd(String usrupd) {
        this.usrupd = usrupd;
    }

    public Date getdtmupd() {
        return dtmupd;
    }

    public void setdtmupd(Date dtmupd) {
        this.dtmupd = dtmupd;
    }

}
