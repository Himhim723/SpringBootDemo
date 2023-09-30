package com.test.demotestjpa.Service;

import com.test.demotestjpa.entity.BusinessUser;

public interface UserService {
    BusinessUser signUp(BusinessUser businessUser);
    void deleteAccount(String username);
    void adjustPassword(String username, String password);
}
