//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.29 时间 11:06:28 PM CST 
//


package szfs.std.szfs._2010.tech.xsd.szfs_302_002;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Document complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ColltnChrgs" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}CollectionCharges"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "colltnChrgs"
})
public class Document {

    @XmlElement(name = "ColltnChrgs", required = true)
    protected CollectionCharges colltnChrgs;

    /**
     * 获取colltnChrgs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CollectionCharges }
     *     
     */
    public CollectionCharges getColltnChrgs() {
        return colltnChrgs;
    }

    /**
     * 设置colltnChrgs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionCharges }
     *     
     */
    public void setColltnChrgs(CollectionCharges value) {
        this.colltnChrgs = value;
    }

}
