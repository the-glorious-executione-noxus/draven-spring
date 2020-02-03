package com.noxus.draven.pdf.interactive;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.*;

import java.io.File;
import java.io.IOException;

/**
 * This example will take a PDF document and set a form field in it.
 *
 * @author Ben Litchfield
 *
 */
public class SetField
{
    /**
     * This will set a single field in the document.
     *
     * @param pdfDocument The PDF to set the field in.
     * @param name The name of the field to set.
     * @param value The new value of the field.
     *
     * @throws IOException If there is an error setting the field.
     */
    public void setField(PDDocument pdfDocument, String name, String value) throws IOException
    {
        PDDocumentCatalog docCatalog = pdfDocument.getDocumentCatalog();
        PDAcroForm acroForm = docCatalog.getAcroForm();
        PDField field = acroForm.getField(name);
        if (field != null)
        {
            if (field instanceof PDCheckBox)
            {
                field.setValue("Yes");
            }
            else if (field instanceof PDComboBox)
            {
                field.setValue(value);
            }
            else if (field instanceof PDListBox)
            {
                field.setValue(value);
            }
            else if (field instanceof PDRadioButton)
            {
                field.setValue(value);
            }
            else if (field instanceof PDTextField)
            {
                field.setValue(value);
            } 
        }
        else
        {
            System.err.println("No field found with name:" + name);
        }
    }

    /**
     * This will read a PDF file and set a field and then write it the pdf out
     * again. <br>
     * see usage() for commandline
     *
     * @param args command line arguments
     *
     * @throws IOException If there is an error importing the FDF document.
     */
    public static void main(String[] args) throws IOException
    {
        SetField setter = new SetField();
        setter.setField(args);
    }

    private void setField(String[] args) throws IOException
    {
        PDDocument pdf = null;
        try
        {
            if (args.length != 3)
            {
                usage();
            }
            else
            {
                SetField example = new SetField();
                pdf = PDDocument.load(new File(args[0]));
                example.setField(pdf, args[1], args[2]);
                pdf.save(args[0]);
            }
        }
        finally
        {
            if (pdf != null)
            {
                pdf.close();
            }
        }
    }

    /**
     * This will print out a message telling how to use this example.
     */
    private static void usage()
    {
        System.err.println("usage: org.apache.pdfbox.examples.interactive.form.SetField <pdf-file> <field-name> <field-value>");
    }
}
