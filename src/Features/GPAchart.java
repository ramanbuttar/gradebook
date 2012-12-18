/**
 * @author Raman Buttar
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * March 13, 2006
 * ===============================
 * NOTE: This class defines the GPA Chart module
 * which generates the GPA Graph.
 *
 */
package Features;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;

public class GPAchart {
    
    private int width;
    private int height;
    private int margin;
    private String[] semesterNames;
    private Double[] gpa;
    private Point[] points;
    private double cgpa;
    private BufferedImage image;
    private Graphics2D canvas;
    
    public GPAchart(String[] semesterNames, Double[] gpa, double cgpa){
        //Constructor that initializes class variables and accepts a String array of Semester Names,
            //double array of Semester GPAs, and a double number for CGPA
        this.width = 600;
        this.height = 500;
        this.margin = 50;
        this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        this.canvas = image.createGraphics();
        this.semesterNames = semesterNames;
        this.gpa = gpa;
        this.points = new Point[this.gpa.length];
        this.cgpa = cgpa;
    }
    
    public void plotData(){
        //Calls other functions to plot all the data
        this.setBackground(Color.WHITE);
        //draw X and Y Axis with specified thickness
        this.drawAxis(5);
        //drawTitle("GPA Chart");
        
        if (this.semesterNames.length > 0){
            //set co-ordinates
            setYPoints();
            setXPoints();
            
            //label each axis
            drawXAxisLabels();
            drawYAxisLabels();
            
            //plot data
            drawDots();
            drawLines();
        } else {
            drawYAxisLabels();
        }
        //plot cgpa
        this.drawCGPA();  
        this.drawLegend();
        
    }
    
    private void setYPoints(){
        //Maps GPAs to Y-Coordinates of points to be plotted on chart
        for (int i = 0; i < this.gpa.length; i++){
            double num = gpa[i];
            double result = num * ((this.height - (margin * 2)) / 4.33);
            String temp = Double.toString(result);
            String str = temp.substring(0, temp.indexOf("."));
            int y = (height - margin) - Integer.parseInt(str);
            this.points[i] = (new Point(0, y));
        }
    }
    
    private void setXPoints(){
        //Maps GPAs to X-Coordinates of points to be plotted on canvas
        int offset = (this.width - this.margin) / this.points.length;
        int x = margin;
        for (int i = 0; i < this.points.length; i++){
            Point pnt = this.points[i];
            if (i == 0){
                if (points.length == 1){
                    pnt.x = this.width / 2;
                } else {
                    pnt.x = this.margin;
                }
            } else {
                pnt.x = x;
            }
            x += offset;
        }
    }
    
    private void setBackground(Color color){
        //Changes background to given colour
        for (int i = 0; i < this.image.getWidth(); ++i) {
            for (int j = 0; j < this.image.getHeight(); j++) {
                this.image.setRGB(i, j, color.getRGB());
            }
        }
    }
    
    private void drawTitle(String title){
        //Centers and draws given title at the top of the canvas
        int x = 0, y = 0;
        this.canvas.setColor(Color.BLACK);
        x = (image.getWidth() / 2) - (title.length() * 7);
        y = 25;
        this.canvas.drawString(title, x, y);
    }
    
    private void drawAxis(int thickness){
        //Draws X and Y axis repeatedly to match desired thickness
        this.canvas.setColor(Color.BLACK);
        int temp = thickness;
        while (temp != 0){
            //x-axis
            canvas.drawLine(margin, image.getHeight() - margin + temp, image.getWidth() - margin, image.getHeight() - margin + temp);
            //y-axis
            canvas.drawLine(margin - temp, margin, margin - temp, image.getHeight() - margin + thickness);
            temp--;
        }
    }
    
    private void drawXAxisLabels(){
        //Draws labels for X-Axis on the canvas
        this.canvas.setColor(Color.BLACK);
        String[] arr = new String[2];
        int center = 0;
        for (int i = 0; i < this.points.length; i++){
            int x = points[i].x;
            arr = this.semesterNames[i].split(" ");
            this.canvas.drawString("|", x, this.height - margin + 15);
            center = (arr[0].length() * 2);
            this.canvas.drawString(arr[0], x - center, this.height - margin + 30);
            this.canvas.drawString(arr[1], x - center, this.height - margin + 45);
        }
    }
    
    private void drawYAxisLabels(){
        //Draws labels for Y-Axis on the canvas
        this.canvas.setColor(Color.BLACK);
        int size = 10;
        int offset = (this.height - margin) / size;
        int temp = margin;
        double value = 4.5;
        for (int i = 0; i < size; i++){
            this.canvas.drawString(value + " -", 17, temp);
            value -= 0.5;
            temp += offset;
        }
    }
    
    private void drawDots(){
        //Draws mapped GPAs as points on the canvas
        this.canvas.setColor(Color.RED);
        int  x = 0, y = 0;
        for (int i = 0; i < this.points.length; i++){
            x = this.points[i].x;
            y = this.points[i].y;
            canvas.fillOval(x-2, y-2, 5, 5);
            //canvas.drawString(gpa[i].toString(), x, y);
        }
    }
    
    private void drawLines(){
        //Draws lines between mapped points on the canvas
        this.canvas.setColor(Color.RED);
        int  currentX = 0, currentY = 0;
        int  nextX = 0, nextY = 0;
        for (int i = 0; i < this.points.length - 1; i++){
            currentX = this.points[i].x;
            currentY = this.points[i].y;
            nextX = this.points[i+1].x;
            nextY = this.points[i+1].y;
            this.canvas.drawLine(currentX, currentY, nextX, nextY);
        }
    }
    
    private void drawCGPA(){
        //Plots CGPA as a horizontal line on the canvas
        this.canvas.setColor(Color.GREEN);
        double result = this.cgpa * ((this.height - (margin * 2)) / 4.33);
        String temp = Double.toString(result);
        String str = temp.substring(0, temp.indexOf("."));
        int y = (height - margin) - Integer.parseInt(str);
        this.canvas.drawLine(margin, y, this.width - margin, y);
    }
      
    public BufferedImage getImage(){
        //Returns BufferedImage
        return this.image;
    }
    
    public void drawLegend(){
        //Draws a legend in top-right corner of the canvas
        this.canvas.setColor(Color.BLACK);
        int x = this.width - (margin * 2) - 5;
        int y = 5;
        this.canvas.drawRect(x, y, margin * 2, margin - 10);
        
        this.canvas.setColor(Color.GREEN);
        this.canvas.drawLine(x + 5, y + 10, x + 20, y + 10);
        this.canvas.setColor(Color.BLACK);
        this.canvas.drawString("CGPA", x + 30, y + 15);
        
        this.canvas.setColor(Color.RED);
        this.canvas.fillOval(x + 5, y + 25, 5, 5);
        this.canvas.setColor(Color.BLACK);
        this.canvas.drawString("SGPA", x + 30, y + 30);
    }
    
}
