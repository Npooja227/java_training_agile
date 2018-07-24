package com.event.dao;

import com.event.model.ModelDeal;

import java.util.List;

public interface DAODeal {

     String createDAO(ModelDeal deal);
    List<ModelDeal> retriveDAO(String name);
    int deleteDAO(int id);
    int updateDAO(ModelDeal deal);
}
