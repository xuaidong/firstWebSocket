package com.poineer.interceptors;

import java.util.Collection;
import java.util.Map;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

/**
 * 
 * @author Administrator
 *
 *	流程控制类
 */
public class WebSocketInterceptors extends HttpSessionHandshakeInterceptor{

	@Override
	public Collection<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return super.getAttributeNames();
	}

	@Override
	public void setCopyAllAttributes(boolean copyAllAttributes) {
		// TODO Auto-generated method stub
		super.setCopyAllAttributes(copyAllAttributes);
	}

	@Override
	public boolean isCopyAllAttributes() {
		// TODO Auto-generated method stub
		return super.isCopyAllAttributes();
	}

	@Override
	public void setCopyHttpSessionId(boolean copyHttpSessionId) {
		// TODO Auto-generated method stub
		super.setCopyHttpSessionId(copyHttpSessionId);
	}

	@Override
	public boolean isCopyHttpSessionId() {
		// TODO Auto-generated method stub
		return super.isCopyHttpSessionId();
	}

	@Override
	public boolean beforeHandshake(ServerHttpRequest request,
			ServerHttpResponse response, WebSocketHandler wsHandler,
			Map<String, Object> attributes) throws Exception {
		// TODO Auto-generated method stub
		return super.beforeHandshake(request, response, wsHandler, attributes);
	}

	@Override
	public void afterHandshake(ServerHttpRequest request,
			ServerHttpResponse response, WebSocketHandler wsHandler,
			Exception ex) {
		// TODO Auto-generated method stub
		super.afterHandshake(request, response, wsHandler, ex);
	}

	
}
