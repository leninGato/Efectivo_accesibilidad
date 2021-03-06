
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestAgentAutoReversion;


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
 *         &lt;element name="dtoRequestAgentAutoReversion" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestAgentAutoReversion" minOccurs="0"/>
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
    "dtoRequestAgentAutoReversion"
})
@XmlRootElement(name = "agentAutoReversion")
public class AgentAutoReversion {

    @XmlElementRef(name = "dtoRequestAgentAutoReversion", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestAgentAutoReversion> dtoRequestAgentAutoReversion;

    /**
     * Obtiene el valor de la propiedad dtoRequestAgentAutoReversion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestAgentAutoReversion }{@code >}
     *     
     */
    public JAXBElement<DTORequestAgentAutoReversion> getDtoRequestAgentAutoReversion() {
        return dtoRequestAgentAutoReversion;
    }

    /**
     * Define el valor de la propiedad dtoRequestAgentAutoReversion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestAgentAutoReversion }{@code >}
     *     
     */
    public void setDtoRequestAgentAutoReversion(JAXBElement<DTORequestAgentAutoReversion> value) {
        this.dtoRequestAgentAutoReversion = value;
    }

}
