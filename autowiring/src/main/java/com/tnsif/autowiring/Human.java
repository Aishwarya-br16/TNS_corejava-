package com.tnsif.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	Heart heart;

	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	/*public Human(Heart heart) {
	*	super();
	*	this.heart = heart;
	}*/

	public void startPumping() {
		heart.pump();
	}

}