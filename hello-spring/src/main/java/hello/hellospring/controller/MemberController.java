package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

//    Field Injection
//    private MemberService memberService;
//    @Autowired private MemberService memberService; -> 생성자 Injection

//    Setter Injection
//    private MemberService memberService;
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }
//    public으로 노출되기 때문에 변경 시 잘못될 수 있다는 단점 있음

//    생성자 Injection - 권장됨
    public final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
   }
}
