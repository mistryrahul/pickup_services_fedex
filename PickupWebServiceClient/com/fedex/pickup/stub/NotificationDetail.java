/**
 * NotificationDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class NotificationDetail  implements java.io.Serializable {
    /* Indicates the type of notification that will be sent. */
    private com.fedex.pickup.stub.NotificationType notificationType;

    /* Specifies the email notification details. */
    private com.fedex.pickup.stub.EMailDetail emailDetail;

    /* Specifies the fax notification details. */
    private com.fedex.pickup.stub.FaxDetail faxDetail;

    /* Specifies the SMS notification details. */
    private com.fedex.pickup.stub.SmsDetail smsDetail;

    /* Specifies the localization for this notification. */
    private com.fedex.pickup.stub.Localization localization;

    public NotificationDetail() {
    }

    public NotificationDetail(
           com.fedex.pickup.stub.NotificationType notificationType,
           com.fedex.pickup.stub.EMailDetail emailDetail,
           com.fedex.pickup.stub.FaxDetail faxDetail,
           com.fedex.pickup.stub.SmsDetail smsDetail,
           com.fedex.pickup.stub.Localization localization) {
           this.notificationType = notificationType;
           this.emailDetail = emailDetail;
           this.faxDetail = faxDetail;
           this.smsDetail = smsDetail;
           this.localization = localization;
    }


    /**
     * Gets the notificationType value for this NotificationDetail.
     * 
     * @return notificationType   * Indicates the type of notification that will be sent.
     */
    public com.fedex.pickup.stub.NotificationType getNotificationType() {
        return notificationType;
    }


    /**
     * Sets the notificationType value for this NotificationDetail.
     * 
     * @param notificationType   * Indicates the type of notification that will be sent.
     */
    public void setNotificationType(com.fedex.pickup.stub.NotificationType notificationType) {
        this.notificationType = notificationType;
    }


    /**
     * Gets the emailDetail value for this NotificationDetail.
     * 
     * @return emailDetail   * Specifies the email notification details.
     */
    public com.fedex.pickup.stub.EMailDetail getEmailDetail() {
        return emailDetail;
    }


    /**
     * Sets the emailDetail value for this NotificationDetail.
     * 
     * @param emailDetail   * Specifies the email notification details.
     */
    public void setEmailDetail(com.fedex.pickup.stub.EMailDetail emailDetail) {
        this.emailDetail = emailDetail;
    }


    /**
     * Gets the faxDetail value for this NotificationDetail.
     * 
     * @return faxDetail   * Specifies the fax notification details.
     */
    public com.fedex.pickup.stub.FaxDetail getFaxDetail() {
        return faxDetail;
    }


    /**
     * Sets the faxDetail value for this NotificationDetail.
     * 
     * @param faxDetail   * Specifies the fax notification details.
     */
    public void setFaxDetail(com.fedex.pickup.stub.FaxDetail faxDetail) {
        this.faxDetail = faxDetail;
    }


    /**
     * Gets the smsDetail value for this NotificationDetail.
     * 
     * @return smsDetail   * Specifies the SMS notification details.
     */
    public com.fedex.pickup.stub.SmsDetail getSmsDetail() {
        return smsDetail;
    }


    /**
     * Sets the smsDetail value for this NotificationDetail.
     * 
     * @param smsDetail   * Specifies the SMS notification details.
     */
    public void setSmsDetail(com.fedex.pickup.stub.SmsDetail smsDetail) {
        this.smsDetail = smsDetail;
    }


    /**
     * Gets the localization value for this NotificationDetail.
     * 
     * @return localization   * Specifies the localization for this notification.
     */
    public com.fedex.pickup.stub.Localization getLocalization() {
        return localization;
    }


    /**
     * Sets the localization value for this NotificationDetail.
     * 
     * @param localization   * Specifies the localization for this notification.
     */
    public void setLocalization(com.fedex.pickup.stub.Localization localization) {
        this.localization = localization;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificationDetail)) return false;
        NotificationDetail other = (NotificationDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notificationType==null && other.getNotificationType()==null) || 
             (this.notificationType!=null &&
              this.notificationType.equals(other.getNotificationType()))) &&
            ((this.emailDetail==null && other.getEmailDetail()==null) || 
             (this.emailDetail!=null &&
              this.emailDetail.equals(other.getEmailDetail()))) &&
            ((this.faxDetail==null && other.getFaxDetail()==null) || 
             (this.faxDetail!=null &&
              this.faxDetail.equals(other.getFaxDetail()))) &&
            ((this.smsDetail==null && other.getSmsDetail()==null) || 
             (this.smsDetail!=null &&
              this.smsDetail.equals(other.getSmsDetail()))) &&
            ((this.localization==null && other.getLocalization()==null) || 
             (this.localization!=null &&
              this.localization.equals(other.getLocalization())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNotificationType() != null) {
            _hashCode += getNotificationType().hashCode();
        }
        if (getEmailDetail() != null) {
            _hashCode += getEmailDetail().hashCode();
        }
        if (getFaxDetail() != null) {
            _hashCode += getFaxDetail().hashCode();
        }
        if (getSmsDetail() != null) {
            _hashCode += getSmsDetail().hashCode();
        }
        if (getLocalization() != null) {
            _hashCode += getLocalization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificationDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "NotificationDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "NotificationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "NotificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "EmailDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "EMailDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "FaxDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "FaxDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "SmsDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "SmsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Localization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Localization"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
