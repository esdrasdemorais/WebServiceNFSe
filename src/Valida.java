import java.io.StringReader;  
import java.net.URL;  
  
import javax.xml.parsers.DocumentBuilder;  
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.transform.stream.StreamSource;  
import javax.xml.validation.Schema;  
import javax.xml.validation.SchemaFactory;  
import javax.xml.validation.Validator;  
  
import org.xml.sax.InputSource;  
import org.xml.sax.SAXParseException;  
  
public class Valida  
{  
    public static String ValidaDoc(String stringXml, String xsdFileName)  
    {  
        //Define o tipo de  - we use W3C  
        String schemaLang = "http://www.w3.org/2001/XMLSchema";  
        //valida driver  
        SchemaFactory factory = SchemaFactory.newInstance(schemaLang);  
        //  
        try   
        {  
            URL xsdPath = Valida.class.getResource("/schemas/" + xsdFileName);  
  
            Schema schema = factory.newSchema(new StreamSource(xsdPath.toURI().toString()));  
            Validator validator = schema.newValidator();  
            //Perform the validation:  
            validator.validate(new StreamSource(new StringReader(stringXml)));  
            DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder = fact.newDocumentBuilder();  
            builder.parse(new InputSource(new StringReader(stringXml)));  
        }  
        catch (Exception e)  
        {  
            if(e instanceof SAXParseException)  
                return "XML Parse Error on Col: "+ ((SAXParseException) e).getColumnNumber() + " | Lin: " + ((SAXParseException) e).getLineNumber() + " - " + ((SAXParseException) e).getLocalizedMessage();  
            else  
                return "Unknow error attemping to validate XML.";  
        }  
        return "";  
    }  
    public static String validaPedCartaCorrecao(String stringXml) {  
        return ValidaDoc(stringXml, "servico_enviar_lote_rps_envio_v03.xsd");  
    }  
}  