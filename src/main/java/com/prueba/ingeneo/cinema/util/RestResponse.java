/**
 * 
 */
package com.prueba.ingeneo.cinema.util;

/**
 * @author santi
 *
 */
public class RestResponse {

	private Integer responseCode;
	private String responseMenssage;
	
	/**
	 * constructor vacio de la clase REstResponse
	 */
	
	/**
	 * constructor de la clase restResponse
	 * @param responseCode
	 * @param responseMenssage
	 */
	public RestResponse(Integer responseCode, String responseMenssage) {
		super();
		this.responseCode = responseCode;
		this.responseMenssage = responseMenssage;
	}
	public RestResponse() {
		super();
	}
	/**
	 * @return the responseCode
	 */
	public Integer getResponseCode() {
		return responseCode;
	}
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	/**
	 * @return the responseMenssage
	 */
	public String getResponseMenssage() {
		return responseMenssage;
	}
	/**
	 * @param responseMenssage the responseMenssage to set
	 */
	public void setResponseMenssage(String responseMenssage) {
		this.responseMenssage = responseMenssage;
	}
	
	
}
