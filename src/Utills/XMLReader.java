/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utills;

import java.io.File;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author TheJenos
 */
public class XMLReader {

    private final org.w3c.dom.Document Document;

    public XMLReader(String file) throws Exception{
        this(new File(file));
    }
    public XMLReader(File file) throws Exception{
        this.Document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
        this.Document.getDocumentElement().normalize();
    }
    
    public boolean getBooleanSelectedNodeData(NodeList nl,String key,String val){
        return Boolean.parseBoolean(getSelectedNodeData(nl, key, val).toLowerCase());
    }
    
    public String getSelectedNodeData(NodeList nl,String key,String val){
        for (int i = 0; i < nl.getLength(); i++) {
            Node get = nl.item(i);
            if(get.hasAttributes()){
                NamedNodeMap attributes = get.getAttributes();
                if(attributes.getNamedItem(key).getTextContent().equalsIgnoreCase(val)){
                    return get.getTextContent();
                }
            }
                
        }
        return null;
    }
    
    public NodeList getNodeByName(String name){
        return this.Document.getElementsByTagName(name);
    }
    
    public Element getNodeByID(String name){
        return this.Document.getElementById(name);
    }
    
    
    
}
