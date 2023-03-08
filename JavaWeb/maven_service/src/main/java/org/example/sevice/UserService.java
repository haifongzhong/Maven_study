package org.example.sevice;

import org.example.dao.UserDao;

/**
 * @className: userService
 * @description: TODO
 * @author: haifongzhong
 * @date: 2023/03/08 10:53
 * @Company: Copyright© [2023/03/08] by [heifongzhong]
 **/

public class UserService {
    public static void testService(){
        System.out.println("userService test ...");
        
        // 调用UserDao的方法
        UserDao.testDao();
    }
}
