package com.example.persistancelayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CO_TRIGGERS")
public class CoTriggersEntity {
	@Id
	@GeneratedValue
	@Column
	private Integer trg_id;
	@Column
	private Integer case_num;
	@Column
	private String create_dt;
	@Column
	private String trg_status;
	@Column
	private String update_dt;
	public Integer getTrg_id() {
		return trg_id;
	}
	public void setTrg_id(Integer trg_id) {
		this.trg_id = trg_id;
	}
	public Integer getCase_num() {
		return case_num;
	}
	public void setCase_num(Integer case_num) {
		this.case_num = case_num;
	}
	public String getCreate_dt() {
		return create_dt;
	}
	public void setCreate_dt(String create_dt) {
		this.create_dt = create_dt;
	}
	public String getTrg_status() {
		return trg_status;
	}
	public void setTrg_status(String trg_status) {
		this.trg_status = trg_status;
	}
	public String getUpdate_dt() {
		return update_dt;
	}
	public void setUpdate_dt(String update_dt) {
		this.update_dt = update_dt;
	}

}
