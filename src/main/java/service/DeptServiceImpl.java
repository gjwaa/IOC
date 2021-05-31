package service;

import dao.DeptDao;

public class DeptServiceImpl implements DeptService{

    private DeptDao deptDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    @Override
    public void getUser() {
        deptDao.getUser();
    }
}
