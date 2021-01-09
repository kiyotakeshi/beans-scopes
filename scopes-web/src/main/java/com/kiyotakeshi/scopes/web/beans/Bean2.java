package com.kiyotakeshi.scopes.web.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // new instance each time bean is requested
public class Bean2 {
}
