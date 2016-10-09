
package us.inswitch.mts.webservices.dto.service.response.xsd;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.inswitch.mts.webservices.dto.service.response.xsd package. 
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

    private final static QName _DTOResponseCashOutConfirmUtfi_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "utfi");
    private final static QName _DTOResponseCashOutConfirmResultText_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "resultText");
    private final static QName _DTOResponseCashOutConfirmCodeErrorId_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "codeErrorId");
    private final static QName _DTOResponseListReservesDocumentNumber_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "documentNumber");
    private final static QName _DTOResponseListReservesMsisdnOrigin_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "msisdnOrigin");
    private final static QName _DTOResponseListReservesAccuntNumber_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "accuntNumber");
    private final static QName _DTOResponseListReservesAmount_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "amount");
    private final static QName _DTOResponseListReservesTransactionId_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "transactionId");
    private final static QName _DTOResponseListReservesTsEnd_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "tsEnd");
    private final static QName _DTOResponseListReservesTsCreated_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "tsCreated");
    private final static QName _DTOResponseWalletStatus_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "status");
    private final static QName _DTOResponseWalletCurrency_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "currency");
    private final static QName _DTOResponseWalletName_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "name");
    private final static QName _DTOResponseGetBalanceReportCSVZipReport_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "zipReport");
    private final static QName _DTOResponseGetBalanceReportCSVNameZip_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "nameZip");
    private final static QName _DTOResponseGetDailyReportZipDailyReport_QNAME = new QName("http://response.service.dto.webservices.mts.inswitch.us/xsd", "zipDailyReport");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.inswitch.mts.webservices.dto.service.response.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTOResponseCashInPre }
     * 
     */
    public DTOResponseCashInPre createDTOResponseCashInPre() {
        return new DTOResponseCashInPre();
    }

    /**
     * Create an instance of {@link DTOResponseCobroConfirm }
     * 
     */
    public DTOResponseCobroConfirm createDTOResponseCobroConfirm() {
        return new DTOResponseCobroConfirm();
    }

    /**
     * Create an instance of {@link DTOResponseCashInConfirm }
     * 
     */
    public DTOResponseCashInConfirm createDTOResponseCashInConfirm() {
        return new DTOResponseCashInConfirm();
    }

    /**
     * Create an instance of {@link DTOResponseChangePin }
     * 
     */
    public DTOResponseChangePin createDTOResponseChangePin() {
        return new DTOResponseChangePin();
    }

    /**
     * Create an instance of {@link DTOResponseWallets }
     * 
     */
    public DTOResponseWallets createDTOResponseWallets() {
        return new DTOResponseWallets();
    }

    /**
     * Create an instance of {@link DTOResponseAgentAutoReversion }
     * 
     */
    public DTOResponseAgentAutoReversion createDTOResponseAgentAutoReversion() {
        return new DTOResponseAgentAutoReversion();
    }

    /**
     * Create an instance of {@link DTOResponseGirosNacionalesConfirm }
     * 
     */
    public DTOResponseGirosNacionalesConfirm createDTOResponseGirosNacionalesConfirm() {
        return new DTOResponseGirosNacionalesConfirm();
    }

    /**
     * Create an instance of {@link DTOResponseListReserves }
     * 
     */
    public DTOResponseListReserves createDTOResponseListReserves() {
        return new DTOResponseListReserves();
    }

    /**
     * Create an instance of {@link DTOResponseFondeoLocalPre }
     * 
     */
    public DTOResponseFondeoLocalPre createDTOResponseFondeoLocalPre() {
        return new DTOResponseFondeoLocalPre();
    }

    /**
     * Create an instance of {@link DTOResponseCobroDevolucionIvaConfirm }
     * 
     */
    public DTOResponseCobroDevolucionIvaConfirm createDTOResponseCobroDevolucionIvaConfirm() {
        return new DTOResponseCobroDevolucionIvaConfirm();
    }

    /**
     * Create an instance of {@link DTOResponseReservesForBankTransfer }
     * 
     */
    public DTOResponseReservesForBankTransfer createDTOResponseReservesForBankTransfer() {
        return new DTOResponseReservesForBankTransfer();
    }

    /**
     * Create an instance of {@link DTOResponseCashOutConfirm }
     * 
     */
    public DTOResponseCashOutConfirm createDTOResponseCashOutConfirm() {
        return new DTOResponseCashOutConfirm();
    }

    /**
     * Create an instance of {@link DTOResponseRemitConfirm }
     * 
     */
    public DTOResponseRemitConfirm createDTOResponseRemitConfirm() {
        return new DTOResponseRemitConfirm();
    }

    /**
     * Create an instance of {@link DTOResponseGetDailyReport }
     * 
     */
    public DTOResponseGetDailyReport createDTOResponseGetDailyReport() {
        return new DTOResponseGetDailyReport();
    }

    /**
     * Create an instance of {@link DTOResponseCashOutPre }
     * 
     */
    public DTOResponseCashOutPre createDTOResponseCashOutPre() {
        return new DTOResponseCashOutPre();
    }

    /**
     * Create an instance of {@link DTOResponseRemitPre }
     * 
     */
    public DTOResponseRemitPre createDTOResponseRemitPre() {
        return new DTOResponseRemitPre();
    }

    /**
     * Create an instance of {@link DTOResponseUtfiAutoReversion }
     * 
     */
    public DTOResponseUtfiAutoReversion createDTOResponseUtfiAutoReversion() {
        return new DTOResponseUtfiAutoReversion();
    }

    /**
     * Create an instance of {@link DTOResponseGirosNacionalesPre }
     * 
     */
    public DTOResponseGirosNacionalesPre createDTOResponseGirosNacionalesPre() {
        return new DTOResponseGirosNacionalesPre();
    }

    /**
     * Create an instance of {@link DTOResponseFondeoLocalConfirm }
     * 
     */
    public DTOResponseFondeoLocalConfirm createDTOResponseFondeoLocalConfirm() {
        return new DTOResponseFondeoLocalConfirm();
    }

    /**
     * Create an instance of {@link DTOResponseCobroPre }
     * 
     */
    public DTOResponseCobroPre createDTOResponseCobroPre() {
        return new DTOResponseCobroPre();
    }

    /**
     * Create an instance of {@link DTOResponseWallet }
     * 
     */
    public DTOResponseWallet createDTOResponseWallet() {
        return new DTOResponseWallet();
    }

    /**
     * Create an instance of {@link DTOResponseGetBalanceReportCSV }
     * 
     */
    public DTOResponseGetBalanceReportCSV createDTOResponseGetBalanceReportCSV() {
        return new DTOResponseGetBalanceReportCSV();
    }

    /**
     * Create an instance of {@link DTOResponseCobroDevolucionIvaPre }
     * 
     */
    public DTOResponseCobroDevolucionIvaPre createDTOResponseCobroDevolucionIvaPre() {
        return new DTOResponseCobroDevolucionIvaPre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseCashOutConfirm.class)
    public JAXBElement<String> createDTOResponseCashOutConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseCashOutConfirm.class)
    public JAXBElement<String> createDTOResponseCashOutConfirmResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseCashOutConfirm.class)
    public JAXBElement<String> createDTOResponseCashOutConfirmCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseCashOutConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseFondeoLocalConfirm.class)
    public JAXBElement<String> createDTOResponseFondeoLocalConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseFondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseFondeoLocalConfirm.class)
    public JAXBElement<String> createDTOResponseFondeoLocalConfirmResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseFondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseFondeoLocalConfirm.class)
    public JAXBElement<String> createDTOResponseFondeoLocalConfirmCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseFondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseAgentAutoReversion.class)
    public JAXBElement<String> createDTOResponseAgentAutoReversionUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseAgentAutoReversion.class)
    public JAXBElement<String> createDTOResponseAgentAutoReversionResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseAgentAutoReversion.class)
    public JAXBElement<String> createDTOResponseAgentAutoReversionCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseAgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseWallets.class)
    public JAXBElement<String> createDTOResponseWalletsUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseWallets.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseWallets.class)
    public JAXBElement<String> createDTOResponseWalletsResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseWallets.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseWallets.class)
    public JAXBElement<String> createDTOResponseWalletsCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseWallets.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseCobroConfirm.class)
    public JAXBElement<String> createDTOResponseCobroConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseCobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseCobroConfirm.class)
    public JAXBElement<String> createDTOResponseCobroConfirmResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseCobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseCobroConfirm.class)
    public JAXBElement<String> createDTOResponseCobroConfirmCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseCobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "documentNumber", scope = DTOResponseListReserves.class)
    public JAXBElement<String> createDTOResponseListReservesDocumentNumber(String value) {
        return new JAXBElement<String>(_DTOResponseListReservesDocumentNumber_QNAME, String.class, DTOResponseListReserves.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "msisdnOrigin", scope = DTOResponseListReserves.class)
    public JAXBElement<Integer> createDTOResponseListReservesMsisdnOrigin(Integer value) {
        return new JAXBElement<Integer>(_DTOResponseListReservesMsisdnOrigin_QNAME, Integer.class, DTOResponseListReserves.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "accuntNumber", scope = DTOResponseListReserves.class)
    public JAXBElement<String> createDTOResponseListReservesAccuntNumber(String value) {
        return new JAXBElement<String>(_DTOResponseListReservesAccuntNumber_QNAME, String.class, DTOResponseListReserves.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTOResponseListReserves.class)
    public JAXBElement<BigDecimal> createDTOResponseListReservesAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DTOResponseListReservesAmount_QNAME, BigDecimal.class, DTOResponseListReserves.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "transactionId", scope = DTOResponseListReserves.class)
    public JAXBElement<Integer> createDTOResponseListReservesTransactionId(Integer value) {
        return new JAXBElement<Integer>(_DTOResponseListReservesTransactionId_QNAME, Integer.class, DTOResponseListReserves.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "tsEnd", scope = DTOResponseListReserves.class)
    public JAXBElement<String> createDTOResponseListReservesTsEnd(String value) {
        return new JAXBElement<String>(_DTOResponseListReservesTsEnd_QNAME, String.class, DTOResponseListReserves.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "tsCreated", scope = DTOResponseListReserves.class)
    public JAXBElement<String> createDTOResponseListReservesTsCreated(String value) {
        return new JAXBElement<String>(_DTOResponseListReservesTsCreated_QNAME, String.class, DTOResponseListReserves.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseRemitConfirm.class)
    public JAXBElement<String> createDTOResponseRemitConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseRemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseRemitConfirm.class)
    public JAXBElement<String> createDTOResponseRemitConfirmResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseRemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseRemitConfirm.class)
    public JAXBElement<String> createDTOResponseRemitConfirmCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseRemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTOResponseWallet.class)
    public JAXBElement<String> createDTOResponseWalletAmount(String value) {
        return new JAXBElement<String>(_DTOResponseListReservesAmount_QNAME, String.class, DTOResponseWallet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "status", scope = DTOResponseWallet.class)
    public JAXBElement<String> createDTOResponseWalletStatus(String value) {
        return new JAXBElement<String>(_DTOResponseWalletStatus_QNAME, String.class, DTOResponseWallet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "currency", scope = DTOResponseWallet.class)
    public JAXBElement<String> createDTOResponseWalletCurrency(String value) {
        return new JAXBElement<String>(_DTOResponseWalletCurrency_QNAME, String.class, DTOResponseWallet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "name", scope = DTOResponseWallet.class)
    public JAXBElement<String> createDTOResponseWalletName(String value) {
        return new JAXBElement<String>(_DTOResponseWalletName_QNAME, String.class, DTOResponseWallet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseFondeoLocalPre.class)
    public JAXBElement<String> createDTOResponseFondeoLocalPreUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseFondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseFondeoLocalPre.class)
    public JAXBElement<String> createDTOResponseFondeoLocalPreResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseFondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseFondeoLocalPre.class)
    public JAXBElement<String> createDTOResponseFondeoLocalPreCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseFondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "zipReport", scope = DTOResponseGetBalanceReportCSV.class)
    public JAXBElement<byte[]> createDTOResponseGetBalanceReportCSVZipReport(byte[] value) {
        return new JAXBElement<byte[]>(_DTOResponseGetBalanceReportCSVZipReport_QNAME, byte[].class, DTOResponseGetBalanceReportCSV.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "nameZip", scope = DTOResponseGetBalanceReportCSV.class)
    public JAXBElement<String> createDTOResponseGetBalanceReportCSVNameZip(String value) {
        return new JAXBElement<String>(_DTOResponseGetBalanceReportCSVNameZip_QNAME, String.class, DTOResponseGetBalanceReportCSV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseGetBalanceReportCSV.class)
    public JAXBElement<String> createDTOResponseGetBalanceReportCSVUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseGetBalanceReportCSV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseGetBalanceReportCSV.class)
    public JAXBElement<String> createDTOResponseGetBalanceReportCSVResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseGetBalanceReportCSV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseGetBalanceReportCSV.class)
    public JAXBElement<String> createDTOResponseGetBalanceReportCSVCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseGetBalanceReportCSV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseCobroPre.class)
    public JAXBElement<String> createDTOResponseCobroPreUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseCobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseCobroPre.class)
    public JAXBElement<String> createDTOResponseCobroPreResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseCobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseCobroPre.class)
    public JAXBElement<String> createDTOResponseCobroPreCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseCobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseCobroDevolucionIvaPre.class)
    public JAXBElement<String> createDTOResponseCobroDevolucionIvaPreUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseCobroDevolucionIvaPre.class)
    public JAXBElement<String> createDTOResponseCobroDevolucionIvaPreResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseCobroDevolucionIvaPre.class)
    public JAXBElement<String> createDTOResponseCobroDevolucionIvaPreCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseCobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseCobroDevolucionIvaConfirm.class)
    public JAXBElement<String> createDTOResponseCobroDevolucionIvaConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseCobroDevolucionIvaConfirm.class)
    public JAXBElement<String> createDTOResponseCobroDevolucionIvaConfirmResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseCobroDevolucionIvaConfirm.class)
    public JAXBElement<String> createDTOResponseCobroDevolucionIvaConfirmCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseCobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseGetDailyReport.class)
    public JAXBElement<String> createDTOResponseGetDailyReportUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseGetDailyReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "zipDailyReport", scope = DTOResponseGetDailyReport.class)
    public JAXBElement<byte[]> createDTOResponseGetDailyReportZipDailyReport(byte[] value) {
        return new JAXBElement<byte[]>(_DTOResponseGetDailyReportZipDailyReport_QNAME, byte[].class, DTOResponseGetDailyReport.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseGetDailyReport.class)
    public JAXBElement<String> createDTOResponseGetDailyReportResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseGetDailyReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseGetDailyReport.class)
    public JAXBElement<String> createDTOResponseGetDailyReportCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseGetDailyReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseRemitPre.class)
    public JAXBElement<String> createDTOResponseRemitPreUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseRemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseRemitPre.class)
    public JAXBElement<String> createDTOResponseRemitPreResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseRemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseRemitPre.class)
    public JAXBElement<String> createDTOResponseRemitPreCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseRemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseCashInConfirm.class)
    public JAXBElement<String> createDTOResponseCashInConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseCashInConfirm.class)
    public JAXBElement<String> createDTOResponseCashInConfirmResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseCashInConfirm.class)
    public JAXBElement<String> createDTOResponseCashInConfirmCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseCashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseCashInPre.class)
    public JAXBElement<String> createDTOResponseCashInPreUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseCashInPre.class)
    public JAXBElement<String> createDTOResponseCashInPreResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseCashInPre.class)
    public JAXBElement<String> createDTOResponseCashInPreCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseCashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseGirosNacionalesConfirm.class)
    public JAXBElement<String> createDTOResponseGirosNacionalesConfirmUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseGirosNacionalesConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseGirosNacionalesConfirm.class)
    public JAXBElement<String> createDTOResponseGirosNacionalesConfirmResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseGirosNacionalesConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseGirosNacionalesConfirm.class)
    public JAXBElement<String> createDTOResponseGirosNacionalesConfirmCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseGirosNacionalesConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseGirosNacionalesPre.class)
    public JAXBElement<String> createDTOResponseGirosNacionalesPreUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseGirosNacionalesPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseGirosNacionalesPre.class)
    public JAXBElement<String> createDTOResponseGirosNacionalesPreResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseGirosNacionalesPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseGirosNacionalesPre.class)
    public JAXBElement<String> createDTOResponseGirosNacionalesPreCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseGirosNacionalesPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseUtfiAutoReversion.class)
    public JAXBElement<String> createDTOResponseUtfiAutoReversionUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseUtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseUtfiAutoReversion.class)
    public JAXBElement<String> createDTOResponseUtfiAutoReversionResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseUtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseUtfiAutoReversion.class)
    public JAXBElement<String> createDTOResponseUtfiAutoReversionCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseUtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseChangePin.class)
    public JAXBElement<String> createDTOResponseChangePinUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseChangePin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseChangePin.class)
    public JAXBElement<String> createDTOResponseChangePinResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseChangePin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseChangePin.class)
    public JAXBElement<String> createDTOResponseChangePinCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseChangePin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseReservesForBankTransfer.class)
    public JAXBElement<String> createDTOResponseReservesForBankTransferUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseReservesForBankTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseReservesForBankTransfer.class)
    public JAXBElement<String> createDTOResponseReservesForBankTransferResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseReservesForBankTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseReservesForBankTransfer.class)
    public JAXBElement<String> createDTOResponseReservesForBankTransferCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseReservesForBankTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTOResponseCashOutPre.class)
    public JAXBElement<String> createDTOResponseCashOutPreUtfi(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmUtfi_QNAME, String.class, DTOResponseCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "resultText", scope = DTOResponseCashOutPre.class)
    public JAXBElement<String> createDTOResponseCashOutPreResultText(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmResultText_QNAME, String.class, DTOResponseCashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.dto.webservices.mts.inswitch.us/xsd", name = "codeErrorId", scope = DTOResponseCashOutPre.class)
    public JAXBElement<String> createDTOResponseCashOutPreCodeErrorId(String value) {
        return new JAXBElement<String>(_DTOResponseCashOutConfirmCodeErrorId_QNAME, String.class, DTOResponseCashOutPre.class, value);
    }

}
