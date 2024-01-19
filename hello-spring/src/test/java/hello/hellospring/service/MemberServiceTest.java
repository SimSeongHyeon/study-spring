package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    //테스트에선 한글로 적어도 괜찮음 , 실제 빌드에 적용 X
    @Test
    void 회원가입() {
        //given
        Member member = new Member();
        //when

        //then
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}