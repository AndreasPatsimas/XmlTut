package org.patsimas.examplexml.run.console;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.patsimas.examplexml.model.entity.Insurance;
import org.patsimas.examplexml.model.entity.Patient;
import org.patsimas.examplexml.model.entity.Payment;
import org.patsimas.examplexml.model.entity.Student;
import org.patsimas.examplexml.object_xml.ObjectToXmlAndInverse;

public class RunObjectToXml {

	public static void main(String[] args) throws ParseException  {
		
		Patient patient = new Patient();
		
		patient.setId(3);
		patient.setName("Sergio");
		patient.setAge(26);
		
		String date = "07/06/1993";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dob = sdf.parse(date);
		
		patient.setDob(dob);
		patient.setEmail("sergio@gmail.com");
		patient.setGender("M");
		patient.setPhone(694409538);
		patient.setPayment(new Payment(new Insurance("ARIS",10000000)));
		
		ObjectToXmlAndInverse.ObjectToXml("another_patient.xml", Patient.class, patient);
	}

}
