package com.demo.common.model;

import java.util.List;

import com.demo.common.model.base.BaseSerie;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Serie extends BaseSerie<Serie> {
	public static final Serie dao = new Serie().dao();

	public List<Serie> find(int brand_id) {
		String sql = "select * from serie where brand_id=" + brand_id;
		return dao.find(sql);
	}
}
