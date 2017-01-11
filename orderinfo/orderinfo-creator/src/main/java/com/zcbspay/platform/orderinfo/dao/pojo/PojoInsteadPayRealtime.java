package com.zcbspay.platform.orderinfo.dao.pojo;

// Generated 2016-10-13 9:21:58 by Hibernate Tools 4.0.0

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TInsteadPayRealtime generated by hbm2java
 */
@Entity
@Table(name = "T_INSTEAD_PAY_REALTIME")
public class PojoInsteadPayRealtime implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String txnseqno;
	private String status;
	private String coopInstCode;
	private String merId;
	private String merName;
	private String merNameAbbr;
	private String accType;
	private String payAccNo;
	private String payAccName;
	private String payBankType;
	private String payBankName;
	private String accNo;
	private String accName;
	private String bankType;
	private String bankName;
	private String province;
	private String city;
	private String certifyType;
	private String certifyNo;
	private String mobile;
	private String frontUrl;
	private String backUrl;
	private Long transAmt;
	private Long txnFee;
	private String currencyCode;
	private String remark;
	private String resv;
	private String orderno;
	private String orderCommiTime;
	private String orderDesc;
	private String txnType;
	private String txnSubType;
	private String bizType;
	private String tn;
	private String retCode;
	private String retInfo;
	private Date createTime;
	private Date updateTime;
	private String notes;
	private String remarks;

	public PojoInsteadPayRealtime() {
	}

	public PojoInsteadPayRealtime(Long id) {
		this.id = id;
	}

	public PojoInsteadPayRealtime(Long id, String accType, String accNo,
			String accName, String bankType, String bankName, String province,
			String city, String certifyType, String certifyNo, String mobile,
			String frontUrl, String backUrl, Long transAmt,
			String currencyCode, String remark, String resv, String txnseqno,
			String status, String orderno, String orderCommiTime,
			String orderDesc, String coopInstCode, String merId,
			String merName, String merNameAbbr, String txnType,
			String txnSubType, String bizType, String tn, String retCode,
			String retInfo, Date createTime, Date updateTime, String notes,
			String remarks) {
		this.id = id;
		this.accType = accType;
		this.accNo = accNo;
		this.accName = accName;
		this.bankType = bankType;
		this.bankName = bankName;
		this.province = province;
		this.city = city;
		this.certifyType = certifyType;
		this.certifyNo = certifyNo;
		this.mobile = mobile;
		this.frontUrl = frontUrl;
		this.backUrl = backUrl;
		this.transAmt = transAmt;
		this.currencyCode = currencyCode;
		this.remark = remark;
		this.resv = resv;
		this.txnseqno = txnseqno;
		this.status = status;
		this.orderno = orderno;
		this.orderCommiTime = orderCommiTime;
		this.orderDesc = orderDesc;
		this.coopInstCode = coopInstCode;
		this.merId = merId;
		this.merName = merName;
		this.merNameAbbr = merNameAbbr;
		this.txnType = txnType;
		this.txnSubType = txnSubType;
		this.bizType = bizType;
		this.tn = tn;
		this.retCode = retCode;
		this.retInfo = retInfo;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.notes = notes;
		this.remarks = remarks;
	}

	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_instead_pay_realtime") 
	 @SequenceGenerator(name="seq_instead_pay_realtime",sequenceName="SEQ_INSTEAD_PAY_REALTIME",allocationSize=1)
	@Column(name = "ID", unique = true, nullable = false, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "ACC_TYPE", length = 2)
	public String getAccType() {
		return this.accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	@Column(name = "ACC_NO", length = 40)
	public String getAccNo() {
		return this.accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	@Column(name = "ACC_NAME", length = 128)
	public String getAccName() {
		return this.accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	@Column(name = "BANK_TYPE", length = 12)
	public String getBankType() {
		return this.bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	@Column(name = "BANK_NAME", length = 128)
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "PROVINCE", length = 20)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "CITY", length = 20)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "CERTIFY_TYPE", length = 2)
	public String getCertifyType() {
		return this.certifyType;
	}

	public void setCertifyType(String certifyType) {
		this.certifyType = certifyType;
	}

	@Column(name = "CERTIFY_NO", length = 20)
	public String getCertifyNo() {
		return this.certifyNo;
	}

	public void setCertifyNo(String certifyNo) {
		this.certifyNo = certifyNo;
	}

	@Column(name = "MOBILE", length = 20)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "FRONT_URL", length = 256)
	public String getFrontUrl() {
		return this.frontUrl;
	}

	public void setFrontUrl(String frontUrl) {
		this.frontUrl = frontUrl;
	}

	@Column(name = "BACK_URL", length = 256)
	public String getBackUrl() {
		return this.backUrl;
	}

	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	@Column(name = "TRANS_AMT", scale = 0)
	public Long getTransAmt() {
		return this.transAmt;
	}

	public void setTransAmt(Long transAmt) {
		this.transAmt = transAmt;
	}

	@Column(name = "CURRENCY_CODE", length = 3)
	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@Column(name = "REMARK", length = 64)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "RESV", length = 512)
	public String getResv() {
		return this.resv;
	}

	public void setResv(String resv) {
		this.resv = resv;
	}

	@Column(name = "TXNSEQNO", length = 16)
	public String getTxnseqno() {
		return this.txnseqno;
	}

	public void setTxnseqno(String txnseqno) {
		this.txnseqno = txnseqno;
	}

	@Column(name = "STATUS", length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "ORDERNO", length = 40)
	public String getOrderno() {
		return this.orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	@Column(name = "ORDER_COMMI_TIME", length = 14)
	public String getOrderCommiTime() {
		return this.orderCommiTime;
	}

	public void setOrderCommiTime(String orderCommiTime) {
		this.orderCommiTime = orderCommiTime;
	}

	@Column(name = "ORDER_DESC", length = 128)
	public String getOrderDesc() {
		return this.orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	@Column(name = "COOP_INST_CODE", length = 15)
	public String getCoopInstCode() {
		return this.coopInstCode;
	}

	public void setCoopInstCode(String coopInstCode) {
		this.coopInstCode = coopInstCode;
	}

	@Column(name = "MER_ID", length = 15)
	public String getMerId() {
		return this.merId;
	}

	public void setMerId(String merId) {
		this.merId = merId;
	}

	@Column(name = "MER_NAME", length = 64)
	public String getMerName() {
		return this.merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}

	@Column(name = "MER_NAME_ABBR", length = 64)
	public String getMerNameAbbr() {
		return this.merNameAbbr;
	}

	public void setMerNameAbbr(String merNameAbbr) {
		this.merNameAbbr = merNameAbbr;
	}

	@Column(name = "TXN_TYPE", length = 2)
	public String getTxnType() {
		return this.txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	@Column(name = "TXN_SUB_TYPE", length = 2)
	public String getTxnSubType() {
		return this.txnSubType;
	}

	public void setTxnSubType(String txnSubType) {
		this.txnSubType = txnSubType;
	}

	@Column(name = "BIZ_TYPE", length = 3)
	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	@Column(name = "TN", length = 64)
	public String getTn() {
		return this.tn;
	}

	public void setTn(String tn) {
		this.tn = tn;
	}

	@Column(name = "RET_CODE", length = 8)
	public String getRetCode() {
		return this.retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	@Column(name = "RET_INFO", length = 256)
	public String getRetInfo() {
		return this.retInfo;
	}

	public void setRetInfo(String retInfo) {
		this.retInfo = retInfo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATE_TIME", length = 7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATE_TIME", length = 7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "NOTES", length = 128)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "REMARKS", length = 128)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Column(name = "TXN_FEE", scale = 0)
	public Long getTxnFee() {
		return txnFee;
	}

	public void setTxnFee(Long txnFee) {
		this.txnFee = txnFee;
	}
	@Column(name = "PAY_ACC_NO", length = 40)
	public String getPayAccNo() {
		return payAccNo;
	}

	public void setPayAccNo(String payAccNo) {
		this.payAccNo = payAccNo;
	}
	@Column(name = "PAY_ACC_NAME", length = 128)
	public String getPayAccName() {
		return payAccName;
	}

	public void setPayAccName(String payAccName) {
		this.payAccName = payAccName;
	}
	@Column(name = "PAY_BANK_TYPE", length = 12)
	public String getPayBankType() {
		return payBankType;
	}

	public void setPayBankType(String payBankType) {
		this.payBankType = payBankType;
	}
	@Column(name = "PAY_BANK_NAME", length = 128)
	public String getPayBankName() {
		return payBankName;
	}

	public void setPayBankName(String payBankName) {
		this.payBankName = payBankName;
	}
	
	
	

	
}
