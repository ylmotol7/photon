
package org.smpte_ra.schemas.st0429_9_2007.AM;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.smpte-ra.org/schemas/429-9/2007/AM}UUID"/>
 *         &lt;element name="AnnotationText" type="{http://www.smpte-ra.org/schemas/429-9/2007/AM}UserText" minOccurs="0"/>
 *         &lt;element name="PackingList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ChunkList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Chunk" type="{http://www.smpte-ra.org/schemas/429-9/2007/AM}ChunkType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetType", propOrder = {
    "id",
    "annotationText",
    "packingList",
    "chunkList"
})
public class AssetType {

    @XmlElement(name = "Id", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlElement(name = "AnnotationText")
    protected UserText annotationText;
    @XmlElement(name = "PackingList")
    protected Boolean packingList;
    @XmlElement(name = "ChunkList", required = true)
    protected AssetType.ChunkList chunkList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the annotationText property.
     * 
     * @return
     *     possible object is
     *     {@link UserText }
     *     
     */
    public UserText getAnnotationText() {
        return annotationText;
    }

    /**
     * Sets the value of the annotationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserText }
     *     
     */
    public void setAnnotationText(UserText value) {
        this.annotationText = value;
    }

    /**
     * Gets the value of the packingList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPackingList() {
        return packingList;
    }

    /**
     * Sets the value of the packingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPackingList(Boolean value) {
        this.packingList = value;
    }

    /**
     * Gets the value of the chunkList property.
     * 
     * @return
     *     possible object is
     *     {@link AssetType.ChunkList }
     *     
     */
    public AssetType.ChunkList getChunkList() {
        return chunkList;
    }

    /**
     * Sets the value of the chunkList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetType.ChunkList }
     *     
     */
    public void setChunkList(AssetType.ChunkList value) {
        this.chunkList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Chunk" type="{http://www.smpte-ra.org/schemas/429-9/2007/AM}ChunkType" maxOccurs="unbounded"/>
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
        "chunk"
    })
    public static class ChunkList {

        @XmlElement(name = "Chunk", required = true)
        protected List<ChunkType> chunk;

        /**
         * Gets the value of the chunk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chunk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChunk().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChunkType }
         * 
         * 
         */
        public List<ChunkType> getChunk() {
            if (chunk == null) {
                chunk = new ArrayList<ChunkType>();
            }
            return this.chunk;
        }

    }

}
