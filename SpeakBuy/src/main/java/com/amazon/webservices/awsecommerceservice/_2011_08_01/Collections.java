// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import com.amazon.webservices.awsecommerceservice._2011_08_01.collections.Collection;


@com.leansoft.nano.annotation.RootElement(name = "Collections", namespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
public class Collections implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Collection")    
	@Order(value=0)
	public List<Collection> collection;	
	
    
}