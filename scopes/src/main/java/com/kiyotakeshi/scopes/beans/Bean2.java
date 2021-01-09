package com.kiyotakeshi.scopes.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // create new instance each time bean is requested
public class Bean2 {
}
