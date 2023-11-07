package com.cams.camsnew.compositekey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class secmsgroupck implements Serializable{
    private String groupid;
    private String applicationid;
    
    public secmsgroupck() {
    }
    
    public secmsgroupck(String groupid, String applicationid) {
        this.groupid = groupid;
        this.applicationid = applicationid;
    }
    
    @Override
    public String toString() {
        return "secmsgroupck [groupid=" + groupid + ", applicationid=" + applicationid + "]";
    }

    public String getGroupid() {
        return groupid;
    }
    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }
    public String getApplicationid() {
        return applicationid;
    }
    public void setApplicationid(String applicationid) {
        this.applicationid = applicationid;
    }

    
}
