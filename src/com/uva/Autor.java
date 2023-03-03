package com.uva;

//import static: importa todos os elementos estaticos da classe
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(TYPE)
public @interface Autor {
	
	public String nome();
	public int ano() default 2000; 
}
