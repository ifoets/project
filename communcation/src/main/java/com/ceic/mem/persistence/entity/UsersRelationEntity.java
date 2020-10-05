package com.ceic.mem.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_relation")
public class UsersRelationEntity implements Serializable {
	private static final long serialVersionUID = 3686074225896762417L;

	private String fromUserId;
	private String toUserId;
	private Boolean viewProfile;
	private Date viewProfileTime;
	private Boolean like;
	private Date likeTime;
	private Boolean sendRequest;
	private Date sendRequestTime;
	private Boolean acceptRequest;
	private Date acceptRequestTime;
	private Boolean viewMobile;
	private Date viewMobileTime;
	private Boolean viewEmail;
	private Date viewEmailTime;
	private Boolean sendMail;
	private Date sendMailTime;
	private Boolean block;
	private String mailContent;
	private Boolean requestPicks;
	private Date requestPicksTime;
	private Boolean respondPicks;
	private Date respondPicksTime;
	private Boolean requestFile;
	private Date requestFileTime;
	private Boolean respondFile;
	private Date respondFileTime;
	private Boolean requestHadoop;
	private Date requestHadoopTime;
	private Boolean respondHadoop;
	private Date respondHadoopTime;

	public UsersRelationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "c_from_user_id", unique = true, nullable = false)
	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	@Column(name = "c_to_user_id", nullable = false)
	public String getToUserId() {
		return toUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

	@Column(name = "b_viewed_profile")
	public Boolean getViewProfile() {
		return viewProfile;
	}

	public void setViewProfile(Boolean viewProfile) {
		this.viewProfile = viewProfile;
	}

	@Column(name = "t_viewed_profile_time")
	public Date getViewProfileTime() {
		return viewProfileTime;
	}

	public void setViewProfileTime(Date viewProfileTime) {
		this.viewProfileTime = viewProfileTime;
	}

	@Column(name = "b_like")
	public Boolean getLike() {
		return like;
	}

	public void setLike(Boolean like) {
		this.like = like;
	}

	@Column(name = "t_like_time")
	public Date getLikeTime() {
		return likeTime;
	}

	public void setLikeTime(Date likeTime) {
		this.likeTime = likeTime;
	}

	@Column(name = "b_send_request")
	public Boolean getSendRequest() {
		return sendRequest;
	}

	public void setSendRequest(Boolean sendRequest) {
		this.sendRequest = sendRequest;
	}

	@Column(name = "t_send_request_time")
	public Date getSendRequestTime() {
		return sendRequestTime;
	}

	public void setSendRequestTime(Date sendRequestTime) {
		this.sendRequestTime = sendRequestTime;
	}

	@Column(name = "b_accept_request")
	public Boolean getAcceptRequest() {
		return acceptRequest;
	}

	public void setAcceptRequest(Boolean acceptRequest) {
		this.acceptRequest = acceptRequest;
	}

	@Column(name = "t_accept_request_time")
	public Date getAcceptRequestTime() {
		return acceptRequestTime;
	}

	public void setAcceptRequestTime(Date acceptRequestTime) {
		this.acceptRequestTime = acceptRequestTime;
	}

	@Column(name = "b_viewed_mobile_no")
	public Boolean getViewMobile() {
		return viewMobile;
	}

	public void setViewMobile(Boolean viewMobile) {
		this.viewMobile = viewMobile;
	}

	@Column(name = "t_view_mobile_time")
	public Date getViewMobileTime() {
		return viewMobileTime;
	}

	public void setViewMobileTime(Date viewMobileTime) {
		this.viewMobileTime = viewMobileTime;
	}

	@Column(name = "b_viewed_email")
	public Boolean getViewEmail() {
		return viewEmail;
	}

	public void setViewEmail(Boolean viewEmail) {
		this.viewEmail = viewEmail;
	}

	@Column(name = "t_view_email_time")
	public Date getViewEmailTime() {
		return viewEmailTime;
	}

	public void setViewEmailTime(Date viewEmailTime) {
		this.viewEmailTime = viewEmailTime;
	}

	@Column(name = "b_send_mail")
	public Boolean getSendMail() {
		return sendMail;
	}

	public void setSendMail(Boolean sendMail) {
		this.sendMail = sendMail;
	}

	@Column(name = "t_send_email_time")
	public Date getSendMailTime() {
		return sendMailTime;
	}

	public void setSendMailTime(Date sendMailTime) {
		this.sendMailTime = sendMailTime;
	}

	@Column(name = "b_block")
	public Boolean getBlock() {
		return block;
	}

	public void setBlock(Boolean block) {
		this.block = block;
	}

	@Column(name = "c_mail_content")
	public String getMailContent() {
		return mailContent;
	}

	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}

	@Column(name = "b_request_picks")
	public Boolean getRequestPicks() {
		return requestPicks;
	}

	public void setRequestPicks(Boolean requestPicks) {
		this.requestPicks = requestPicks;
	}

	@Column(name = "t_request_picks_time")
	public Date getRequestPicksTime() {
		return requestPicksTime;
	}

	public void setRequestPicksTime(Date requestPicksTime) {
		this.requestPicksTime = requestPicksTime;
	}

	@Column(name = "b_respond_picks")
	public Boolean getRespondPicks() {
		return respondPicks;
	}

	public void setRespondPicks(Boolean respondPicks) {
		this.respondPicks = respondPicks;
	}

	@Column(name = "t_respond_picks_time")
	public Date getRespondPicksTime() {
		return respondPicksTime;
	}

	public void setRespondPicksTime(Date respondPicksTime) {
		this.respondPicksTime = respondPicksTime;
	}

	@Column(name = "b_request_file")
	public Boolean getRequestFile() {
		return requestFile;
	}

	public void setRequestFile(Boolean requestFile) {
		this.requestFile = requestFile;
	}

	@Column(name = "t_request_file_time")
	public Date getRequestFileTime() {
		return requestFileTime;
	}

	public void setRequestFileTime(Date requestFileTime) {
		this.requestFileTime = requestFileTime;
	}

	@Column(name = "b_respond_file")
	public Boolean getRespondFile() {
		return respondFile;
	}

	public void setRespondFile(Boolean respondFile) {
		this.respondFile = respondFile;
	}

	@Column(name = "t_respond_file_time")
	public Date getRespondFileTime() {
		return respondFileTime;
	}

	public void setRespondFileTime(Date respondFileTime) {
		this.respondFileTime = respondFileTime;
	}

	@Column(name = "b_request_hadoop")
	public Boolean getRequestHadoop() {
		return requestHadoop;
	}

	public void setRequestHadoop(Boolean requestHadoop) {
		this.requestHadoop = requestHadoop;
	}

	@Column(name = "t_request_hadoop_time")
	public Date getRequestHadoopTime() {
		return requestHadoopTime;
	}

	public void setRequestHadoopTime(Date requestHadoopTime) {
		this.requestHadoopTime = requestHadoopTime;
	}

	@Column(name = "b_respond_hadoop")
	public Boolean getrespondHadoop() {
		return respondHadoop;
	}

	public void setrespondHadoop(Boolean respondHadoop) {
		this.respondHadoop = respondHadoop;
	}

	@Column(name = "t_respond_hadoop_time")
	public Date getrespondHadoopTime() {
		return respondHadoopTime;
	}

	public void setrespondHadoopTime(Date respondHadoopTime) {
		this.respondHadoopTime = respondHadoopTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fromUserId == null) ? 0 : fromUserId.hashCode());
		result = prime * result + ((toUserId == null) ? 0 : toUserId.hashCode());
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
		UsersRelationEntity other = (UsersRelationEntity) obj;
		if (fromUserId == null) {
			if (other.fromUserId != null)
				return false;
		} else if (!fromUserId.equals(other.fromUserId))
			return false;
		if (toUserId == null) {
			if (other.toUserId != null)
				return false;
		} else if (!toUserId.equals(other.toUserId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsersRelationEntity [fromUserId=" + fromUserId + ", toUserId=" + toUserId + ", viewProfile="
				+ viewProfile + ", viewProfileTime=" + viewProfileTime + ", like=" + like + ", likeTime=" + likeTime
				+ ", sendRequest=" + sendRequest + ", sendRequestTime=" + sendRequestTime + ", acceptRequest="
				+ acceptRequest + ", acceptRequestTime=" + acceptRequestTime + ", viewMobile=" + viewMobile
				+ ", viewMobileTime=" + viewMobileTime + ", viewEmail=" + viewEmail + ", viewEmailTime=" + viewEmailTime
				+ ", sendMail=" + sendMail + ", sendMailTime=" + sendMailTime + ", block=" + block + ", mailContent="
				+ mailContent + ", requestPicks=" + requestPicks + ", requestPicksTime=" + requestPicksTime
				+ ", respondPicks=" + respondPicks + ", respondPicksTime=" + respondPicksTime + ", requestFile="
				+ requestFile + ", requestFileTime=" + requestFileTime + ", respondFile=" + respondFile
				+ ", respondFileTime=" + respondFileTime + ", requestHadoop=" + requestHadoop + ", requestHadoopTime="
				+ requestHadoopTime + ", respondHadoop=" + respondHadoop + ", respondHadoopTime=" + respondHadoopTime
				+ "]";
	}

}
