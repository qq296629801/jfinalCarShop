package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAdmin<M extends BaseAdmin<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public M setUserName(java.lang.String userName) {
		set("user_name", userName);
		return (M)this;
	}

	public java.lang.String getUserName() {
		return get("user_name");
	}

	public M setPassWord(java.lang.String passWord) {
		set("pass_word", passWord);
		return (M)this;
	}

	public java.lang.String getPassWord() {
		return get("pass_word");
	}

	public M setNickName(java.lang.String nickName) {
		set("nick_name", nickName);
		return (M)this;
	}

	public java.lang.String getNickName() {
		return get("nick_name");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	public java.lang.String getRemark() {
		return get("remark");
	}

	public M setRoleId(java.lang.Integer roleId) {
		set("role_id", roleId);
		return (M)this;
	}

	public java.lang.Integer getRoleId() {
		return get("role_id");
	}

	public M setLoginTimes(java.lang.Integer loginTimes) {
		set("login_times", loginTimes);
		return (M)this;
	}

	public java.lang.Integer getLoginTimes() {
		return get("login_times");
	}

	public M setIp(java.lang.String ip) {
		set("ip", ip);
		return (M)this;
	}

	public java.lang.String getIp() {
		return get("ip");
	}

	public M setLastTime(java.util.Date lastTime) {
		set("last_time", lastTime);
		return (M)this;
	}

	public java.util.Date getLastTime() {
		return get("last_time");
	}

	public M setRole(java.lang.Integer role) {
		set("role", role);
		return (M)this;
	}

	public java.lang.Integer getRole() {
		return get("role");
	}

}