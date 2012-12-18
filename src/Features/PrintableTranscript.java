/**
 * Trevor Choo - #200130530
 * CMPT 275 D100 - Team Blank
 * SFU Surrey Campus
 * March 14, 2006
 * ======================================================
 * This class allows a student object to be printed to a
 * printer.
 */

package Features;

import School.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.print.*;
import java.io.*;

public class PrintableTranscript {
    private final String TEMP_PATH = "Storage\\Transcripts\\temp.txt";
    public PrintableTranscript(Student currentStudent) {
        
        //Create a new PrinterJob object
        PrinterJob printJob = PrinterJob.getPrinterJob();
        
        //Create new book so that the document can span multiple pages
        Book book = new Book();
        
        //Add the document page
        PageFormat documentPageFormat = new PageFormat();
        documentPageFormat.setOrientation(PageFormat.PORTRAIT);
        
        //add pages to the book
        
        printJob.setPageable(book);
        
        //Show print dialog, if ok then print.
        if (printJob.printDialog()) {
            try {
                //generate the transcript file to read from
                TranscriptGenerator.saveTranscript(currentStudent, null);
                
                //count number of lines in the transcript
                int numLines = countLines();
                
                //determine how many pages are needed for this document
                int numPages = (int) Math.ceil(((float)numLines / 53.0));
                
                
                String lines[] = storeLines(numLines);
                String subLine[];
                for(int i=0; i<numPages; i++) {//split output into multiple pages
                    subLine = generateSusbstring(lines, i);
                    book.append(new Document(subLine), documentPageFormat);
                }
                //send the print job to the printer
                printJob.print();
                
                //delete the temporary file
                deleteTempFile();
                
                //successful print
            } catch (Exception PrintException) {
                PrintException.printStackTrace();
            }
        }
    }
    
    
    private String[] generateSusbstring(String[] lines, int pagenum) {//generates an array of strings to fill one page
        
        String subArray[] = new String[52];
        int subArrayTrack = 0;
        for(int i=(pagenum * 52); i<52*(pagenum +1); i++) {
            if(i < lines.length) {
                subArray[subArrayTrack] = lines[i];
                subArrayTrack++;
            }
        }
        
        return subArray;
    }
    
    
    private int countLines() throws IOException {
        FileInputStream fin = new FileInputStream(TEMP_PATH);
        InputStreamReader cin = new InputStreamReader(fin);
        BufferedReader in = new BufferedReader(cin);
        
        String input = "";
        int numLines = 0;
        
        //count the num of lines in the file
        while(input != null) {
            numLines++;
            input = in.readLine();
        }
        
        numLines-=1;
        in.close();
        cin.close();
        fin.close();
        
        return numLines;
    }
    
    private String[] storeLines(int numLines) throws IOException {
        FileInputStream fin = new FileInputStream(TEMP_PATH);
        InputStreamReader cin = new InputStreamReader(fin);
        BufferedReader in = new BufferedReader(cin);
        
        String lines[] = new String[numLines];
        
        //create an array of all lines in the file
        for(int i=0; i<numLines; i++) {
            lines[i] = in.readLine();
        }
        
        return lines;
    }
    
    private class Document implements Printable {
        
        private String lines[];
        public Document(String[] subLine) {
            lines = subLine;
        }
        
        public int print(Graphics g, PageFormat pageFormat, int page) {
            
            Graphics2D workspace = (Graphics2D) g;
            Font monofont = new Font("Monospaced", 0, 10);
            workspace.setFont(monofont);
            workspace.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            
            //Set font color to black
            workspace.setPaint(Color.black);
            
            //mark the top left corner of the printable area with a point
            Point2D.Double cursor = new Point2D.Double(0.15 * 72,0.15 * 72);
            
            //add each line onto the graphics object
            for(int j=0; j<lines.length; j++) {
                String line = lines[j];
                if(line != null)
                    workspace.drawString(line, (float)cursor.x, (float)cursor.y);
                
                //next line...
                cursor.y+=12.0;
            }
            
            //Graphics pg = workspace.create();
            
            //signal the printer that the page is complete.
            return (PAGE_EXISTS);
        }
    }
    
    private void deleteTempFile() {
        File file = new File(TEMP_PATH);
        
        try {
            file.delete();
            System.out.println("Deleted.");
        } catch (Exception e) {
            System.out.println("\n-> ERROR: File could not be deleted properly.");
            System.out.println("Not Deleted.");
        }
    }
    
}