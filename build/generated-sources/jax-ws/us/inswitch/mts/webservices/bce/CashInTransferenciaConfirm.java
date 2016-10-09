
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashInTransferencia;


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
 *         &lt;element name="dtoRequestCashInTransferenciaConfirm" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestCashInTransferencia" minOccurs="0"/>
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
    "dtoRequestCashInTransferenciaConfirm"
})
@XmlRootElement(name = "cashInTransferenciaConfirm")
public class CashInTransferenciaConfirm {

    @XmlElementRef(name = "dtoRequestCashInTransferenciaConfirm", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestCashInTransferencia> dtoRequestCashInTransferenciaConfirm;

    /**
     * Obtiene el valor de la propiedad dtoRequestCashInTransferenciaConfirm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCashInTransferencia }{@code >}
     *     
     */
    public JAXBElement<DTORequestCashInTransferencia> getDtoRequestCashInTransferenciaConfirm() {
        return dtoRequestCashInTransferenciaConfirm;
    }

    /**
     * Define el valor de la propiedad dtoRequestCashInTransferenciaConfirm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCashInTransferencia }{@code >}
     *     
     */
    public void setDtoRequestCashInTransferenciaConfirm(JAXBElement<DTORequestCashInTransferencia> value) {
        this.dtoRequestCashInTransferenciaConfirm = value;
    }

}
