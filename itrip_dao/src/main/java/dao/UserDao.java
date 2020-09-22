package dao;

import cn.beans.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> getUserByInfo(int pageIndex, int pageSize,String userName);
    int getUserCount();

}
