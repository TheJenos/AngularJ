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

    private JSONObject $scope;
    private JSONObject $parent;
    private HttpServletRequest requ;
    private HttpServletResponse resp;

    public void onInit() {
    }

    public void onDestroy() {
    }

    public JSONObject get$parent() {
        return $parent;
    }

    public void set$parent(JSONObject $parent) {
        this.$parent = $parent;
    }
    
    public JSONObject get$scope() {
        return $scope;
    }

    public void set$scope(JSONObject $scope) {
        this.$scope = $scope;
    }

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

    public String template() {
        return "";
    }

}
