
package us.inswitch.mts.webservices.dto.administration.response.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.inswitch.mts.webservices.dto.administration.response.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DTOResponseUpdateClientAdditionalDataCodeErrorId_QNAME = new QName("http://response.administration.dto.webservices.mts.inswitch.us/xsd", "codeErrorId");
    private final static QName _DTOResponseUpdateClientAdditionalDataUtfi_QNAME = new QName("http://response.administration.dto.webservices.mts.inswitch.us/xsd", "utfi");
    private final static QName _DTOResponseUpdateClientAdditionalDataResultText_QNAME = new QName("http://response.administration.dto.webservices.mts.inswitch.us/xsd", "resultText");
    private final static QName _DTOResponseClientAdditionalDataKey_QNAME = new QName("http://response.administration.dto.webservices.mts.inswitch.us/xsd", "key");
    private final static QName _DTOResponseClientAdditionalDataValue_QNAME = new QName("http://response.administration.dto.webservices.mts.inswitch.us/xsd", "value");
    private final static QName _DTOResponseClientAdditionalDataDescription_QNAME = new QName("http://response.administration.dto.webservices.mts.inswitch.us/xsd", "description");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.inswitch.mts.webservices.dto.administration.response.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTOResponseDeleteClientAdditionalData }
     * 
     */
    public DTOResponseDeleteClientAdditionalData createDTOResponseDeleteClientAdditionalData() {
        return new DTOResponseDeleteClientAdditionalData();
    }

    /**
     * Create an instance of {@link DTOResponseUpdateClientAdditionalData }
     * 
     */
    public DTOResponseUpdateClientAdditionalData createDTOResponseUpdateClientAdditionalData() {
        return new DTOResponseUpdateClientAdditionalData();
    }

    /**
     * Create an instance of {@link DTOResponseInsertClientAdditionalData }
     * 
     */
    public DTOResponseInsertClientAdditionalData createDTOResponseInsertClientAdditionalData() {
        return new DTOResponseInsertClientAdditionalData();
    }

    /**
     * Create an instance of {@link DTOResponseSendPUSH }
     * 
     */
    public DTOResponseSendPUSH createDTOResponseSendPUSH() {
        return new DTOResponseSendPUSH();
    }

    /**
     * Create an instance of {@link DTOResponseGetClientAdditionalData }
     * 
     */
    public DTOResponseGetClientAdditionalData createDTOResponseGetClientAdditionalData() {
        return new DTOResponseGetClientAdditionalData();
    }

    /**
     * Create an instance of {@link DTOResponseSendSMS }
     * 
     */
    public DTOResponseSendSMS createDTOResponseSendSMS() {
        return new DTOResponseSendSMS();
    }

    /**
     * Create an instance of {@link DTOResponseClientAdditionalData }
     * 
     */
    public DTOResponseClientAdditionalData createDTOResponseClientAdditionalData() {
        return new DTOResponseClientAdditionalData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseUpdateClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseUpdateClientAdditionalDataCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataCodeErrorId_QNAME, String.class, DTOResponseUpdateClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseUpdateClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseUpdateClientAdditionalDataUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataUtfi_QNAME, String.class, DTOResponseUpdateClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseUpdateClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseUpdateClientAdditionalDataResultText(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataResultText_QNAME, String.class, DTOResponseUpdateClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseInsertClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseInsertClientAdditionalDataCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataCodeErrorId_QNAME, String.class, DTOResponseInsertClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseInsertClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseInsertClientAdditionalDataUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataUtfi_QNAME, String.class, DTOResponseInsertClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseInsertClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseInsertClientAdditionalDataResultText(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataResultText_QNAME, String.class, DTOResponseInsertClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseGetClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseGetClientAdditionalDataCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataCodeErrorId_QNAME, String.class, DTOResponseGetClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseGetClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseGetClientAdditionalDataUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataUtfi_QNAME, String.class, DTOResponseGetClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseGetClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseGetClientAdditionalDataResultText(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataResultText_QNAME, String.class, DTOResponseGetClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseDeleteClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseDeleteClientAdditionalDataCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataCodeErrorId_QNAME, String.class, DTOResponseDeleteClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseDeleteClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseDeleteClientAdditionalDataUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataUtfi_QNAME, String.class, DTOResponseDeleteClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseDeleteClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseDeleteClientAdditionalDataResultText(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataResultText_QNAME, String.class, DTOResponseDeleteClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseSendSMS.class)
    public JAXBElement<String> createDTOResponseSendSMSCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataCodeErrorId_QNAME, String.class, DTOResponseSendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseSendSMS.class)
    public JAXBElement<String> createDTOResponseSendSMSUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataUtfi_QNAME, String.class, DTOResponseSendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseSendSMS.class)
    public JAXBElement<String> createDTOResponseSendSMSResultText(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataResultText_QNAME, String.class, DTOResponseSendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseSendPUSH.class)
    public JAXBElement<String> createDTOResponseSendPUSHCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataCodeErrorId_QNAME, String.class, DTOResponseSendPUSH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseSendPUSH.class)
    public JAXBElement<String> createDTOResponseSendPUSHUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataUtfi_QNAME, String.class, DTOResponseSendPUSH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseSendPUSH.class)
    public JAXBElement<String> createDTOResponseSendPUSHResultText(String value) {
        return new JAXBElement<String>(_DTOResponseUpdateClientAdditionalDataResultText_QNAME, String.class, DTOResponseSendPUSH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "key", scope = DTOResponseClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseClientAdditionalDataKey(String value) {
        return new JAXBElement<String>(_DTOResponseClientAdditionalDataKey_QNAME, String.class, DTOResponseClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "value", scope = DTOResponseClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseClientAdditionalDataValue(String value) {
        return new JAXBElement<String>(_DTOResponseClientAdditionalDataValue_QNAME, String.class, DTOResponseClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.administration.dto.webservices.mts.inswitch.us/xsd", name = "description", scope = DTOResponseClientAdditionalData.class)
    public JAXBElement<String> createDTOResponseClientAdditionalDataDescription(String value) {
        return new JAXBElement<String>(_DTOResponseClientAdditionalDataDescription_QNAME, String.class, DTOResponseClientAdditionalData.class, value);
    }

}
