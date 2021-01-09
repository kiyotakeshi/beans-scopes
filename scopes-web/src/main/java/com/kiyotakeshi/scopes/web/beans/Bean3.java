package com.kiyotakeshi.scopes.web.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope // new instance per each HTTP request
public class Bean3 {
}
