//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.06 at 02:44:21 PM IST 
//


package net.opengis.ogc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BinaryLogicOpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryLogicOpType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/ogc}LogicOpsType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="2">
 *         &lt;element ref="{http://www.opengis.net/ogc}comparisonOps"/>
 *         &lt;element ref="{http://www.opengis.net/ogc}spatialOps"/>
 *         &lt;element ref="{http://www.opengis.net/ogc}logicOps"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryLogicOpType", propOrder = {
    "comparisonOpsOrSpatialOpsOrLogicOps"
})
public class BinaryLogicOpType
    extends LogicOpsType
{

    @XmlElementRefs({
        @XmlElementRef(name = "comparisonOps", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "logicOps", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class),
        @XmlElementRef(name = "spatialOps", namespace = "http://www.opengis.net/ogc", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> comparisonOpsOrSpatialOpsOrLogicOps;

    /**
     * Gets the value of the comparisonOpsOrSpatialOpsOrLogicOps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparisonOpsOrSpatialOpsOrLogicOps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparisonOpsOrSpatialOpsOrLogicOps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceBufferType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryLogicOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link ComparisonOpsType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnaryLogicOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link PropertyIsNullType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link PropertyIsBetweenType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpatialOpsType }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceBufferType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BBOXType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinaryLogicOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicOpsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PropertyIsLikeType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getComparisonOpsOrSpatialOpsOrLogicOps() {
        if (comparisonOpsOrSpatialOpsOrLogicOps == null) {
            comparisonOpsOrSpatialOpsOrLogicOps = new ArrayList<JAXBElement<?>>();
        }
        return this.comparisonOpsOrSpatialOpsOrLogicOps;
    }

}
