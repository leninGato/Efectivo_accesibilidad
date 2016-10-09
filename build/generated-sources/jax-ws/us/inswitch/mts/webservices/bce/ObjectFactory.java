
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import us.inswitch.mts.exceptions.xsd.ServiceException;
import us.inswitch.mts.webservices.dto.administration.request.xsd.DTORequestDeleteClientAdditionalData;
import us.inswitch.mts.webservices.dto.administration.request.xsd.DTORequestGetClientAdditionalData;
import us.inswitch.mts.webservices.dto.administration.request.xsd.DTORequestInsertClientAdditionalData;
import us.inswitch.mts.webservices.dto.administration.request.xsd.DTORequestSendPUSH;
import us.inswitch.mts.webservices.dto.administration.request.xsd.DTORequestSendSMS;
import us.inswitch.mts.webservices.dto.administration.request.xsd.DTORequestUpdateClientAdditionalData;
import us.inswitch.mts.webservices.dto.administration.response.xsd.DTOResponseDeleteClientAdditionalData;
import us.inswitch.mts.webservices.dto.administration.response.xsd.DTOResponseGetClientAdditionalData;
import us.inswitch.mts.webservices.dto.administration.response.xsd.DTOResponseInsertClientAdditionalData;
import us.inswitch.mts.webservices.dto.administration.response.xsd.DTOResponseSendPUSH;
import us.inswitch.mts.webservices.dto.administration.response.xsd.DTOResponseSendSMS;
import us.inswitch.mts.webservices.dto.administration.response.xsd.DTOResponseUpdateClientAdditionalData;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestAgentAutoReversion;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashInConfirm;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashInPre;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashInTransferencia;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashOutConfirm;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashOutPre;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashOutTransferencia;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestChangePin;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCobroConfirm;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCobroDevolucionIvaConfirm;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCobroDevolucionIvaPre;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCobroPre;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestFondeoLocalConfirm;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestFondeoLocalPre;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestGetBalance;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestGetDailyReport;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestGirosNacionales;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestRemitConfirm;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestRemitPre;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestReservesForBankTransfer;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestUtfiAutoReversion;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseAgentAutoReversion;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashInConfirm;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashInPre;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashOutConfirm;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashOutPre;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseChangePin;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCobroConfirm;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCobroDevolucionIvaConfirm;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCobroDevolucionIvaPre;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCobroPre;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseFondeoLocalConfirm;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseFondeoLocalPre;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseGetBalanceReportCSV;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseGetDailyReport;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseGirosNacionalesConfirm;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseGirosNacionalesPre;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseRemitConfirm;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseRemitPre;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseReservesForBankTransfer;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseUtfiAutoReversion;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseWallets;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestDeleteBatchLine;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestDeleteBatchPayment;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestEditBatchLine;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestExecuteBatchPayment;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestGetBalanceReport;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestGetBalanceReportCSV;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestMassiveBatchUpload;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestReportTransaction;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestReportTransactionMsisdn;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestRetrieveBatch;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestRetrieveBatchLines;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestRetrieveBatchOneLine;
import us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseDeleteBatchLine;
import us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseDeleteBatchPayment;
import us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseEditBatchLine;
import us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseExecuteBatchPaymentConfirm;
import us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseExecuteBatchPaymentPre;
import us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseGetBalanceReport;
import us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseMassiveBatchUpload;
import us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseReportTransactions;
import us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseRetrieveBatchLines;
import us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseRetrieveBatchOneLine;
import us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseRetrieveBatchs;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.inswitch.mts.webservices.bce package. 
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

    private final static QName _CobroConfirmDtoRequestCobroConfirm_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCobroConfirm");
    private final static QName _CashOutTransferenciaConfirmDtoRequestCashOutTransferenciaConfirm_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCashOutTransferenciaConfirm");
    private final static QName _SendSMSResponseReturn_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "return");
    private final static QName _MassiveBatchDebitUploadDtoRequestMassiveBatchUpload_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestMassiveBatchUpload");
    private final static QName _DeleteBatchLineDtoRequestDeleteBatchLine_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestDeleteBatchLine");
    private final static QName _EditBatchLineDtoRequestEditBatchLine_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestEditBatchLine");
    private final static QName _ReportTransactionDtoRequestReportTransaction_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestReportTransaction");
    private final static QName _DeleteBatchPaymentDtoRequestDeleteBatchPayment_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestDeleteBatchPayment");
    private final static QName _CashOutPreDtoRequestCashOutPre_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCashOutPre");
    private final static QName _GetDailyReportDtoRequestGetDailyReport_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestGetDailyReport");
    private final static QName _RetrieveBatchLinesDtoRequestRetrieveBatchLines_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestRetrieveBatchLines");
    private final static QName _CashInTransferenciaConfirmDtoRequestCashInTransferenciaConfirm_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCashInTransferenciaConfirm");
    private final static QName _DeleteClientAdditionalDataDtoRequestDeleteClientAdditionalData_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestDeleteClientAdditionalData");
    private final static QName _GetBalanceReportDtoRequestGetBalanceReport_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestGetBalanceReport");
    private final static QName _GetClientAdditionalDataDtoRequestGetClientAdditionalData_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestGetClientAdditionalData");
    private final static QName _CashInATMConfirmDtoRequestCashInATMConfirm_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCashInATMConfirm");
    private final static QName _SendSMSDtoRequestSendSMS_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestSendSMS");
    private final static QName _MTSServiceServiceExceptionServiceException_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "ServiceException");
    private final static QName _UpdateClientAdditionalDataDtoRequestUpdateClientAdditionalData_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestUpdateClientAdditionalData");
    private final static QName _ExecuteBatchPaymentPreDtoRequestExecuteBatchPayment_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestExecuteBatchPayment");
    private final static QName _RetrieveBatchDebitDtoRequestRetrieveBatchDebit_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestRetrieveBatchDebit");
    private final static QName _RetrieveBatchOneLineDtoRequestRetrieveBatchOneLine_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestRetrieveBatchOneLine");
    private final static QName _FondeoLocalConfirmDtoRequestFondeoLocalConfirm_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestFondeoLocalConfirm");
    private final static QName _GirosNacionalesConfirmDtoRequestGirosNacionales_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestGirosNacionales");
    private final static QName _RetrieveBatchCreditDtoRequestRetrieveBatchCredit_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestRetrieveBatchCredit");
    private final static QName _ChangePinDtoRequestChangePin_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestChangePin");
    private final static QName _UtfiAutoReversionDtoRequestUtfiAutoReversion_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestUtfiAutoReversion");
    private final static QName _FondeoLocalPreDtoRequestFondeoLocalPre_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestFondeoLocalPre");
    private final static QName _CashOutATMConfirmDtoRequestCashOutATMConfirm_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCashOutATMConfirm");
    private final static QName _CashInPreDtoRequestCashInPre_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCashInPre");
    private final static QName _CashOutTransferenciaPreDtoRequestCashOutTransferenciaPre_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCashOutTransferenciaPre");
    private final static QName _AgentAutoReversionDtoRequestAgentAutoReversion_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestAgentAutoReversion");
    private final static QName _CobroDevolucionIvaConfirmDtoRequestCobroDevolucionIvaConfirm_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCobroDevolucionIvaConfirm");
    private final static QName _CashInTransferenciaPreDtoRequestCashInTransferenciaPre_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCashInTransferenciaPre");
    private final static QName _ReservesForBankTransferDtoRequestReservesForBankTransfer_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestReservesForBankTransfer");
    private final static QName _GetBalanceReportCSVDtoRequestGetBalanceReportCSV_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestGetBalanceReportCSV");
    private final static QName _GetBalanceDtoRequestGetBalance_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestGetBalance");
    private final static QName _CashOutATMPreDtoRequestCashOutATMPre_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCashOutATMPre");
    private final static QName _CobroPreDtoRequestCobroPre_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCobroPre");
    private final static QName _SendPUSHDtoRequestSendPUSH_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestSendPUSH");
    private final static QName _CashInConfirmDtoRequestCashInConfirm_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCashInConfirm");
    private final static QName _InsertClientAdditionalDataDtoRequestInsertClientAdditionalData_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestInsertClientAdditionalData");
    private final static QName _ReportTransactionMsisdnDtoRequestReportTransactionMsisdn_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestReportTransactionMsisdn");
    private final static QName _RemitConfirmDtoRequestRemitConfirm_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestRemitConfirm");
    private final static QName _RemitPreDtoRequestRemitPre_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestRemitPre");
    private final static QName _CobroDevolucionIvaPreDtoRequestCobroDevolucionIvaPre_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCobroDevolucionIvaPre");
    private final static QName _CashInATMPreDtoRequestCashInATMPre_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCashInATMPre");
    private final static QName _CashOutConfirmDtoRequestCashOutConfirm_QNAME = new QName("http://bce.webservices.mts.inswitch.us", "dtoRequestCashOutConfirm");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.inswitch.mts.webservices.bce
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FondeoLocalConfirm }
     * 
     */
    public FondeoLocalConfirm createFondeoLocalConfirm() {
        return new FondeoLocalConfirm();
    }

    /**
     * Create an instance of {@link RemitPre }
     * 
     */
    public RemitPre createRemitPre() {
        return new RemitPre();
    }

    /**
     * Create an instance of {@link GetBalanceReportCSV }
     * 
     */
    public GetBalanceReportCSV createGetBalanceReportCSV() {
        return new GetBalanceReportCSV();
    }

    /**
     * Create an instance of {@link DeleteClientAdditionalDataResponse }
     * 
     */
    public DeleteClientAdditionalDataResponse createDeleteClientAdditionalDataResponse() {
        return new DeleteClientAdditionalDataResponse();
    }

    /**
     * Create an instance of {@link GetDailyReportResponse }
     * 
     */
    public GetDailyReportResponse createGetDailyReportResponse() {
        return new GetDailyReportResponse();
    }

    /**
     * Create an instance of {@link CashInConfirmResponse }
     * 
     */
    public CashInConfirmResponse createCashInConfirmResponse() {
        return new CashInConfirmResponse();
    }

    /**
     * Create an instance of {@link UtfiAutoReversion }
     * 
     */
    public UtfiAutoReversion createUtfiAutoReversion() {
        return new UtfiAutoReversion();
    }

    /**
     * Create an instance of {@link MassiveBatchCreditUploadResponse }
     * 
     */
    public MassiveBatchCreditUploadResponse createMassiveBatchCreditUploadResponse() {
        return new MassiveBatchCreditUploadResponse();
    }

    /**
     * Create an instance of {@link RemitConfirmResponse }
     * 
     */
    public RemitConfirmResponse createRemitConfirmResponse() {
        return new RemitConfirmResponse();
    }

    /**
     * Create an instance of {@link InsertClientAdditionalData }
     * 
     */
    public InsertClientAdditionalData createInsertClientAdditionalData() {
        return new InsertClientAdditionalData();
    }

    /**
     * Create an instance of {@link RetrieveBatchLines }
     * 
     */
    public RetrieveBatchLines createRetrieveBatchLines() {
        return new RetrieveBatchLines();
    }

    /**
     * Create an instance of {@link GetVersionIdResponse }
     * 
     */
    public GetVersionIdResponse createGetVersionIdResponse() {
        return new GetVersionIdResponse();
    }

    /**
     * Create an instance of {@link CashInTransferenciaConfirm }
     * 
     */
    public CashInTransferenciaConfirm createCashInTransferenciaConfirm() {
        return new CashInTransferenciaConfirm();
    }

    /**
     * Create an instance of {@link DeleteClientAdditionalData }
     * 
     */
    public DeleteClientAdditionalData createDeleteClientAdditionalData() {
        return new DeleteClientAdditionalData();
    }

    /**
     * Create an instance of {@link UpdateClientAdditionalDataResponse }
     * 
     */
    public UpdateClientAdditionalDataResponse createUpdateClientAdditionalDataResponse() {
        return new UpdateClientAdditionalDataResponse();
    }

    /**
     * Create an instance of {@link ReservesForBankTransfer }
     * 
     */
    public ReservesForBankTransfer createReservesForBankTransfer() {
        return new ReservesForBankTransfer();
    }

    /**
     * Create an instance of {@link ExecuteBatchPaymentConfirmResponse }
     * 
     */
    public ExecuteBatchPaymentConfirmResponse createExecuteBatchPaymentConfirmResponse() {
        return new ExecuteBatchPaymentConfirmResponse();
    }

    /**
     * Create an instance of {@link CashInPreResponse }
     * 
     */
    public CashInPreResponse createCashInPreResponse() {
        return new CashInPreResponse();
    }

    /**
     * Create an instance of {@link RemitConfirm }
     * 
     */
    public RemitConfirm createRemitConfirm() {
        return new RemitConfirm();
    }

    /**
     * Create an instance of {@link FondeoLocalPre }
     * 
     */
    public FondeoLocalPre createFondeoLocalPre() {
        return new FondeoLocalPre();
    }

    /**
     * Create an instance of {@link EditBatchLine }
     * 
     */
    public EditBatchLine createEditBatchLine() {
        return new EditBatchLine();
    }

    /**
     * Create an instance of {@link CashOutConfirm }
     * 
     */
    public CashOutConfirm createCashOutConfirm() {
        return new CashOutConfirm();
    }

    /**
     * Create an instance of {@link DeleteBatchLineResponse }
     * 
     */
    public DeleteBatchLineResponse createDeleteBatchLineResponse() {
        return new DeleteBatchLineResponse();
    }

    /**
     * Create an instance of {@link ReportTransactionMsisdnResponse }
     * 
     */
    public ReportTransactionMsisdnResponse createReportTransactionMsisdnResponse() {
        return new ReportTransactionMsisdnResponse();
    }

    /**
     * Create an instance of {@link CobroDevolucionIvaConfirm }
     * 
     */
    public CobroDevolucionIvaConfirm createCobroDevolucionIvaConfirm() {
        return new CobroDevolucionIvaConfirm();
    }

    /**
     * Create an instance of {@link CashInPre }
     * 
     */
    public CashInPre createCashInPre() {
        return new CashInPre();
    }

    /**
     * Create an instance of {@link UtfiAutoReversionResponse }
     * 
     */
    public UtfiAutoReversionResponse createUtfiAutoReversionResponse() {
        return new UtfiAutoReversionResponse();
    }

    /**
     * Create an instance of {@link CashOutATMPre }
     * 
     */
    public CashOutATMPre createCashOutATMPre() {
        return new CashOutATMPre();
    }

    /**
     * Create an instance of {@link GetBalance }
     * 
     */
    public GetBalance createGetBalance() {
        return new GetBalance();
    }

    /**
     * Create an instance of {@link CashInTransferenciaPreResponse }
     * 
     */
    public CashInTransferenciaPreResponse createCashInTransferenciaPreResponse() {
        return new CashInTransferenciaPreResponse();
    }

    /**
     * Create an instance of {@link ExecuteBatchPaymentConfirm }
     * 
     */
    public ExecuteBatchPaymentConfirm createExecuteBatchPaymentConfirm() {
        return new ExecuteBatchPaymentConfirm();
    }

    /**
     * Create an instance of {@link ReportTransaction }
     * 
     */
    public ReportTransaction createReportTransaction() {
        return new ReportTransaction();
    }

    /**
     * Create an instance of {@link FondeoLocalConfirmResponse }
     * 
     */
    public FondeoLocalConfirmResponse createFondeoLocalConfirmResponse() {
        return new FondeoLocalConfirmResponse();
    }

    /**
     * Create an instance of {@link GetBalanceResponse }
     * 
     */
    public GetBalanceResponse createGetBalanceResponse() {
        return new GetBalanceResponse();
    }

    /**
     * Create an instance of {@link CobroDevolucionIvaConfirmResponse }
     * 
     */
    public CobroDevolucionIvaConfirmResponse createCobroDevolucionIvaConfirmResponse() {
        return new CobroDevolucionIvaConfirmResponse();
    }

    /**
     * Create an instance of {@link RetrieveBatchOneLine }
     * 
     */
    public RetrieveBatchOneLine createRetrieveBatchOneLine() {
        return new RetrieveBatchOneLine();
    }

    /**
     * Create an instance of {@link CobroPreResponse }
     * 
     */
    public CobroPreResponse createCobroPreResponse() {
        return new CobroPreResponse();
    }

    /**
     * Create an instance of {@link RetrieveBatchDebitResponse }
     * 
     */
    public RetrieveBatchDebitResponse createRetrieveBatchDebitResponse() {
        return new RetrieveBatchDebitResponse();
    }

    /**
     * Create an instance of {@link RetrieveBatchCreditResponse }
     * 
     */
    public RetrieveBatchCreditResponse createRetrieveBatchCreditResponse() {
        return new RetrieveBatchCreditResponse();
    }

    /**
     * Create an instance of {@link CashOutATMPreResponse }
     * 
     */
    public CashOutATMPreResponse createCashOutATMPreResponse() {
        return new CashOutATMPreResponse();
    }

    /**
     * Create an instance of {@link InsertClientAdditionalDataResponse }
     * 
     */
    public InsertClientAdditionalDataResponse createInsertClientAdditionalDataResponse() {
        return new InsertClientAdditionalDataResponse();
    }

    /**
     * Create an instance of {@link GetBalanceReportResponse }
     * 
     */
    public GetBalanceReportResponse createGetBalanceReportResponse() {
        return new GetBalanceReportResponse();
    }

    /**
     * Create an instance of {@link GetBalanceReport }
     * 
     */
    public GetBalanceReport createGetBalanceReport() {
        return new GetBalanceReport();
    }

    /**
     * Create an instance of {@link CashInConfirm }
     * 
     */
    public CashInConfirm createCashInConfirm() {
        return new CashInConfirm();
    }

    /**
     * Create an instance of {@link RetrieveBatchLinesResponse }
     * 
     */
    public RetrieveBatchLinesResponse createRetrieveBatchLinesResponse() {
        return new RetrieveBatchLinesResponse();
    }

    /**
     * Create an instance of {@link AgentAutoReversionResponse }
     * 
     */
    public AgentAutoReversionResponse createAgentAutoReversionResponse() {
        return new AgentAutoReversionResponse();
    }

    /**
     * Create an instance of {@link MTSServiceServiceException }
     * 
     */
    public MTSServiceServiceException createMTSServiceServiceException() {
        return new MTSServiceServiceException();
    }

    /**
     * Create an instance of {@link CashOutATMConfirmResponse }
     * 
     */
    public CashOutATMConfirmResponse createCashOutATMConfirmResponse() {
        return new CashOutATMConfirmResponse();
    }

    /**
     * Create an instance of {@link RetrieveBatchOneLineResponse }
     * 
     */
    public RetrieveBatchOneLineResponse createRetrieveBatchOneLineResponse() {
        return new RetrieveBatchOneLineResponse();
    }

    /**
     * Create an instance of {@link GetBalanceReportCSVResponse }
     * 
     */
    public GetBalanceReportCSVResponse createGetBalanceReportCSVResponse() {
        return new GetBalanceReportCSVResponse();
    }

    /**
     * Create an instance of {@link EditBatchLineResponse }
     * 
     */
    public EditBatchLineResponse createEditBatchLineResponse() {
        return new EditBatchLineResponse();
    }

    /**
     * Create an instance of {@link CashInATMPre }
     * 
     */
    public CashInATMPre createCashInATMPre() {
        return new CashInATMPre();
    }

    /**
     * Create an instance of {@link ChangePin }
     * 
     */
    public ChangePin createChangePin() {
        return new ChangePin();
    }

    /**
     * Create an instance of {@link CobroConfirmResponse }
     * 
     */
    public CobroConfirmResponse createCobroConfirmResponse() {
        return new CobroConfirmResponse();
    }

    /**
     * Create an instance of {@link CashInATMConfirmResponse }
     * 
     */
    public CashInATMConfirmResponse createCashInATMConfirmResponse() {
        return new CashInATMConfirmResponse();
    }

    /**
     * Create an instance of {@link RetrieveBatchCredit }
     * 
     */
    public RetrieveBatchCredit createRetrieveBatchCredit() {
        return new RetrieveBatchCredit();
    }

    /**
     * Create an instance of {@link ReservesForBankTransferResponse }
     * 
     */
    public ReservesForBankTransferResponse createReservesForBankTransferResponse() {
        return new ReservesForBankTransferResponse();
    }

    /**
     * Create an instance of {@link CashInTransferenciaPre }
     * 
     */
    public CashInTransferenciaPre createCashInTransferenciaPre() {
        return new CashInTransferenciaPre();
    }

    /**
     * Create an instance of {@link ExecuteBatchPaymentPre }
     * 
     */
    public ExecuteBatchPaymentPre createExecuteBatchPaymentPre() {
        return new ExecuteBatchPaymentPre();
    }

    /**
     * Create an instance of {@link CashInATMConfirm }
     * 
     */
    public CashInATMConfirm createCashInATMConfirm() {
        return new CashInATMConfirm();
    }

    /**
     * Create an instance of {@link CashOutTransferenciaPre }
     * 
     */
    public CashOutTransferenciaPre createCashOutTransferenciaPre() {
        return new CashOutTransferenciaPre();
    }

    /**
     * Create an instance of {@link RemitPreResponse }
     * 
     */
    public RemitPreResponse createRemitPreResponse() {
        return new RemitPreResponse();
    }

    /**
     * Create an instance of {@link MassiveBatchDebitUploadResponse }
     * 
     */
    public MassiveBatchDebitUploadResponse createMassiveBatchDebitUploadResponse() {
        return new MassiveBatchDebitUploadResponse();
    }

    /**
     * Create an instance of {@link FondeoLocalPreResponse }
     * 
     */
    public FondeoLocalPreResponse createFondeoLocalPreResponse() {
        return new FondeoLocalPreResponse();
    }

    /**
     * Create an instance of {@link MassiveBatchDebitUpload }
     * 
     */
    public MassiveBatchDebitUpload createMassiveBatchDebitUpload() {
        return new MassiveBatchDebitUpload();
    }

    /**
     * Create an instance of {@link GetDailyReportNoCommission }
     * 
     */
    public GetDailyReportNoCommission createGetDailyReportNoCommission() {
        return new GetDailyReportNoCommission();
    }

    /**
     * Create an instance of {@link GetDailyReportTelcoResponse }
     * 
     */
    public GetDailyReportTelcoResponse createGetDailyReportTelcoResponse() {
        return new GetDailyReportTelcoResponse();
    }

    /**
     * Create an instance of {@link SendPUSHResponse }
     * 
     */
    public SendPUSHResponse createSendPUSHResponse() {
        return new SendPUSHResponse();
    }

    /**
     * Create an instance of {@link DeleteBatchLine }
     * 
     */
    public DeleteBatchLine createDeleteBatchLine() {
        return new DeleteBatchLine();
    }

    /**
     * Create an instance of {@link GirosNacionalesConfirmResponse }
     * 
     */
    public GirosNacionalesConfirmResponse createGirosNacionalesConfirmResponse() {
        return new GirosNacionalesConfirmResponse();
    }

    /**
     * Create an instance of {@link CobroDevolucionIvaPre }
     * 
     */
    public CobroDevolucionIvaPre createCobroDevolucionIvaPre() {
        return new CobroDevolucionIvaPre();
    }

    /**
     * Create an instance of {@link UpdateClientAdditionalData }
     * 
     */
    public UpdateClientAdditionalData createUpdateClientAdditionalData() {
        return new UpdateClientAdditionalData();
    }

    /**
     * Create an instance of {@link GirosNacionalesConfirm }
     * 
     */
    public GirosNacionalesConfirm createGirosNacionalesConfirm() {
        return new GirosNacionalesConfirm();
    }

    /**
     * Create an instance of {@link GirosNacionalesPreResponse }
     * 
     */
    public GirosNacionalesPreResponse createGirosNacionalesPreResponse() {
        return new GirosNacionalesPreResponse();
    }

    /**
     * Create an instance of {@link SendSMS }
     * 
     */
    public SendSMS createSendSMS() {
        return new SendSMS();
    }

    /**
     * Create an instance of {@link GetClientAdditionalDataResponse }
     * 
     */
    public GetClientAdditionalDataResponse createGetClientAdditionalDataResponse() {
        return new GetClientAdditionalDataResponse();
    }

    /**
     * Create an instance of {@link CashOutConfirmResponse }
     * 
     */
    public CashOutConfirmResponse createCashOutConfirmResponse() {
        return new CashOutConfirmResponse();
    }

    /**
     * Create an instance of {@link GetDailyReportNoCommissionResponse }
     * 
     */
    public GetDailyReportNoCommissionResponse createGetDailyReportNoCommissionResponse() {
        return new GetDailyReportNoCommissionResponse();
    }

    /**
     * Create an instance of {@link AgentAutoReversion }
     * 
     */
    public AgentAutoReversion createAgentAutoReversion() {
        return new AgentAutoReversion();
    }

    /**
     * Create an instance of {@link CashOutTransferenciaConfirmResponse }
     * 
     */
    public CashOutTransferenciaConfirmResponse createCashOutTransferenciaConfirmResponse() {
        return new CashOutTransferenciaConfirmResponse();
    }

    /**
     * Create an instance of {@link RetrieveBatchDebit }
     * 
     */
    public RetrieveBatchDebit createRetrieveBatchDebit() {
        return new RetrieveBatchDebit();
    }

    /**
     * Create an instance of {@link CashOutTransferenciaConfirm }
     * 
     */
    public CashOutTransferenciaConfirm createCashOutTransferenciaConfirm() {
        return new CashOutTransferenciaConfirm();
    }

    /**
     * Create an instance of {@link GetDailyReportTelco }
     * 
     */
    public GetDailyReportTelco createGetDailyReportTelco() {
        return new GetDailyReportTelco();
    }

    /**
     * Create an instance of {@link CashInTransferenciaConfirmResponse }
     * 
     */
    public CashInTransferenciaConfirmResponse createCashInTransferenciaConfirmResponse() {
        return new CashInTransferenciaConfirmResponse();
    }

    /**
     * Create an instance of {@link SendSMSResponse }
     * 
     */
    public SendSMSResponse createSendSMSResponse() {
        return new SendSMSResponse();
    }

    /**
     * Create an instance of {@link GetVersionId }
     * 
     */
    public GetVersionId createGetVersionId() {
        return new GetVersionId();
    }

    /**
     * Create an instance of {@link CashOutATMConfirm }
     * 
     */
    public CashOutATMConfirm createCashOutATMConfirm() {
        return new CashOutATMConfirm();
    }

    /**
     * Create an instance of {@link GirosNacionalesPre }
     * 
     */
    public GirosNacionalesPre createGirosNacionalesPre() {
        return new GirosNacionalesPre();
    }

    /**
     * Create an instance of {@link MassiveBatchCreditUpload }
     * 
     */
    public MassiveBatchCreditUpload createMassiveBatchCreditUpload() {
        return new MassiveBatchCreditUpload();
    }

    /**
     * Create an instance of {@link GetDailyReport }
     * 
     */
    public GetDailyReport createGetDailyReport() {
        return new GetDailyReport();
    }

    /**
     * Create an instance of {@link DeleteBatchPaymentResponse }
     * 
     */
    public DeleteBatchPaymentResponse createDeleteBatchPaymentResponse() {
        return new DeleteBatchPaymentResponse();
    }

    /**
     * Create an instance of {@link ReportTransactionResponse }
     * 
     */
    public ReportTransactionResponse createReportTransactionResponse() {
        return new ReportTransactionResponse();
    }

    /**
     * Create an instance of {@link ExecuteBatchPaymentPreResponse }
     * 
     */
    public ExecuteBatchPaymentPreResponse createExecuteBatchPaymentPreResponse() {
        return new ExecuteBatchPaymentPreResponse();
    }

    /**
     * Create an instance of {@link CobroDevolucionIvaPreResponse }
     * 
     */
    public CobroDevolucionIvaPreResponse createCobroDevolucionIvaPreResponse() {
        return new CobroDevolucionIvaPreResponse();
    }

    /**
     * Create an instance of {@link ChangePinResponse }
     * 
     */
    public ChangePinResponse createChangePinResponse() {
        return new ChangePinResponse();
    }

    /**
     * Create an instance of {@link CashOutPreResponse }
     * 
     */
    public CashOutPreResponse createCashOutPreResponse() {
        return new CashOutPreResponse();
    }

    /**
     * Create an instance of {@link CashInATMPreResponse }
     * 
     */
    public CashInATMPreResponse createCashInATMPreResponse() {
        return new CashInATMPreResponse();
    }

    /**
     * Create an instance of {@link CobroPre }
     * 
     */
    public CobroPre createCobroPre() {
        return new CobroPre();
    }

    /**
     * Create an instance of {@link CashOutPre }
     * 
     */
    public CashOutPre createCashOutPre() {
        return new CashOutPre();
    }

    /**
     * Create an instance of {@link CobroConfirm }
     * 
     */
    public CobroConfirm createCobroConfirm() {
        return new CobroConfirm();
    }

    /**
     * Create an instance of {@link ReportTransactionMsisdn }
     * 
     */
    public ReportTransactionMsisdn createReportTransactionMsisdn() {
        return new ReportTransactionMsisdn();
    }

    /**
     * Create an instance of {@link SendPUSH }
     * 
     */
    public SendPUSH createSendPUSH() {
        return new SendPUSH();
    }

    /**
     * Create an instance of {@link GetClientAdditionalData }
     * 
     */
    public GetClientAdditionalData createGetClientAdditionalData() {
        return new GetClientAdditionalData();
    }

    /**
     * Create an instance of {@link DeleteBatchPayment }
     * 
     */
    public DeleteBatchPayment createDeleteBatchPayment() {
        return new DeleteBatchPayment();
    }

    /**
     * Create an instance of {@link CashOutTransferenciaPreResponse }
     * 
     */
    public CashOutTransferenciaPreResponse createCashOutTransferenciaPreResponse() {
        return new CashOutTransferenciaPreResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCobroConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCobroConfirm", scope = CobroConfirm.class)
    public JAXBElement<DTORequestCobroConfirm> createCobroConfirmDtoRequestCobroConfirm(DTORequestCobroConfirm value) {
        return new JAXBElement<DTORequestCobroConfirm>(_CobroConfirmDtoRequestCobroConfirm_QNAME, DTORequestCobroConfirm.class, CobroConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashOutTransferencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCashOutTransferenciaConfirm", scope = CashOutTransferenciaConfirm.class)
    public JAXBElement<DTORequestCashOutTransferencia> createCashOutTransferenciaConfirmDtoRequestCashOutTransferenciaConfirm(DTORequestCashOutTransferencia value) {
        return new JAXBElement<DTORequestCashOutTransferencia>(_CashOutTransferenciaConfirmDtoRequestCashOutTransferenciaConfirm_QNAME, DTORequestCashOutTransferencia.class, CashOutTransferenciaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseSendSMS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = SendSMSResponse.class)
    public JAXBElement<DTOResponseSendSMS> createSendSMSResponseReturn(DTOResponseSendSMS value) {
        return new JAXBElement<DTOResponseSendSMS>(_SendSMSResponseReturn_QNAME, DTOResponseSendSMS.class, SendSMSResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseChangePin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = ChangePinResponse.class)
    public JAXBElement<DTOResponseChangePin> createChangePinResponseReturn(DTOResponseChangePin value) {
        return new JAXBElement<DTOResponseChangePin>(_SendSMSResponseReturn_QNAME, DTOResponseChangePin.class, ChangePinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseMassiveBatchUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = MassiveBatchDebitUploadResponse.class)
    public JAXBElement<DTOResponseMassiveBatchUpload> createMassiveBatchDebitUploadResponseReturn(DTOResponseMassiveBatchUpload value) {
        return new JAXBElement<DTOResponseMassiveBatchUpload>(_SendSMSResponseReturn_QNAME, DTOResponseMassiveBatchUpload.class, MassiveBatchDebitUploadResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestMassiveBatchUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestMassiveBatchUpload", scope = MassiveBatchDebitUpload.class)
    public JAXBElement<DTORequestMassiveBatchUpload> createMassiveBatchDebitUploadDtoRequestMassiveBatchUpload(DTORequestMassiveBatchUpload value) {
        return new JAXBElement<DTORequestMassiveBatchUpload>(_MassiveBatchDebitUploadDtoRequestMassiveBatchUpload_QNAME, DTORequestMassiveBatchUpload.class, MassiveBatchDebitUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseSendPUSH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = SendPUSHResponse.class)
    public JAXBElement<DTOResponseSendPUSH> createSendPUSHResponseReturn(DTOResponseSendPUSH value) {
        return new JAXBElement<DTOResponseSendPUSH>(_SendSMSResponseReturn_QNAME, DTOResponseSendPUSH.class, SendPUSHResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseUtfiAutoReversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = UtfiAutoReversionResponse.class)
    public JAXBElement<DTOResponseUtfiAutoReversion> createUtfiAutoReversionResponseReturn(DTOResponseUtfiAutoReversion value) {
        return new JAXBElement<DTOResponseUtfiAutoReversion>(_SendSMSResponseReturn_QNAME, DTOResponseUtfiAutoReversion.class, UtfiAutoReversionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseGetBalanceReportCSV }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = GetBalanceReportCSVResponse.class)
    public JAXBElement<DTOResponseGetBalanceReportCSV> createGetBalanceReportCSVResponseReturn(DTOResponseGetBalanceReportCSV value) {
        return new JAXBElement<DTOResponseGetBalanceReportCSV>(_SendSMSResponseReturn_QNAME, DTOResponseGetBalanceReportCSV.class, GetBalanceReportCSVResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseReportTransactions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = ReportTransactionMsisdnResponse.class)
    public JAXBElement<DTOResponseReportTransactions> createReportTransactionMsisdnResponseReturn(DTOResponseReportTransactions value) {
        return new JAXBElement<DTOResponseReportTransactions>(_SendSMSResponseReturn_QNAME, DTOResponseReportTransactions.class, ReportTransactionMsisdnResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestDeleteBatchLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestDeleteBatchLine", scope = DeleteBatchLine.class)
    public JAXBElement<DTORequestDeleteBatchLine> createDeleteBatchLineDtoRequestDeleteBatchLine(DTORequestDeleteBatchLine value) {
        return new JAXBElement<DTORequestDeleteBatchLine>(_DeleteBatchLineDtoRequestDeleteBatchLine_QNAME, DTORequestDeleteBatchLine.class, DeleteBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestEditBatchLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestEditBatchLine", scope = EditBatchLine.class)
    public JAXBElement<DTORequestEditBatchLine> createEditBatchLineDtoRequestEditBatchLine(DTORequestEditBatchLine value) {
        return new JAXBElement<DTORequestEditBatchLine>(_EditBatchLineDtoRequestEditBatchLine_QNAME, DTORequestEditBatchLine.class, EditBatchLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseDeleteBatchLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = DeleteBatchLineResponse.class)
    public JAXBElement<DTOResponseDeleteBatchLine> createDeleteBatchLineResponseReturn(DTOResponseDeleteBatchLine value) {
        return new JAXBElement<DTOResponseDeleteBatchLine>(_SendSMSResponseReturn_QNAME, DTOResponseDeleteBatchLine.class, DeleteBatchLineResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestReportTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestReportTransaction", scope = ReportTransaction.class)
    public JAXBElement<DTORequestReportTransaction> createReportTransactionDtoRequestReportTransaction(DTORequestReportTransaction value) {
        return new JAXBElement<DTORequestReportTransaction>(_ReportTransactionDtoRequestReportTransaction_QNAME, DTORequestReportTransaction.class, ReportTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashOutConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CashOutATMConfirmResponse.class)
    public JAXBElement<DTOResponseCashOutConfirm> createCashOutATMConfirmResponseReturn(DTOResponseCashOutConfirm value) {
        return new JAXBElement<DTOResponseCashOutConfirm>(_SendSMSResponseReturn_QNAME, DTOResponseCashOutConfirm.class, CashOutATMConfirmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseGetDailyReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = GetDailyReportTelcoResponse.class)
    public JAXBElement<DTOResponseGetDailyReport> createGetDailyReportTelcoResponseReturn(DTOResponseGetDailyReport value) {
        return new JAXBElement<DTOResponseGetDailyReport>(_SendSMSResponseReturn_QNAME, DTOResponseGetDailyReport.class, GetDailyReportTelcoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseDeleteBatchPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = DeleteBatchPaymentResponse.class)
    public JAXBElement<DTOResponseDeleteBatchPayment> createDeleteBatchPaymentResponseReturn(DTOResponseDeleteBatchPayment value) {
        return new JAXBElement<DTOResponseDeleteBatchPayment>(_SendSMSResponseReturn_QNAME, DTOResponseDeleteBatchPayment.class, DeleteBatchPaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestDeleteBatchPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestDeleteBatchPayment", scope = DeleteBatchPayment.class)
    public JAXBElement<DTORequestDeleteBatchPayment> createDeleteBatchPaymentDtoRequestDeleteBatchPayment(DTORequestDeleteBatchPayment value) {
        return new JAXBElement<DTORequestDeleteBatchPayment>(_DeleteBatchPaymentDtoRequestDeleteBatchPayment_QNAME, DTORequestDeleteBatchPayment.class, DeleteBatchPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseExecuteBatchPaymentConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = ExecuteBatchPaymentConfirmResponse.class)
    public JAXBElement<DTOResponseExecuteBatchPaymentConfirm> createExecuteBatchPaymentConfirmResponseReturn(DTOResponseExecuteBatchPaymentConfirm value) {
        return new JAXBElement<DTOResponseExecuteBatchPaymentConfirm>(_SendSMSResponseReturn_QNAME, DTOResponseExecuteBatchPaymentConfirm.class, ExecuteBatchPaymentConfirmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashOutPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCashOutPre", scope = CashOutPre.class)
    public JAXBElement<DTORequestCashOutPre> createCashOutPreDtoRequestCashOutPre(DTORequestCashOutPre value) {
        return new JAXBElement<DTORequestCashOutPre>(_CashOutPreDtoRequestCashOutPre_QNAME, DTORequestCashOutPre.class, CashOutPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseReservesForBankTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = ReservesForBankTransferResponse.class)
    public JAXBElement<DTOResponseReservesForBankTransfer> createReservesForBankTransferResponseReturn(DTOResponseReservesForBankTransfer value) {
        return new JAXBElement<DTOResponseReservesForBankTransfer>(_SendSMSResponseReturn_QNAME, DTOResponseReservesForBankTransfer.class, ReservesForBankTransferResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseFondeoLocalPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = FondeoLocalPreResponse.class)
    public JAXBElement<DTOResponseFondeoLocalPre> createFondeoLocalPreResponseReturn(DTOResponseFondeoLocalPre value) {
        return new JAXBElement<DTOResponseFondeoLocalPre>(_SendSMSResponseReturn_QNAME, DTOResponseFondeoLocalPre.class, FondeoLocalPreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestGetDailyReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestGetDailyReport", scope = GetDailyReport.class)
    public JAXBElement<DTORequestGetDailyReport> createGetDailyReportDtoRequestGetDailyReport(DTORequestGetDailyReport value) {
        return new JAXBElement<DTORequestGetDailyReport>(_GetDailyReportDtoRequestGetDailyReport_QNAME, DTORequestGetDailyReport.class, GetDailyReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestRetrieveBatchLines }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestRetrieveBatchLines", scope = RetrieveBatchLines.class)
    public JAXBElement<DTORequestRetrieveBatchLines> createRetrieveBatchLinesDtoRequestRetrieveBatchLines(DTORequestRetrieveBatchLines value) {
        return new JAXBElement<DTORequestRetrieveBatchLines>(_RetrieveBatchLinesDtoRequestRetrieveBatchLines_QNAME, DTORequestRetrieveBatchLines.class, RetrieveBatchLines.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseDeleteClientAdditionalData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = DeleteClientAdditionalDataResponse.class)
    public JAXBElement<DTOResponseDeleteClientAdditionalData> createDeleteClientAdditionalDataResponseReturn(DTOResponseDeleteClientAdditionalData value) {
        return new JAXBElement<DTOResponseDeleteClientAdditionalData>(_SendSMSResponseReturn_QNAME, DTOResponseDeleteClientAdditionalData.class, DeleteClientAdditionalDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashInTransferencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCashInTransferenciaConfirm", scope = CashInTransferenciaConfirm.class)
    public JAXBElement<DTORequestCashInTransferencia> createCashInTransferenciaConfirmDtoRequestCashInTransferenciaConfirm(DTORequestCashInTransferencia value) {
        return new JAXBElement<DTORequestCashInTransferencia>(_CashInTransferenciaConfirmDtoRequestCashInTransferenciaConfirm_QNAME, DTORequestCashInTransferencia.class, CashInTransferenciaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestDeleteClientAdditionalData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestDeleteClientAdditionalData", scope = DeleteClientAdditionalData.class)
    public JAXBElement<DTORequestDeleteClientAdditionalData> createDeleteClientAdditionalDataDtoRequestDeleteClientAdditionalData(DTORequestDeleteClientAdditionalData value) {
        return new JAXBElement<DTORequestDeleteClientAdditionalData>(_DeleteClientAdditionalDataDtoRequestDeleteClientAdditionalData_QNAME, DTORequestDeleteClientAdditionalData.class, DeleteClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashInConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CashInTransferenciaConfirmResponse.class)
    public JAXBElement<DTOResponseCashInConfirm> createCashInTransferenciaConfirmResponseReturn(DTOResponseCashInConfirm value) {
        return new JAXBElement<DTOResponseCashInConfirm>(_SendSMSResponseReturn_QNAME, DTOResponseCashInConfirm.class, CashInTransferenciaConfirmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestGetBalanceReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestGetBalanceReport", scope = GetBalanceReport.class)
    public JAXBElement<DTORequestGetBalanceReport> createGetBalanceReportDtoRequestGetBalanceReport(DTORequestGetBalanceReport value) {
        return new JAXBElement<DTORequestGetBalanceReport>(_GetBalanceReportDtoRequestGetBalanceReport_QNAME, DTORequestGetBalanceReport.class, GetBalanceReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestGetClientAdditionalData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestGetClientAdditionalData", scope = GetClientAdditionalData.class)
    public JAXBElement<DTORequestGetClientAdditionalData> createGetClientAdditionalDataDtoRequestGetClientAdditionalData(DTORequestGetClientAdditionalData value) {
        return new JAXBElement<DTORequestGetClientAdditionalData>(_GetClientAdditionalDataDtoRequestGetClientAdditionalData_QNAME, DTORequestGetClientAdditionalData.class, GetClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashInConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCashInATMConfirm", scope = CashInATMConfirm.class)
    public JAXBElement<DTORequestCashInConfirm> createCashInATMConfirmDtoRequestCashInATMConfirm(DTORequestCashInConfirm value) {
        return new JAXBElement<DTORequestCashInConfirm>(_CashInATMConfirmDtoRequestCashInATMConfirm_QNAME, DTORequestCashInConfirm.class, CashInATMConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestSendSMS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestSendSMS", scope = SendSMS.class)
    public JAXBElement<DTORequestSendSMS> createSendSMSDtoRequestSendSMS(DTORequestSendSMS value) {
        return new JAXBElement<DTORequestSendSMS>(_SendSMSDtoRequestSendSMS_QNAME, DTORequestSendSMS.class, SendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseUpdateClientAdditionalData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = UpdateClientAdditionalDataResponse.class)
    public JAXBElement<DTOResponseUpdateClientAdditionalData> createUpdateClientAdditionalDataResponseReturn(DTOResponseUpdateClientAdditionalData value) {
        return new JAXBElement<DTOResponseUpdateClientAdditionalData>(_SendSMSResponseReturn_QNAME, DTOResponseUpdateClientAdditionalData.class, UpdateClientAdditionalDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "ServiceException", scope = MTSServiceServiceException.class)
    public JAXBElement<ServiceException> createMTSServiceServiceExceptionServiceException(ServiceException value) {
        return new JAXBElement<ServiceException>(_MTSServiceServiceExceptionServiceException_QNAME, ServiceException.class, MTSServiceServiceException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashInConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CashInATMConfirmResponse.class)
    public JAXBElement<DTOResponseCashInConfirm> createCashInATMConfirmResponseReturn(DTOResponseCashInConfirm value) {
        return new JAXBElement<DTOResponseCashInConfirm>(_SendSMSResponseReturn_QNAME, DTOResponseCashInConfirm.class, CashInATMConfirmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseEditBatchLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = EditBatchLineResponse.class)
    public JAXBElement<DTOResponseEditBatchLine> createEditBatchLineResponseReturn(DTOResponseEditBatchLine value) {
        return new JAXBElement<DTOResponseEditBatchLine>(_SendSMSResponseReturn_QNAME, DTOResponseEditBatchLine.class, EditBatchLineResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCobroPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CobroPreResponse.class)
    public JAXBElement<DTOResponseCobroPre> createCobroPreResponseReturn(DTOResponseCobroPre value) {
        return new JAXBElement<DTOResponseCobroPre>(_SendSMSResponseReturn_QNAME, DTOResponseCobroPre.class, CobroPreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestUpdateClientAdditionalData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestUpdateClientAdditionalData", scope = UpdateClientAdditionalData.class)
    public JAXBElement<DTORequestUpdateClientAdditionalData> createUpdateClientAdditionalDataDtoRequestUpdateClientAdditionalData(DTORequestUpdateClientAdditionalData value) {
        return new JAXBElement<DTORequestUpdateClientAdditionalData>(_UpdateClientAdditionalDataDtoRequestUpdateClientAdditionalData_QNAME, DTORequestUpdateClientAdditionalData.class, UpdateClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestExecuteBatchPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestExecuteBatchPayment", scope = ExecuteBatchPaymentPre.class)
    public JAXBElement<DTORequestExecuteBatchPayment> createExecuteBatchPaymentPreDtoRequestExecuteBatchPayment(DTORequestExecuteBatchPayment value) {
        return new JAXBElement<DTORequestExecuteBatchPayment>(_ExecuteBatchPaymentPreDtoRequestExecuteBatchPayment_QNAME, DTORequestExecuteBatchPayment.class, ExecuteBatchPaymentPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseRetrieveBatchs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = RetrieveBatchDebitResponse.class)
    public JAXBElement<DTOResponseRetrieveBatchs> createRetrieveBatchDebitResponseReturn(DTOResponseRetrieveBatchs value) {
        return new JAXBElement<DTOResponseRetrieveBatchs>(_SendSMSResponseReturn_QNAME, DTOResponseRetrieveBatchs.class, RetrieveBatchDebitResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashOutPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CashOutATMPreResponse.class)
    public JAXBElement<DTOResponseCashOutPre> createCashOutATMPreResponseReturn(DTOResponseCashOutPre value) {
        return new JAXBElement<DTOResponseCashOutPre>(_SendSMSResponseReturn_QNAME, DTOResponseCashOutPre.class, CashOutATMPreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestRetrieveBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestRetrieveBatchDebit", scope = RetrieveBatchDebit.class)
    public JAXBElement<DTORequestRetrieveBatch> createRetrieveBatchDebitDtoRequestRetrieveBatchDebit(DTORequestRetrieveBatch value) {
        return new JAXBElement<DTORequestRetrieveBatch>(_RetrieveBatchDebitDtoRequestRetrieveBatchDebit_QNAME, DTORequestRetrieveBatch.class, RetrieveBatchDebit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseGirosNacionalesPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = GirosNacionalesPreResponse.class)
    public JAXBElement<DTOResponseGirosNacionalesPre> createGirosNacionalesPreResponseReturn(DTOResponseGirosNacionalesPre value) {
        return new JAXBElement<DTOResponseGirosNacionalesPre>(_SendSMSResponseReturn_QNAME, DTOResponseGirosNacionalesPre.class, GirosNacionalesPreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestRetrieveBatchOneLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestRetrieveBatchOneLine", scope = RetrieveBatchOneLine.class)
    public JAXBElement<DTORequestRetrieveBatchOneLine> createRetrieveBatchOneLineDtoRequestRetrieveBatchOneLine(DTORequestRetrieveBatchOneLine value) {
        return new JAXBElement<DTORequestRetrieveBatchOneLine>(_RetrieveBatchOneLineDtoRequestRetrieveBatchOneLine_QNAME, DTORequestRetrieveBatchOneLine.class, RetrieveBatchOneLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseRetrieveBatchLines }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = RetrieveBatchLinesResponse.class)
    public JAXBElement<DTOResponseRetrieveBatchLines> createRetrieveBatchLinesResponseReturn(DTOResponseRetrieveBatchLines value) {
        return new JAXBElement<DTOResponseRetrieveBatchLines>(_SendSMSResponseReturn_QNAME, DTOResponseRetrieveBatchLines.class, RetrieveBatchLinesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestGetDailyReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestGetDailyReport", scope = GetDailyReportNoCommission.class)
    public JAXBElement<DTORequestGetDailyReport> createGetDailyReportNoCommissionDtoRequestGetDailyReport(DTORequestGetDailyReport value) {
        return new JAXBElement<DTORequestGetDailyReport>(_GetDailyReportDtoRequestGetDailyReport_QNAME, DTORequestGetDailyReport.class, GetDailyReportNoCommission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseGetDailyReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = GetDailyReportNoCommissionResponse.class)
    public JAXBElement<DTOResponseGetDailyReport> createGetDailyReportNoCommissionResponseReturn(DTOResponseGetDailyReport value) {
        return new JAXBElement<DTOResponseGetDailyReport>(_SendSMSResponseReturn_QNAME, DTOResponseGetDailyReport.class, GetDailyReportNoCommissionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestFondeoLocalConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestFondeoLocalConfirm", scope = FondeoLocalConfirm.class)
    public JAXBElement<DTORequestFondeoLocalConfirm> createFondeoLocalConfirmDtoRequestFondeoLocalConfirm(DTORequestFondeoLocalConfirm value) {
        return new JAXBElement<DTORequestFondeoLocalConfirm>(_FondeoLocalConfirmDtoRequestFondeoLocalConfirm_QNAME, DTORequestFondeoLocalConfirm.class, FondeoLocalConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestExecuteBatchPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestExecuteBatchPayment", scope = ExecuteBatchPaymentConfirm.class)
    public JAXBElement<DTORequestExecuteBatchPayment> createExecuteBatchPaymentConfirmDtoRequestExecuteBatchPayment(DTORequestExecuteBatchPayment value) {
        return new JAXBElement<DTORequestExecuteBatchPayment>(_ExecuteBatchPaymentPreDtoRequestExecuteBatchPayment_QNAME, DTORequestExecuteBatchPayment.class, ExecuteBatchPaymentConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestGirosNacionales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestGirosNacionales", scope = GirosNacionalesConfirm.class)
    public JAXBElement<DTORequestGirosNacionales> createGirosNacionalesConfirmDtoRequestGirosNacionales(DTORequestGirosNacionales value) {
        return new JAXBElement<DTORequestGirosNacionales>(_GirosNacionalesConfirmDtoRequestGirosNacionales_QNAME, DTORequestGirosNacionales.class, GirosNacionalesConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashOutPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CashOutPreResponse.class)
    public JAXBElement<DTOResponseCashOutPre> createCashOutPreResponseReturn(DTOResponseCashOutPre value) {
        return new JAXBElement<DTOResponseCashOutPre>(_SendSMSResponseReturn_QNAME, DTOResponseCashOutPre.class, CashOutPreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestGetDailyReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestGetDailyReport", scope = GetDailyReportTelco.class)
    public JAXBElement<DTORequestGetDailyReport> createGetDailyReportTelcoDtoRequestGetDailyReport(DTORequestGetDailyReport value) {
        return new JAXBElement<DTORequestGetDailyReport>(_GetDailyReportDtoRequestGetDailyReport_QNAME, DTORequestGetDailyReport.class, GetDailyReportTelco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseRetrieveBatchOneLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = RetrieveBatchOneLineResponse.class)
    public JAXBElement<DTOResponseRetrieveBatchOneLine> createRetrieveBatchOneLineResponseReturn(DTOResponseRetrieveBatchOneLine value) {
        return new JAXBElement<DTOResponseRetrieveBatchOneLine>(_SendSMSResponseReturn_QNAME, DTOResponseRetrieveBatchOneLine.class, RetrieveBatchOneLineResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseGirosNacionalesConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = GirosNacionalesConfirmResponse.class)
    public JAXBElement<DTOResponseGirosNacionalesConfirm> createGirosNacionalesConfirmResponseReturn(DTOResponseGirosNacionalesConfirm value) {
        return new JAXBElement<DTOResponseGirosNacionalesConfirm>(_SendSMSResponseReturn_QNAME, DTOResponseGirosNacionalesConfirm.class, GirosNacionalesConfirmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestRetrieveBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestRetrieveBatchCredit", scope = RetrieveBatchCredit.class)
    public JAXBElement<DTORequestRetrieveBatch> createRetrieveBatchCreditDtoRequestRetrieveBatchCredit(DTORequestRetrieveBatch value) {
        return new JAXBElement<DTORequestRetrieveBatch>(_RetrieveBatchCreditDtoRequestRetrieveBatchCredit_QNAME, DTORequestRetrieveBatch.class, RetrieveBatchCredit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestGirosNacionales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestGirosNacionales", scope = GirosNacionalesPre.class)
    public JAXBElement<DTORequestGirosNacionales> createGirosNacionalesPreDtoRequestGirosNacionales(DTORequestGirosNacionales value) {
        return new JAXBElement<DTORequestGirosNacionales>(_GirosNacionalesConfirmDtoRequestGirosNacionales_QNAME, DTORequestGirosNacionales.class, GirosNacionalesPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestChangePin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestChangePin", scope = ChangePin.class)
    public JAXBElement<DTORequestChangePin> createChangePinDtoRequestChangePin(DTORequestChangePin value) {
        return new JAXBElement<DTORequestChangePin>(_ChangePinDtoRequestChangePin_QNAME, DTORequestChangePin.class, ChangePin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseMassiveBatchUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = MassiveBatchCreditUploadResponse.class)
    public JAXBElement<DTOResponseMassiveBatchUpload> createMassiveBatchCreditUploadResponseReturn(DTOResponseMassiveBatchUpload value) {
        return new JAXBElement<DTOResponseMassiveBatchUpload>(_SendSMSResponseReturn_QNAME, DTOResponseMassiveBatchUpload.class, MassiveBatchCreditUploadResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashInPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CashInPreResponse.class)
    public JAXBElement<DTOResponseCashInPre> createCashInPreResponseReturn(DTOResponseCashInPre value) {
        return new JAXBElement<DTOResponseCashInPre>(_SendSMSResponseReturn_QNAME, DTOResponseCashInPre.class, CashInPreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = GetVersionIdResponse.class)
    public JAXBElement<String> createGetVersionIdResponseReturn(String value) {
        return new JAXBElement<String>(_SendSMSResponseReturn_QNAME, String.class, GetVersionIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseWallets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = GetBalanceResponse.class)
    public JAXBElement<DTOResponseWallets> createGetBalanceResponseReturn(DTOResponseWallets value) {
        return new JAXBElement<DTOResponseWallets>(_SendSMSResponseReturn_QNAME, DTOResponseWallets.class, GetBalanceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestUtfiAutoReversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestUtfiAutoReversion", scope = UtfiAutoReversion.class)
    public JAXBElement<DTORequestUtfiAutoReversion> createUtfiAutoReversionDtoRequestUtfiAutoReversion(DTORequestUtfiAutoReversion value) {
        return new JAXBElement<DTORequestUtfiAutoReversion>(_UtfiAutoReversionDtoRequestUtfiAutoReversion_QNAME, DTORequestUtfiAutoReversion.class, UtfiAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseReportTransactions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = ReportTransactionResponse.class)
    public JAXBElement<DTOResponseReportTransactions> createReportTransactionResponseReturn(DTOResponseReportTransactions value) {
        return new JAXBElement<DTOResponseReportTransactions>(_SendSMSResponseReturn_QNAME, DTOResponseReportTransactions.class, ReportTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestFondeoLocalPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestFondeoLocalPre", scope = FondeoLocalPre.class)
    public JAXBElement<DTORequestFondeoLocalPre> createFondeoLocalPreDtoRequestFondeoLocalPre(DTORequestFondeoLocalPre value) {
        return new JAXBElement<DTORequestFondeoLocalPre>(_FondeoLocalPreDtoRequestFondeoLocalPre_QNAME, DTORequestFondeoLocalPre.class, FondeoLocalPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseInsertClientAdditionalData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = InsertClientAdditionalDataResponse.class)
    public JAXBElement<DTOResponseInsertClientAdditionalData> createInsertClientAdditionalDataResponseReturn(DTOResponseInsertClientAdditionalData value) {
        return new JAXBElement<DTOResponseInsertClientAdditionalData>(_SendSMSResponseReturn_QNAME, DTOResponseInsertClientAdditionalData.class, InsertClientAdditionalDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseGetBalanceReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = GetBalanceReportResponse.class)
    public JAXBElement<DTOResponseGetBalanceReport> createGetBalanceReportResponseReturn(DTOResponseGetBalanceReport value) {
        return new JAXBElement<DTOResponseGetBalanceReport>(_SendSMSResponseReturn_QNAME, DTOResponseGetBalanceReport.class, GetBalanceReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseFondeoLocalConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = FondeoLocalConfirmResponse.class)
    public JAXBElement<DTOResponseFondeoLocalConfirm> createFondeoLocalConfirmResponseReturn(DTOResponseFondeoLocalConfirm value) {
        return new JAXBElement<DTOResponseFondeoLocalConfirm>(_SendSMSResponseReturn_QNAME, DTOResponseFondeoLocalConfirm.class, FondeoLocalConfirmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashOutConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCashOutATMConfirm", scope = CashOutATMConfirm.class)
    public JAXBElement<DTORequestCashOutConfirm> createCashOutATMConfirmDtoRequestCashOutATMConfirm(DTORequestCashOutConfirm value) {
        return new JAXBElement<DTORequestCashOutConfirm>(_CashOutATMConfirmDtoRequestCashOutATMConfirm_QNAME, DTORequestCashOutConfirm.class, CashOutATMConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashInPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCashInPre", scope = CashInPre.class)
    public JAXBElement<DTORequestCashInPre> createCashInPreDtoRequestCashInPre(DTORequestCashInPre value) {
        return new JAXBElement<DTORequestCashInPre>(_CashInPreDtoRequestCashInPre_QNAME, DTORequestCashInPre.class, CashInPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashOutConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CashOutTransferenciaConfirmResponse.class)
    public JAXBElement<DTOResponseCashOutConfirm> createCashOutTransferenciaConfirmResponseReturn(DTOResponseCashOutConfirm value) {
        return new JAXBElement<DTOResponseCashOutConfirm>(_SendSMSResponseReturn_QNAME, DTOResponseCashOutConfirm.class, CashOutTransferenciaConfirmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashOutTransferencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCashOutTransferenciaPre", scope = CashOutTransferenciaPre.class)
    public JAXBElement<DTORequestCashOutTransferencia> createCashOutTransferenciaPreDtoRequestCashOutTransferenciaPre(DTORequestCashOutTransferencia value) {
        return new JAXBElement<DTORequestCashOutTransferencia>(_CashOutTransferenciaPreDtoRequestCashOutTransferenciaPre_QNAME, DTORequestCashOutTransferencia.class, CashOutTransferenciaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestAgentAutoReversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestAgentAutoReversion", scope = AgentAutoReversion.class)
    public JAXBElement<DTORequestAgentAutoReversion> createAgentAutoReversionDtoRequestAgentAutoReversion(DTORequestAgentAutoReversion value) {
        return new JAXBElement<DTORequestAgentAutoReversion>(_AgentAutoReversionDtoRequestAgentAutoReversion_QNAME, DTORequestAgentAutoReversion.class, AgentAutoReversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCobroDevolucionIvaPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CobroDevolucionIvaPreResponse.class)
    public JAXBElement<DTOResponseCobroDevolucionIvaPre> createCobroDevolucionIvaPreResponseReturn(DTOResponseCobroDevolucionIvaPre value) {
        return new JAXBElement<DTOResponseCobroDevolucionIvaPre>(_SendSMSResponseReturn_QNAME, DTOResponseCobroDevolucionIvaPre.class, CobroDevolucionIvaPreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCobroDevolucionIvaConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCobroDevolucionIvaConfirm", scope = CobroDevolucionIvaConfirm.class)
    public JAXBElement<DTORequestCobroDevolucionIvaConfirm> createCobroDevolucionIvaConfirmDtoRequestCobroDevolucionIvaConfirm(DTORequestCobroDevolucionIvaConfirm value) {
        return new JAXBElement<DTORequestCobroDevolucionIvaConfirm>(_CobroDevolucionIvaConfirmDtoRequestCobroDevolucionIvaConfirm_QNAME, DTORequestCobroDevolucionIvaConfirm.class, CobroDevolucionIvaConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseRemitPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = RemitPreResponse.class)
    public JAXBElement<DTOResponseRemitPre> createRemitPreResponseReturn(DTOResponseRemitPre value) {
        return new JAXBElement<DTOResponseRemitPre>(_SendSMSResponseReturn_QNAME, DTOResponseRemitPre.class, RemitPreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseRemitConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = RemitConfirmResponse.class)
    public JAXBElement<DTOResponseRemitConfirm> createRemitConfirmResponseReturn(DTOResponseRemitConfirm value) {
        return new JAXBElement<DTOResponseRemitConfirm>(_SendSMSResponseReturn_QNAME, DTOResponseRemitConfirm.class, RemitConfirmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashInTransferencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCashInTransferenciaPre", scope = CashInTransferenciaPre.class)
    public JAXBElement<DTORequestCashInTransferencia> createCashInTransferenciaPreDtoRequestCashInTransferenciaPre(DTORequestCashInTransferencia value) {
        return new JAXBElement<DTORequestCashInTransferencia>(_CashInTransferenciaPreDtoRequestCashInTransferenciaPre_QNAME, DTORequestCashInTransferencia.class, CashInTransferenciaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestReservesForBankTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestReservesForBankTransfer", scope = ReservesForBankTransfer.class)
    public JAXBElement<DTORequestReservesForBankTransfer> createReservesForBankTransferDtoRequestReservesForBankTransfer(DTORequestReservesForBankTransfer value) {
        return new JAXBElement<DTORequestReservesForBankTransfer>(_ReservesForBankTransferDtoRequestReservesForBankTransfer_QNAME, DTORequestReservesForBankTransfer.class, ReservesForBankTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashInPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CashInTransferenciaPreResponse.class)
    public JAXBElement<DTOResponseCashInPre> createCashInTransferenciaPreResponseReturn(DTOResponseCashInPre value) {
        return new JAXBElement<DTOResponseCashInPre>(_SendSMSResponseReturn_QNAME, DTOResponseCashInPre.class, CashInTransferenciaPreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestGetBalanceReportCSV }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestGetBalanceReportCSV", scope = GetBalanceReportCSV.class)
    public JAXBElement<DTORequestGetBalanceReportCSV> createGetBalanceReportCSVDtoRequestGetBalanceReportCSV(DTORequestGetBalanceReportCSV value) {
        return new JAXBElement<DTORequestGetBalanceReportCSV>(_GetBalanceReportCSVDtoRequestGetBalanceReportCSV_QNAME, DTORequestGetBalanceReportCSV.class, GetBalanceReportCSV.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestGetBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestGetBalance", scope = GetBalance.class)
    public JAXBElement<DTORequestGetBalance> createGetBalanceDtoRequestGetBalance(DTORequestGetBalance value) {
        return new JAXBElement<DTORequestGetBalance>(_GetBalanceDtoRequestGetBalance_QNAME, DTORequestGetBalance.class, GetBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseAgentAutoReversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = AgentAutoReversionResponse.class)
    public JAXBElement<DTOResponseAgentAutoReversion> createAgentAutoReversionResponseReturn(DTOResponseAgentAutoReversion value) {
        return new JAXBElement<DTOResponseAgentAutoReversion>(_SendSMSResponseReturn_QNAME, DTOResponseAgentAutoReversion.class, AgentAutoReversionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashOutPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CashOutTransferenciaPreResponse.class)
    public JAXBElement<DTOResponseCashOutPre> createCashOutTransferenciaPreResponseReturn(DTOResponseCashOutPre value) {
        return new JAXBElement<DTOResponseCashOutPre>(_SendSMSResponseReturn_QNAME, DTOResponseCashOutPre.class, CashOutTransferenciaPreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashOutPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCashOutATMPre", scope = CashOutATMPre.class)
    public JAXBElement<DTORequestCashOutPre> createCashOutATMPreDtoRequestCashOutATMPre(DTORequestCashOutPre value) {
        return new JAXBElement<DTORequestCashOutPre>(_CashOutATMPreDtoRequestCashOutATMPre_QNAME, DTORequestCashOutPre.class, CashOutATMPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCobroPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCobroPre", scope = CobroPre.class)
    public JAXBElement<DTORequestCobroPre> createCobroPreDtoRequestCobroPre(DTORequestCobroPre value) {
        return new JAXBElement<DTORequestCobroPre>(_CobroPreDtoRequestCobroPre_QNAME, DTORequestCobroPre.class, CobroPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestSendPUSH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestSendPUSH", scope = SendPUSH.class)
    public JAXBElement<DTORequestSendPUSH> createSendPUSHDtoRequestSendPUSH(DTORequestSendPUSH value) {
        return new JAXBElement<DTORequestSendPUSH>(_SendPUSHDtoRequestSendPUSH_QNAME, DTORequestSendPUSH.class, SendPUSH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashInConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CashInConfirmResponse.class)
    public JAXBElement<DTOResponseCashInConfirm> createCashInConfirmResponseReturn(DTOResponseCashInConfirm value) {
        return new JAXBElement<DTOResponseCashInConfirm>(_SendSMSResponseReturn_QNAME, DTOResponseCashInConfirm.class, CashInConfirmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCobroDevolucionIvaConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CobroDevolucionIvaConfirmResponse.class)
    public JAXBElement<DTOResponseCobroDevolucionIvaConfirm> createCobroDevolucionIvaConfirmResponseReturn(DTOResponseCobroDevolucionIvaConfirm value) {
        return new JAXBElement<DTOResponseCobroDevolucionIvaConfirm>(_SendSMSResponseReturn_QNAME, DTOResponseCobroDevolucionIvaConfirm.class, CobroDevolucionIvaConfirmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashInConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCashInConfirm", scope = CashInConfirm.class)
    public JAXBElement<DTORequestCashInConfirm> createCashInConfirmDtoRequestCashInConfirm(DTORequestCashInConfirm value) {
        return new JAXBElement<DTORequestCashInConfirm>(_CashInConfirmDtoRequestCashInConfirm_QNAME, DTORequestCashInConfirm.class, CashInConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashOutConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CashOutConfirmResponse.class)
    public JAXBElement<DTOResponseCashOutConfirm> createCashOutConfirmResponseReturn(DTOResponseCashOutConfirm value) {
        return new JAXBElement<DTOResponseCashOutConfirm>(_SendSMSResponseReturn_QNAME, DTOResponseCashOutConfirm.class, CashOutConfirmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestInsertClientAdditionalData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestInsertClientAdditionalData", scope = InsertClientAdditionalData.class)
    public JAXBElement<DTORequestInsertClientAdditionalData> createInsertClientAdditionalDataDtoRequestInsertClientAdditionalData(DTORequestInsertClientAdditionalData value) {
        return new JAXBElement<DTORequestInsertClientAdditionalData>(_InsertClientAdditionalDataDtoRequestInsertClientAdditionalData_QNAME, DTORequestInsertClientAdditionalData.class, InsertClientAdditionalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestReportTransactionMsisdn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestReportTransactionMsisdn", scope = ReportTransactionMsisdn.class)
    public JAXBElement<DTORequestReportTransactionMsisdn> createReportTransactionMsisdnDtoRequestReportTransactionMsisdn(DTORequestReportTransactionMsisdn value) {
        return new JAXBElement<DTORequestReportTransactionMsisdn>(_ReportTransactionMsisdnDtoRequestReportTransactionMsisdn_QNAME, DTORequestReportTransactionMsisdn.class, ReportTransactionMsisdn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestMassiveBatchUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestMassiveBatchUpload", scope = MassiveBatchCreditUpload.class)
    public JAXBElement<DTORequestMassiveBatchUpload> createMassiveBatchCreditUploadDtoRequestMassiveBatchUpload(DTORequestMassiveBatchUpload value) {
        return new JAXBElement<DTORequestMassiveBatchUpload>(_MassiveBatchDebitUploadDtoRequestMassiveBatchUpload_QNAME, DTORequestMassiveBatchUpload.class, MassiveBatchCreditUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseGetClientAdditionalData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = GetClientAdditionalDataResponse.class)
    public JAXBElement<DTOResponseGetClientAdditionalData> createGetClientAdditionalDataResponseReturn(DTOResponseGetClientAdditionalData value) {
        return new JAXBElement<DTOResponseGetClientAdditionalData>(_SendSMSResponseReturn_QNAME, DTOResponseGetClientAdditionalData.class, GetClientAdditionalDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestRemitConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestRemitConfirm", scope = RemitConfirm.class)
    public JAXBElement<DTORequestRemitConfirm> createRemitConfirmDtoRequestRemitConfirm(DTORequestRemitConfirm value) {
        return new JAXBElement<DTORequestRemitConfirm>(_RemitConfirmDtoRequestRemitConfirm_QNAME, DTORequestRemitConfirm.class, RemitConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseExecuteBatchPaymentPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = ExecuteBatchPaymentPreResponse.class)
    public JAXBElement<DTOResponseExecuteBatchPaymentPre> createExecuteBatchPaymentPreResponseReturn(DTOResponseExecuteBatchPaymentPre value) {
        return new JAXBElement<DTOResponseExecuteBatchPaymentPre>(_SendSMSResponseReturn_QNAME, DTOResponseExecuteBatchPaymentPre.class, ExecuteBatchPaymentPreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCashInPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CashInATMPreResponse.class)
    public JAXBElement<DTOResponseCashInPre> createCashInATMPreResponseReturn(DTOResponseCashInPre value) {
        return new JAXBElement<DTOResponseCashInPre>(_SendSMSResponseReturn_QNAME, DTOResponseCashInPre.class, CashInATMPreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseCobroConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = CobroConfirmResponse.class)
    public JAXBElement<DTOResponseCobroConfirm> createCobroConfirmResponseReturn(DTOResponseCobroConfirm value) {
        return new JAXBElement<DTOResponseCobroConfirm>(_SendSMSResponseReturn_QNAME, DTOResponseCobroConfirm.class, CobroConfirmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestRemitPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestRemitPre", scope = RemitPre.class)
    public JAXBElement<DTORequestRemitPre> createRemitPreDtoRequestRemitPre(DTORequestRemitPre value) {
        return new JAXBElement<DTORequestRemitPre>(_RemitPreDtoRequestRemitPre_QNAME, DTORequestRemitPre.class, RemitPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseRetrieveBatchs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = RetrieveBatchCreditResponse.class)
    public JAXBElement<DTOResponseRetrieveBatchs> createRetrieveBatchCreditResponseReturn(DTOResponseRetrieveBatchs value) {
        return new JAXBElement<DTOResponseRetrieveBatchs>(_SendSMSResponseReturn_QNAME, DTOResponseRetrieveBatchs.class, RetrieveBatchCreditResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCobroDevolucionIvaPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCobroDevolucionIvaPre", scope = CobroDevolucionIvaPre.class)
    public JAXBElement<DTORequestCobroDevolucionIvaPre> createCobroDevolucionIvaPreDtoRequestCobroDevolucionIvaPre(DTORequestCobroDevolucionIvaPre value) {
        return new JAXBElement<DTORequestCobroDevolucionIvaPre>(_CobroDevolucionIvaPreDtoRequestCobroDevolucionIvaPre_QNAME, DTORequestCobroDevolucionIvaPre.class, CobroDevolucionIvaPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashInPre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCashInATMPre", scope = CashInATMPre.class)
    public JAXBElement<DTORequestCashInPre> createCashInATMPreDtoRequestCashInATMPre(DTORequestCashInPre value) {
        return new JAXBElement<DTORequestCashInPre>(_CashInATMPreDtoRequestCashInATMPre_QNAME, DTORequestCashInPre.class, CashInATMPre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOResponseGetDailyReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "return", scope = GetDailyReportResponse.class)
    public JAXBElement<DTOResponseGetDailyReport> createGetDailyReportResponseReturn(DTOResponseGetDailyReport value) {
        return new JAXBElement<DTOResponseGetDailyReport>(_SendSMSResponseReturn_QNAME, DTOResponseGetDailyReport.class, GetDailyReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTORequestCashOutConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bce.webservices.mts.inswitch.us", name = "dtoRequestCashOutConfirm", scope = CashOutConfirm.class)
    public JAXBElement<DTORequestCashOutConfirm> createCashOutConfirmDtoRequestCashOutConfirm(DTORequestCashOutConfirm value) {
        return new JAXBElement<DTORequestCashOutConfirm>(_CashOutConfirmDtoRequestCashOutConfirm_QNAME, DTORequestCashOutConfirm.class, CashOutConfirm.class, value);
    }

}
