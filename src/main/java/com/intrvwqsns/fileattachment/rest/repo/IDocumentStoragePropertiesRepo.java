package com.intrvwqsns.fileattachment.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.intrvwqsns.fileattachment.rest.entities.DocumentStorageEntity;

public interface IDocumentStoragePropertiesRepo extends JpaRepository<DocumentStorageEntity, Integer> {

    @Query("Select a from DocumnentStorageProperties a where user_id = ?1 and document_type = ?2")
    DocumentStorageEntity checkDocumentByUserId(Integer userId, String docType);
    
    @Query("Select fileName from DocumnentStorageProperties a where user_id = ?1 and document_type = ?2")
    String getUploadDocumnetPath(Integer userId, String docType);
}
