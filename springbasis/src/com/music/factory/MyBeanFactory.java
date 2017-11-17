package com.music.factory;

import java.net.URL;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class MyBeanFactory {
	
	private Document doc =  null;
    
	
	public Document getDoc() {
		return doc;
	}

	
	public void setDoc(Document doc) {
		this.doc = doc;
	}

    public void parse(URL url) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(url);
        this.doc = document;
    }
}
