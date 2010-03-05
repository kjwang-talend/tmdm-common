/**
 * WSGetBusinessConceptKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package urn_com_amalto_xtentis_webservice;

public class WSGetBusinessConceptKey  implements java.io.Serializable {
    private urn_com_amalto_xtentis_webservice.WSDataModelPK wsDataModelPK;

    private java.lang.String concept;

    public WSGetBusinessConceptKey() {
    }

    public WSGetBusinessConceptKey(
           urn_com_amalto_xtentis_webservice.WSDataModelPK wsDataModelPK,
           java.lang.String concept) {
           this.wsDataModelPK = wsDataModelPK;
           this.concept = concept;
    }


    /**
     * Gets the wsDataModelPK value for this WSGetBusinessConceptKey.
     * 
     * @return wsDataModelPK
     */
    public urn_com_amalto_xtentis_webservice.WSDataModelPK getWsDataModelPK() {
        return wsDataModelPK;
    }


    /**
     * Sets the wsDataModelPK value for this WSGetBusinessConceptKey.
     * 
     * @param wsDataModelPK
     */
    public void setWsDataModelPK(urn_com_amalto_xtentis_webservice.WSDataModelPK wsDataModelPK) {
        this.wsDataModelPK = wsDataModelPK;
    }


    /**
     * Gets the concept value for this WSGetBusinessConceptKey.
     * 
     * @return concept
     */
    public java.lang.String getConcept() {
        return concept;
    }


    /**
     * Sets the concept value for this WSGetBusinessConceptKey.
     * 
     * @param concept
     */
    public void setConcept(java.lang.String concept) {
        this.concept = concept;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSGetBusinessConceptKey)) return false;
        WSGetBusinessConceptKey other = (WSGetBusinessConceptKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsDataModelPK==null && other.getWsDataModelPK()==null) || 
             (this.wsDataModelPK!=null &&
              this.wsDataModelPK.equals(other.getWsDataModelPK()))) &&
            ((this.concept==null && other.getConcept()==null) || 
             (this.concept!=null &&
              this.concept.equals(other.getConcept())));
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
        if (getWsDataModelPK() != null) {
            _hashCode += getWsDataModelPK().hashCode();
        }
        if (getConcept() != null) {
            _hashCode += getConcept().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSGetBusinessConceptKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetBusinessConceptKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsDataModelPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsDataModelPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModelPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concept");
        elemField.setXmlName(new javax.xml.namespace.QName("", "concept"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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