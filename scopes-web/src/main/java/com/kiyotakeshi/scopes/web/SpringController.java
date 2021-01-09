package com.kiyotakeshi.scopes.web;

import com.kiyotakeshi.scopes.web.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
public class SpringController {

    private final Bean1 springBean1;

    private final Bean2 springBean2;

    private final Bean3 springBean3;

    private final Bean4 springBean4;

    private final Bean5 springBean5;

    public SpringController(Bean1 springBean1, Bean2 springBean2, Bean3 springBean3, Bean4 springBean4, Bean5 springBean5) {
        this.springBean1 = springBean1;
        this.springBean2 = springBean2;
        this.springBean3 = springBean3;
        this.springBean4 = springBean4;
        this.springBean5 = springBean5;
    }

    @RequestMapping
    @ResponseBody
    public String index() {
        return "<pre>" +
                this.springBean1 + " - Singleton\n" +
                this.springBean2 + " - Prototype\n" +
                this.springBean3 + " - Request Scope\n" +
                this.springBean4 + " - Session Scope\n" +
                this.springBean5 + " - Application Scope\n" +
                "</pre>";

        /**
         * browser 1
         * com.kiyotakeshi.scopes.web.beans.Bean1@45f7c - Singleton // not change
         * com.kiyotakeshi.scopes.web.beans.Bean2@61ee16c3 - Prototype // change everytime reload browser
         * com.kiyotakeshi.scopes.web.beans.Bean3@6d0fd6fc - Request Scope // change everytime reload browser
         * com.kiyotakeshi.scopes.web.beans.Bean4@25850586 - Session Scope // difference between normal browser and incognito browser
         * com.kiyotakeshi.scopes.web.beans.Bean5@7cf4cf95 - Application Scope // not change

         * browser 2
         * com.kiyotakeshi.scopes.web.beans.Bean1@45f7c - Singleton
         * com.kiyotakeshi.scopes.web.beans.Bean2@e54bc29 - Prototype
         * com.kiyotakeshi.scopes.web.beans.Bean3@78e1158f - Request Scope
         * com.kiyotakeshi.scopes.web.beans.Bean4@2e968882 - Session Scope
         * com.kiyotakeshi.scopes.web.beans.Bean5@7cf4cf95 - Application Scope
         */
    }
}
