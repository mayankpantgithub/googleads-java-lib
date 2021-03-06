
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} hosted by either DoubleClick for Advertisers (DFA) or DART
 *             for Publishers.
 *             <p>
 *             Similar to third-party creatives, a DoubleClick tag is used to retrieve a
 *             creative asset. However, DoubleClick tags are not sent to the user's browser.
 *             Instead, they are processed internally within the DoubleClick system..
 *           
 * 
 * <p>Java class for InternalRedirectCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternalRedirectCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201306}Creative">
 *       &lt;sequence>
 *         &lt;element name="assetSize" type="{https://www.google.com/apis/ads/publisher/v201306}Size" minOccurs="0"/>
 *         &lt;element name="internalRedirectUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overrideSize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isInterstitial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalRedirectCreative", propOrder = {
    "assetSize",
    "internalRedirectUrl",
    "overrideSize",
    "isInterstitial"
})
public class InternalRedirectCreative
    extends Creative
{

    protected Size assetSize;
    protected String internalRedirectUrl;
    protected Boolean overrideSize;
    protected Boolean isInterstitial;

    /**
     * Gets the value of the assetSize property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getAssetSize() {
        return assetSize;
    }

    /**
     * Sets the value of the assetSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setAssetSize(Size value) {
        this.assetSize = value;
    }

    /**
     * Gets the value of the internalRedirectUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalRedirectUrl() {
        return internalRedirectUrl;
    }

    /**
     * Sets the value of the internalRedirectUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalRedirectUrl(String value) {
        this.internalRedirectUrl = value;
    }

    /**
     * Gets the value of the overrideSize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideSize() {
        return overrideSize;
    }

    /**
     * Sets the value of the overrideSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideSize(Boolean value) {
        this.overrideSize = value;
    }

    /**
     * Gets the value of the isInterstitial property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInterstitial() {
        return isInterstitial;
    }

    /**
     * Sets the value of the isInterstitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInterstitial(Boolean value) {
        this.isInterstitial = value;
    }

}
