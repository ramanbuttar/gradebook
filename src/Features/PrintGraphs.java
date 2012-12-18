/**
 * Trevor Choo - #200130530
 * CMPT 275 D100 - Team Blank
 * SFU Surrey Campus
 * April 2, 2006
 * ======================================================
 * NOTE: This class is responsible for printing out the 
 * two graphs when requested by the user
 */

package Features;

import School.Student;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.print.*;

public class PrintGraphs 
{
    public PrintGraphs(Student currentStudent) 
    {
        //generate grades graph
        BufferedImage grph_grades = currentStudent.drawGradesGraph();
        
        //generate cgpa graph
        BufferedImage gpa_chart = currentStudent.drawGPAChart();
        
        //Create a new PrinterJob object
        PrinterJob printJob = PrinterJob.getPrinterJob();
        
        //Create new book so that the document can span multiple pages
        Book book = new Book();
        
        //Add the document page
        PageFormat documentPageFormat = new PageFormat();
        documentPageFormat.setOrientation(PageFormat.PORTRAIT);
        
        //set ready to print
        printJob.setPageable(book);
        
        //Show print dialog, if ok then print.
        if (printJob.printDialog())
        {
            try 
            {
                
                //add pages to the book
                book.append(new Document(grph_grades), documentPageFormat);
                book.append(new Document(gpa_chart), documentPageFormat);

                //send the print job to the printer
                printJob.print();
                
                //successful print
            }
            catch (Exception PrintException) 
            {
                PrintException.printStackTrace();
            }
        }
    }  
    
    private class Document implements Printable 
    {
        
        private BufferedImage imgtoPrint;
        public Document(BufferedImage graph) {
            imgtoPrint = graph;
        }
        
        public int print(Graphics g, PageFormat pageFormat, int page) 
        {
            
            Graphics2D workspace = (Graphics2D) g;
            Font monofont = new Font("Monospaced", 0, 10);
            workspace.setFont(monofont);
            workspace.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            
            //Set font color to black
            workspace.setPaint(Color.black);
            
            //mark the top left corner of the printable area with a point
            Point2D.Double cursor = new Point2D.Double(0,0);
            
            //scale the image down
            workspace.drawImage(imgtoPrint, 0, 0, 400, 400, null);
            
            //signal the printer that the page is complete.
            return (PAGE_EXISTS);
        }
    }
}
