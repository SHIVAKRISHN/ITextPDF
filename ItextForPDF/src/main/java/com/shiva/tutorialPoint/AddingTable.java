/**
 * 
 */
package com.shiva.tutorialPoint;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;

/**
 * @author shiva
 *
 */
public class AddingTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {           
	      // Creating a PdfDocument object   
	      String dest = "/home/shiva/SHIVA/dynamicReports/addingTable.pdf";   
	      PdfWriter writer = new PdfWriter(dest);       
	         
	      // Creating a PdfDocument object      
	      PdfDocument pdf = new PdfDocument(writer);                  
	      
	      // Creating a Document object       
	      Document doc = new Document(pdf);                       
	         
	      // Creating a table       
	      float [] pointColumnWidths = {150F, 150F};   
	      Table table = new Table(pointColumnWidths);    
	      
	      // Adding cells to the table       
	      table.addCell(new Cell().add("Name"));       
	      table.addCell(new Cell().add("Shiva"));       
	      table.addCell(new Cell().add("Id"));       
	      table.addCell(new Cell().add("2"));       
	      table.addCell(new Cell().add("Designation"));       
	      table.addCell(new Cell().add("Developer"));                 
	         
	      // Adding Table to document        
	      doc.add(table);                  
	         
	      // Closing the document       
	      doc.close();
	      System.out.println("Table created successfully.."); 
	}

}
