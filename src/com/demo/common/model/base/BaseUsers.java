package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseUsers<M extends BaseUsers<M>> extends Model<M> implements IBean {

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

	public M setUserPass(java.lang.String userPass) {
		set("user_pass", userPass);
		return (M)this;
	}

	public java.lang.String getUserPass() {
		return get("user_pass");
	}

	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}

	public java.lang.String getPhone() {
		return get("phone");
	}

	public M setCreateTime(java.lang.String createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.lang.String getCreateTime() {
		return get("create_time");
	}

	public M setNickName(java.lang.String nickName) {
		set("nick_name", nickName);
		return (M)this;
	}

	public java.lang.String getNickName() {
		return get("nick_name");
	}

	public M setCityId(java.lang.Integer cityId) {
		set("city_id", cityId);
		return (M)this;
	}

	public java.lang.Integer getCityId() {
		return get("city_id");
	}

	public M setCityId2(java.lang.Integer cityId2) {
		set("city_id2", cityId2);
		return (M)this;
	}

	public java.lang.Integer getCityId2() {
		return get("city_id2");
	}

	public M setCityId3(java.lang.Integer cityId3) {
		set("city_id3", cityId3);
		return (M)this;
	}

	public java.lang.Integer getCityId3() {
		return get("city_id3");
	}

}
