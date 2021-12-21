package test.norfolk.xml;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import part.norfolk.xml.ReadXmlDomParser;

/**
 * Test if it is possible to read from staff xml. 
 * There should be 2 records.
 * @author jahic
 *
 */

class ReadStuffXml {

	@Test
	void test()
	{
		ReadXmlDomParser readXMLDomParser = new ReadXmlDomParser("testsuite\\test\\norfolk\\xml\\staff.xml");
        // get <staff>
		NodeList list = readXMLDomParser.getElementsByTagName("staff");

		for (int temp = 0; temp < list.getLength(); temp++)
		{
			Node node = list.item(temp);

			if (node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element element = (Element) node;

				// get staff's attribute
				String id = element.getAttribute("id");

				// get text
				String firstname = element.getElementsByTagName("firstname").item(0).getTextContent();
				String lastname = element.getElementsByTagName("lastname").item(0).getTextContent();
				String nickname = element.getElementsByTagName("nickname").item(0).getTextContent();

				NodeList salaryNodeList = element.getElementsByTagName("salary");
				String salary = salaryNodeList.item(0).getTextContent();

				// get salary's attribute
				String currency = salaryNodeList.item(0).getAttributes().getNamedItem("currency").getTextContent();

				System.out.println("Current Element :" + node.getNodeName());
				System.out.println("Staff Id : " + id);
				System.out.println("First Name : " + firstname);
				System.out.println("Last Name : " + lastname);
				System.out.println("Nick Name : " + nickname);
				System.out.printf("Salary [Currency] : %,.2f [%s]%n%n", Float.parseFloat(salary), currency);
			}
		}
		// There are 2 staff nodes.
		assertEquals(list.getLength(), 2);
	}
}
