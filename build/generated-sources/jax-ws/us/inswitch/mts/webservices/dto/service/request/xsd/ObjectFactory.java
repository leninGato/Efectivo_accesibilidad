
package us.inswitch.mts.webservices.dto.service.request.xsd;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.inswitch.mts.webservices.dto.service.request.xsd package. 
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

    private final static QName _DTORequestCashInTransferenciaMsisdnSource_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "msisdnSource");
    private final static QName _DTORequestCashInTransferenciaAmount_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "amount");
    private final static QName _DTORequestCashInTransferenciaPassword_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "password");
    private final static QName _DTORequestCashInTransferenciaPin_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "pin");
    private final static QName _DTORequestCashInTransferenciaSourceAccount_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "sourceAccount");
    private final static QName _DTORequestCashInTransferenciaUtfi_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "utfi");
    private final static QName _DTORequestCashInTransferenciaBrandId_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "brandId");
    private final static QName _DTORequestCashInTransferenciaDocument_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "document");
    private final static QName _DTORequestCashInTransferenciaMsisdnTarget_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "msisdnTarget");
    private final static QName _DTORequestCashInTransferenciaCurrency_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "currency");
    private final static QName _DTORequestCashInTransferenciaLanguage_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "language");
    private final static QName _DTORequestCashInTransferenciaUser_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "user");
    private final static QName _DTORequestGetBalanceMsisdn_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "msisdn");
    private final static QName _DTORequestAgentAutoReversionIdTransaction_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "idTransaction");
    private final static QName _DTORequestGetDailyReportDateReport_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "dateReport");
    private final static QName _DTORequestCashOutConfirmOtp_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "otp");
    private final static QName _DTORequestCobroDevolucionIvaPreMontoImponible_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "montoImponible");
    private final static QName _DTORequestChangePinNewpin_QNAME = new QName("http://request.service.dto.webservices.mts.inswitch.us/xsd", "newpin");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.inswitch.mts.webservices.dto.service.request.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTORequestFondeoLocalConfirm }
     * 
     */
    public DTORequestFondeoLocalConfirm createDTORequestFondeoLocalConfirm() {
        return new DTORequestFondeoLocalConfirm();
    }

    /**
     * Create an instance of {@link DTORequestRemitPre }
     * 
     */
    public DTORequestRemitPre createDTORequestRemitPre() {
        return new DTORequestRemitPre();
    }

    /**
     * Create an instance of {@link DTORequestUtfiAutoReversion }
     * 
     */
    public DTORequestUtfiAutoReversion createDTORequestUtfiAutoReversion() {
        return new DTORequestUtfiAutoReversion();
    }

    /**
     * Create an instance of {@link DTORequestCashInTransferencia }
     * 
     */
    public DTORequestCashInTransferencia createDTORequestCashInTransferencia() {
        return new DTORequestCashInTransferencia();
    }

    /**
     * Create an instance of {@link DTORequestReservesForBankTransfer }
     * 
     */
    public DTORequestReservesForBankTransfer createDTORequestReservesForBankTransfer() {
        return new DTORequestReservesForBankTransfer();
    }

    /**
     * Create an instance of {@link DTORequestRemitConfirm }
     * 
     */
    public DTORequestRemitConfirm createDTORequestRemitConfirm() {
        return new DTORequestRemitConfirm();
    }

    /**
     * Create an instance of {@link DTORequestFondeoLocalPre }
     * 
     */
    public DTORequestFondeoLocalPre createDTORequestFondeoLocalPre() {
        return new DTORequestFondeoLocalPre();
    }

    /**
     * Create an instance of {@link DTORequestCashOutConfirm }
     * 
     */
    public DTORequestCashOutConfirm createDTORequestCashOutConfirm() {
        return new DTORequestCashOutConfirm();
    }

    /**
     * Create an instance of {@link DTORequestCobroDevolucionIvaConfirm }
     * 
     */
    public DTORequestCobroDevolucionIvaConfirm createDTORequestCobroDevolucionIvaConfirm() {
        return new DTORequestCobroDevolucionIvaConfirm();
    }

    /**
     * Create an instance of {@link DTORequestCashInPre }
     * 
     */
    public DTORequestCashInPre createDTORequestCashInPre() {
        return new DTORequestCashInPre();
    }

    /**
     * Create an instance of {@link DTORequestCashOutPre }
     * 
     */
    public DTORequestCashOutPre createDTORequestCashOutPre() {
        return new DTORequestCashOutPre();
    }

    /**
     * Create an instance of {@link DTORequestGetBalance }
     * 
     */
    public DTORequestGetBalance createDTORequestGetBalance() {
        return new DTORequestGetBalance();
    }

    /**
     * Create an instance of {@link DTORequestCashInConfirm }
     * 
     */
    public DTORequestCashInConfirm createDTORequestCashInConfirm() {
        return new DTORequestCashInConfirm();
    }

    /**
     * Create an instance of {@link DTORequestChangePin }
     * 
     */
    public DTORequestChangePin createDTORequestChangePin() {
        return new DTORequestChangePin();
    }

    /**
     * Create an instance of {@link DTORequestCashOutTransferencia }
     * 
     */
    public DTORequestCashOutTransferencia createDTORequestCashOutTransferencia() {
        return new DTORequestCashOutTransferencia();
    }

    /**
     * Create an instance of {@link DTORequestGetDailyReport }
     * 
     */
    public DTORequestGetDailyReport createDTORequestGetDailyReport() {
        return new DTORequestGetDailyReport();
    }

    /**
     * Create an instance of {@link DTORequestCobroDevolucionIvaPre }
     * 
     */
    public DTORequestCobroDevolucionIvaPre createDTORequestCobroDevolucionIvaPre() {
        return new DTORequestCobroDevolucionIvaPre();
    }

    /**
     * Create an instance of {@link DTORequestGirosNacionales }
     * 
     */
    public DTORequestGirosNacionales createDTORequestGirosNacionales() {
        return new DTORequestGirosNacionales();
    }

    /**
     * Create an instance of {@link DTORequestAgentAutoReversion }
     * 
     */
    public DTORequestAgentAutoReversion createDTORequestAgentAutoReversion() {
        return new DTORequestAgentAutoReversion();
    }

    /**
     * Create an instance of {@link DTORequestCobroPre }
     * 
     */
    public DTORequestCobroPre createDTORequestCobroPre() {
        return new DTORequestCobroPre();
    }

    /**
     * Create an instance of {@link DTORequestCobroConfirm }
     * 
     */
    public DTORequestCobroConfirm createDTORequestCobroConfirm() {
        return new DTORequestCobroConfirm();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestCashInTransferencia.class)
    public JAXBElement<String> createDTORequestCashInTransferenciaMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestCashInTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestCashInTransferencia.class)
    public JAXBElement<BigDecimal> createDTORequestCashInTransferenciaAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DTORequestCashInTransferenciaAmount_QNAME, BigDecimal.class, DTORequestCashInTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestCashInTransferencia.class)
    public JAXBElement<String> createDTORequestCashInTransferenciaPassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestCashInTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestCashInTransferencia.class)
    public JAXBElement<String> createDTORequestCashInTransferenciaPin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestCashInTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "sourceAccount", scope = DTORequestCashInTransferencia.class)
    public JAXBElement<String> createDTORequestCashInTransferenciaSourceAccount(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaSourceAccount_QNAME, String.class, DTORequestCashInTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestCashInTransferencia.class)
    public JAXBElement<String> createDTORequestCashInTransferenciaUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestCashInTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestCashInTransferencia.class)
    public JAXBElement<Integer> createDTORequestCashInTransferenciaBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaBrandId_QNAME, Integer.class, DTORequestCashInTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestCashInTransferencia.class)
    public JAXBElement<String> createDTORequestCashInTransferenciaDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestCashInTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestCashInTransferencia.class)
    public JAXBElement<String> createDTORequestCashInTransferenciaMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestCashInTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestCashInTransferencia.class)
    public JAXBElement<Integer> createDTORequestCashInTransferenciaCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaCurrency_QNAME, Integer.class, DTORequestCashInTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestCashInTransferencia.class)
    public JAXBElement<String> createDTORequestCashInTransferenciaLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestCashInTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestCashInTransferencia.class)
    public JAXBElement<String> createDTORequestCashInTransferenciaUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestCashInTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestGetBalance.class)
    public JAXBElement<String> createDTORequestGetBalancePassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestGetBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestGetBalance.class)
    public JAXBElement<String> createDTORequestGetBalancePin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestGetBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestGetBalance.class)
    public JAXBElement<String> createDTORequestGetBalanceUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestGetBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestGetBalance.class)
    public JAXBElement<String> createDTORequestGetBalanceLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestGetBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestGetBalance.class)
    public JAXBElement<String> createDTORequestGetBalanceUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestGetBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdn", scope = DTORequestGetBalance.class)
    public JAXBElement<String> createDTORequestGetBalanceMsisdn(String value) {
        return new JAXBElement<String>(_DTORequestGetBalanceMsisdn_QNAME, String.class, DTORequestGetBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPreMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestCashInPre.class)
    public JAXBElement<Double> createDTORequestCashInPreAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashInTransferenciaAmount_QNAME, Double.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPrePassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPrePin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPreUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestCashInPre.class)
    public JAXBElement<Integer> createDTORequestCashInPreBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaBrandId_QNAME, Integer.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPreDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPreMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestCashInPre.class)
    public JAXBElement<Integer> createDTORequestCashInPreCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaCurrency_QNAME, Integer.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPreLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestCashInPre.class)
    public JAXBElement<String> createDTORequestCashInPreUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestAgentAutoReversion.class)
    public JAXBElement<String> createDTORequestAgentAutoReversionPassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestAgentAutoReversion.class)
    public JAXBElement<String> createDTORequestAgentAutoReversionUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestAgentAutoReversion.class)
    public JAXBElement<String> createDTORequestAgentAutoReversionLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestAgentAutoReversion.class)
    public JAXBElement<String> createDTORequestAgentAutoReversionUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "idTransaction", scope = DTORequestAgentAutoReversion.class)
    public JAXBElement<String> createDTORequestAgentAutoReversionIdTransaction(String value) {
        return new JAXBElement<String>(_DTORequestAgentAutoReversionIdTransaction_QNAME, String.class, DTORequestAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestGetDailyReport.class)
    public JAXBElement<String> createDTORequestGetDailyReportPassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestGetDailyReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestGetDailyReport.class)
    public JAXBElement<String> createDTORequestGetDailyReportUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestGetDailyReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestGetDailyReport.class)
    public JAXBElement<String> createDTORequestGetDailyReportLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestGetDailyReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestGetDailyReport.class)
    public JAXBElement<String> createDTORequestGetDailyReportUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestGetDailyReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "dateReport", scope = DTORequestGetDailyReport.class)
    public JAXBElement<XMLGregorianCalendar> createDTORequestGetDailyReportDateReport(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DTORequestGetDailyReportDateReport_QNAME, XMLGregorianCalendar.class, DTORequestGetDailyReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<Double> createDTORequestCashOutConfirmAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashInTransferenciaAmount_QNAME, Double.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmPassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmPin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<Integer> createDTORequestCashOutConfirmBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaBrandId_QNAME, Integer.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<Integer> createDTORequestCashOutConfirmCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaCurrency_QNAME, Integer.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "otp", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmOtp(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmOtp_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestCashOutConfirm.class)
    public JAXBElement<String> createDTORequestCashOutConfirmUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestRemitPre.class)
    public JAXBElement<String> createDTORequestRemitPreMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestRemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestRemitPre.class)
    public JAXBElement<Double> createDTORequestRemitPreAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashInTransferenciaAmount_QNAME, Double.class, DTORequestRemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestRemitPre.class)
    public JAXBElement<String> createDTORequestRemitPrePassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestRemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestRemitPre.class)
    public JAXBElement<String> createDTORequestRemitPrePin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestRemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestRemitPre.class)
    public JAXBElement<String> createDTORequestRemitPreUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestRemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestRemitPre.class)
    public JAXBElement<Integer> createDTORequestRemitPreBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaBrandId_QNAME, Integer.class, DTORequestRemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestRemitPre.class)
    public JAXBElement<String> createDTORequestRemitPreDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestRemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestRemitPre.class)
    public JAXBElement<String> createDTORequestRemitPreMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestRemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestRemitPre.class)
    public JAXBElement<Integer> createDTORequestRemitPreCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaCurrency_QNAME, Integer.class, DTORequestRemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestRemitPre.class)
    public JAXBElement<String> createDTORequestRemitPreLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestRemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestRemitPre.class)
    public JAXBElement<String> createDTORequestRemitPreUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestRemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestGirosNacionales.class)
    public JAXBElement<String> createDTORequestGirosNacionalesMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestGirosNacionales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestGirosNacionales.class)
    public JAXBElement<BigDecimal> createDTORequestGirosNacionalesAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DTORequestCashInTransferenciaAmount_QNAME, BigDecimal.class, DTORequestGirosNacionales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestGirosNacionales.class)
    public JAXBElement<String> createDTORequestGirosNacionalesPassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestGirosNacionales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestGirosNacionales.class)
    public JAXBElement<String> createDTORequestGirosNacionalesPin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestGirosNacionales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestGirosNacionales.class)
    public JAXBElement<String> createDTORequestGirosNacionalesUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestGirosNacionales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestGirosNacionales.class)
    public JAXBElement<String> createDTORequestGirosNacionalesDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestGirosNacionales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestGirosNacionales.class)
    public JAXBElement<String> createDTORequestGirosNacionalesMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestGirosNacionales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestGirosNacionales.class)
    public JAXBElement<String> createDTORequestGirosNacionalesLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestGirosNacionales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "otp", scope = DTORequestGirosNacionales.class)
    public JAXBElement<String> createDTORequestGirosNacionalesOtp(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmOtp_QNAME, String.class, DTORequestGirosNacionales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestGirosNacionales.class)
    public JAXBElement<String> createDTORequestGirosNacionalesUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestGirosNacionales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestFondeoLocalConfirm.class)
    public JAXBElement<String> createDTORequestFondeoLocalConfirmMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestFondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestFondeoLocalConfirm.class)
    public JAXBElement<Double> createDTORequestFondeoLocalConfirmAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashInTransferenciaAmount_QNAME, Double.class, DTORequestFondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestFondeoLocalConfirm.class)
    public JAXBElement<String> createDTORequestFondeoLocalConfirmPassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestFondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestFondeoLocalConfirm.class)
    public JAXBElement<String> createDTORequestFondeoLocalConfirmPin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestFondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestFondeoLocalConfirm.class)
    public JAXBElement<String> createDTORequestFondeoLocalConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestFondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestFondeoLocalConfirm.class)
    public JAXBElement<Integer> createDTORequestFondeoLocalConfirmBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaBrandId_QNAME, Integer.class, DTORequestFondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestFondeoLocalConfirm.class)
    public JAXBElement<String> createDTORequestFondeoLocalConfirmDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestFondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestFondeoLocalConfirm.class)
    public JAXBElement<String> createDTORequestFondeoLocalConfirmMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestFondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestFondeoLocalConfirm.class)
    public JAXBElement<Integer> createDTORequestFondeoLocalConfirmCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaCurrency_QNAME, Integer.class, DTORequestFondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestFondeoLocalConfirm.class)
    public JAXBElement<String> createDTORequestFondeoLocalConfirmLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestFondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestFondeoLocalConfirm.class)
    public JAXBElement<String> createDTORequestFondeoLocalConfirmUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestFondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestReservesForBankTransfer.class)
    public JAXBElement<String> createDTORequestReservesForBankTransferPassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestReservesForBankTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestReservesForBankTransfer.class)
    public JAXBElement<String> createDTORequestReservesForBankTransferUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestReservesForBankTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestReservesForBankTransfer.class)
    public JAXBElement<String> createDTORequestReservesForBankTransferLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestReservesForBankTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestReservesForBankTransfer.class)
    public JAXBElement<String> createDTORequestReservesForBankTransferUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestReservesForBankTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestUtfiAutoReversion.class)
    public JAXBElement<String> createDTORequestUtfiAutoReversionPassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestUtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestUtfiAutoReversion.class)
    public JAXBElement<String> createDTORequestUtfiAutoReversionUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestUtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestUtfiAutoReversion.class)
    public JAXBElement<String> createDTORequestUtfiAutoReversionLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestUtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestUtfiAutoReversion.class)
    public JAXBElement<String> createDTORequestUtfiAutoReversionUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestUtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestCashInConfirm.class)
    public JAXBElement<Double> createDTORequestCashInConfirmAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashInTransferenciaAmount_QNAME, Double.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmPassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmPin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestCashInConfirm.class)
    public JAXBElement<Integer> createDTORequestCashInConfirmBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaBrandId_QNAME, Integer.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestCashInConfirm.class)
    public JAXBElement<Integer> createDTORequestCashInConfirmCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaCurrency_QNAME, Integer.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestCashInConfirm.class)
    public JAXBElement<String> createDTORequestCashInConfirmUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestCobroDevolucionIvaPre.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaPreMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestCobroDevolucionIvaPre.class)
    public JAXBElement<Double> createDTORequestCobroDevolucionIvaPreAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashInTransferenciaAmount_QNAME, Double.class, DTORequestCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestCobroDevolucionIvaPre.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaPrePassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "montoImponible", scope = DTORequestCobroDevolucionIvaPre.class)
    public JAXBElement<Double> createDTORequestCobroDevolucionIvaPreMontoImponible(Double value) {
        return new JAXBElement<Double>(_DTORequestCobroDevolucionIvaPreMontoImponible_QNAME, Double.class, DTORequestCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestCobroDevolucionIvaPre.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaPrePin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestCobroDevolucionIvaPre.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaPreUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestCobroDevolucionIvaPre.class)
    public JAXBElement<Integer> createDTORequestCobroDevolucionIvaPreBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaBrandId_QNAME, Integer.class, DTORequestCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestCobroDevolucionIvaPre.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaPreDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestCobroDevolucionIvaPre.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaPreMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestCobroDevolucionIvaPre.class)
    public JAXBElement<Integer> createDTORequestCobroDevolucionIvaPreCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaCurrency_QNAME, Integer.class, DTORequestCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestCobroDevolucionIvaPre.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaPreLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestCobroDevolucionIvaPre.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaPreUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestCobroConfirm.class)
    public JAXBElement<String> createDTORequestCobroConfirmMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestCobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestCobroConfirm.class)
    public JAXBElement<Double> createDTORequestCobroConfirmAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashInTransferenciaAmount_QNAME, Double.class, DTORequestCobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestCobroConfirm.class)
    public JAXBElement<String> createDTORequestCobroConfirmPassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestCobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestCobroConfirm.class)
    public JAXBElement<String> createDTORequestCobroConfirmPin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestCobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestCobroConfirm.class)
    public JAXBElement<String> createDTORequestCobroConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestCobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestCobroConfirm.class)
    public JAXBElement<Integer> createDTORequestCobroConfirmBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaBrandId_QNAME, Integer.class, DTORequestCobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestCobroConfirm.class)
    public JAXBElement<String> createDTORequestCobroConfirmDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestCobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestCobroConfirm.class)
    public JAXBElement<String> createDTORequestCobroConfirmMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestCobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestCobroConfirm.class)
    public JAXBElement<Integer> createDTORequestCobroConfirmCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaCurrency_QNAME, Integer.class, DTORequestCobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestCobroConfirm.class)
    public JAXBElement<String> createDTORequestCobroConfirmLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestCobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestCobroConfirm.class)
    public JAXBElement<String> createDTORequestCobroConfirmUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestCobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestChangePin.class)
    public JAXBElement<String> createDTORequestChangePinPassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestChangePin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestChangePin.class)
    public JAXBElement<String> createDTORequestChangePinPin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestChangePin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestChangePin.class)
    public JAXBElement<String> createDTORequestChangePinUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestChangePin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "newpin", scope = DTORequestChangePin.class)
    public JAXBElement<String> createDTORequestChangePinNewpin(String value) {
        return new JAXBElement<String>(_DTORequestChangePinNewpin_QNAME, String.class, DTORequestChangePin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestChangePin.class)
    public JAXBElement<String> createDTORequestChangePinLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestChangePin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestChangePin.class)
    public JAXBElement<String> createDTORequestChangePinUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestChangePin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdn", scope = DTORequestChangePin.class)
    public JAXBElement<String> createDTORequestChangePinMsisdn(String value) {
        return new JAXBElement<String>(_DTORequestGetBalanceMsisdn_QNAME, String.class, DTORequestChangePin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestFondeoLocalPre.class)
    public JAXBElement<String> createDTORequestFondeoLocalPreMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestFondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestFondeoLocalPre.class)
    public JAXBElement<Double> createDTORequestFondeoLocalPreAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashInTransferenciaAmount_QNAME, Double.class, DTORequestFondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestFondeoLocalPre.class)
    public JAXBElement<String> createDTORequestFondeoLocalPrePassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestFondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestFondeoLocalPre.class)
    public JAXBElement<String> createDTORequestFondeoLocalPrePin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestFondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestFondeoLocalPre.class)
    public JAXBElement<String> createDTORequestFondeoLocalPreUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestFondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestFondeoLocalPre.class)
    public JAXBElement<Integer> createDTORequestFondeoLocalPreBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaBrandId_QNAME, Integer.class, DTORequestFondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestFondeoLocalPre.class)
    public JAXBElement<String> createDTORequestFondeoLocalPreDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestFondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestFondeoLocalPre.class)
    public JAXBElement<String> createDTORequestFondeoLocalPreMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestFondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestFondeoLocalPre.class)
    public JAXBElement<Integer> createDTORequestFondeoLocalPreCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaCurrency_QNAME, Integer.class, DTORequestFondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestFondeoLocalPre.class)
    public JAXBElement<String> createDTORequestFondeoLocalPreLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestFondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestFondeoLocalPre.class)
    public JAXBElement<String> createDTORequestFondeoLocalPreUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestFondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestCashOutTransferencia.class)
    public JAXBElement<String> createDTORequestCashOutTransferenciaMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestCashOutTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestCashOutTransferencia.class)
    public JAXBElement<BigDecimal> createDTORequestCashOutTransferenciaAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DTORequestCashInTransferenciaAmount_QNAME, BigDecimal.class, DTORequestCashOutTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestCashOutTransferencia.class)
    public JAXBElement<String> createDTORequestCashOutTransferenciaPassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestCashOutTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestCashOutTransferencia.class)
    public JAXBElement<String> createDTORequestCashOutTransferenciaPin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestCashOutTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestCashOutTransferencia.class)
    public JAXBElement<String> createDTORequestCashOutTransferenciaUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestCashOutTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestCashOutTransferencia.class)
    public JAXBElement<Integer> createDTORequestCashOutTransferenciaBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaBrandId_QNAME, Integer.class, DTORequestCashOutTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestCashOutTransferencia.class)
    public JAXBElement<String> createDTORequestCashOutTransferenciaDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestCashOutTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestCashOutTransferencia.class)
    public JAXBElement<String> createDTORequestCashOutTransferenciaMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestCashOutTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestCashOutTransferencia.class)
    public JAXBElement<Integer> createDTORequestCashOutTransferenciaCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaCurrency_QNAME, Integer.class, DTORequestCashOutTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestCashOutTransferencia.class)
    public JAXBElement<String> createDTORequestCashOutTransferenciaLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestCashOutTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "otp", scope = DTORequestCashOutTransferencia.class)
    public JAXBElement<String> createDTORequestCashOutTransferenciaOtp(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmOtp_QNAME, String.class, DTORequestCashOutTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestCashOutTransferencia.class)
    public JAXBElement<String> createDTORequestCashOutTransferenciaUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestCashOutTransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestCobroDevolucionIvaConfirm.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaConfirmMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestCobroDevolucionIvaConfirm.class)
    public JAXBElement<Double> createDTORequestCobroDevolucionIvaConfirmAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashInTransferenciaAmount_QNAME, Double.class, DTORequestCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestCobroDevolucionIvaConfirm.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaConfirmPassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "montoImponible", scope = DTORequestCobroDevolucionIvaConfirm.class)
    public JAXBElement<Double> createDTORequestCobroDevolucionIvaConfirmMontoImponible(Double value) {
        return new JAXBElement<Double>(_DTORequestCobroDevolucionIvaPreMontoImponible_QNAME, Double.class, DTORequestCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestCobroDevolucionIvaConfirm.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaConfirmPin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestCobroDevolucionIvaConfirm.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestCobroDevolucionIvaConfirm.class)
    public JAXBElement<Integer> createDTORequestCobroDevolucionIvaConfirmBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaBrandId_QNAME, Integer.class, DTORequestCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestCobroDevolucionIvaConfirm.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaConfirmDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestCobroDevolucionIvaConfirm.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaConfirmMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestCobroDevolucionIvaConfirm.class)
    public JAXBElement<Integer> createDTORequestCobroDevolucionIvaConfirmCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaCurrency_QNAME, Integer.class, DTORequestCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestCobroDevolucionIvaConfirm.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaConfirmLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestCobroDevolucionIvaConfirm.class)
    public JAXBElement<String> createDTORequestCobroDevolucionIvaConfirmUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestRemitConfirm.class)
    public JAXBElement<String> createDTORequestRemitConfirmMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestRemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestRemitConfirm.class)
    public JAXBElement<Double> createDTORequestRemitConfirmAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashInTransferenciaAmount_QNAME, Double.class, DTORequestRemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestRemitConfirm.class)
    public JAXBElement<String> createDTORequestRemitConfirmPassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestRemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestRemitConfirm.class)
    public JAXBElement<String> createDTORequestRemitConfirmPin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestRemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestRemitConfirm.class)
    public JAXBElement<String> createDTORequestRemitConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestRemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestRemitConfirm.class)
    public JAXBElement<Integer> createDTORequestRemitConfirmBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaBrandId_QNAME, Integer.class, DTORequestRemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestRemitConfirm.class)
    public JAXBElement<String> createDTORequestRemitConfirmDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestRemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestRemitConfirm.class)
    public JAXBElement<String> createDTORequestRemitConfirmMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestRemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestRemitConfirm.class)
    public JAXBElement<Integer> createDTORequestRemitConfirmCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaCurrency_QNAME, Integer.class, DTORequestRemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestRemitConfirm.class)
    public JAXBElement<String> createDTORequestRemitConfirmLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestRemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestRemitConfirm.class)
    public JAXBElement<String> createDTORequestRemitConfirmUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestRemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestCobroPre.class)
    public JAXBElement<String> createDTORequestCobroPreMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestCobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestCobroPre.class)
    public JAXBElement<Double> createDTORequestCobroPreAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashInTransferenciaAmount_QNAME, Double.class, DTORequestCobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestCobroPre.class)
    public JAXBElement<String> createDTORequestCobroPrePassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestCobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestCobroPre.class)
    public JAXBElement<String> createDTORequestCobroPrePin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestCobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestCobroPre.class)
    public JAXBElement<String> createDTORequestCobroPreUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestCobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestCobroPre.class)
    public JAXBElement<Integer> createDTORequestCobroPreBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaBrandId_QNAME, Integer.class, DTORequestCobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestCobroPre.class)
    public JAXBElement<String> createDTORequestCobroPreDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestCobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestCobroPre.class)
    public JAXBElement<String> createDTORequestCobroPreMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestCobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestCobroPre.class)
    public JAXBElement<Integer> createDTORequestCobroPreCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaCurrency_QNAME, Integer.class, DTORequestCobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestCobroPre.class)
    public JAXBElement<String> createDTORequestCobroPreLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestCobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestCobroPre.class)
    public JAXBElement<String> createDTORequestCobroPreUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestCobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnSource", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPreMsisdnSource(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnSource_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestCashOutPre.class)
    public JAXBElement<Double> createDTORequestCashOutPreAmount(Double value) {
        return new JAXBElement<Double>(_DTORequestCashInTransferenciaAmount_QNAME, Double.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPrePassword(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPassword_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "pin", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPrePin(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaPin_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPreUtfi(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUtfi_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "brandId", scope = DTORequestCashOutPre.class)
    public JAXBElement<Integer> createDTORequestCashOutPreBrandId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaBrandId_QNAME, Integer.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "document", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPreDocument(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaDocument_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnTarget", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPreMsisdnTarget(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaMsisdnTarget_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTORequestCashOutPre.class)
    public JAXBElement<Integer> createDTORequestCashOutPreCurrency(Integer value) {
        return new JAXBElement<Integer>(_DTORequestCashInTransferenciaCurrency_QNAME, Integer.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPreLanguage(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaLanguage_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "otp", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPreOtp(String value) {
        return new JAXBElement<String>(_DTORequestCashOutConfirmOtp_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestCashOutPre.class)
    public JAXBElement<String> createDTORequestCashOutPreUser(String value) {
        return new JAXBElement<String>(_DTORequestCashInTransferenciaUser_QNAME, String.class, DTORequestCashOutPre.class, value);
    }

}
