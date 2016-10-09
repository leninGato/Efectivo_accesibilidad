
package us.inswitch.mts.webservices.dto.administration.request.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.inswitch.mts.webservices.dto.administration.request.xsd package. 
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

    private final static QName _DTORequestUpdateClientAdditionalDataLanguage_QNAME = new QName("http://request.administration.dto.webservices.mts.inswitch.us/xsd", "language");
    private final static QName _DTORequestUpdateClientAdditionalDataKey_QNAME = new QName("http://request.administration.dto.webservices.mts.inswitch.us/xsd", "key");
    private final static QName _DTORequestUpdateClientAdditionalDataUser_QNAME = new QName("http://request.administration.dto.webservices.mts.inswitch.us/xsd", "user");
    private final static QName _DTORequestUpdateClientAdditionalDataValue_QNAME = new QName("http://request.administration.dto.webservices.mts.inswitch.us/xsd", "value");
    private final static QName _DTORequestUpdateClientAdditionalDataClientId_QNAME = new QName("http://request.administration.dto.webservices.mts.inswitch.us/xsd", "clientId");
    private final static QName _DTORequestUpdateClientAdditionalDataPassword_QNAME = new QName("http://request.administration.dto.webservices.mts.inswitch.us/xsd", "password");
    private final static QName _DTORequestUpdateClientAdditionalDataUtfi_QNAME = new QName("http://request.administration.dto.webservices.mts.inswitch.us/xsd", "utfi");
    private final static QName _DTORequestSendSMSMensaje_QNAME = new QName("http://request.administration.dto.webservices.mts.inswitch.us/xsd", "mensaje");
    private final static QName _DTORequestSendSMSOperadora_QNAME = new QName("http://request.administration.dto.webservices.mts.inswitch.us/xsd", "operadora");
    private final static QName _DTORequestSendSMSMsisdnDestino_QNAME = new QName("http://request.administration.dto.webservices.mts.inswitch.us/xsd", "msisdnDestino");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.inswitch.mts.webservices.dto.administration.request.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTORequestUpdateClientAdditionalData }
     * 
     */
    public DTORequestUpdateClientAdditionalData createDTORequestUpdateClientAdditionalData() {
        return new DTORequestUpdateClientAdditionalData();
    }

    /**
     * Create an instance of {@link DTORequestDeleteClientAdditionalData }
     * 
     */
    public DTORequestDeleteClientAdditionalData createDTORequestDeleteClientAdditionalData() {
        return new DTORequestDeleteClientAdditionalData();
    }

    /**
     * Create an instance of {@link DTORequestSendSMS }
     * 
     */
    public DTORequestSendSMS createDTORequestSendSMS() {
        return new DTORequestSendSMS();
    }

    /**
     * Create an instance of {@link DTORequestGetClientAdditionalData }
     * 
     */
    public DTORequestGetClientAdditionalData createDTORequestGetClientAdditionalData() {
        return new DTORequestGetClientAdditionalData();
    }

    /**
     * Create an instance of {@link DTORequestInsertClientAdditionalData }
     * 
     */
    public DTORequestInsertClientAdditionalData createDTORequestInsertClientAdditionalData() {
        return new DTORequestInsertClientAdditionalData();
    }

    /**
     * Create an instance of {@link DTORequestSendPUSH }
     * 
     */
    public DTORequestSendPUSH createDTORequestSendPUSH() {
        return new DTORequestSendPUSH();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestUpdateClientAdditionalData.class)
    public JAXBElement<String> createDTORequestUpdateClientAdditionalDataLanguage(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataLanguage_QNAME, String.class, DTORequestUpdateClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "key", scope = DTORequestUpdateClientAdditionalData.class)
    public JAXBElement<String> createDTORequestUpdateClientAdditionalDataKey(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataKey_QNAME, String.class, DTORequestUpdateClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestUpdateClientAdditionalData.class)
    public JAXBElement<String> createDTORequestUpdateClientAdditionalDataUser(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataUser_QNAME, String.class, DTORequestUpdateClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "value", scope = DTORequestUpdateClientAdditionalData.class)
    public JAXBElement<String> createDTORequestUpdateClientAdditionalDataValue(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataValue_QNAME, String.class, DTORequestUpdateClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "clientId", scope = DTORequestUpdateClientAdditionalData.class)
    public JAXBElement<String> createDTORequestUpdateClientAdditionalDataClientId(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataClientId_QNAME, String.class, DTORequestUpdateClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestUpdateClientAdditionalData.class)
    public JAXBElement<String> createDTORequestUpdateClientAdditionalDataPassword(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataPassword_QNAME, String.class, DTORequestUpdateClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestUpdateClientAdditionalData.class)
    public JAXBElement<String> createDTORequestUpdateClientAdditionalDataUtfi(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataUtfi_QNAME, String.class, DTORequestUpdateClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestInsertClientAdditionalData.class)
    public JAXBElement<String> createDTORequestInsertClientAdditionalDataLanguage(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataLanguage_QNAME, String.class, DTORequestInsertClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "key", scope = DTORequestInsertClientAdditionalData.class)
    public JAXBElement<String> createDTORequestInsertClientAdditionalDataKey(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataKey_QNAME, String.class, DTORequestInsertClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestInsertClientAdditionalData.class)
    public JAXBElement<String> createDTORequestInsertClientAdditionalDataUser(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataUser_QNAME, String.class, DTORequestInsertClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "value", scope = DTORequestInsertClientAdditionalData.class)
    public JAXBElement<String> createDTORequestInsertClientAdditionalDataValue(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataValue_QNAME, String.class, DTORequestInsertClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "clientId", scope = DTORequestInsertClientAdditionalData.class)
    public JAXBElement<String> createDTORequestInsertClientAdditionalDataClientId(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataClientId_QNAME, String.class, DTORequestInsertClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestInsertClientAdditionalData.class)
    public JAXBElement<String> createDTORequestInsertClientAdditionalDataPassword(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataPassword_QNAME, String.class, DTORequestInsertClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestInsertClientAdditionalData.class)
    public JAXBElement<String> createDTORequestInsertClientAdditionalDataUtfi(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataUtfi_QNAME, String.class, DTORequestInsertClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestDeleteClientAdditionalData.class)
    public JAXBElement<String> createDTORequestDeleteClientAdditionalDataLanguage(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataLanguage_QNAME, String.class, DTORequestDeleteClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "key", scope = DTORequestDeleteClientAdditionalData.class)
    public JAXBElement<String> createDTORequestDeleteClientAdditionalDataKey(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataKey_QNAME, String.class, DTORequestDeleteClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestDeleteClientAdditionalData.class)
    public JAXBElement<String> createDTORequestDeleteClientAdditionalDataUser(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataUser_QNAME, String.class, DTORequestDeleteClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "clientId", scope = DTORequestDeleteClientAdditionalData.class)
    public JAXBElement<String> createDTORequestDeleteClientAdditionalDataClientId(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataClientId_QNAME, String.class, DTORequestDeleteClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestDeleteClientAdditionalData.class)
    public JAXBElement<String> createDTORequestDeleteClientAdditionalDataPassword(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataPassword_QNAME, String.class, DTORequestDeleteClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestDeleteClientAdditionalData.class)
    public JAXBElement<String> createDTORequestDeleteClientAdditionalDataUtfi(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataUtfi_QNAME, String.class, DTORequestDeleteClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestGetClientAdditionalData.class)
    public JAXBElement<String> createDTORequestGetClientAdditionalDataLanguage(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataLanguage_QNAME, String.class, DTORequestGetClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestGetClientAdditionalData.class)
    public JAXBElement<String> createDTORequestGetClientAdditionalDataUser(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataUser_QNAME, String.class, DTORequestGetClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "clientId", scope = DTORequestGetClientAdditionalData.class)
    public JAXBElement<String> createDTORequestGetClientAdditionalDataClientId(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataClientId_QNAME, String.class, DTORequestGetClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestGetClientAdditionalData.class)
    public JAXBElement<String> createDTORequestGetClientAdditionalDataPassword(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataPassword_QNAME, String.class, DTORequestGetClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestGetClientAdditionalData.class)
    public JAXBElement<String> createDTORequestGetClientAdditionalDataUtfi(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataUtfi_QNAME, String.class, DTORequestGetClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "mensaje", scope = DTORequestSendSMS.class)
    public JAXBElement<String> createDTORequestSendSMSMensaje(String value) {
        return new JAXBElement<String>(_DTORequestSendSMSMensaje_QNAME, String.class, DTORequestSendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestSendSMS.class)
    public JAXBElement<String> createDTORequestSendSMSLanguage(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataLanguage_QNAME, String.class, DTORequestSendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "operadora", scope = DTORequestSendSMS.class)
    public JAXBElement<Integer> createDTORequestSendSMSOperadora(Integer value) {
        return new JAXBElement<Integer>(_DTORequestSendSMSOperadora_QNAME, Integer.class, DTORequestSendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestSendSMS.class)
    public JAXBElement<String> createDTORequestSendSMSUser(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataUser_QNAME, String.class, DTORequestSendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestSendSMS.class)
    public JAXBElement<String> createDTORequestSendSMSPassword(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataPassword_QNAME, String.class, DTORequestSendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "msisdnDestino", scope = DTORequestSendSMS.class)
    public JAXBElement<String> createDTORequestSendSMSMsisdnDestino(String value) {
        return new JAXBElement<String>(_DTORequestSendSMSMsisdnDestino_QNAME, String.class, DTORequestSendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestSendSMS.class)
    public JAXBElement<String> createDTORequestSendSMSUtfi(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataUtfi_QNAME, String.class, DTORequestSendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "mensaje", scope = DTORequestSendPUSH.class)
    public JAXBElement<String> createDTORequestSendPUSHMensaje(String value) {
        return new JAXBElement<String>(_DTORequestSendSMSMensaje_QNAME, String.class, DTORequestSendPUSH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestSendPUSH.class)
    public JAXBElement<String> createDTORequestSendPUSHLanguage(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataLanguage_QNAME, String.class, DTORequestSendPUSH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "operadora", scope = DTORequestSendPUSH.class)
    public JAXBElement<Integer> createDTORequestSendPUSHOperadora(Integer value) {
        return new JAXBElement<Integer>(_DTORequestSendSMSOperadora_QNAME, Integer.class, DTORequestSendPUSH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestSendPUSH.class)
    public JAXBElement<String> createDTORequestSendPUSHUser(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataUser_QNAME, String.class, DTORequestSendPUSH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestSendPUSH.class)
    public JAXBElement<String> createDTORequestSendPUSHPassword(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataPassword_QNAME, String.class, DTORequestSendPUSH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "msisdnDestino", scope = DTORequestSendPUSH.class)
    public JAXBElement<String> createDTORequestSendPUSHMsisdnDestino(String value) {
        return new JAXBElement<String>(_DTORequestSendSMSMsisdnDestino_QNAME, String.class, DTORequestSendPUSH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.administration.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestSendPUSH.class)
    public JAXBElement<String> createDTORequestSendPUSHUtfi(String value) {
        return new JAXBElement<String>(_DTORequestUpdateClientAdditionalDataUtfi_QNAME, String.class, DTORequestSendPUSH.class, value);
    }

}
