package com.bbva.mzic;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.mzic.dto.projecto.LetterDTO;
import com.bbva.mzic.dto.projecto.PRUEBA2;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractMZICT00201MXTransaction extends AbstractTransaction {

	public AbstractMZICT00201MXTransaction(){
	}


	/**
	 * Return value for input parameter MZICC008
	 */
	protected PRUEBA2 getMzicc008(){
		return (PRUEBA2)this.getParameter("MZICC008");
	}

	/**
	 * Return value for input parameter Name
	 */
	protected String getName(){
		return (String)this.getParameter("Name");
	}

	/**
	 * Return value for input parameter Phone
	 */
	protected Long getPhone(){
		return (Long)this.getParameter("Phone");
	}

	/**
	 * Return value for input parameter LastName
	 */
	protected String getLastname(){
		return (String)this.getParameter("LastName");
	}

	/**
	 * Return value for input parameter email
	 */
	protected String getEmail(){
		return (String)this.getParameter("email");
	}

	/**
	 * Set value for LetterDTO output parameter MZICC009
	 */
	protected void setMzicc009(final LetterDTO field){
		this.addParameter("MZICC009", field);
	}

	/**
	 * Set value for String output parameter Name
	 */
	protected void setName(final String field){
		this.addParameter("Name", field);
	}

	/**
	 * Set value for String output parameter LastName
	 */
	protected void setLastname(final String field){
		this.addParameter("LastName", field);
	}

	/**
	 * Set value for String output parameter email
	 */
	protected void setEmail(final String field){
		this.addParameter("email", field);
	}

	/**
	 * Set value for Long output parameter Y
	 */
	protected void setY(final Long field){
		this.addParameter("Y", field);
	}
}
