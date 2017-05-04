package com.example.admin.img.other.bulider;

/**
 * Created by admin on 2017/4/28.
 */

public class Request {

    public String url;

    private String method;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public static class Builder {

        private Request request = new Request();

        public Builder() {

        }

        public Builder url(String url) {
            request.setUrl(url);
            return this;
        }

        public Builder get() {
            request.setMethod("GET");
            return this;
        }

        public Builder post() {
            request.setMethod("POST");
            return this;
        }

        public Request build() {

            return request;
        }

    }

}