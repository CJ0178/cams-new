package com.cams.camsnew.model;

import com.fasterxml.jackson.databind.DatabindException;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="sec_menu")
public class SecMsMenuModel implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, length = 5)
    private String menuid;
    @Column(length = 12)
    private String formid;
    @Column(length = 10)
    private String applicationid;
    @Column(length = 5)
    private String parentmenuid;
    @Column(length = 50)
    private String prompt;
    @Column(precision = 38, scale = 0)
    private Number menulevel;
    @Column(length = 2)
    private String result;
    @Column(precision = 38, scale = 0)
    private Number menuorder;
    @Column(length = 12)
    private String usrupd;
    private Date dtmupd;
    private Character active;
    @Column(length = 20)
    private String menutype;

    public SecMsMenuModel() {
    }
    
    public SecMsMenuModel(String menuid, String formid, String applicationid, String parentmenuid, String prompt,
            Number menulevel, String result, Number menuorder, String usrupd, Date dtmupd, Character active,
            String menutype) {
        this.menuid = menuid;
        this.formid = formid;
        this.applicationid = applicationid;
        this.parentmenuid = parentmenuid;
        this.prompt = prompt;
        this.menulevel = menulevel;
        this.result = result;
        this.menuorder = menuorder;
        this.usrupd = usrupd;
        this.dtmupd = dtmupd;
        this.active = active;
        this.menutype = menutype;
    }

    @Override
    public String toString() {
        return "SecMsMenuModel [menuid=" + menuid + ", formid=" + formid + ", applicationid=" + applicationid
                + ", parentmenuid=" + parentmenuid + ", prompt=" + prompt + ", menulevel=" + menulevel + ", result="
                + result + ", menuorder=" + menuorder + ", usrupd=" + usrupd + ", dtmupd=" + dtmupd + ", active="
                + active + ", menutype=" + menutype + "]";
    }

    public String getMenuid() {
        return menuid;
    }
    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }
    public String getFormid() {
        return formid;
    }
    public void setFormid(String formid) {
        this.formid = formid;
    }
    public String getApplicationid() {
        return applicationid;
    }
    public void setApplicationid(String applicationid) {
        this.applicationid = applicationid;
    }
    public String getParentmenuid() {
        return parentmenuid;
    }
    public void setParentmenuid(String parentmenuid) {
        this.parentmenuid = parentmenuid;
    }
    public String getPrompt() {
        return prompt;
    }
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
    public Number getMenulevel() {
        return menulevel;
    }
    public void setMenulevel(Number menulevel) {
        this.menulevel = menulevel;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public Number getMenuorder() {
        return menuorder;
    }
    public void setMenuorder(Number menuorder) {
        this.menuorder = menuorder;
    }
    public String getUsrupd() {
        return usrupd;
    }
    public void setUsrupd(String usrupd) {
        this.usrupd = usrupd;
    }
    public Date getDtmupd() {
        return dtmupd;
    }
    public void setDtmupd(Date dtmupd) {
        this.dtmupd = dtmupd;
    }
    public Character getActive() {
        return active;
    }
    public void setActive(Character active) {
        this.active = active;
    }
    public String getMenutype() {
        return menutype;
    }
    public void setMenutype(String menutype) {
        this.menutype = menutype;
    }

    
}
