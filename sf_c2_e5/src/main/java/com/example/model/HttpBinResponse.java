package com.example.model;

public class HttpBinResponse {

  private String method;
  private String origin;
  private String url;
  private Product json;


  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Product getJson() {
    return json;
  }

  public void setJson(Product json) {
    this.json = json;
  }
}
