package com.fastcampus.ch3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TxService {
    @Autowired
    A1Dao a1Dao;

    @Autowired
    B1Dao b1Dao;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void insertA1WithTx() throws Exception {
        a1Dao.insert(1, 100);
        insertB1WithTx();
        a1Dao.insert(2, 100);
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void insertB1WithTx() throws Exception {
        b1Dao.insert(1, 100);
        b1Dao.insert(1, 200);
    }

    public void insertA1WithoutTx() throws Exception {
        a1Dao.insert(1, 100);
        a1Dao.insert(1, 200);
    }
//    @Transactional //RuntimeException, Error만 rollback
    @Transactional(rollbackFor = Exception.class) //Exception을 rollback
    public void insertA1WithTxFail() throws Exception {
        a1Dao.insert(1, 100);
//        throw new Exception();
//        throw new RuntimeException();
        a1Dao.insert(1, 200);
    }
    @Transactional
    public void insertA1WithTxSucess() throws Exception {
        a1Dao.insert(1, 100);
        a1Dao.insert(2, 200);
    }
}
