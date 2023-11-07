package com.cams.camsnew.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="sec_msuser")
public class SecMsUserModel {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @OneToOne
//    @JoinColumn(name = "userid")
//    private SecMemberOfGroupModel user;
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // @GeneratedValue(generator = "uuid")
    // @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(nullable = false, length = 12)
    private String userid;
    @Column(length = 50)
    private String fullname;
    private Character active;
    @Column(length = 24)
    private String sqlpassword;
    @Column(length = 50)
    private String securitypassword;
    @Column(length = 50)
    private String securityanswer;
    @Column(length = 12)
    private String usercrt;
    @Column(length = 12)
    private String usrupd;
    private Date dtmupd;
    private Date dtmcrt;
    private Character islocked;
    @Column(columnDefinition = "CHAR(2)")
    private String usertype;
    private Number timeslocked;
    @Column(length = 7)
    private String kode_sentra_admin;
    @Column(length = 1)
    private String isloggedin = "0";
    private Date lastlogin;
    @Column(length = 7)
    private String kode_kanwil;
    @Column(length = 7)
    private String kode_kcu;
    @Column(length = 200)
    private String email;
    private Character email_flag_edoc = '1';
    @Column(precision = 17, scale = 2)
    private Number approval_limit;
    @Column(length = 200)
    private String key_id;
    @Column(length = 50)
    private String host_id;
    @Column(length = 50)
    private String full_name;
    @Column(length = 1)
    private String is_locked;
    @Column(length = 1)
    private String is_logged_in;
    private Timestamp last_login;
    @Column(length = 50)
    private String security_answer;
    @Column(length = 50)
    private String security_question;
    @Column(length = 24)
    private String sql_password;
    @Column(precision = 10, scale = 0)
    private Number times_locked;
    @Column(length = 2)
    private String user_type;

    public SecMsUserModel(String userid, String fullname, Character active, String sqlpassword, String securitypassword,
            String securityanswer, String usercrt, String usrupd, Date dtmupd, Date dtmcrt, Character islocked,
            String usertype, Number timeslocked, String kode_sentra_admin, String isloggedin, Date lastlogin,
            String kode_kanwil, String kode_kcu, String email, Character email_flag_edoc, Number approval_limit,
            String key_id, String host_id, String full_name, String is_locked, String is_logged_in,
            Timestamp last_login, String security_answer, String security_question, String sql_password,
            Number times_locked, String user_type) {
        this.userid = userid;
        this.fullname = fullname;
        this.active = active;
        this.sqlpassword = sqlpassword;
        this.securitypassword = securitypassword;
        this.securityanswer = securityanswer;
        this.usercrt = usercrt;
        this.usrupd = usrupd;
        this.dtmupd = dtmupd;
        this.dtmcrt = dtmcrt;
        this.islocked = islocked;
        this.usertype = usertype;
        this.timeslocked = timeslocked;
        this.kode_sentra_admin = kode_sentra_admin;
        this.isloggedin = isloggedin;
        this.lastlogin = lastlogin;
        this.kode_kanwil = kode_kanwil;
        this.kode_kcu = kode_kcu;
        this.email = email;
        this.email_flag_edoc = email_flag_edoc;
        this.approval_limit = approval_limit;
        this.key_id = key_id;
        this.host_id = host_id;
        this.full_name = full_name;
        this.is_locked = is_locked;
        this.is_logged_in = is_logged_in;
        this.last_login = last_login;
        this.security_answer = security_answer;
        this.security_question = security_question;
        this.sql_password = sql_password;
        this.times_locked = times_locked;
        this.user_type = user_type;
    }

    public SecMsUserModel() {
    }

    @Override
    public String toString() {
        return "SecMsUserModel [userid=" + userid + ", fullname=" + fullname + ", active=" + active + ", sqlpassword="
                + sqlpassword + ", securitypassword=" + securitypassword + ", securityanswer=" + securityanswer
                + ", usercrt=" + usercrt + ", usrupd=" + usrupd + ", dtmupd=" + dtmupd + ", dtmcrt=" + dtmcrt
                + ", islocked=" + islocked + ", usertype=" + usertype + ", timeslocked=" + timeslocked
                + ", kode_sentra_admin=" + kode_sentra_admin + ", isloggedin=" + isloggedin + ", lastlogin=" + lastlogin
                + ", kode_kanwil=" + kode_kanwil + ", kode_kcu=" + kode_kcu + ", email=" + email + ", email_flag_edoc="
                + email_flag_edoc + ", approval_limit=" + approval_limit + ", key_id=" + key_id + ", host_id=" + host_id
                + ", full_name=" + full_name + ", is_locked=" + is_locked + ", is_logged_in=" + is_logged_in
                + ", last_login=" + last_login + ", security_answer=" + security_answer + ", security_question="
                + security_question + ", sql_password=" + sql_password + ", times_locked=" + times_locked
                + ", user_type=" + user_type + "]";
    }
    
