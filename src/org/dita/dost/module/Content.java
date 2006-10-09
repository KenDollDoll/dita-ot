/*
 * This file is part of the DITA Open Toolkit project hosted on
 * Sourceforge.net. See the accompanying license.txt file for 
 * applicable licenses.
 */

/*
 * (c) Copyright IBM Corp. 2004, 2005 All Rights Reserved.
 */
package org.dita.dost.module;

import java.util.Collection;

/**
 * Content is an interface which defines the method a content container should implement.
 * Content container is used to exchange result data between module, reader and writer
 * instance.
 * 
 * @author Zhang, Yuan Peng
 */
public interface Content {
    /**
     * Get the collection contained in the content container.
     * 
     * @return
     * 
     */
    Collection getCollection();

    /**
     * Get the object contained in the content container.
     * 
     * @return
     * 
     */
    Object getValue();

    /**
     * Set the collection to the content container.
     * 
     * @param collection
     * 
     */
    void setCollection(Collection collection);

    /**
     * Set the object to the content container.
     * 
     * @param object
     * 
     */
    void setValue(Object object);
}
