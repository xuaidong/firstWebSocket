package com.poineer.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.poineer.interceptors.WebSocketInterceptors;

@Configuration
@EnableWebMvc
@EnableWebSocket
public class SpringWebSocketConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer {
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(webSocketHandler(),"/websocket/mywebsocket.do").addInterceptors(new WebSocketInterceptors());
        registry.addHandler(webSocketHandler(), "/sockjs/socketServer.do").addInterceptors(new WebSocketInterceptors()).withSockJS();
    }
 
    @Bean
    public TextWebSocketHandler webSocketHandler(){
        return new WebSocket();
    }

}
