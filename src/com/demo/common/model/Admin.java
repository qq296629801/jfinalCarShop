package com.demo.common.model;

import com.demo.common.model.base.BaseAdmin;
import com.szcarshop.util.MD5Util;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Admin extends BaseAdmin<Admin> {
	public static final Admin dao = new Admin().dao();

	public Admin find(Admin admin) {
		System.out.println(admin.getUserName());
		System.out.println(MD5Util.string2MD5(admin.getPassWord()));
		String sql = "select * from admin where user_name='" + admin.getUserName() + "' and pass_word='"
				+ MD5Util.string2MD5(admin.getPassWord()) + "'";
		return Admin.dao.findFirst(sql);
	}

	public Admin find() {
		String sql = "select a.*,b.name bname from admin a,role b where a.role_id=b.id";
		return Admin.dao.findFirst(sql);
	}
}