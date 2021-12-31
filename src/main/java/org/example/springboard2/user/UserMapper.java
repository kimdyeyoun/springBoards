package org.example.springboard2.user;

import org.apache.ibatis.annotations.Mapper;
import org.example.springboard2.user.model.UserEntity;

@Mapper
public interface UserMapper {
    UserEntity selUser(UserEntity entity);
    UserEntity insUser(UserEntity entity);
}
