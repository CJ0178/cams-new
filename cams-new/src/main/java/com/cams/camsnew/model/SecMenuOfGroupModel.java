package com.cams.camsnew.model;

import javax.persistence.*;

import com.cams.camsnew.compositekey.secmenuofgroupck;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="SEC_MENUOFGROUP")
//@IdClass(secmenuofgroupck.class)
public class SecMenuOfGroupModel implements Serializable{
    

    // @OneToOne
    // @JoinColumn(name = "GROUPID")
    // private SecMsGroupModel group;
    // @OneToOne
    // @JoinColumn(name = "APPLICATIONID")
    // private SecMsGroupModel application;
    
	@EmbeddedId
	private secmenuofgroupck id;

    @Column(length = 12)
    private String usrupd;
    private Date dtmupd;
    @Column(length = 1)
    private String updatemenu;

    public SecMenuOfGroupModel() {
    }

    public SecMenuOfGroupModel(String usrupd, Date dtmupd,
            String updatemenu) {
        this.usrupd = usrupd;
        this.dtmupd = dtmupd;
        this.updatemenu = updatemenu;
    }

    @Override
    public String toString() {
        return "SecMenuOfGroupModel [usrupd=" + usrupd + ", dtmupd=" + dtmupd
                + ", updatemenu=" + updatemenu + "]";
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
    public String getupdatemenu() {
        return updatemenu;
    }
    public void setupdatemenu(String updatemenu) {
        this.updatemenu = updatemenu;
    }
}
