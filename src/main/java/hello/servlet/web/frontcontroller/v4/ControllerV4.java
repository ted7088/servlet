package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

//v3와 거의 비슷
//구현입장에서 modelview를 직접 생성하여 반환하지 않도록 편리한 인터페이스 제공

public interface ControllerV4 {
    /**
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
