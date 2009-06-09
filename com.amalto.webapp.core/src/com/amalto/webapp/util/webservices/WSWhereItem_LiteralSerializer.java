// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.webapp.util.webservices;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.xsd.XSDConstants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;

public class WSWhereItem_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_whereCondition_QNAME = new QName("", "whereCondition");
    private static final QName ns2_WSWhereCondition_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSWhereCondition");
    private CombinedSerializer ns2_myWSWhereCondition_LiteralSerializer;
    private static final QName ns1_whereAnd_QNAME = new QName("", "whereAnd");
    private static final QName ns2_WSWhereAnd_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSWhereAnd");
    private CombinedSerializer ns2_myWSWhereAnd_LiteralSerializer;
    private static final QName ns1_whereOr_QNAME = new QName("", "whereOr");
    private static final QName ns2_WSWhereOr_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSWhereOr");
    private CombinedSerializer ns2_myWSWhereOr_LiteralSerializer;
    
    public WSWhereItem_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSWhereItem_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myWSWhereCondition_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.webapp.util.webservices.WSWhereCondition.class, ns2_WSWhereCondition_TYPE_QNAME);
        ns2_myWSWhereAnd_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.webapp.util.webservices.WSWhereAnd.class, ns2_WSWhereAnd_TYPE_QNAME);
        ns2_myWSWhereOr_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.webapp.util.webservices.WSWhereOr.class, ns2_WSWhereOr_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.webapp.util.webservices.WSWhereItem instance = new com.amalto.webapp.util.webservices.WSWhereItem();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_whereCondition_QNAME)) {
                member = ns2_myWSWhereCondition_LiteralSerializer.deserialize(ns1_whereCondition_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setWhereCondition((com.amalto.webapp.util.webservices.WSWhereCondition)member);
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_whereAnd_QNAME)) {
                member = ns2_myWSWhereAnd_LiteralSerializer.deserialize(ns1_whereAnd_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setWhereAnd((com.amalto.webapp.util.webservices.WSWhereAnd)member);
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_whereOr_QNAME)) {
                member = ns2_myWSWhereOr_LiteralSerializer.deserialize(ns1_whereOr_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setWhereOr((com.amalto.webapp.util.webservices.WSWhereOr)member);
                reader.nextElementContent();
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.webapp.util.webservices.WSWhereItem instance = (com.amalto.webapp.util.webservices.WSWhereItem)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.webapp.util.webservices.WSWhereItem instance = (com.amalto.webapp.util.webservices.WSWhereItem)obj;
        
        if (instance.getWhereCondition() != null) {
            ns2_myWSWhereCondition_LiteralSerializer.serialize(instance.getWhereCondition(), ns1_whereCondition_QNAME, null, writer, context);
        }
        if (instance.getWhereAnd() != null) {
            ns2_myWSWhereAnd_LiteralSerializer.serialize(instance.getWhereAnd(), ns1_whereAnd_QNAME, null, writer, context);
        }
        if (instance.getWhereOr() != null) {
            ns2_myWSWhereOr_LiteralSerializer.serialize(instance.getWhereOr(), ns1_whereOr_QNAME, null, writer, context);
        }
    }
}
