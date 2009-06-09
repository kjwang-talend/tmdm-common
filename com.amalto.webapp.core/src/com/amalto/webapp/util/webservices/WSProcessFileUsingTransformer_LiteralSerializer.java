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

public class WSProcessFileUsingTransformer_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_fileName_QNAME = new QName("", "fileName");
    private static final QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final QName ns1_contentType_QNAME = new QName("", "contentType");
    private static final QName ns1_wsTransformerPK_QNAME = new QName("", "wsTransformerPK");
    private static final QName ns2_WSTransformerPK_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSTransformerPK");
    private CombinedSerializer ns2_myWSTransformerPK_LiteralSerializer;
    private static final QName ns1_wsOutputDecisionTable_QNAME = new QName("", "wsOutputDecisionTable");
    private static final QName ns2_WSOutputDecisionTable_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSOutputDecisionTable");
    private CombinedSerializer ns2_myWSOutputDecisionTable_LiteralSerializer;
    
    public WSProcessFileUsingTransformer_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSProcessFileUsingTransformer_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns3_string_TYPE_QNAME);
        ns2_myWSTransformerPK_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.webapp.util.webservices.WSTransformerPK.class, ns2_WSTransformerPK_TYPE_QNAME);
        ns2_myWSOutputDecisionTable_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.webapp.util.webservices.WSOutputDecisionTable.class, ns2_WSOutputDecisionTable_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.webapp.util.webservices.WSProcessFileUsingTransformer instance = new com.amalto.webapp.util.webservices.WSProcessFileUsingTransformer();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_fileName_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_fileName_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setFileName((java.lang.String)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_fileName_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_contentType_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_contentType_QNAME, reader, context);
                instance.setContentType((java.lang.String)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_contentType_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_wsTransformerPK_QNAME)) {
                member = ns2_myWSTransformerPK_LiteralSerializer.deserialize(ns1_wsTransformerPK_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setWsTransformerPK((com.amalto.webapp.util.webservices.WSTransformerPK)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_wsTransformerPK_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_wsOutputDecisionTable_QNAME)) {
                member = ns2_myWSOutputDecisionTable_LiteralSerializer.deserialize(ns1_wsOutputDecisionTable_QNAME, reader, context);
                instance.setWsOutputDecisionTable((com.amalto.webapp.util.webservices.WSOutputDecisionTable)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_wsOutputDecisionTable_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.webapp.util.webservices.WSProcessFileUsingTransformer instance = (com.amalto.webapp.util.webservices.WSProcessFileUsingTransformer)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.webapp.util.webservices.WSProcessFileUsingTransformer instance = (com.amalto.webapp.util.webservices.WSProcessFileUsingTransformer)obj;
        
        if (instance.getFileName() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getFileName(), ns1_fileName_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getContentType(), ns1_contentType_QNAME, null, writer, context);
        if (instance.getWsTransformerPK() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myWSTransformerPK_LiteralSerializer.serialize(instance.getWsTransformerPK(), ns1_wsTransformerPK_QNAME, null, writer, context);
        ns2_myWSOutputDecisionTable_LiteralSerializer.serialize(instance.getWsOutputDecisionTable(), ns1_wsOutputDecisionTable_QNAME, null, writer, context);
    }
}
