// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import com.amazon.webservices.awsecommerceservice._2011_08_01.cartaddrequest.Items;
import java.util.List;


public class CartAddRequest implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CartId")    
	@Order(value=0)
	public String cartId;	
	
	@Element(name = "HMAC")    
	@Order(value=1)
	public String hmac;	
	
	@Element(name = "MergeCart")    
	@Order(value=2)
	public String mergeCart;	
	
	@Element(name = "Items")    
	@Order(value=3)
	public Items items;	
	
	@Element(name = "ResponseGroup")    
	@Order(value=4)
	public List<String> responseGroup;	
	
    
}