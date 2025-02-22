package sbs.com.java.text_board.member;

import sbs.com.java.text_board.container.Container;

public class MemberService {
  private MemberRepository memberRepository;
  public MemberService() {
    memberRepository = Container.memberRepository;
  }
  public void join(String loginId, String loginPW, String name) {
    memberRepository.join(loginId, loginPW, name);
  }

  public Member findByLoginId(String loginId) {
    return memberRepository.findByLoginId(loginId);
  }

  public Member findById(int id) {
    return memberRepository.findById(id);
  }
}