
package com.base.domain.mst;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="m_base_app_scrn_fields")
public class AppScreenFieldsDM implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "SCR_FLD_REF")
	 private Long screenFieldId;
	
	@JoinColumn(name = "SCREEN_ID", referencedColumnName = "SCREEN_ID")
    @ManyToOne(fetch = FetchType.EAGER)
	private AppScreensDM appScreenId;
	
	@Column(name="FIELD_CODE")
	private String fieldCode;
	
	@Column(name="FIELD_DESC")
	private String fieldDescription;
	
	@Column(name = "FIELD_STATUS")
	 private String status;
	
	@Transient
	private String screenName;
	
	public String getScreenName() {
		if(appScreenId!=null) {
		return appScreenId.getScreencode();
		} else {
			return null;
		}
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	public Long getScreenFieldId() {
		return screenFieldId;
	}
	public void setScreenFieldId(Long screenFieldId) {
		this.screenFieldId = screenFieldId;
	}

	public AppScreensDM getAppScreenId() {
		return appScreenId;
	}

	public void setAppScreenId(AppScreensDM appScreenId) {
		this.appScreenId = appScreenId;
	}

	public String getFieldCode() {
		return fieldCode;
	}

	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}

	public String getFieldDescription() {
		return fieldDescription;
	}

	public void setFieldDescription(String fieldDescription) {
		this.fieldDescription = fieldDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
