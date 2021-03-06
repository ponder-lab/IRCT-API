/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.bd2k.irct.model.security;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Lob;

/**
 * This is a JWT token representation. It holds information that is provided by
 * an identity provider.
 * 
 * @author Jeremy R. Easton-Marks
 *
 */
@Entity
public class JWT extends Token implements Serializable {

	private static final long serialVersionUID = 896022262654846110L;

	@Lob
	private String idToken;
	@Lob
	private String access;
	private String type;

	private String clientId;

	/**
	 * Creates a new token
	 */
	public JWT() {

	}

	/**
	 * Creates a new token with the given information
	 * 
	 * @param idToken
	 *            Id Token
	 * @param access
	 *            Access Token
	 * @param type
	 *            Token Type
	 * @param clientId
	 *            Client Id
	 */
	public JWT(String idToken, String access, String type, String clientId) {
		this.idToken = idToken;
		this.access = access;
		this.type = type;
		this.clientId = clientId;
	}

	public String toString() {
		return this.idToken;
	}

	/**
	 * Returns the access token
	 * 
	 * @return Access Token
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * Sets the access token
	 * 
	 * @param access
	 *            Access Token
	 */
	public void setAccess(String access) {
		this.access = access;
	}

	/**
	 * Returns the token type
	 * 
	 * @return Token Type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the token type
	 * 
	 * @param type
	 *            Token Type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Sets the id token
	 * 
	 * @param idToken
	 *            Id Token
	 */
	public void setIdToken(String idToken) {
		this.idToken = idToken;
	}

	/**
	 * Returns the id token
	 * 
	 * @return Id Token
	 */
	public String getIdToken() {
		return this.idToken;
	}

	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId
	 *            the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

}
