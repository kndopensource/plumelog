package com.beeplay.easylog.core.dto;

/**
 * className：BaseLogMessage
 * description：
 * time：2020-05-11.15:28
 *
 * @author Tank
 * @version 1.0.0
 */
public class BaseLogMessage {

    /**
     * 追踪码
     */
    private String traceId;

    /**
     * 应用名
     */
    private String appName;

    /**
     * 方法名
     */
    private String methodName;

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
