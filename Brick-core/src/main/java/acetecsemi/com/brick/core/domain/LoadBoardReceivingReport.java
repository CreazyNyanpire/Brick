package acetecsemi.com.brick.core.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author harlow
 * @version 1.0
 * @created 09-02-2015 15:27:09
 */
@Entity
@Table(name = "BRICK_LOADBOARDRECREPORT")
public class LoadBoardReceivingReport extends BrickAbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1376428644368634706L;
	@ManyToOne(cascade = { CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinColumn(name = "LOADBOARD_ID", referencedColumnName = "ID")
	private LoadBoard loadBoard;
	private String fileUrl;

	public LoadBoard getLoadBoard() {
		return loadBoard;
	}

	public void setLoadBoard(LoadBoard loadBoard) {
		this.loadBoard = loadBoard;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	@Override
	public String[] businessKeys() {
		return new String[] { String.valueOf(getId()),
				this.getCreateTimestamp().toString() };
	}

}