package com.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cheque")
public class Cheque extends Payment
{
	@Column(name="cheque")
	private String chequetype;

	public String getChequetype() {
		return chequetype;
	}

	public void setChequetype(String chequetype) {
		this.chequetype = chequetype;
	}
}
