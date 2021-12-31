package org.example.springboard2.user;

import org.example.springboard2.Const;
import org.example.springboard2.user.model.UserEntity;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserService {
    @Autowired
    private UserMapper mapper;

    @Autowired
    private HttpSession hs;

    public int login(UserEntity entity){
        UserEntity loginUser = null;
        try {
            loginUser = mapper.selUser(entity);
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        if (loginUser == null){
            return 2;//아이디 x
        }
        if (BCrypt.checkpw(entity.getUpw(), loginUser.getUpw())){
            loginUser.setUpw(null);
            loginUser.setRdt(null);
            hs.setAttribute(Const.LOGIN_USER ,loginUser);
            return 1;//로그인 성공
        }
        return 3;//비밀번호 다름
    };

    public int join(UserEntity entity){
        try {
            entity.setUpw(BCrypt.hashpw(entity.getUpw(), BCrypt.gensalt()));
            mapper.insUser(entity);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}
