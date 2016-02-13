package com.reservation.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.reservation.service.exception.RailReservationException;

@WebService
public class RailReservationUsingFault {

	@WebMethod
	public String getString()throws RailReservationException
	{
		return "rail Reservation";
	}
}
