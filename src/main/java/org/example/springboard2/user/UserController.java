package org.example.springboard2.user;

import org.example.springboard2.user.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/login")
    public void login() {
    }

    @PostMapping("/login")
    public String loginProc(UserEntity entity, RedirectAttributes reAttr) {
        int result = service.login(entity);
        switch (result) {
            case 0:
                reAttr.addFlashAttribute("msg", "로그인 실패");
                break;
            case 1:
                return "redirect:/board/list";
            case 2:
                reAttr.addFlashAttribute("msg", "아이디 달");
                break;
            case 3:
                reAttr.addFlashAttribute("msg", "비번 달");
                break;
        }
        return "redirect:/user/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession hs, HttpServletRequest req) {
        hs.invalidate();
        String referer = req.getHeader("Referer");
        if (referer == null) {
            referer = "/user/login";
        }
        return "redirect:" + referer;
    }

    @GetMapping("/join")
    public void join() {
    }

    ;

    @PostMapping("/join")
    public String joinProc(UserEntity entity, RedirectAttributes reAttr) {
        int result = service.join(entity);
        switch (result){
            case 1:
                service.login(entity);
                return "redirect:/board/list";
        }
        reAttr.addFlashAttribute("msg", "회원가입에 실패하셨습니다.");
        return "redirect:/user/login";
    }
}
