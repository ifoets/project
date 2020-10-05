package com.ciec.mem.dto;

import java.io.Serializable;
import java.util.Date;

public class UsersRelationDTO implements Serializable {

	private static final long serialVersionUID = 3686074225896762415L;

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

	public UsersRelationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersRelationDTO(String fromUserId, String toUserId, Boolean viewProfile, Date viewProfileTime, Boolean like,
			Date likeTime, Boolean sendRequest, Date sendRequestTime, Boolean acceptRequest, Date acceptRequestTime,
			Boolean viewMobile, Date viewMobileTime, Boolean viewEmail, Date viewEmailTime, Boolean sendMail,
			Date sendMailTime, Boolean block, String mailContent, Boolean requestPicks, Date requestPicksTime,
			Boolean respondPicks, Date respondPicksTime, Boolean requestFile, Date requestFileTime, Boolean respondFile,
			Date respondFileTime, Boolean requestHadoop, Date requestHadoopTime, Boolean respondHadoop,
			Date respondHadoopTime) {
		super();
		this.fromUserId = fromUserId;
		this.toUserId = toUserId;
		this.viewProfile = viewProfile;
		this.viewProfileTime = viewProfileTime;
		this.like = like;
		this.likeTime = likeTime;
		this.sendRequest = sendRequest;
		this.sendRequestTime = sendRequestTime;
		this.acceptRequest = acceptRequest;
		this.acceptRequestTime = acceptRequestTime;
		this.viewMobile = viewMobile;
		this.viewMobileTime = viewMobileTime;
		this.viewEmail = viewEmail;
		this.viewEmailTime = viewEmailTime;
		this.sendMail = sendMail;
		this.sendMailTime = sendMailTime;
		this.block = block;
		this.mailContent = mailContent;
		this.requestPicks = requestPicks;
		this.requestPicksTime = requestPicksTime;
		this.respondPicks = respondPicks;
		this.respondPicksTime = respondPicksTime;
		this.requestFile = requestFile;
		this.requestFileTime = requestFileTime;
		this.respondFile = respondFile;
		this.respondFileTime = respondFileTime;
		this.requestHadoop = requestHadoop;
		this.requestHadoopTime = requestHadoopTime;
		this.respondHadoop = respondHadoop;
		this.respondHadoopTime = respondHadoopTime;
	}

	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getToUserId() {
		return toUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

	public Boolean getViewProfile() {
		return viewProfile;
	}

	public void setViewProfile(Boolean viewProfile) {
		this.viewProfile = viewProfile;
	}

	public Date getViewProfileTime() {
		return viewProfileTime;
	}

	public void setViewProfileTime(Date viewProfileTime) {
		this.viewProfileTime = viewProfileTime;
	}

	public Boolean getLike() {
		return like;
	}

	public void setLike(Boolean like) {
		this.like = like;
	}

	public Date getLikeTime() {
		return likeTime;
	}

	public void setLikeTime(Date likeTime) {
		this.likeTime = likeTime;
	}

	public Boolean getSendRequest() {
		return sendRequest;
	}

	public void setSendRequest(Boolean sendRequest) {
		this.sendRequest = sendRequest;
	}

	public Date getSendRequestTime() {
		return sendRequestTime;
	}

	public void setSendRequestTime(Date sendRequestTime) {
		this.sendRequestTime = sendRequestTime;
	}

	public Boolean getAcceptRequest() {
		return acceptRequest;
	}

	public void setAcceptRequest(Boolean acceptRequest) {
		this.acceptRequest = acceptRequest;
	}

	public Date getAcceptRequestTime() {
		return acceptRequestTime;
	}

	public void setAcceptRequestTime(Date acceptRequestTime) {
		this.acceptRequestTime = acceptRequestTime;
	}

	public Boolean getViewMobile() {
		return viewMobile;
	}

	public void setViewMobile(Boolean viewMobile) {
		this.viewMobile = viewMobile;
	}

	public Date getViewMobileTime() {
		return viewMobileTime;
	}

	public void setViewMobileTime(Date viewMobileTime) {
		this.viewMobileTime = viewMobileTime;
	}

	public Boolean getViewEmail() {
		return viewEmail;
	}

	public void setViewEmail(Boolean viewEmail) {
		this.viewEmail = viewEmail;
	}

	public Date getViewEmailTime() {
		return viewEmailTime;
	}

	public void setViewEmailTime(Date viewEmailTime) {
		this.viewEmailTime = viewEmailTime;
	}

	public Boolean getSendMail() {
		return sendMail;
	}

	public void setSendMail(Boolean sendMail) {
		this.sendMail = sendMail;
	}

	public Date getSendMailTime() {
		return sendMailTime;
	}

	public void setSendMailTime(Date sendMailTime) {
		this.sendMailTime = sendMailTime;
	}

	public Boolean getBlock() {
		return block;
	}

	public void setBlock(Boolean block) {
		this.block = block;
	}

	public String getMailContent() {
		return mailContent;
	}

	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}

	public Boolean getRequestPicks() {
		return requestPicks;
	}

	public void setRequestPicks(Boolean requestPicks) {
		this.requestPicks = requestPicks;
	}

	public Date getRequestPicksTime() {
		return requestPicksTime;
	}

	public void setRequestPicksTime(Date requestPicksTime) {
		this.requestPicksTime = requestPicksTime;
	}

	public Boolean getRespondPicks() {
		return respondPicks;
	}

	public void setRespondPicks(Boolean respondPicks) {
		this.respondPicks = respondPicks;
	}

	public Date getRespondPicksTime() {
		return respondPicksTime;
	}

	public void setRespondPicksTime(Date respondPicksTime) {
		this.respondPicksTime = respondPicksTime;
	}

	public Boolean getRequestFile() {
		return requestFile;
	}

	public void setRequestFile(Boolean requestFile) {
		this.requestFile = requestFile;
	}

	public Date getRequestFileTime() {
		return requestFileTime;
	}

	public void setRequestFileTime(Date requestFileTime) {
		this.requestFileTime = requestFileTime;
	}

	public Boolean getRespondFile() {
		return respondFile;
	}

	public void setRespondFile(Boolean respondFile) {
		this.respondFile = respondFile;
	}

	public Date getRespondFileTime() {
		return respondFileTime;
	}

	public void setRespondFileTime(Date respondFileTime) {
		this.respondFileTime = respondFileTime;
	}

	public Boolean getRequestHadoop() {
		return requestHadoop;
	}

	public void setRequestHadoop(Boolean requestHadoop) {
		this.requestHadoop = requestHadoop;
	}

	public Date getRequestHadoopTime() {
		return requestHadoopTime;
	}

	public void setRequestHadoopTime(Date requestHadoopTime) {
		this.requestHadoopTime = requestHadoopTime;
	}

	public Boolean getrespondHadoop() {
		return respondHadoop;
	}

	public void setrespondHadoop(Boolean respondHadoop) {
		this.respondHadoop = respondHadoop;
	}

	public Date getrespondHadoopTime() {
		return respondHadoopTime;
	}

	public void setrespondHadoopTime(Date respondHadoopTime) {
		this.respondHadoopTime = respondHadoopTime;
	}

	@Override
	public String toString() {
		return "UsersRelationDTO [fromUserId=" + fromUserId + ", toUserId=" + toUserId + ", viewProfile=" + viewProfile
				+ ", viewProfileTime=" + viewProfileTime + ", like=" + like + ", likeTime=" + likeTime
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
