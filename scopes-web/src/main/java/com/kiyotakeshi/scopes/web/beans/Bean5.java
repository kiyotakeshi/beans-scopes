package com.kiyotakeshi.scopes.web.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope // one instance per each ServletContext
public class Bean5 {
}
