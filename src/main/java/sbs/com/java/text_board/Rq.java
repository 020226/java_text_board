package sbs.com.java.text_board;

import lombok.Getter;
import sbs.com.java.text_board.util.Util;

import java.util.Map;

public class Rq {
  public String url;
  @Getter
  public Map<String, String> params;
  @Getter
  public String urlPath;
  public Rq(String url) {
    this.url = url;
    params = Util.getParamsFromUrl(this.url);
    urlPath = Util.getPathFromUrl(this.url);
  }
  public int getIntParam(String paramName, int defaultValue) {
    if(!params.containsKey(paramName)) {
      return defaultValue;
    }
    try {
      return Integer.parseInt(params.get(paramName));
    } catch (NumberFormatException e) {
      return defaultValue;
    }
  }
  public String getParam(String paramName, String defaultValue) {
    if(!params.containsKey(paramName)) {
      return defaultValue;
    }
    return params.get(paramName);
  }
}
