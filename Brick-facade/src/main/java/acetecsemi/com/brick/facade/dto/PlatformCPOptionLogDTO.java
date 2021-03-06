package acetecsemi.com.brick.facade.dto;

import java.util.Date;

import java.io.Serializable;

public class PlatformCPOptionLogDTO implements Serializable {

	private Long id;

	private int version;

	private String optUser;

	private String grossDie;

	private String chipSelection;

	private Date endTime;

	private Long touchTimes;

	private Date startTime;

	private Date createTimestamp;

	private Date createTimestampEnd;

	private String inkType;

	private String pcNo;

	private String completedChip;

	private Date optDate;

	private Date optDateEnd;

	private String status;

	private String productModel;

	private String endOptUser;

	private Date lastModifyTimestamp;

	private Date lastModifyTimestampEnd;

	private String team;

	private String standardWorkHours;

	private String nowStation;

	private String lastModifyEmployNo;

	private Long duration;

	private String category;

	private String createEmployNo;

	private String subStatus;

	private String chipSelectionRemark;

	private String optRemark;

	private String completedChipDescription;

	private String nowLot;

	private String theoryTime;

	private String isShift;

	public void setOptUser(String optUser) {
		this.optUser = optUser;
	}

	public String getOptUser() {
		return this.optUser;
	}

	public void setGrossDie(String grossDie) {
		this.grossDie = grossDie;
	}

	public String getGrossDie() {
		return this.grossDie;
	}

	public void setChipSelection(String chipSelection) {
		this.chipSelection = chipSelection;
	}

	public String getChipSelection() {
		return this.chipSelection;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setTouchTimes(Long touchTimes) {
		this.touchTimes = touchTimes;
	}

	public Long getTouchTimes() {
		return this.touchTimes;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Date getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestampEnd(Date createTimestampEnd) {
		this.createTimestampEnd = createTimestampEnd;
	}

	public Date getCreateTimestampEnd() {
		return this.createTimestampEnd;
	}

	public void setInkType(String inkType) {
		this.inkType = inkType;
	}

	public String getInkType() {
		return this.inkType;
	}

	public void setPcNo(String pcNo) {
		this.pcNo = pcNo;
	}

	public String getPcNo() {
		return this.pcNo;
	}

	public void setCompletedChip(String completedChip) {
		this.completedChip = completedChip;
	}

	public String getCompletedChip() {
		return this.completedChip;
	}

	public void setOptDate(Date optDate) {
		this.optDate = optDate;
	}

	public Date getOptDate() {
		return this.optDate;
	}

	public void setOptDateEnd(Date optDateEnd) {
		this.optDateEnd = optDateEnd;
	}

	public Date getOptDateEnd() {
		return this.optDateEnd;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getProductModel() {
		return this.productModel;
	}

	public void setEndOptUser(String endOptUser) {
		this.endOptUser = endOptUser;
	}

	public String getEndOptUser() {
		return this.endOptUser;
	}

	public void setLastModifyTimestamp(Date lastModifyTimestamp) {
		this.lastModifyTimestamp = lastModifyTimestamp;
	}

	public Date getLastModifyTimestamp() {
		return this.lastModifyTimestamp;
	}

	public void setLastModifyTimestampEnd(Date lastModifyTimestampEnd) {
		this.lastModifyTimestampEnd = lastModifyTimestampEnd;
	}

	public Date getLastModifyTimestampEnd() {
		return this.lastModifyTimestampEnd;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getTeam() {
		return this.team;
	}

	public void setStandardWorkHours(String standardWorkHours) {
		this.standardWorkHours = standardWorkHours;
	}

	public String getStandardWorkHours() {
		return this.standardWorkHours;
	}

	public void setNowStation(String nowStation) {
		this.nowStation = nowStation;
	}

	public String getNowStation() {
		return this.nowStation;
	}

	public void setLastModifyEmployNo(String lastModifyEmployNo) {
		this.lastModifyEmployNo = lastModifyEmployNo;
	}

	public String getLastModifyEmployNo() {
		return this.lastModifyEmployNo;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCreateEmployNo(String createEmployNo) {
		this.createEmployNo = createEmployNo;
	}

	public String getCreateEmployNo() {
		return this.createEmployNo;
	}

	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

	public String getSubStatus() {
		return this.subStatus;
	}

	public void setChipSelectionRemark(String chipSelectionRemark) {
		this.chipSelectionRemark = chipSelectionRemark;
	}

	public String getChipSelectionRemark() {
		return this.chipSelectionRemark;
	}

	public void setOptRemark(String optRemark) {
		this.optRemark = optRemark;
	}

	public String getOptRemark() {
		return this.optRemark;
	}

	public void setCompletedChipDescription(String completedChipDescription) {
		this.completedChipDescription = completedChipDescription;
	}

	public String getCompletedChipDescription() {
		return this.completedChipDescription;
	}

	public void setNowLot(String nowLot) {
		this.nowLot = nowLot;
	}

	public String getNowLot() {
		return this.nowLot;
	}

	public void setTheoryTime(String theoryTime) {
		this.theoryTime = theoryTime;
	}

	public String getTheoryTime() {
		return this.theoryTime;
	}

	public void setIsShift(String isShift) {
		this.isShift = isShift;
	}

	public String getIsShift() {
		return this.isShift;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlatformCPOptionLogDTO other = (PlatformCPOptionLogDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}