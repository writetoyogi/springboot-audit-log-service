package org.dnyanyog.dto;

public class AuditLogResponse {
	
	private Long id;	
	private String status;
	private String message;


	public static AuditLogResponse getInstance() {
		return new AuditLogResponse();
	}


	public Long getId() {
		return id;
	}

	public AuditLogResponse setId(Long id) {
		this.id = id;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public AuditLogResponse setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public AuditLogResponse setMessage(String message) {
		this.message = message;
		return this;
	}

}
