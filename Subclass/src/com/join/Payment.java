package com.join;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="payment1")
@Inheritance(strategy=InheritanceType.JOINED)
public class Payment
{
	@Id
	@Column(name="pid")
	private int id;
	@Column(name="amount")
	private int amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}
