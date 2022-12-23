package com.example.FinalProjectHadi.Service;

import com.example.FinalProjectHadi.Entity.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;

public interface User_Service {
    UserEntity AddUser(UserEntity userEntity);
    void saveUser(UserEntity userEntity);

}
