package com.kiyotakeshi.scopes.web.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope // new instance per each HTTP session
public class Bean4 {
}
