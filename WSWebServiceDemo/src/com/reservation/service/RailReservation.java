
package com.reservation.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(serviceName="RailReservationService")
public class RailReservation {

	
	
	@SuppressWarnings("unchecked")
	@WebMethod
	public List<PNRList> getPNRStatus(){
		
		PNRList pnrList = new PNRList();
	
		PNRNumbers pnrNumbers1 = new PNRNumbers();
		pnrNumbers1.setPnr("1001");
		pnrNumbers1.setName("ABC");
		pnrList.getPnrNumbers().add(pnrNumbers1);
		PNRNumbers pnrNumbers2 = new PNRNumbers();
		pnrNumbers2.setPnr("1002");
		pnrNumbers2.setName("XYZ");
		pnrList.getPnrNumbers().add(pnrNumbers2);
		
		
		return (List<PNRList>) pnrList;
	
		
		
	}
}
