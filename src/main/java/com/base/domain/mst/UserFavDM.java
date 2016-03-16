
package com.base.domain.mst;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "m_base_user_favs")
public class UserFavDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "USER_FAVID")
	private Long userfavId;
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name = "SCREEN_ID")
	private Long screenId;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastUpdatedDt;
	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;
	@Transient
	private String userName;
	@Transient
	private String screenName;
	@Transient
	private boolean selected;

	public UserFavDM() {

	}

	public UserFavDM(Long userfavId) {
		this.userfavId = userfavId;
	}

	public Long getUserfavId() {
		return userfavId;
	}

	public void setUserfavId(Long userfavId) {
		this.userfavId = userfavId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getScreenId() {
		return screenId;
	}

	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}

	public Date getLastUpdatedDt() {
		return lastUpdatedDt;
	}

	public void setLastUpdatedDt(Date lastUpdatedDt) {
		this.lastUpdatedDt = lastUpdatedDt;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
