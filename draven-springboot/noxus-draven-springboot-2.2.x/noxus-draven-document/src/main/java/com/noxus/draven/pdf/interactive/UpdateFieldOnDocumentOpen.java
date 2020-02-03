package com.noxus.draven.pdf.interactive;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript;

import java.io.File;
import java.io.IOException;

/**
 * Update field automatically when the document is opened.
 * 
 * This sample adds document action to automatically update a 
 * field value with the current date when the document is opened.
 * 
 * This sample builds on the form generated by @link CreateSimpleForm so you need to run that first.
 * 
 */
public final class UpdateFieldOnDocumentOpen
{
    private UpdateFieldOnDocumentOpen()
    {
    }
    
    public static void main(String[] args) throws IOException
    {
        // Load the PDF document created by SimpleForm.java
        PDDocument document = PDDocument.load(new File("target/SimpleForm.pdf"));
        
        // Note that the JavaScript will depend on the reader application.
        // The classes and methods available to Adobe Reader and Adobe Acrobat
        // are documented in the Acrobat SDK.
        String javaScript = "var now = util.printd('yyyy-mm-dd', new Date());"
                + "var oField = this.getField('SampleField');"
                + "oField.value = now;";
        
        // Create an action as JavaScript action
        PDActionJavaScript jsAction = new PDActionJavaScript();
        jsAction.setAction(javaScript);
        
        // Set the action to be executed when the document is opened
        document.getDocumentCatalog().setOpenAction(jsAction);
        
        document.save("target/UpdateFieldOnDocumentOpen.pdf");
        document.close();
    }
}
