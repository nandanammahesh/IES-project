package com.example.persistancelayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.mail.iap.ByteArray;

@Entity
@Table(name = "CO_PDFS")
public class CoPdfEntity {
	@Id
	@Column
	@GeneratedValue
	private Integer co_pdf_id;
	@Column
	private String plan_status;
	@Column
	private Integer case_number;
	@Column
	private byte[] pdf_document;
	@Column
	private String plan_name;

	public Integer getCo_pdf_id() {
		return co_pdf_id;
	}

	public void setCo_pdf_id(Integer co_pdf_id) {
		this.co_pdf_id = co_pdf_id;
	}

	public String getPlan_status() {
		return plan_status;
	}

	public void setPlan_status(String plan_status) {
		this.plan_status = plan_status;
	}

	public Integer getCase_number() {
		return case_number;
	}

	public void setCase_number(Integer case_number) {
		this.case_number = case_number;
	}

	public byte[] getPdf_document() {
		return pdf_document;
	}

	public void setPdf_document(byte[] pdf_document) {
		this.pdf_document = pdf_document;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

}
