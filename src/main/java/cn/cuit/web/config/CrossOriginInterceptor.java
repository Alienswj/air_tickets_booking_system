package cn.cuit.web.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CrossOriginInterceptor implements HandlerInterceptor {
//    private Set<String> allowedOrigins;
//
//    public CrossOriginInterceptor(){
//        allowedOrigins=new HashSet<>(Arrays.asList());
//    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // 若允许跨域的域名信息集合中包含请求的域名信息，则在返回消息头中添加Access-Control-Allow-Origin
//        String requestOrigin = request.getHeader("Origin");
//        System.out.println(requestOrigin);
        //对所有origin都放行
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Max-Age", "21600");
        return true;
    }
}
