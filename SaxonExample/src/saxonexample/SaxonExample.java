package saxonexample;

import net.sf.saxon.TransformerFactoryImpl;
import net.sf.saxon.Configuration;
import net.sf.saxon.trans.XPathException;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;

public class SaxonExample {
    public static void main(String[] args) {
        try {
            // Configurar el origen XML y la transformación XSLT
            StreamSource xmlSource = new StreamSource(new File("C:\\Users\\Usuario\\Documents\\GitHub\\Proyectos\\PaginaSubida/productos.xml"));
            StreamSource xsltSource = new StreamSource(new File("C:\\Users\\Usuario\\Documents\\GitHub\\Proyectos\\PaginaSubida/limpieza.xsl"));

            // Configurar el resultado de la transformación
            StreamResult result = new StreamResult(new File("C:\\Users\\Usuario\\Documents\\GitHub\\Proyectos\\PaginaSubida/limpieza.html"));

            // Configurar el motor de transformación Saxon
            TransformerFactory transformerFactory = new TransformerFactoryImpl();

            // Realizar la transformación
            Transformer transformer = transformerFactory.newTransformer(xsltSource);
            transformer.transform(xmlSource, result);

            System.out.println("Transformación completada.");
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}

