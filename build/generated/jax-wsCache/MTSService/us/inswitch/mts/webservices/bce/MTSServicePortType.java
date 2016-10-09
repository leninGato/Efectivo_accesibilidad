
package us.inswitch.mts.webservices.bce;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
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
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MTSServicePortType", targetNamespace = "http://bce.webservices.mts.inswitch.us")
@XmlSeeAlso({
    us.inswitch.mts.exceptions.xsd.ObjectFactory.class,
    us.inswitch.mts.model.xsd.ObjectFactory.class,
    us.inswitch.mts.webservices.bce.ObjectFactory.class,
    us.inswitch.mts.webservices.dto.administration.request.xsd.ObjectFactory.class,
    us.inswitch.mts.webservices.dto.administration.response.xsd.ObjectFactory.class,
    us.inswitch.mts.webservices.dto.service.request.xsd.ObjectFactory.class,
    us.inswitch.mts.webservices.dto.service.response.xsd.ObjectFactory.class,
    us.inswitch.mts.webservices.dto.web.request.xsd.ObjectFactory.class,
    us.inswitch.mts.webservices.dto.web.response.xsd.ObjectFactory.class
})
public interface MTSServicePortType {


    /**
     * 
     * @param dtoRequestDeleteClientAdditionalData
     * @return
     *     returns us.inswitch.mts.webservices.dto.administration.response.xsd.DTOResponseDeleteClientAdditionalData
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:deleteClientAdditionalData")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "deleteClientAdditionalData", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.DeleteClientAdditionalData")
    @ResponseWrapper(localName = "deleteClientAdditionalDataResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.DeleteClientAdditionalDataResponse")
    public DTOResponseDeleteClientAdditionalData deleteClientAdditionalData(
        @WebParam(name = "dtoRequestDeleteClientAdditionalData", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestDeleteClientAdditionalData dtoRequestDeleteClientAdditionalData)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestChangePin
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseChangePin
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:changePin")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "changePin", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.ChangePin")
    @ResponseWrapper(localName = "changePinResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.ChangePinResponse")
    public DTOResponseChangePin changePin(
        @WebParam(name = "dtoRequestChangePin", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestChangePin dtoRequestChangePin)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestReportTransactionMsisdn
     * @return
     *     returns us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseReportTransactions
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:reportTransactionMsisdn")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "reportTransactionMsisdn", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.ReportTransactionMsisdn")
    @ResponseWrapper(localName = "reportTransactionMsisdnResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.ReportTransactionMsisdnResponse")
    public DTOResponseReportTransactions reportTransactionMsisdn(
        @WebParam(name = "dtoRequestReportTransactionMsisdn", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestReportTransactionMsisdn dtoRequestReportTransactionMsisdn)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestFondeoLocalPre
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseFondeoLocalPre
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:fondeoLocalPre")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "fondeoLocalPre", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.FondeoLocalPre")
    @ResponseWrapper(localName = "fondeoLocalPreResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.FondeoLocalPreResponse")
    public DTOResponseFondeoLocalPre fondeoLocalPre(
        @WebParam(name = "dtoRequestFondeoLocalPre", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestFondeoLocalPre dtoRequestFondeoLocalPre)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestGetClientAdditionalData
     * @return
     *     returns us.inswitch.mts.webservices.dto.administration.response.xsd.DTOResponseGetClientAdditionalData
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:getClientAdditionalData")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "getClientAdditionalData", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetClientAdditionalData")
    @ResponseWrapper(localName = "getClientAdditionalDataResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetClientAdditionalDataResponse")
    public DTOResponseGetClientAdditionalData getClientAdditionalData(
        @WebParam(name = "dtoRequestGetClientAdditionalData", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestGetClientAdditionalData dtoRequestGetClientAdditionalData)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCashInPre
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashInPre
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cashInPre")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cashInPre", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashInPre")
    @ResponseWrapper(localName = "cashInPreResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashInPreResponse")
    public DTOResponseCashInPre cashInPre(
        @WebParam(name = "dtoRequestCashInPre", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCashInPre dtoRequestCashInPre)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestSendPUSH
     * @return
     *     returns us.inswitch.mts.webservices.dto.administration.response.xsd.DTOResponseSendPUSH
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:sendPUSH")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "sendPUSH", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.SendPUSH")
    @ResponseWrapper(localName = "sendPUSHResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.SendPUSHResponse")
    public DTOResponseSendPUSH sendPUSH(
        @WebParam(name = "dtoRequestSendPUSH", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestSendPUSH dtoRequestSendPUSH)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestGetDailyReport
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseGetDailyReport
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:getDailyReportTelco")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "getDailyReportTelco", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetDailyReportTelco")
    @ResponseWrapper(localName = "getDailyReportTelcoResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetDailyReportTelcoResponse")
    public DTOResponseGetDailyReport getDailyReportTelco(
        @WebParam(name = "dtoRequestGetDailyReport", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestGetDailyReport dtoRequestGetDailyReport)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCashInTransferenciaPre
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashInPre
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cashInTransferenciaPre")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cashInTransferenciaPre", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashInTransferenciaPre")
    @ResponseWrapper(localName = "cashInTransferenciaPreResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashInTransferenciaPreResponse")
    public DTOResponseCashInPre cashInTransferenciaPre(
        @WebParam(name = "dtoRequestCashInTransferenciaPre", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCashInTransferencia dtoRequestCashInTransferenciaPre)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCashOutTransferenciaPre
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashOutPre
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cashOutTransferenciaPre")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cashOutTransferenciaPre", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashOutTransferenciaPre")
    @ResponseWrapper(localName = "cashOutTransferenciaPreResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashOutTransferenciaPreResponse")
    public DTOResponseCashOutPre cashOutTransferenciaPre(
        @WebParam(name = "dtoRequestCashOutTransferenciaPre", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCashOutTransferencia dtoRequestCashOutTransferenciaPre)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "urn:getVersionId")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "getVersionId", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetVersionId")
    @ResponseWrapper(localName = "getVersionIdResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetVersionIdResponse")
    public String getVersionId();

    /**
     * 
     * @param dtoRequestGirosNacionales
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseGirosNacionalesConfirm
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:girosNacionalesConfirm")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "girosNacionalesConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GirosNacionalesConfirm")
    @ResponseWrapper(localName = "girosNacionalesConfirmResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GirosNacionalesConfirmResponse")
    public DTOResponseGirosNacionalesConfirm girosNacionalesConfirm(
        @WebParam(name = "dtoRequestGirosNacionales", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestGirosNacionales dtoRequestGirosNacionales)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestInsertClientAdditionalData
     * @return
     *     returns us.inswitch.mts.webservices.dto.administration.response.xsd.DTOResponseInsertClientAdditionalData
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:insertClientAdditionalData")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "insertClientAdditionalData", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.InsertClientAdditionalData")
    @ResponseWrapper(localName = "insertClientAdditionalDataResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.InsertClientAdditionalDataResponse")
    public DTOResponseInsertClientAdditionalData insertClientAdditionalData(
        @WebParam(name = "dtoRequestInsertClientAdditionalData", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestInsertClientAdditionalData dtoRequestInsertClientAdditionalData)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCashOutATMPre
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashOutPre
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cashOutATMPre")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cashOutATMPre", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashOutATMPre")
    @ResponseWrapper(localName = "cashOutATMPreResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashOutATMPreResponse")
    public DTOResponseCashOutPre cashOutATMPre(
        @WebParam(name = "dtoRequestCashOutATMPre", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCashOutPre dtoRequestCashOutATMPre)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCashOutATMConfirm
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashOutConfirm
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cashOutATMConfirm")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cashOutATMConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashOutATMConfirm")
    @ResponseWrapper(localName = "cashOutATMConfirmResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashOutATMConfirmResponse")
    public DTOResponseCashOutConfirm cashOutATMConfirm(
        @WebParam(name = "dtoRequestCashOutATMConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCashOutConfirm dtoRequestCashOutATMConfirm)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestReservesForBankTransfer
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseReservesForBankTransfer
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:reservesForBankTransfer")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "reservesForBankTransfer", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.ReservesForBankTransfer")
    @ResponseWrapper(localName = "reservesForBankTransferResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.ReservesForBankTransferResponse")
    public DTOResponseReservesForBankTransfer reservesForBankTransfer(
        @WebParam(name = "dtoRequestReservesForBankTransfer", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestReservesForBankTransfer dtoRequestReservesForBankTransfer)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestDeleteBatchLine
     * @return
     *     returns us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseDeleteBatchLine
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:deleteBatchLine")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "deleteBatchLine", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.DeleteBatchLine")
    @ResponseWrapper(localName = "deleteBatchLineResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.DeleteBatchLineResponse")
    public DTOResponseDeleteBatchLine deleteBatchLine(
        @WebParam(name = "dtoRequestDeleteBatchLine", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestDeleteBatchLine dtoRequestDeleteBatchLine)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCashInATMPre
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashInPre
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cashInATMPre")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cashInATMPre", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashInATMPre")
    @ResponseWrapper(localName = "cashInATMPreResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashInATMPreResponse")
    public DTOResponseCashInPre cashInATMPre(
        @WebParam(name = "dtoRequestCashInATMPre", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCashInPre dtoRequestCashInATMPre)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestRemitPre
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseRemitPre
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:remitPre")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "remitPre", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.RemitPre")
    @ResponseWrapper(localName = "remitPreResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.RemitPreResponse")
    public DTOResponseRemitPre remitPre(
        @WebParam(name = "dtoRequestRemitPre", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestRemitPre dtoRequestRemitPre)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestExecuteBatchPayment
     * @return
     *     returns us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseExecuteBatchPaymentConfirm
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:executeBatchPaymentConfirm")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "executeBatchPaymentConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.ExecuteBatchPaymentConfirm")
    @ResponseWrapper(localName = "executeBatchPaymentConfirmResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.ExecuteBatchPaymentConfirmResponse")
    public DTOResponseExecuteBatchPaymentConfirm executeBatchPaymentConfirm(
        @WebParam(name = "dtoRequestExecuteBatchPayment", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestExecuteBatchPayment dtoRequestExecuteBatchPayment)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestAgentAutoReversion
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseAgentAutoReversion
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:agentAutoReversion")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "agentAutoReversion", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.AgentAutoReversion")
    @ResponseWrapper(localName = "agentAutoReversionResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.AgentAutoReversionResponse")
    public DTOResponseAgentAutoReversion agentAutoReversion(
        @WebParam(name = "dtoRequestAgentAutoReversion", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestAgentAutoReversion dtoRequestAgentAutoReversion)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestRetrieveBatchLines
     * @return
     *     returns us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseRetrieveBatchLines
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:retrieveBatchLines")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "retrieveBatchLines", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.RetrieveBatchLines")
    @ResponseWrapper(localName = "retrieveBatchLinesResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.RetrieveBatchLinesResponse")
    public DTOResponseRetrieveBatchLines retrieveBatchLines(
        @WebParam(name = "dtoRequestRetrieveBatchLines", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestRetrieveBatchLines dtoRequestRetrieveBatchLines)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestMassiveBatchUpload
     * @return
     *     returns us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseMassiveBatchUpload
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:massiveBatchCreditUpload")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "massiveBatchCreditUpload", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.MassiveBatchCreditUpload")
    @ResponseWrapper(localName = "massiveBatchCreditUploadResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.MassiveBatchCreditUploadResponse")
    public DTOResponseMassiveBatchUpload massiveBatchCreditUpload(
        @WebParam(name = "dtoRequestMassiveBatchUpload", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestMassiveBatchUpload dtoRequestMassiveBatchUpload)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestRetrieveBatchDebit
     * @return
     *     returns us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseRetrieveBatchs
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:retrieveBatchDebit")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "retrieveBatchDebit", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.RetrieveBatchDebit")
    @ResponseWrapper(localName = "retrieveBatchDebitResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.RetrieveBatchDebitResponse")
    public DTOResponseRetrieveBatchs retrieveBatchDebit(
        @WebParam(name = "dtoRequestRetrieveBatchDebit", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestRetrieveBatch dtoRequestRetrieveBatchDebit)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestGetBalance
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseWallets
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:getBalance")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "getBalance", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetBalance")
    @ResponseWrapper(localName = "getBalanceResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetBalanceResponse")
    public DTOResponseWallets getBalance(
        @WebParam(name = "dtoRequestGetBalance", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestGetBalance dtoRequestGetBalance)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestFondeoLocalConfirm
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseFondeoLocalConfirm
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:fondeoLocalConfirm")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "fondeoLocalConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.FondeoLocalConfirm")
    @ResponseWrapper(localName = "fondeoLocalConfirmResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.FondeoLocalConfirmResponse")
    public DTOResponseFondeoLocalConfirm fondeoLocalConfirm(
        @WebParam(name = "dtoRequestFondeoLocalConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestFondeoLocalConfirm dtoRequestFondeoLocalConfirm)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestGetBalanceReportCSV
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseGetBalanceReportCSV
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:getBalanceReportCSV")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "getBalanceReportCSV", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetBalanceReportCSV")
    @ResponseWrapper(localName = "getBalanceReportCSVResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetBalanceReportCSVResponse")
    public DTOResponseGetBalanceReportCSV getBalanceReportCSV(
        @WebParam(name = "dtoRequestGetBalanceReportCSV", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestGetBalanceReportCSV dtoRequestGetBalanceReportCSV)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestEditBatchLine
     * @return
     *     returns us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseEditBatchLine
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:editBatchLine")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "editBatchLine", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.EditBatchLine")
    @ResponseWrapper(localName = "editBatchLineResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.EditBatchLineResponse")
    public DTOResponseEditBatchLine editBatchLine(
        @WebParam(name = "dtoRequestEditBatchLine", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestEditBatchLine dtoRequestEditBatchLine)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestUpdateClientAdditionalData
     * @return
     *     returns us.inswitch.mts.webservices.dto.administration.response.xsd.DTOResponseUpdateClientAdditionalData
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:updateClientAdditionalData")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "updateClientAdditionalData", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.UpdateClientAdditionalData")
    @ResponseWrapper(localName = "updateClientAdditionalDataResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.UpdateClientAdditionalDataResponse")
    public DTOResponseUpdateClientAdditionalData updateClientAdditionalData(
        @WebParam(name = "dtoRequestUpdateClientAdditionalData", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestUpdateClientAdditionalData dtoRequestUpdateClientAdditionalData)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCashOutTransferenciaConfirm
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashOutConfirm
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cashOutTransferenciaConfirm")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cashOutTransferenciaConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashOutTransferenciaConfirm")
    @ResponseWrapper(localName = "cashOutTransferenciaConfirmResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashOutTransferenciaConfirmResponse")
    public DTOResponseCashOutConfirm cashOutTransferenciaConfirm(
        @WebParam(name = "dtoRequestCashOutTransferenciaConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCashOutTransferencia dtoRequestCashOutTransferenciaConfirm)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestRemitConfirm
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseRemitConfirm
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:remitConfirm")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "remitConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.RemitConfirm")
    @ResponseWrapper(localName = "remitConfirmResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.RemitConfirmResponse")
    public DTOResponseRemitConfirm remitConfirm(
        @WebParam(name = "dtoRequestRemitConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestRemitConfirm dtoRequestRemitConfirm)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCobroDevolucionIvaConfirm
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCobroDevolucionIvaConfirm
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cobroDevolucionIvaConfirm")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cobroDevolucionIvaConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CobroDevolucionIvaConfirm")
    @ResponseWrapper(localName = "cobroDevolucionIvaConfirmResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CobroDevolucionIvaConfirmResponse")
    public DTOResponseCobroDevolucionIvaConfirm cobroDevolucionIvaConfirm(
        @WebParam(name = "dtoRequestCobroDevolucionIvaConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCobroDevolucionIvaConfirm dtoRequestCobroDevolucionIvaConfirm)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCashInTransferenciaConfirm
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashInConfirm
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cashInTransferenciaConfirm")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cashInTransferenciaConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashInTransferenciaConfirm")
    @ResponseWrapper(localName = "cashInTransferenciaConfirmResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashInTransferenciaConfirmResponse")
    public DTOResponseCashInConfirm cashInTransferenciaConfirm(
        @WebParam(name = "dtoRequestCashInTransferenciaConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCashInTransferencia dtoRequestCashInTransferenciaConfirm)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCashInATMConfirm
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashInConfirm
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cashInATMConfirm")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cashInATMConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashInATMConfirm")
    @ResponseWrapper(localName = "cashInATMConfirmResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashInATMConfirmResponse")
    public DTOResponseCashInConfirm cashInATMConfirm(
        @WebParam(name = "dtoRequestCashInATMConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCashInConfirm dtoRequestCashInATMConfirm)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCashOutPre
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashOutPre
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cashOutPre")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cashOutPre", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashOutPre")
    @ResponseWrapper(localName = "cashOutPreResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashOutPreResponse")
    public DTOResponseCashOutPre cashOutPre(
        @WebParam(name = "dtoRequestCashOutPre", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCashOutPre dtoRequestCashOutPre)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestUtfiAutoReversion
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseUtfiAutoReversion
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:utfiAutoReversion")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "utfiAutoReversion", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.UtfiAutoReversion")
    @ResponseWrapper(localName = "utfiAutoReversionResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.UtfiAutoReversionResponse")
    public DTOResponseUtfiAutoReversion utfiAutoReversion(
        @WebParam(name = "dtoRequestUtfiAutoReversion", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestUtfiAutoReversion dtoRequestUtfiAutoReversion)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestMassiveBatchUpload
     * @return
     *     returns us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseMassiveBatchUpload
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:massiveBatchDebitUpload")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "massiveBatchDebitUpload", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.MassiveBatchDebitUpload")
    @ResponseWrapper(localName = "massiveBatchDebitUploadResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.MassiveBatchDebitUploadResponse")
    public DTOResponseMassiveBatchUpload massiveBatchDebitUpload(
        @WebParam(name = "dtoRequestMassiveBatchUpload", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestMassiveBatchUpload dtoRequestMassiveBatchUpload)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestExecuteBatchPayment
     * @return
     *     returns us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseExecuteBatchPaymentPre
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:executeBatchPaymentPre")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "executeBatchPaymentPre", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.ExecuteBatchPaymentPre")
    @ResponseWrapper(localName = "executeBatchPaymentPreResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.ExecuteBatchPaymentPreResponse")
    public DTOResponseExecuteBatchPaymentPre executeBatchPaymentPre(
        @WebParam(name = "dtoRequestExecuteBatchPayment", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestExecuteBatchPayment dtoRequestExecuteBatchPayment)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestRetrieveBatchOneLine
     * @return
     *     returns us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseRetrieveBatchOneLine
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:retrieveBatchOneLine")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "retrieveBatchOneLine", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.RetrieveBatchOneLine")
    @ResponseWrapper(localName = "retrieveBatchOneLineResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.RetrieveBatchOneLineResponse")
    public DTOResponseRetrieveBatchOneLine retrieveBatchOneLine(
        @WebParam(name = "dtoRequestRetrieveBatchOneLine", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestRetrieveBatchOneLine dtoRequestRetrieveBatchOneLine)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCobroDevolucionIvaPre
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCobroDevolucionIvaPre
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cobroDevolucionIvaPre")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cobroDevolucionIvaPre", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CobroDevolucionIvaPre")
    @ResponseWrapper(localName = "cobroDevolucionIvaPreResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CobroDevolucionIvaPreResponse")
    public DTOResponseCobroDevolucionIvaPre cobroDevolucionIvaPre(
        @WebParam(name = "dtoRequestCobroDevolucionIvaPre", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCobroDevolucionIvaPre dtoRequestCobroDevolucionIvaPre)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestReportTransaction
     * @return
     *     returns us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseReportTransactions
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:reportTransaction")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "reportTransaction", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.ReportTransaction")
    @ResponseWrapper(localName = "reportTransactionResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.ReportTransactionResponse")
    public DTOResponseReportTransactions reportTransaction(
        @WebParam(name = "dtoRequestReportTransaction", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestReportTransaction dtoRequestReportTransaction)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestGetDailyReport
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseGetDailyReport
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:getDailyReport")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "getDailyReport", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetDailyReport")
    @ResponseWrapper(localName = "getDailyReportResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetDailyReportResponse")
    public DTOResponseGetDailyReport getDailyReport(
        @WebParam(name = "dtoRequestGetDailyReport", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestGetDailyReport dtoRequestGetDailyReport)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCobroConfirm
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCobroConfirm
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cobroConfirm")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cobroConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CobroConfirm")
    @ResponseWrapper(localName = "cobroConfirmResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CobroConfirmResponse")
    public DTOResponseCobroConfirm cobroConfirm(
        @WebParam(name = "dtoRequestCobroConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCobroConfirm dtoRequestCobroConfirm)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestRetrieveBatchCredit
     * @return
     *     returns us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseRetrieveBatchs
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:retrieveBatchCredit")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "retrieveBatchCredit", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.RetrieveBatchCredit")
    @ResponseWrapper(localName = "retrieveBatchCreditResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.RetrieveBatchCreditResponse")
    public DTOResponseRetrieveBatchs retrieveBatchCredit(
        @WebParam(name = "dtoRequestRetrieveBatchCredit", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestRetrieveBatch dtoRequestRetrieveBatchCredit)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestGetDailyReport
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseGetDailyReport
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:getDailyReportNoCommission")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "getDailyReportNoCommission", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetDailyReportNoCommission")
    @ResponseWrapper(localName = "getDailyReportNoCommissionResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetDailyReportNoCommissionResponse")
    public DTOResponseGetDailyReport getDailyReportNoCommission(
        @WebParam(name = "dtoRequestGetDailyReport", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestGetDailyReport dtoRequestGetDailyReport)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCashOutConfirm
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashOutConfirm
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cashOutConfirm")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cashOutConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashOutConfirm")
    @ResponseWrapper(localName = "cashOutConfirmResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashOutConfirmResponse")
    public DTOResponseCashOutConfirm cashOutConfirm(
        @WebParam(name = "dtoRequestCashOutConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCashOutConfirm dtoRequestCashOutConfirm)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestGetBalanceReport
     * @return
     *     returns us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseGetBalanceReport
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:getBalanceReport")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "getBalanceReport", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetBalanceReport")
    @ResponseWrapper(localName = "getBalanceReportResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GetBalanceReportResponse")
    public DTOResponseGetBalanceReport getBalanceReport(
        @WebParam(name = "dtoRequestGetBalanceReport", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestGetBalanceReport dtoRequestGetBalanceReport)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCobroPre
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCobroPre
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cobroPre")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cobroPre", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CobroPre")
    @ResponseWrapper(localName = "cobroPreResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CobroPreResponse")
    public DTOResponseCobroPre cobroPre(
        @WebParam(name = "dtoRequestCobroPre", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCobroPre dtoRequestCobroPre)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestGirosNacionales
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseGirosNacionalesPre
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:girosNacionalesPre")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "girosNacionalesPre", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GirosNacionalesPre")
    @ResponseWrapper(localName = "girosNacionalesPreResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.GirosNacionalesPreResponse")
    public DTOResponseGirosNacionalesPre girosNacionalesPre(
        @WebParam(name = "dtoRequestGirosNacionales", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestGirosNacionales dtoRequestGirosNacionales)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestSendSMS
     * @return
     *     returns us.inswitch.mts.webservices.dto.administration.response.xsd.DTOResponseSendSMS
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:sendSMS")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "sendSMS", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.SendSMS")
    @ResponseWrapper(localName = "sendSMSResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.SendSMSResponse")
    public DTOResponseSendSMS sendSMS(
        @WebParam(name = "dtoRequestSendSMS", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestSendSMS dtoRequestSendSMS)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestCashInConfirm
     * @return
     *     returns us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseCashInConfirm
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:cashInConfirm")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "cashInConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashInConfirm")
    @ResponseWrapper(localName = "cashInConfirmResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.CashInConfirmResponse")
    public DTOResponseCashInConfirm cashInConfirm(
        @WebParam(name = "dtoRequestCashInConfirm", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestCashInConfirm dtoRequestCashInConfirm)
        throws MTSServiceServiceException_Exception
    ;

    /**
     * 
     * @param dtoRequestDeleteBatchPayment
     * @return
     *     returns us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseDeleteBatchPayment
     * @throws MTSServiceServiceException_Exception
     */
    @WebMethod(action = "urn:deleteBatchPayment")
    @WebResult(targetNamespace = "http://bce.webservices.mts.inswitch.us")
    @RequestWrapper(localName = "deleteBatchPayment", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.DeleteBatchPayment")
    @ResponseWrapper(localName = "deleteBatchPaymentResponse", targetNamespace = "http://bce.webservices.mts.inswitch.us", className = "us.inswitch.mts.webservices.bce.DeleteBatchPaymentResponse")
    public DTOResponseDeleteBatchPayment deleteBatchPayment(
        @WebParam(name = "dtoRequestDeleteBatchPayment", targetNamespace = "http://bce.webservices.mts.inswitch.us")
        DTORequestDeleteBatchPayment dtoRequestDeleteBatchPayment)
        throws MTSServiceServiceException_Exception
    ;

}
