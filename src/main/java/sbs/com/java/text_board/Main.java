package sbs.com.java.text_board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int lastArticleId = 0;
    System.out.println("== 자바 텍스트 게시판 시작 ==");
    while(true) {
      System.out.println("명령) ");
      String cmd = sc.nextLine();

      if(cmd.equals("/usr/article/write")) {
        System.out.println("== 게시물 작성 ==");
        System.out.println("제목 : ");
        String subject = sc.nextLine();
        System.out.println("내용 : ");
        String content = sc.nextLine();

        int id = ++lastArticleId;

        // 객체는 항상 새롭게 만들어진다
        Article article = new Article(); // 게시물 작성 후 article 객체 생성
        // 입력 받은 내용을 객체와 연결
        article.id = id;
        article.subject = subject;
        article.content = content;

        System.out.println("생성된 게시물 객체" + article);
        System.out.printf("%d번 게시물이 등록되었습니다.\n", article.id);
      }

      else if(cmd.equals("exit")) {
        System.out.println("프로그램을 종료합니다.");
        break; // 반복문 빠져나옴
      }
      else {
        System.out.println("잘못된 명령어입니다.");
      }
    }
     System.out.println("== 자바 텍스트 게시판 종료 ==");
     sc.close();
  }
}

class Article {
  int id;
  String subject;
  String content;
}