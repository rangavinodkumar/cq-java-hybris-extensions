/*************************************************************************
 *
 * ADOBE CONFIDENTIAL
 * __________________
 *
 *  Copyright 2013 Adobe Systems Incorporated
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Adobe Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated and its
 * suppliers and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe Systems Incorporated.
 **************************************************************************/
package com.mycompany.myproject;

import javax.jcr.Node;

import com.adobe.cq.commerce.hybris.importer.DefaultImportHandler;
import com.adobe.cq.commerce.hybris.importer.ImportHandler;
import com.adobe.cq.commerce.hybris.importer.ImporterContext;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.ValueMap;

/**
 * Customized import handler for Hybris product catalogs.
 */
@Component(metatype = true, label = "Customized Commerce Hybris Import Handler")
@Service
public class MyImportHandler extends DefaultImportHandler implements ImportHandler {

    public void updateAsset(Node imageNode, ImporterContext ctx, ValueMap values) throws Exception {
        // put your code here
    }

}