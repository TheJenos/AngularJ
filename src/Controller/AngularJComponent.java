/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

/**
 *
 * @author TheJenos
 */
public class AngularJComponent {

    private JSONObject attributes;

    public void setAttributes(JSONObject attributes) {
        this.attributes = attributes;
    }

    public JSONObject getAttributes() {
        return attributes;
    }

    private HttpServletRequest requ;
    private HttpServletResponse resp;

    public void setRequ(HttpServletRequest requ) {
        this.requ = requ;
    }

    public HttpServletRequest getRequ() {
        return requ;
    }

    public HttpServletResponse getResp() {
        return resp;
    }

    public void setResp(HttpServletResponse resp) {
        this.resp = resp;
    }

    public void onInit(){};

    public String template() {
        return "";
    }

     public void onDestroy(){};

}
