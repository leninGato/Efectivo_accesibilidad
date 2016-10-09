
package us.inswitch.mts.webservices.dto.web.response.xsd;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DTOResponseReportTransaction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DTOResponseReportTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destiny" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interfaceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movementQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="msisdnDestiny" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msisdnSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tsTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTOResponseReportTransaction", propOrder = {
    "amount",
    "brandId",
    "currency",
    "destiny",
    "errorCode",
    "errorDescription",
    "interfaceId",
    "movementQuantity",
    "msisdnDestiny",
    "msisdnSource",
    "result",
    "service",
    "source",
    "transactionId",
    "tsTransaction",
    "type"
})
public class DTOResponseReportTransaction {

    @XmlElementRef(name = "amount", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> amount;
    @XmlElementRef(name = "brandId", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brandId;
    @XmlElementRef(name = "currency", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElementRef(name = "destiny", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> destiny;
    @XmlElementRef(name = "errorCode", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode;
    @XmlElementRef(name = "errorDescription", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorDescription;
    @XmlElementRef(name = "interfaceId", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceId;
    @XmlElementRef(name = "movementQuantity", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> movementQuantity;
    @XmlElementRef(name = "msisdnDestiny", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> msisdnDestiny;
    @XmlElementRef(name = "msisdnSource", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> msisdnSource;
    @XmlElementRef(name = "result", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> result;
    @XmlElementRef(name = "service", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> service;
    @XmlElementRef(name = "source", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> source;
    @XmlElementRef(name = "transactionId", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> transactionId;
    @XmlElementRef(name = "tsTransaction", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tsTransaction;
    @XmlElementRef(name = "type", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> type;

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmount(JAXBElement<String> value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad brandId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrandId() {
        return brandId;
    }

    /**
     * Define el valor de la propiedad brandId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrandId(JAXBElement<String> value) {
        this.brandId = value;
    }

    /**
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<String> value) {
        this.currency = value;
    }

    /**
     * Obtiene el valor de la propiedad destiny.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDestiny() {
        return destiny;
    }

    /**
     * Define el valor de la propiedad destiny.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDestiny(JAXBElement<BigDecimal> value) {
        this.destiny = value;
    }

    /**
     * Obtiene el valor de la propiedad errorCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorCode() {
        return errorCode;
    }

    /**
     * Define el valor de la propiedad errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorCode(JAXBElement<String> value) {
        this.errorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad errorDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorDescription() {
        return errorDescription;
    }

    /**
     * Define el valor de la propiedad errorDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorDescription(JAXBElement<String> value) {
        this.errorDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad interfaceId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceId() {
        return interfaceId;
    }

    /**
     * Define el valor de la propiedad interfaceId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceId(JAXBElement<String> value) {
        this.interfaceId = value;
    }

    /**
     * Obtiene el valor de la propiedad movementQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMovementQuantity() {
        return movementQuantity;
    }

    /**
     * Define el valor de la propiedad movementQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMovementQuantity(JAXBElement<BigDecimal> value) {
        this.movementQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad msisdnDestiny.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsisdnDestiny() {
        return msisdnDestiny;
    }

    /**
     * Define el valor de la propiedad msisdnDestiny.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsisdnDestiny(JAXBElement<String> value) {
        this.msisdnDestiny = value;
    }

    /**
     * Obtiene el valor de la propiedad msisdnSource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsisdnSource() {
        return msisdnSource;
    }

    /**
     * Define el valor de la propiedad msisdnSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsisdnSource(JAXBElement<String> value) {
        this.msisdnSource = value;
    }

    /**
     * Obtiene el valor de la propiedad result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getResult() {
        return result;
    }

    /**
     * Define el valor de la propiedad result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setResult(JAXBElement<BigDecimal> value) {
        this.result = value;
    }

    /**
     * Obtiene el valor de la propiedad service.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getService() {
        return service;
    }

    /**
     * Define el valor de la propiedad service.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setService(JAXBElement<String> value) {
        this.service = value;
    }

    /**
     * Obtiene el valor de la propiedad source.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSource() {
        return source;
    }

    /**
     * Define el valor de la propiedad source.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSource(JAXBElement<BigDecimal> value) {
        this.source = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTransactionId() {
        return transactionId;
    }

    /**
     * Define el valor de la propiedad transactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTransactionId(JAXBElement<BigDecimal> value) {
        this.transactionId = value;
    }

    /**
     * Obtiene el valor de la propiedad tsTransaction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTsTransaction() {
        return tsTransaction;
    }

    /**
     * Define el valor de la propiedad tsTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTsTransaction(JAXBElement<String> value) {
        this.tsTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setType(JAXBElement<BigDecimal> value) {
        this.type = value;
    }

}
