package Spring5_02.service;

import Spring5_02.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney(){

            //少100
            userDao.reduceMoney();

            //多100
            userDao.addMoney();




//        try{
//            //1开启事务
//
//            //2进行业务操作
//            //少100
//            userDao.reduceMoney();
//            //多100
//            userDao.addMoney();
//            //3 没有异常，提交事务
//        }catch (Exception e){
//            //4 出现异常，事务回滚
//        }
    }
}
