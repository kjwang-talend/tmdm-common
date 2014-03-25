/*
 * Copyright (C) 2006-2014 Talend Inc. - www.talend.com
 *
 * This source code is available under agreement available at
 * %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
 *
 * You should have received a copy of the agreement
 * along with this program; if not, write to Talend SA
 * 9 rue Pages 92150 Suresnes, France
 */

package org.talend.mdm.commmon.metadata;

import org.talend.mdm.commmon.metadata.validation.ValidationFactory;
import org.talend.mdm.commmon.metadata.validation.ValidationRule;

import java.util.List;

/**
 *
 */
public class SimpleTypeFieldMetadata extends MetadataExtensions implements FieldMetadata {

    private final boolean isMany;

    private final String name;

    private final List<String> allowWriteUsers;

    private final List<String> hideUsers;
    
    private final List<String> workflowAccessRights;

    private final boolean isMandatory;

    private TypeMetadata fieldType;

    private boolean isKey;

    private TypeMetadata declaringType;

    private ComplexTypeMetadata containingType;

    private boolean isFrozen;

    private int cachedHashCode;

    public SimpleTypeFieldMetadata(ComplexTypeMetadata containingType,
                                   boolean isKey,
                                   boolean isMany,
                                   boolean isMandatory,
                                   String name,
                                   TypeMetadata fieldType,
                                   List<String> allowWriteUsers,
                                   List<String> hideUsers,
                                   List<String> workflowAccessRights) {
        if (fieldType == null) {
            throw new IllegalArgumentException("Field type cannot be null.");
        }
        this.isMandatory = isMandatory;
        this.containingType = containingType;
        this.declaringType = containingType;
        this.isKey = isKey;
        this.isMany = isMany;
        this.name = name;
        this.fieldType = fieldType;
        this.allowWriteUsers = allowWriteUsers;
        this.hideUsers = hideUsers;
        this.workflowAccessRights = workflowAccessRights;
    }

    public String getName() {
        return name;
    }

    public boolean isKey() {
        return isKey;
    }

    public TypeMetadata getType() {
        return fieldType;
    }

    public ComplexTypeMetadata getContainingType() {
        return containingType;
    }

    public void setContainingType(ComplexTypeMetadata typeMetadata) {
        assertFrozen();
        this.containingType = typeMetadata;
    }

    public void setDeclaringType(TypeMetadata declaringType) {
        assertFrozen();
        this.declaringType = declaringType;
    }

    public FieldMetadata freeze() {
        if (isFrozen) {
            return this;
        }
        isFrozen = true;
        fieldType = fieldType.freeze();
        return this;
    }

    public void promoteToKey() {
        isKey = true;
    }

    @Override
    public void validate(ValidationHandler handler) {
        ValidationFactory.getRule(this).perform(handler);
    }

    @Override
    public ValidationRule createValidationRule() {
        return ValidationFactory.getRule(this);
    }

    @Override
    public String getPath() {
        FieldMetadata container = containingType.getContainer();
        if (container != null) {
            return container.getPath() + '/' + name;
        } else {
            return name;
        }
    }

    @Override
    public String getEntityTypeName() {
        return containingType.getEntity().getName();
    }

    public TypeMetadata getDeclaringType() {
        return declaringType;
    }

    public void adopt(ComplexTypeMetadata metadata) {
        FieldMetadata copy = copy();
        copy.setContainingType(metadata);
        metadata.addField(copy);
    }

    public FieldMetadata copy() {
        SimpleTypeFieldMetadata copy = new SimpleTypeFieldMetadata(containingType,
                isKey,
                isMany,
                isMandatory,
                name,
                fieldType,
                allowWriteUsers,
                hideUsers,
                workflowAccessRights);
        copy.setDeclaringType(declaringType);
        return copy;
    }

    public List<String> getHideUsers() {
        return hideUsers;
    }

    public List<String> getWriteUsers() {
        return allowWriteUsers;
    }
    
    public List<String> getWorkflowAccessRights() {
        return this.workflowAccessRights;
    }

    public boolean isMany() {
        return isMany;
    }

    public boolean isMandatory() {
        return isMandatory;
    }

    public <T> T accept(MetadataVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Simple {" + //$NON-NLS-1$
                "declaringType=" + declaringType + //$NON-NLS-1$
                ", containingType=" + containingType + //$NON-NLS-1$
                ", name='" + name + '\'' + //$NON-NLS-1$
                ", isKey=" + isKey + //$NON-NLS-1$
                ", isMany=" + isMany + //$NON-NLS-1$
                ", fieldTypeName='" + fieldType.getName() + '\'' + //$NON-NLS-1$
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SimpleTypeFieldMetadata)) {
            return false;
        }

        SimpleTypeFieldMetadata that = (SimpleTypeFieldMetadata) o;

        if (isFrozen) {
            if (declaringType != null ? !declaringType.equals(that.declaringType) : that.declaringType != null)
                return false;
        }
        if (isKey != that.isKey) return false;
        if (isMandatory != that.isMandatory) return false;
        if (isMany != that.isMany) return false;
        if (allowWriteUsers != null ? !allowWriteUsers.equals(that.allowWriteUsers) : that.allowWriteUsers != null)
            return false;
        if (fieldType != null ? !fieldType.equals(that.fieldType) : that.fieldType != null) return false;
        if (hideUsers != null ? !hideUsers.equals(that.hideUsers) : that.hideUsers != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (workflowAccessRights != null ? !workflowAccessRights.equals(that.workflowAccessRights) : that.workflowAccessRights != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        if (isFrozen && cachedHashCode != 0) {
            return cachedHashCode;
        }
        int result = (isMany ? 1 : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (declaringType != null ? declaringType.getName().hashCode() : 0);
        result = 31 * result + (fieldType != null ? fieldType.getName().hashCode() : 0);
        result = 31 * result + (allowWriteUsers != null ? allowWriteUsers.hashCode() : 0);
        result = 31 * result + (hideUsers != null ? hideUsers.hashCode() : 0);
        result = 31 * result + (isKey ? 1 : 0);
        result = 31 * result + (isMandatory ? 1 : 0);
        result = 31 * result + (workflowAccessRights != null ? workflowAccessRights.hashCode() : 0);
        cachedHashCode = result;
        return result;
    }

    private void assertFrozen() {
        if (isFrozen) {
            throw new IllegalStateException("Field definition is frozen");
        }
    }
}
