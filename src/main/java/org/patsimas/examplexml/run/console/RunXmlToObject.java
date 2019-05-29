package org.patsimas.examplexml.run.console;

import org.patsimas.examplexml.model.entity.Patient;
import org.patsimas.examplexml.model.entity.Student;
import org.patsimas.examplexml.object_xml.ObjectToXmlAndInverse;

public class RunXmlToObject {

	public static void main(String[] args) {

			Student student = (Student) ObjectToXmlAndInverse.XmlToObject("student.xml", Student.class, new Student());
			System.out.println(student);
			
			Patient patient = (Patient) ObjectToXmlAndInverse.XmlToObject("Patient.xml", Patient.class, new Patient());
			System.out.println(patient);
			
			Patient VipPatient = (Patient) ObjectToXmlAndInverse.XmlToObject("Vip_patient.xml", Patient.class, new Patient());
			System.out.println(VipPatient);
			
			Patient anotherPatient = (Patient) ObjectToXmlAndInverse.XmlToObject("another_patient.xml", Patient.class, new Patient());
			System.out.println(anotherPatient);
	}

}
