/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utills;

import java.io.File;
import java.io.IOException;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author TheJenos
 */
public class XMLReader {

    private org.w3c.dom.Document Document;
    private static XMLReader instance;
    private static String file = Thread.currentThread().getContextClassLoader().getResource("/AngulerJ.xml").getFile();

    public static XMLReader getInstance() {
        try {
            if (instance == null) {
                instance = new XMLReader();
                instance.setXmlFile(new File(file));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }

    private XMLReader() {}
    
    public void setXmlFile(File file) throws Exception{
        this.Document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
        this.Document.getDocumentElement().normalize();
    }

    public boolean getBooleanSelectedNodeData(NodeList nl, String key, String val) {
        return Boolean.parseBoolean(getSelectedNodeData(nl, key, val).toLowerCase());
    }

    public String getSelectedNodeData(NodeList nl, String key, String val) {
        for (int i = 0; i < nl.getLength(); i++) {
            Node get = nl.item(i);
            if (get.hasAttributes()) {
                NamedNodeMap attributes = get.getAttributes();
                if (attributes.getNamedItem(key).getTextContent().equalsIgnoreCase(val)) {
                    return get.getTextContent();
                }
            }

        }
        return null;
    }
    
    public String getSelectedNodeData(String key, String val) {
        NodeList nl = getNodeByName("property");
        for (int i = 0; i < nl.getLength(); i++) {
            Node get = nl.item(i);
            if (get.hasAttributes()) {
                NamedNodeMap attributes = get.getAttributes();
                if (attributes.getNamedItem(key).getTextContent().equalsIgnoreCase(val)) {
                    return get.getTextContent();
                }
            }

        }
        return null;
    }

    public NodeList getNodeByName(String name) {
        return this.Document.getElementsByTagName(name);
    }

    public Element getNodeByID(String name) {
        return this.Document.getElementById(name);
    }

}
