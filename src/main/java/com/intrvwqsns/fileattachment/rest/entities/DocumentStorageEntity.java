package com.intrvwqsns.fileattachment.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "merchant_document")
@Data
public class DocumentStorageEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "document_id")
	private Integer documentId;

	@Column(name = "user_id")
	private Integer UserId;

	@Column(name = "file_name")
	private String fileName;

	@Column(name = "document_type")
	private String documentType;

}
