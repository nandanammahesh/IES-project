package com.example.persistancelayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ELIGIBILITY_DETAILS")
public class EligibilityDtlsEntity {
    @Id
    @GeneratedValue
    @Column
	private Integer ed_trace_id;
    @Column
	private String benefit_amt;
    @Column
	private Integer case_num;
    @Column
    private String create_dt;
    @Column
    private String denial_reason;
    @Column
    private String plan_end_dt;
    @Column
    private String plan_name;
    @Column
    private String plan_start_dt;
    @Column
    private String plan_status;
    @Column
    private String update_dt;
    public Integer getEd_trace_id() {
		return ed_trace_id;
	}
	public void setEd_trace_id(Integer ed_trace_id) {
		this.ed_trace_id = ed_trace_id;
	}
	public String getBenefit_amt() {
		return benefit_amt;
	}
	public void setBenefit_amt(String benefit_amt) {
		this.benefit_amt = benefit_amt;
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
	public String getDenial_reason() {
		return denial_reason;
	}
	public void setDenial_reason(String denial_reason) {
		this.denial_reason = denial_reason;
	}
	public String getPlan_end_dt() {
		return plan_end_dt;
	}
	public void setPlan_end_dt(String plan_end_dt) {
		this.plan_end_dt = plan_end_dt;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public String getPlan_start_dt() {
		return plan_start_dt;
	}
	public void setPlan_start_dt(String plan_start_dt) {
		this.plan_start_dt = plan_start_dt;
	}
	public String getPlan_status() {
		return plan_status;
	}
	public void setPlan_status(String plan_status) {
		this.plan_status = plan_status;
	}
	public String getUpdate_dt() {
		return update_dt;
	}
	public void setUpdate_dt(String update_dt) {
		this.update_dt = update_dt;
	}
	
}
