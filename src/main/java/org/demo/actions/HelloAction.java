package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

    public String execute() throws Exception {
        return SUCCESS;
    }

    public String global() {
        return "global";
    }

}
