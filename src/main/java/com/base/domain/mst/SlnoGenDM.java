
package com.base.domain.mst;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_base_slno_gen")
public class SlnoGenDM implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -237229254968979147L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "SLNO_ID")
	private Long slnoId;
	@Column(name = "COMPANY_ID")
	private Long companyId;
	@Column(name = "BRANCH_ID")
	private Long branchId;
	@Column(name = "MODULE_ID")
	private Long moduleId;
	@Column(name = "SLNOGEN_LEVEL")
	private String slnogenLevel;
	@Column(name = "REF_KEY")
	private String refKey;
	@Column(name = "KEY_DESC")
	private String keyDesc;
	@Column(name = "AUTOGEN_YN")
	private String autoGenYN;
	@Column(name = "PREFIX_KEY")
	private String prefixKey;
	@Column(name = "PREFIX_CNCAT")
	private String prefixCncat;
	@Column(name = "SUFFIX_KEY")
	private String suffixKey;
	@Column(name = "SUFFIX_CNCAT")
	private String suffixCncat;
	@Column(name = "CURR_SEQNO")
	private Long currSeqNo;
	@Column(name = "LAST_SEQ_NO")
	private String lastSeqNo;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastUpdatedDt;
	@Column(name = "LAST_UPDATED_BY")
	private String lastupdatedby;
	@Transient
	private String moduleName;
	@Transient
	private String slnoName;
	@Transient
	private String branchName;

	public SlnoGenDM() {

	}

	public SlnoGenDM(Long slnoId, Long companyId) {
		this.slnoId = slnoId;
		this.companyId = companyId;

	}

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public String getKeyDesc() {
		return keyDesc;
	}

	public void setKeyDesc(String keyDesc) {
		this.keyDesc = keyDesc;
	}

	public String getAutoGenYN() {
		return autoGenYN;
	}

	public void setAutoGenYN(String autoGenYN) {
		this.autoGenYN = autoGenYN;
	}

	public Long getSlnoId() {
		return slnoId;
	}

	public void setSlnoId(Long slnoId) {
		this.slnoId = slnoId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getRefKey() {
		return refKey;
	}

	public String getSlnogenLevel() {
		return slnogenLevel;
	}

	public void setSlnogenLevel(String slnogenLevel) {
		this.slnogenLevel = slnogenLevel;
	}

	public void setRefKey(String refKey) {
		this.refKey = refKey;
	}

	public String getPrefixKey() {
		return prefixKey;
	}

	public void setPrefixKey(String prefixKey) {
		this.prefixKey = prefixKey;
	}

	public String getPrefixCncat() {
		return prefixCncat;
	}

	public void setPrefixCncat(String prefixCncat) {
		this.prefixCncat = prefixCncat;
	}

	public String getSuffixKey() {
		return suffixKey;
	}

	public void setSuffixKey(String suffixKey) {
		this.suffixKey = suffixKey;
	}

	public String getSuffixCncat() {
		return suffixCncat;
	}

	public void setSuffixCncat(String suffixCncat) {
		this.suffixCncat = suffixCncat;
	}

	public Long getCurrSeqNo() {
		return currSeqNo;
	}

	public void setCurrSeqNo(Long currSeqNo) {
		this.currSeqNo = currSeqNo;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getLastSeqNo() {
		return lastSeqNo;
	}

	public void setLastSeqNo(String lastSeqNo) {
		this.lastSeqNo = lastSeqNo;
	}

	public String getLastUpdatedDt() {
		if (lastUpdatedDt != null) {
			return DateUtils.datetostringtime(lastUpdatedDt);
		} else {
			return "";
		}
	}

	public void setLastUpdatedDt(Date lastUpdatedDt) {
		this.lastUpdatedDt = lastUpdatedDt;
	}

	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getSlnoName() {
		return slnoName;
	}

	public void setSlnoName(String slnoName) {
		this.slnoName = slnoName;
	}
}
