package com.demo.common.model;

import java.util.List;

import com.demo.common.model.base.BaseGearbox;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Gearbox extends BaseGearbox<Gearbox> {
	public static final Gearbox dao = new Gearbox().dao();

	public List<Gearbox> find() {
		String sql = "SELECT * from gearbox";
		return Gearbox.dao.find(sql);
	}
}