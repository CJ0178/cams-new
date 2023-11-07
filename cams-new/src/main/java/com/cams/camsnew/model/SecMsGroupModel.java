package com.cams.camsnew.model;

import javax.persistence.*;

import com.cams.camsnew.compositekey.secmsgroupck;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="sec_msgroup")
@IdClass(secmsgroupck.class)
public class SecMsGroupModel {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @OneToOne
//    @JoinColumn(name = "groupid")
//    private SecMemberOfGroupModel group;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @OneToOne
//    @JoinColumn(name = "applicationid")
//    private SecMemberOfGroupModel application;
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, length = 7)
    private String groupid;
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, length = 10)
    private String applicationid;
    @Column(length = 50)
    private String groupname;
    private Character active;
    @Column(length = 12)
    private String usrupd;
    private Date dtmupd;

    public SecMsGroupModel() {
    }

    public SecMsGroupModel(String groupid, String applicationid, String groupname, Character active, String usrupd, Date dtmupd) {
        this.groupid = groupid;
        this.applicationid = applicationid;
        this.groupname = groupname;
        this.active = active;
        this.usrupd = usrupd;
        this.dtmupd = dtmupd;
    }

    @Override
    public String toString() {
        return "SecMsGroupModel{" +
                "groupid='" + groupid + '\'' +
                ", applicationid='" + applicationid + '\'' +
                ", groupname='" + groupname + '\'' +
                ", active=" + active +
                ", usrupd='" + usrupd + '\'' +
                ", dtmupd=" + dtmupd +
                '}';
    }

    public String getgroupid() {
        return groupid;
    }

    public void setgroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getapplicationid() {
        return applicationid;
    }

    public void setapplicationid(String applicationid) {
        this.applicationid = applicationid;
    }

    public String getgroupname() {
        return groupname;
    }

    public void setgroupname(String groupname) {
        this.groupname = groupname;
    }

    public Character getactive() {
        return active;
    }

    public void setactive(char active) {
        this.active = active;
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

	@Override
	public int hashCode() {
		return Objects.hash(applicationid, groupid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SecMsGroupModel other = (SecMsGroupModel) obj;
		return Objects.equals(applicationid, other.applicationid) && Objects.equals(groupid, other.groupid);
	}
    
    
}
