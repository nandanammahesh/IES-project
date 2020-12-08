package com.example.persistancelayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BATCH_RUN_DTLS")
public class BatchRunDtlsEntity {
	@Id
	@Column
	@GeneratedValue
	private Integer batch_run_seq; 
	@Column
	private String batch_name;
	@Column
	private String batch_run_status;
	@Column
	private String end_date;
	@Column
	private Integer instance_num;
	@Column
	private String start_date;
	public Integer getBatch_run_seq() {
		return batch_run_seq;
	}
	public void setBatch_run_seq(Integer batch_run_seq) {
		this.batch_run_seq = batch_run_seq;
	}
	public String getBatch_name() {
		return batch_name;
	}
	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}
	public String getBatch_run_status() {
		return batch_run_status;
	}
	public void setBatch_run_status(String batch_run_status) {
		this.batch_run_status = batch_run_status;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public Integer getInstance_num() {
		return instance_num;
	}
	public void setInstance_num(Integer instance_num) {
		this.instance_num = instance_num;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

}
