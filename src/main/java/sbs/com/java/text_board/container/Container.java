package sbs.com.java.text_board.container;

import sbs.com.java.text_board.article.ArticleController;
import sbs.com.java.text_board.article.ArticleRepository;
import sbs.com.java.text_board.article.ArticleService;
import sbs.com.java.text_board.base.interceptor.NeedLoginInterceptor;
import sbs.com.java.text_board.base.interceptor.NeedLogoutInterceptor;
import sbs.com.java.text_board.base.session.Session;
import sbs.com.java.text_board.member.MemberController;
import sbs.com.java.text_board.member.MemberRepository;
import sbs.com.java.text_board.member.MemberService;

import java.util.Scanner;
public class Container {
  public static Scanner sc;
  public static Session session;
  public static MemberRepository memberRepository;
  public static ArticleRepository articleRepository;
  public static MemberService memberService;
  public static ArticleService articleService;
  public static MemberController memberController;
  public static ArticleController articleController;

  public static NeedLoginInterceptor needLoginInterceptor;
  public static NeedLogoutInterceptor needLogoutInterceptor;

  static {
    sc = new Scanner(System.in);
    session = new Session();

    needLoginInterceptor = new NeedLoginInterceptor();
    needLogoutInterceptor = new NeedLogoutInterceptor();

    memberRepository = new MemberRepository();
    articleRepository = new ArticleRepository();

    memberService = new MemberService();
    articleService = new ArticleService();

    memberController = new MemberController();
    articleController = new ArticleController();
  }
}