    public String getuserid() {
        return userid;
    }
    public void setuserid(String userid) {
        this.userid = userid;
    }
    public String getfullname() {
        return fullname;
    }
    public void setfullname(String fullname) {
        this.fullname = fullname;
    }
    public Character getactive() {
        return active;
    }
    public void setactive(Character active) {
        this.active = active;
    }
    public String getsqlpassword() {
        return sqlpassword;
    }
    public void setsqlpassword(String sqlpassword) {
        this.sqlpassword = sqlpassword;
    }
    public String getsecuritypassword() {
        return securitypassword;
    }
    public void setsecuritypassword(String securitypassword) {
        this.securitypassword = securitypassword;
    }
    public String getsecurityanswer() {
        return securityanswer;
    }
    public void setsecurityanswer(String securityanswer) {
        this.securityanswer = securityanswer;
    }
    public String getusercrt() {
        return usercrt;
    }
    public void setusercrt(String usercrt) {
        this.usercrt = usercrt;
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
    public Date getdtmcrt() {
        return dtmcrt;
    }
    public void setdtmcrt(Date dtmcrt) {
        this.dtmcrt = dtmcrt;
    }
    public Character getislocked() {
        return islocked;
    }
    public void setislocked(Character islocked) {
        this.islocked = islocked;
    }
    public String getusertype() {
        return usertype;
    }
    public void setusertype(String usertype) {
        this.usertype = usertype;
    }
    public Number gettimeslocked() {
        return timeslocked;
    }
    public void settimeslocked(Number timeslocked) {
        this.timeslocked = timeslocked;
    }
    public String getkode_sentra_admin() {
        return kode_sentra_admin;
    }
    public void setkode_sentra_admin(String kode_sentra_admin) {
        this.kode_sentra_admin = kode_sentra_admin;
    }
    public String getisloggedin() {
        return isloggedin;
    }
    public void setisloggedin(String isloggedin) {
        this.isloggedin = isloggedin;
    }
    public Date getlastlogin() {
        return lastlogin;
    }
    public void setlastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }
    public String getkode_kanwil() {
        return kode_kanwil;
    }
    public void setkode_kanwil(String kode_kanwil) {
        this.kode_kanwil = kode_kanwil;
    }
    public String getkode_kcu() {
        return kode_kcu;
    }
    public void setkode_kcu(String kode_kcu) {
        this.kode_kcu = kode_kcu;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }
    public Character getemail_flag_edoc() {
        return email_flag_edoc;
    }
    public void setemail_flag_edoc(Character email_flag_edoc) {
        this.email_flag_edoc = email_flag_edoc;
    }
    public Number getapproval_limit() {
        return approval_limit;
    }
    public void setapproval_limit(Number approval_limit) {
        this.approval_limit = approval_limit;
    }
    public String getkey_id() {
        return key_id;
    }
    public void setkey_id(String key_id) {
        this.key_id = key_id;
    }
    public String gethost_id() {
        return host_id;
    }
    public void sethost_id(String host_id) {
        this.host_id = host_id;
    }
    public String getfull_name() {
        return full_name;
    }
    public void setfull_name(String full_name) {
        this.full_name = full_name;
    }
    public String getis_locked() {
        return is_locked;
    }
    public void setis_locked(String is_locked) {
        this.is_locked = is_locked;
    }
    public String getis_logged_in() {
        return is_logged_in;
    }
    public void setis_logged_in(String is_logged_in) {
        this.is_logged_in = is_logged_in;
    }
    public Timestamp getlast_login() {
        return last_login;
    }
    public void setlast_login(Timestamp last_login) {
        this.last_login = last_login;
    }
    public String getsecurity_answer() {
        return security_answer;
    }
    public void setsecurity_answer(String security_answer) {
        this.security_answer = security_answer;
    }
    public String getsecurity_question() {
        return security_question;
    }
    public void setsecurity_question(String security_question) {
        this.security_question = security_question;
    }
    public String getsql_password() {
        return sql_password;
    }
    public void setsql_password(String sql_password) {
        this.sql_password = sql_password;
    }
    public Number gettimes_locked() {
        return times_locked;
    }
    public void settimes_locked(Number times_locked) {
        this.times_locked = times_locked;
    }
    public String getuser_type() {
        return user_type;
    }
    public void setuser_type(String user_type) {
        this.user_type = user_type;
    }

	@Override
	public int hashCode() {
		return Objects.hash(userid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SecMsUserModel other = (SecMsUserModel) obj;
		return Objects.equals(userid, other.userid);
	}
    
    
}
