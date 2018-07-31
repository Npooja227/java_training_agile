package com.service;

import com.DAO.DocumentDAO;
import com.model.DocumentModel;

import java.sql.SQLException;
import java.util.List;

/**
 * This is DocumentServiceImplementation Class which contains
 * create,retrieve,and delete methods
 */
public class DocumentServiceImpl implements DocumentService {
    DocumentDAO dao = null;
    List<DocumentModel> documentmodel = null;

    /**
     * This is create methods which takes an object as input and pass that object to
     * DAO
     *
     * @param documentmodel
     * @return status
     */
    public int createDocument(DocumentModel documentmodel) {
        dao = new DocumentDAO();
        int status = dao.createDocument(documentmodel);
        return status;
    }

    /**
     * This is retrieve methods which returns a list
     *
     * @return list
     */
    public List<DocumentModel> retreiveDocument() {
        dao = new DocumentDAO();
        documentmodel = dao.retreiveDocument();
        return documentmodel;
    }

    /**
     * This is delete methods which takes id as an input and pass it to the DAO
     *
     * @param id
     * @return status
     */

    public int deleteMultipleDocument(int id) {
        dao = new DocumentDAO();
        int status = 0;
        status = dao.deleteMultipleDocument(id);
        return status;
    }

}