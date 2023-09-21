package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//어뎁터 도입
//프레임워크를 유연하고 확장성 있게 설계
//다형성과 어댑터 덕분에 기존 구조를 유지 및 프레임워크의 기능을 확장

public interface MyHandlerAdapter {

    boolean supports(Object handler);

    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler)throws ServletException, IOException;
}
