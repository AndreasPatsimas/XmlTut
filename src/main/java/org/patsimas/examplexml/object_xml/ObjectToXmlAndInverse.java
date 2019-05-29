package org.patsimas.examplexml.object_xml;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;




public class ObjectToXmlAndInverse {

	public static Object XmlToObject(String nameOfXmlFile, Class entityClass,Object entityObject) {
		try {
			
			JAXBContext jaxbContext = JAXBContext.newInstance(entityClass);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			
			entityObject = (Object) jaxbUnmarshaller.unmarshal(new File(nameOfXmlFile));
			
			return entityObject;
		}
		catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}
	
	public static void ObjectToXml(String nameOfXmlFile, Class EntityClass,Object entityObject) {
		
		try {
			
			JAXBContext contextObj = JAXBContext.newInstance(EntityClass);
			
			Marshaller marshallerObj = contextObj.createMarshaller();  
		   
			marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); 
			
			marshallerObj.marshal(entityObject, new FileOutputStream(nameOfXmlFile));
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
