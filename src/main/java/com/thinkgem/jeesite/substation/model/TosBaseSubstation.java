package com.thinkgem.jeesite.substation.model;

import java.io.Serializable;

/**
 * 
 * {厂站实体类}
 * @author Zhu Jia
 * @mail 490618067@qq.com
 * @created 2015-12-1 上午1:43:30
 * @lastModify 2015-12-1 上午1:43:30
 * @version 1.0
 */
public class TosBaseSubstation implements Serializable{

	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 10086L;

	private String id;
	
	/**
	 * UIP标识
	 */
	private String mrid;
	
	/**
	 * 英文名字
	 */
	private String ename;
	
	/**
	 * 中文名字
	 */
	private String cname;
	
	/**
	 * 电压等级
	 */
	private float voltage;
	
	/**
	 * 生效时间
	 */
	private String validate;
	
	/**
	 * 失效时间
	 */
	private String invalidate;
	
	/**
	 * 所属区域
	 */
	private String area;
	
	/**
	 * 数据来源
	 */
	private String source;
	
	/**
	 * 编码
	 */
	private String code;
	
	/**
	 * 名称
	 */
	private String fullName;
	
	/**
	 * 调度关系
	 * 1：国调 2：网调 3：省调
	 */
	private String dispatchRelation;
	
	/**
	 * 资产关系
	 */
	private String assetRelation;
	
	/**
	 * 所在地市供电公司
	 */
	private String powerSupplyCompany;
	
	/**
	 * 负责人
	 */
	private String leader;
	
	/**
	 * 电话
	 */
	private String phone;
	
	/**
	 * 传真
	 */
	private String fax;
	
	/**
	 * 手机号码
	 */
	private String mobile;
	
	/**
	 * 电子邮箱
	 */
	private String eMail;
	
	/**
	 * 地址
	 */
	private String address;
	
	/**
	 * 邮编
	 */
	private String zipCode;
	
	/**
	 * 类型
	 * 1：跨区 2：跨省 3：联络变 4：电厂
	 */
	private String kind;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMrid() {
		return mrid;
	}

	public void setMrid(String mrid) {
		this.mrid = mrid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public float getVoltage() {
		return voltage;
	}

	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}

	public String getValidate() {
		return validate;
	}

	public void setValidate(String validate) {
		this.validate = validate;
	}

	public String getInvalidate() {
		return invalidate;
	}

	public void setInvalidate(String invalidate) {
		this.invalidate = invalidate;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDispatchRelation() {
		return dispatchRelation;
	}

	public void setDispatchRelation(String dispatchRelation) {
		this.dispatchRelation = dispatchRelation;
	}

	public String getAssetRelation() {
		return assetRelation;
	}

	public void setAssetRelation(String assetRelation) {
		this.assetRelation = assetRelation;
	}

	public String getPowerSupplyCompany() {
		return powerSupplyCompany;
	}

	public void setPowerSupplyCompany(String powerSupplyCompany) {
		this.powerSupplyCompany = powerSupplyCompany;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
}
