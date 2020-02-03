package com.noxus.draven.pdf.zmtest.fillforms;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDTextField;

import java.io.File;
import java.io.IOException;

/**
 * Example to show filling form fields.
 * 
 */
public final class FillFormField
{
    private FillFormField()
    {
    }

    public static void main(String[] args) throws IOException
    {
        String formTemplate = "src/main/resources/org/apache/pdfbox/examples/interactive/form/FillFormField.pdf";
        
        // load the document
        PDDocument pdfDocument = PDDocument.load(new File(formTemplate));

        // get the document catalog
        PDAcroForm acroForm = pdfDocument.getDocumentCatalog().getAcroForm();
        
        // as there might not be an AcroForm entry a null check is necessary
        if (acroForm != null)
        {
            // Retrieve an individual field and set its value.
            PDTextField field = (PDTextField) acroForm.getField( "sampleField" );
            field.setValue("Text Entry");
            
            // If a field is nested within the form tree a fully qualified name 
            // might be provided to access the field.
            field = (PDTextField) acroForm.getField( "fieldsContainer.nestedSampleField" );
            field.setValue("Text Entry");
        }

        // Save and close the filled out form.
        pdfDocument.save("target/FillFormField.pdf");
        pdfDocument.close();
    }

}
