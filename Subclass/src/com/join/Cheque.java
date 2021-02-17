package com.join;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cheque")
public class Cheque extends Payment
{
	public String getChequetype() {
		return chequetype;
	}

	public void setChequetype(String chequetype) {
		this.chequetype = chequetype;
	}

	@Column(name="chequetype")
	private String chequetype;
	

}
