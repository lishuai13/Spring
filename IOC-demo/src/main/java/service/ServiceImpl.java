package service;

import dao.Dao;


public class ServiceImpl implements Service{

    private Dao dao ;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    public void show() {
        dao.show();
    }
}

