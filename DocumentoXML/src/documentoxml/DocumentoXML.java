package documentoxml;

import java.io.File;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;

public class DocumentoXML {

    public static void main(String[] args) {
        final String RUTA_XML = "XML_coches.xml";
        try{
            // Creamos los objetos necesarios
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            org.w3c.dom.Document doc = db.newDocument();
            
            // Definimos el elemento raiz del elemento
            Element eRaiz = doc.createElement("concesionario");
            doc.appendChild(eRaiz);
            
            //Definimos el nodo que contendrá los elementos
            Element eCoche = doc.createElement("coche");
            eRaiz.appendChild(eCoche);
            
            // Nodo para marca del coche
            Element eMarca = doc.createElement("marca");
            eMarca.appendChild(doc.createTextNode("Seat"));
            eCoche.appendChild(eMarca);
            
            // Nodo para el modelo del coche
            Element eModelo = doc.createElement("modelo");
            eModelo.appendChild(doc.createTextNode("Leon"));
            eCoche.appendChild(eModelo);
            
            //Nodo para la cilindrada
            Element eCilindrada = doc.createElement("cilindrada");
            eCilindrada.appendChild(doc.createTextNode("1,5"));
            eCoche.appendChild(eCilindrada);
            
            //Clases necesaria finalizar creacion de archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(RUTA_XML));
            //Creacion del fichero XML en disco
            transformer.transform(source, result);
            
            
            
            
        }
        catch(ParserConfigurationException | TransformerException |DOMException e){
            System.out.println("Error --> " + e.toString());
        }
    }

}
