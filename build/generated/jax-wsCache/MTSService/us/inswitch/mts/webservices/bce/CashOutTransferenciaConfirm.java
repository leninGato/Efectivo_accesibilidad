
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashOutTransferencia;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtoRequestCashOutTransferenciaConfirm" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestCashOutTransferencia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dtoRequestCashOutTransferenciaConfirm"
})
@XmlRootElement(name = "cashOutTransferenciaConfirm")
public class CashOutTransferenciaConfirm {

    @XmlElementRef(name = "dtoRequestCashOutTransferenciaConfirm", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestCashOutTransferencia> dtoRequestCashOutTransferenciaConfirm;

    /**
     * Obtiene el valor de la propiedad dtoRequestCashOutTransferenciaConfirm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCashOutTransferencia }{@code >}
     *     
     */
    public JAXBElement<DTORequestCashOutTransferencia> getDtoRequestCashOutTransferenciaConfirm() {
        return dtoRequestCashOutTransferenciaConfirm;
    }

    /**
     * Define el valor de la propiedad dtoRequestCashOutTransferenciaConfirm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCashOutTransferencia }{@code >}
     *     
     */
    public void setDtoRequestCashOutTransferenciaConfirm(JAXBElement<DTORequestCashOutTransferencia> value) {
        this.dtoRequestCashOutTransferenciaConfirm = value;
    }

}
