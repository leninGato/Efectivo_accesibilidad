
package us.inswitch.mts.webservices.dto.web.response.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DTOResponseRetrieveBatchLine complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DTOResponseRetrieveBatchLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchPaymentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="walletDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="walletTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTOResponseRetrieveBatchLine", propOrder = {
    "msisdn",
    "amount",
    "batchPaymentId",
    "currencyId",
    "description",
    "errorCode",
    "errorText",
    "lineId",
    "role",
    "status",
    "walletDescription",
    "walletTypeId"
})
public class DTOResponseRetrieveBatchLine {

    @XmlElementRef(name = "MSISDN", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> msisdn;
    @XmlElementRef(name = "amount", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> amount;
    @XmlElementRef(name = "batchPaymentId", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> batchPaymentId;
    @XmlElementRef(name = "currencyId", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> currencyId;
    @XmlElementRef(name = "description", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "errorCode", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode;
    @XmlElementRef(name = "errorText", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorText;
    @XmlElementRef(name = "lineId", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lineId;
    @XmlElementRef(name = "role", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> role;
    @XmlElementRef(name = "status", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "walletDescription", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> walletDescription;
    @XmlElementRef(name = "walletTypeId", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> walletTypeId;

    /**
     * Obtiene el valor de la propiedad msisdn.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSISDN() {
        return msisdn;
    }

    /**
     * Define el valor de la propiedad msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSISDN(JAXBElement<String> value) {
        this.msisdn = value;
    }

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
     * Obtiene el valor de la propiedad batchPaymentId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBatchPaymentId() {
        return batchPaymentId;
    }

    /**
     * Define el valor de la propiedad batchPaymentId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBatchPaymentId(JAXBElement<Integer> value) {
        this.batchPaymentId = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCurrencyId() {
        return currencyId;
    }

    /**
     * Define el valor de la propiedad currencyId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCurrencyId(JAXBElement<Integer> value) {
        this.currencyId = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
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
     * Obtiene el valor de la propiedad errorText.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorText() {
        return errorText;
    }

    /**
     * Define el valor de la propiedad errorText.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorText(JAXBElement<String> value) {
        this.errorText = value;
    }

    /**
     * Obtiene el valor de la propiedad lineId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLineId() {
        return lineId;
    }

    /**
     * Define el valor de la propiedad lineId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLineId(JAXBElement<Integer> value) {
        this.lineId = value;
    }

    /**
     * Obtiene el valor de la propiedad role.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRole() {
        return role;
    }

    /**
     * Define el valor de la propiedad role.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRole(JAXBElement<String> value) {
        this.role = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad walletDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWalletDescription() {
        return walletDescription;
    }

    /**
     * Define el valor de la propiedad walletDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWalletDescription(JAXBElement<String> value) {
        this.walletDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad walletTypeId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWalletTypeId() {
        return walletTypeId;
    }

    /**
     * Define el valor de la propiedad walletTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWalletTypeId(JAXBElement<Integer> value) {
        this.walletTypeId = value;
    }

}
