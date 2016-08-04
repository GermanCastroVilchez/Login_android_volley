package com.example.consultadd.tixdo_login.Model;


import java.io.Serializable;
import java.util.List;

/**
 * Created by consultadd on 2/8/16.
 */
public class User implements Serializable {
    /**
     * id : 409
     * referral_code : REFSQkZGa
     * last_login : 2016-08-02T12:13:18.627014Z
     * is_superuser : false
     * username : dubemayur
     * first_name :
     * last_name :
     * email : dubemayur@gmail.com
     * date_joined : 2016-07-21T07:51:12.091139Z
     * name :
     * phone : 9028962439
     * birthday : 2004-07-15
     * photo : null
     * gender : null
     * married : no
     * anniversary : null
     * preferences : null
     * refresh_token : null
     * expires_in : null
     * ref_code_redeemed_at : null
     * referred_by : null
     * groups : []
     * user_permissions : []
     */

    private String id;
    private String referral_code;
    private String last_login;
    private boolean is_superuser;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private String date_joined;
    private String name;
    private String phone;
    private String birthday;
    private Object photo;
    private Object gender;
    private String married;
    private Object anniversary;
    private Object preferences;
    private Object refresh_token;
    private Object expires_in;
    private Object ref_code_redeemed_at;
    private Object referred_by;
    private List<?> groups;
    private List<?> user_permissions;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReferral_code() {
        return referral_code;
    }

    public void setReferral_code(String referral_code) {
        this.referral_code = referral_code;
    }

    public String getLast_login() {
        return last_login;
    }

    public void setLast_login(String last_login) {
        this.last_login = last_login;
    }

    public boolean isIs_superuser() {
        return is_superuser;
    }

    public void setIs_superuser(boolean is_superuser) {
        this.is_superuser = is_superuser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate_joined() {
        return date_joined;
    }

    public void setDate_joined(String date_joined) {
        this.date_joined = date_joined;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Object getPhoto() {
        return photo;
    }

    public void setPhoto(Object photo) {
        this.photo = photo;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public Object getAnniversary() {
        return anniversary;
    }

    public void setAnniversary(Object anniversary) {
        this.anniversary = anniversary;
    }

    public Object getPreferences() {
        return preferences;
    }

    public void setPreferences(Object preferences) {
        this.preferences = preferences;
    }

    public Object getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(Object refresh_token) {
        this.refresh_token = refresh_token;
    }

    public Object getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Object expires_in) {
        this.expires_in = expires_in;
    }

    public Object getRef_code_redeemed_at() {
        return ref_code_redeemed_at;
    }

    public void setRef_code_redeemed_at(Object ref_code_redeemed_at) {
        this.ref_code_redeemed_at = ref_code_redeemed_at;
    }

    public Object getReferred_by() {
        return referred_by;
    }

    public void setReferred_by(Object referred_by) {
        this.referred_by = referred_by;
    }

    public List<?> getGroups() {
        return groups;
    }

    public void setGroups(List<?> groups) {
        this.groups = groups;
    }

    public List<?> getUser_permissions() {
        return user_permissions;
    }

    public void setUser_permissions(List<?> user_permissions) {
        this.user_permissions = user_permissions;
    }
//    private String mname,mid,memail;
//
//    public void setMname(String name){mname=name;}
//
//    public void setMid(String id){mid=id;}
//
//    public void setMemail(String email){memail=email;}


}
