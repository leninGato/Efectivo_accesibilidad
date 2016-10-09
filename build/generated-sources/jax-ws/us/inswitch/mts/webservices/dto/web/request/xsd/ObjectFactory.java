
package us.inswitch.mts.webservices.dto.web.request.xsd;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.inswitch.mts.webservices.dto.web.request.xsd package. 
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

    private final static QName _DTORequestReportTransactionMsisdnUser_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "user");
    private final static QName _DTORequestReportTransactionMsisdnDateFrom_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "dateFrom");
    private final static QName _DTORequestReportTransactionMsisdnMsisdn_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "msisdn");
    private final static QName _DTORequestReportTransactionMsisdnPage_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "page");
    private final static QName _DTORequestReportTransactionMsisdnLanguage_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "language");
    private final static QName _DTORequestReportTransactionMsisdnDateTo_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "dateTo");
    private final static QName _DTORequestReportTransactionMsisdnRowPerPage_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "rowPerPage");
    private final static QName _DTORequestReportTransactionMsisdnUtfi_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "utfi");
    private final static QName _DTORequestReportTransactionMsisdnPassword_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "password");
    private final static QName _DTORequestReportTransactionMsisdnSourceId_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "sourceId");
    private final static QName _DTORequestRetrieveBatchSize_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "size");
    private final static QName _DTORequestDeleteBatchLineBatchId_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "batchId");
    private final static QName _DTORequestDeleteBatchLineLineId_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "lineId");
    private final static QName _DTORequestEditBatchLineDeviceId_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "deviceId");
    private final static QName _DTORequestEditBatchLineCurrencyId_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "currencyId");
    private final static QName _DTORequestEditBatchLineWalletTypeId_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "walletTypeId");
    private final static QName _DTORequestEditBatchLineRole_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "role");
    private final static QName _DTORequestEditBatchLineAmount_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "amount");
    private final static QName _DTORequestMassiveBatchUploadDescription_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "description");
    private final static QName _DTORequestMassiveBatchUploadBatchByte_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "batchByte");
    private final static QName _DTORequestGetBalanceReportAgentId_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "agentId");
    private final static QName _DTORequestRetrieveBatchOneLineLine_QNAME = new QName("http://request.web.dto.webservices.mts.inswitch.us/xsd", "line");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.inswitch.mts.webservices.dto.web.request.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTORequestGetBalanceReportCSV }
     * 
     */
    public DTORequestGetBalanceReportCSV createDTORequestGetBalanceReportCSV() {
        return new DTORequestGetBalanceReportCSV();
    }

    /**
     * Create an instance of {@link DTORequestRetrieveBatchLines }
     * 
     */
    public DTORequestRetrieveBatchLines createDTORequestRetrieveBatchLines() {
        return new DTORequestRetrieveBatchLines();
    }

    /**
     * Create an instance of {@link DTORequestEditBatchLine }
     * 
     */
    public DTORequestEditBatchLine createDTORequestEditBatchLine() {
        return new DTORequestEditBatchLine();
    }

    /**
     * Create an instance of {@link DTORequestExecuteBatchPayment }
     * 
     */
    public DTORequestExecuteBatchPayment createDTORequestExecuteBatchPayment() {
        return new DTORequestExecuteBatchPayment();
    }

    /**
     * Create an instance of {@link DTORequestReportTransaction }
     * 
     */
    public DTORequestReportTransaction createDTORequestReportTransaction() {
        return new DTORequestReportTransaction();
    }

    /**
     * Create an instance of {@link DTORequestRetrieveBatchOneLine }
     * 
     */
    public DTORequestRetrieveBatchOneLine createDTORequestRetrieveBatchOneLine() {
        return new DTORequestRetrieveBatchOneLine();
    }

    /**
     * Create an instance of {@link DTORequestGetBalanceReport }
     * 
     */
    public DTORequestGetBalanceReport createDTORequestGetBalanceReport() {
        return new DTORequestGetBalanceReport();
    }

    /**
     * Create an instance of {@link DTORequestRetrieveBatch }
     * 
     */
    public DTORequestRetrieveBatch createDTORequestRetrieveBatch() {
        return new DTORequestRetrieveBatch();
    }

    /**
     * Create an instance of {@link DTORequestMassiveBatchUpload }
     * 
     */
    public DTORequestMassiveBatchUpload createDTORequestMassiveBatchUpload() {
        return new DTORequestMassiveBatchUpload();
    }

    /**
     * Create an instance of {@link DTORequestDeleteBatchLine }
     * 
     */
    public DTORequestDeleteBatchLine createDTORequestDeleteBatchLine() {
        return new DTORequestDeleteBatchLine();
    }

    /**
     * Create an instance of {@link DTORequestReportTransactionMsisdn }
     * 
     */
    public DTORequestReportTransactionMsisdn createDTORequestReportTransactionMsisdn() {
        return new DTORequestReportTransactionMsisdn();
    }

    /**
     * Create an instance of {@link DTORequestDeleteBatchPayment }
     * 
     */
    public DTORequestDeleteBatchPayment createDTORequestDeleteBatchPayment() {
        return new DTORequestDeleteBatchPayment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestReportTransactionMsisdn.class)
    public JAXBElement<String> createDTORequestReportTransactionMsisdnUser(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUser_QNAME, String.class, DTORequestReportTransactionMsisdn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "dateFrom", scope = DTORequestReportTransactionMsisdn.class)
    public JAXBElement<String> createDTORequestReportTransactionMsisdnDateFrom(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnDateFrom_QNAME, String.class, DTORequestReportTransactionMsisdn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "msisdn", scope = DTORequestReportTransactionMsisdn.class)
    public JAXBElement<String> createDTORequestReportTransactionMsisdnMsisdn(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnMsisdn_QNAME, String.class, DTORequestReportTransactionMsisdn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "page", scope = DTORequestReportTransactionMsisdn.class)
    public JAXBElement<Integer> createDTORequestReportTransactionMsisdnPage(Integer value) {
        return new JAXBElement<Integer>(_DTORequestReportTransactionMsisdnPage_QNAME, Integer.class, DTORequestReportTransactionMsisdn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestReportTransactionMsisdn.class)
    public JAXBElement<String> createDTORequestReportTransactionMsisdnLanguage(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnLanguage_QNAME, String.class, DTORequestReportTransactionMsisdn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "dateTo", scope = DTORequestReportTransactionMsisdn.class)
    public JAXBElement<String> createDTORequestReportTransactionMsisdnDateTo(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnDateTo_QNAME, String.class, DTORequestReportTransactionMsisdn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "rowPerPage", scope = DTORequestReportTransactionMsisdn.class)
    public JAXBElement<Integer> createDTORequestReportTransactionMsisdnRowPerPage(Integer value) {
        return new JAXBElement<Integer>(_DTORequestReportTransactionMsisdnRowPerPage_QNAME, Integer.class, DTORequestReportTransactionMsisdn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestReportTransactionMsisdn.class)
    public JAXBElement<String> createDTORequestReportTransactionMsisdnUtfi(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUtfi_QNAME, String.class, DTORequestReportTransactionMsisdn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestReportTransactionMsisdn.class)
    public JAXBElement<String> createDTORequestReportTransactionMsisdnPassword(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnPassword_QNAME, String.class, DTORequestReportTransactionMsisdn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "sourceId", scope = DTORequestReportTransactionMsisdn.class)
    public JAXBElement<Integer> createDTORequestReportTransactionMsisdnSourceId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestReportTransactionMsisdnSourceId_QNAME, Integer.class, DTORequestReportTransactionMsisdn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestReportTransaction.class)
    public JAXBElement<String> createDTORequestReportTransactionUser(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUser_QNAME, String.class, DTORequestReportTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "dateFrom", scope = DTORequestReportTransaction.class)
    public JAXBElement<String> createDTORequestReportTransactionDateFrom(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnDateFrom_QNAME, String.class, DTORequestReportTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "page", scope = DTORequestReportTransaction.class)
    public JAXBElement<Integer> createDTORequestReportTransactionPage(Integer value) {
        return new JAXBElement<Integer>(_DTORequestReportTransactionMsisdnPage_QNAME, Integer.class, DTORequestReportTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestReportTransaction.class)
    public JAXBElement<String> createDTORequestReportTransactionLanguage(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnLanguage_QNAME, String.class, DTORequestReportTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "dateTo", scope = DTORequestReportTransaction.class)
    public JAXBElement<String> createDTORequestReportTransactionDateTo(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnDateTo_QNAME, String.class, DTORequestReportTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "rowPerPage", scope = DTORequestReportTransaction.class)
    public JAXBElement<Integer> createDTORequestReportTransactionRowPerPage(Integer value) {
        return new JAXBElement<Integer>(_DTORequestReportTransactionMsisdnRowPerPage_QNAME, Integer.class, DTORequestReportTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestReportTransaction.class)
    public JAXBElement<String> createDTORequestReportTransactionUtfi(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUtfi_QNAME, String.class, DTORequestReportTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestReportTransaction.class)
    public JAXBElement<String> createDTORequestReportTransactionPassword(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnPassword_QNAME, String.class, DTORequestReportTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "sourceId", scope = DTORequestReportTransaction.class)
    public JAXBElement<Integer> createDTORequestReportTransactionSourceId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestReportTransactionMsisdnSourceId_QNAME, Integer.class, DTORequestReportTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestRetrieveBatch.class)
    public JAXBElement<String> createDTORequestRetrieveBatchUser(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUser_QNAME, String.class, DTORequestRetrieveBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "page", scope = DTORequestRetrieveBatch.class)
    public JAXBElement<Integer> createDTORequestRetrieveBatchPage(Integer value) {
        return new JAXBElement<Integer>(_DTORequestReportTransactionMsisdnPage_QNAME, Integer.class, DTORequestRetrieveBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestRetrieveBatch.class)
    public JAXBElement<String> createDTORequestRetrieveBatchLanguage(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnLanguage_QNAME, String.class, DTORequestRetrieveBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "size", scope = DTORequestRetrieveBatch.class)
    public JAXBElement<Integer> createDTORequestRetrieveBatchSize(Integer value) {
        return new JAXBElement<Integer>(_DTORequestRetrieveBatchSize_QNAME, Integer.class, DTORequestRetrieveBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestRetrieveBatch.class)
    public JAXBElement<String> createDTORequestRetrieveBatchUtfi(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUtfi_QNAME, String.class, DTORequestRetrieveBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestRetrieveBatch.class)
    public JAXBElement<String> createDTORequestRetrieveBatchPassword(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnPassword_QNAME, String.class, DTORequestRetrieveBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestDeleteBatchLine.class)
    public JAXBElement<String> createDTORequestDeleteBatchLineUser(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUser_QNAME, String.class, DTORequestDeleteBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "batchId", scope = DTORequestDeleteBatchLine.class)
    public JAXBElement<String> createDTORequestDeleteBatchLineBatchId(String value) {
        return new JAXBElement<String>(_DTORequestDeleteBatchLineBatchId_QNAME, String.class, DTORequestDeleteBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestDeleteBatchLine.class)
    public JAXBElement<String> createDTORequestDeleteBatchLineLanguage(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnLanguage_QNAME, String.class, DTORequestDeleteBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "lineId", scope = DTORequestDeleteBatchLine.class)
    public JAXBElement<String> createDTORequestDeleteBatchLineLineId(String value) {
        return new JAXBElement<String>(_DTORequestDeleteBatchLineLineId_QNAME, String.class, DTORequestDeleteBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestDeleteBatchLine.class)
    public JAXBElement<String> createDTORequestDeleteBatchLineUtfi(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUtfi_QNAME, String.class, DTORequestDeleteBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestDeleteBatchLine.class)
    public JAXBElement<String> createDTORequestDeleteBatchLinePassword(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnPassword_QNAME, String.class, DTORequestDeleteBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "deviceId", scope = DTORequestEditBatchLine.class)
    public JAXBElement<String> createDTORequestEditBatchLineDeviceId(String value) {
        return new JAXBElement<String>(_DTORequestEditBatchLineDeviceId_QNAME, String.class, DTORequestEditBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestEditBatchLine.class)
    public JAXBElement<String> createDTORequestEditBatchLineUser(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUser_QNAME, String.class, DTORequestEditBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "batchId", scope = DTORequestEditBatchLine.class)
    public JAXBElement<String> createDTORequestEditBatchLineBatchId(String value) {
        return new JAXBElement<String>(_DTORequestDeleteBatchLineBatchId_QNAME, String.class, DTORequestEditBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "currencyId", scope = DTORequestEditBatchLine.class)
    public JAXBElement<String> createDTORequestEditBatchLineCurrencyId(String value) {
        return new JAXBElement<String>(_DTORequestEditBatchLineCurrencyId_QNAME, String.class, DTORequestEditBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestEditBatchLine.class)
    public JAXBElement<String> createDTORequestEditBatchLineLanguage(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnLanguage_QNAME, String.class, DTORequestEditBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "walletTypeId", scope = DTORequestEditBatchLine.class)
    public JAXBElement<String> createDTORequestEditBatchLineWalletTypeId(String value) {
        return new JAXBElement<String>(_DTORequestEditBatchLineWalletTypeId_QNAME, String.class, DTORequestEditBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "lineId", scope = DTORequestEditBatchLine.class)
    public JAXBElement<String> createDTORequestEditBatchLineLineId(String value) {
        return new JAXBElement<String>(_DTORequestDeleteBatchLineLineId_QNAME, String.class, DTORequestEditBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestEditBatchLine.class)
    public JAXBElement<String> createDTORequestEditBatchLineUtfi(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUtfi_QNAME, String.class, DTORequestEditBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "role", scope = DTORequestEditBatchLine.class)
    public JAXBElement<String> createDTORequestEditBatchLineRole(String value) {
        return new JAXBElement<String>(_DTORequestEditBatchLineRole_QNAME, String.class, DTORequestEditBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "amount", scope = DTORequestEditBatchLine.class)
    public JAXBElement<BigDecimal> createDTORequestEditBatchLineAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DTORequestEditBatchLineAmount_QNAME, BigDecimal.class, DTORequestEditBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestEditBatchLine.class)
    public JAXBElement<String> createDTORequestEditBatchLinePassword(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnPassword_QNAME, String.class, DTORequestEditBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestExecuteBatchPayment.class)
    public JAXBElement<String> createDTORequestExecuteBatchPaymentUser(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUser_QNAME, String.class, DTORequestExecuteBatchPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "batchId", scope = DTORequestExecuteBatchPayment.class)
    public JAXBElement<String> createDTORequestExecuteBatchPaymentBatchId(String value) {
        return new JAXBElement<String>(_DTORequestDeleteBatchLineBatchId_QNAME, String.class, DTORequestExecuteBatchPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestExecuteBatchPayment.class)
    public JAXBElement<String> createDTORequestExecuteBatchPaymentLanguage(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnLanguage_QNAME, String.class, DTORequestExecuteBatchPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestExecuteBatchPayment.class)
    public JAXBElement<String> createDTORequestExecuteBatchPaymentUtfi(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUtfi_QNAME, String.class, DTORequestExecuteBatchPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestExecuteBatchPayment.class)
    public JAXBElement<String> createDTORequestExecuteBatchPaymentPassword(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnPassword_QNAME, String.class, DTORequestExecuteBatchPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestMassiveBatchUpload.class)
    public JAXBElement<String> createDTORequestMassiveBatchUploadUser(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUser_QNAME, String.class, DTORequestMassiveBatchUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestMassiveBatchUpload.class)
    public JAXBElement<String> createDTORequestMassiveBatchUploadLanguage(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnLanguage_QNAME, String.class, DTORequestMassiveBatchUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "description", scope = DTORequestMassiveBatchUpload.class)
    public JAXBElement<String> createDTORequestMassiveBatchUploadDescription(String value) {
        return new JAXBElement<String>(_DTORequestMassiveBatchUploadDescription_QNAME, String.class, DTORequestMassiveBatchUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestMassiveBatchUpload.class)
    public JAXBElement<String> createDTORequestMassiveBatchUploadUtfi(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUtfi_QNAME, String.class, DTORequestMassiveBatchUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "batchByte", scope = DTORequestMassiveBatchUpload.class)
    public JAXBElement<byte[]> createDTORequestMassiveBatchUploadBatchByte(byte[] value) {
        return new JAXBElement<byte[]>(_DTORequestMassiveBatchUploadBatchByte_QNAME, byte[].class, DTORequestMassiveBatchUpload.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestMassiveBatchUpload.class)
    public JAXBElement<String> createDTORequestMassiveBatchUploadPassword(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnPassword_QNAME, String.class, DTORequestMassiveBatchUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestGetBalanceReport.class)
    public JAXBElement<String> createDTORequestGetBalanceReportUser(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUser_QNAME, String.class, DTORequestGetBalanceReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "dateFrom", scope = DTORequestGetBalanceReport.class)
    public JAXBElement<String> createDTORequestGetBalanceReportDateFrom(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnDateFrom_QNAME, String.class, DTORequestGetBalanceReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "page", scope = DTORequestGetBalanceReport.class)
    public JAXBElement<Integer> createDTORequestGetBalanceReportPage(Integer value) {
        return new JAXBElement<Integer>(_DTORequestReportTransactionMsisdnPage_QNAME, Integer.class, DTORequestGetBalanceReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestGetBalanceReport.class)
    public JAXBElement<String> createDTORequestGetBalanceReportLanguage(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnLanguage_QNAME, String.class, DTORequestGetBalanceReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "dateTo", scope = DTORequestGetBalanceReport.class)
    public JAXBElement<String> createDTORequestGetBalanceReportDateTo(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnDateTo_QNAME, String.class, DTORequestGetBalanceReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "rowPerPage", scope = DTORequestGetBalanceReport.class)
    public JAXBElement<Integer> createDTORequestGetBalanceReportRowPerPage(Integer value) {
        return new JAXBElement<Integer>(_DTORequestReportTransactionMsisdnRowPerPage_QNAME, Integer.class, DTORequestGetBalanceReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestGetBalanceReport.class)
    public JAXBElement<String> createDTORequestGetBalanceReportUtfi(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUtfi_QNAME, String.class, DTORequestGetBalanceReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "agentId", scope = DTORequestGetBalanceReport.class)
    public JAXBElement<Integer> createDTORequestGetBalanceReportAgentId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestGetBalanceReportAgentId_QNAME, Integer.class, DTORequestGetBalanceReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestGetBalanceReport.class)
    public JAXBElement<String> createDTORequestGetBalanceReportPassword(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnPassword_QNAME, String.class, DTORequestGetBalanceReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestRetrieveBatchLines.class)
    public JAXBElement<String> createDTORequestRetrieveBatchLinesUser(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUser_QNAME, String.class, DTORequestRetrieveBatchLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "batchId", scope = DTORequestRetrieveBatchLines.class)
    public JAXBElement<String> createDTORequestRetrieveBatchLinesBatchId(String value) {
        return new JAXBElement<String>(_DTORequestDeleteBatchLineBatchId_QNAME, String.class, DTORequestRetrieveBatchLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "page", scope = DTORequestRetrieveBatchLines.class)
    public JAXBElement<Integer> createDTORequestRetrieveBatchLinesPage(Integer value) {
        return new JAXBElement<Integer>(_DTORequestReportTransactionMsisdnPage_QNAME, Integer.class, DTORequestRetrieveBatchLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestRetrieveBatchLines.class)
    public JAXBElement<String> createDTORequestRetrieveBatchLinesLanguage(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnLanguage_QNAME, String.class, DTORequestRetrieveBatchLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "size", scope = DTORequestRetrieveBatchLines.class)
    public JAXBElement<Integer> createDTORequestRetrieveBatchLinesSize(Integer value) {
        return new JAXBElement<Integer>(_DTORequestRetrieveBatchSize_QNAME, Integer.class, DTORequestRetrieveBatchLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestRetrieveBatchLines.class)
    public JAXBElement<String> createDTORequestRetrieveBatchLinesUtfi(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUtfi_QNAME, String.class, DTORequestRetrieveBatchLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestRetrieveBatchLines.class)
    public JAXBElement<String> createDTORequestRetrieveBatchLinesPassword(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnPassword_QNAME, String.class, DTORequestRetrieveBatchLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestGetBalanceReportCSV.class)
    public JAXBElement<String> createDTORequestGetBalanceReportCSVUser(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUser_QNAME, String.class, DTORequestGetBalanceReportCSV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "dateFrom", scope = DTORequestGetBalanceReportCSV.class)
    public JAXBElement<String> createDTORequestGetBalanceReportCSVDateFrom(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnDateFrom_QNAME, String.class, DTORequestGetBalanceReportCSV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestGetBalanceReportCSV.class)
    public JAXBElement<String> createDTORequestGetBalanceReportCSVLanguage(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnLanguage_QNAME, String.class, DTORequestGetBalanceReportCSV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "dateTo", scope = DTORequestGetBalanceReportCSV.class)
    public JAXBElement<String> createDTORequestGetBalanceReportCSVDateTo(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnDateTo_QNAME, String.class, DTORequestGetBalanceReportCSV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestGetBalanceReportCSV.class)
    public JAXBElement<String> createDTORequestGetBalanceReportCSVUtfi(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUtfi_QNAME, String.class, DTORequestGetBalanceReportCSV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "agentId", scope = DTORequestGetBalanceReportCSV.class)
    public JAXBElement<Integer> createDTORequestGetBalanceReportCSVAgentId(Integer value) {
        return new JAXBElement<Integer>(_DTORequestGetBalanceReportAgentId_QNAME, Integer.class, DTORequestGetBalanceReportCSV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestGetBalanceReportCSV.class)
    public JAXBElement<String> createDTORequestGetBalanceReportCSVPassword(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnPassword_QNAME, String.class, DTORequestGetBalanceReportCSV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestDeleteBatchPayment.class)
    public JAXBElement<String> createDTORequestDeleteBatchPaymentUser(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUser_QNAME, String.class, DTORequestDeleteBatchPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "batchId", scope = DTORequestDeleteBatchPayment.class)
    public JAXBElement<String> createDTORequestDeleteBatchPaymentBatchId(String value) {
        return new JAXBElement<String>(_DTORequestDeleteBatchLineBatchId_QNAME, String.class, DTORequestDeleteBatchPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestDeleteBatchPayment.class)
    public JAXBElement<String> createDTORequestDeleteBatchPaymentLanguage(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnLanguage_QNAME, String.class, DTORequestDeleteBatchPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestDeleteBatchPayment.class)
    public JAXBElement<String> createDTORequestDeleteBatchPaymentUtfi(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUtfi_QNAME, String.class, DTORequestDeleteBatchPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestDeleteBatchPayment.class)
    public JAXBElement<String> createDTORequestDeleteBatchPaymentPassword(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnPassword_QNAME, String.class, DTORequestDeleteBatchPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "user", scope = DTORequestRetrieveBatchOneLine.class)
    public JAXBElement<String> createDTORequestRetrieveBatchOneLineUser(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUser_QNAME, String.class, DTORequestRetrieveBatchOneLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "batchId", scope = DTORequestRetrieveBatchOneLine.class)
    public JAXBElement<String> createDTORequestRetrieveBatchOneLineBatchId(String value) {
        return new JAXBElement<String>(_DTORequestDeleteBatchLineBatchId_QNAME, String.class, DTORequestRetrieveBatchOneLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "language", scope = DTORequestRetrieveBatchOneLine.class)
    public JAXBElement<String> createDTORequestRetrieveBatchOneLineLanguage(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnLanguage_QNAME, String.class, DTORequestRetrieveBatchOneLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "line", scope = DTORequestRetrieveBatchOneLine.class)
    public JAXBElement<String> createDTORequestRetrieveBatchOneLineLine(String value) {
        return new JAXBElement<String>(_DTORequestRetrieveBatchOneLineLine_QNAME, String.class, DTORequestRetrieveBatchOneLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "utfi", scope = DTORequestRetrieveBatchOneLine.class)
    public JAXBElement<String> createDTORequestRetrieveBatchOneLineUtfi(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnUtfi_QNAME, String.class, DTORequestRetrieveBatchOneLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", name = "password", scope = DTORequestRetrieveBatchOneLine.class)
    public JAXBElement<String> createDTORequestRetrieveBatchOneLinePassword(String value) {
        return new JAXBElement<String>(_DTORequestReportTransactionMsisdnPassword_QNAME, String.class, DTORequestRetrieveBatchOneLine.class, value);
    }

}
