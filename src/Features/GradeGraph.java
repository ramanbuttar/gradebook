/**
 * @author Balroop Singh Johal
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * March 13, 2006
 * ===============================
 * NOTE: This class defines the Grade Chart module
 * which generates the Grade Graph.
 *
 */
package Features;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class GradeGraph {
    private int width;
    private int height;
    private int margin;
    private int ratio;
    private BufferedImage image;
    private Graphics2D canvas;
    private int[] grades = new int[11];
    
    public GradeGraph(int arr[]){
        //initialize values
        this.width = 800;
        this.height = 600;
        this.margin = 50;
        this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        this.canvas = image.createGraphics();
        this.grades = arr;
    }
    
    public void plotData(){
        this.setBackground(Color.WHITE);
        this.drawAxis(5);
        //drawTitle("Marks Layout");
        drawRects(grades);
    }
    
    private void drawAxis(int thickness){
        int temp = thickness;
        this.canvas.setColor(Color.BLACK);
        while (temp != 0){
            //x-axis
            canvas.drawLine(margin, image.getHeight() - margin + temp, image.getWidth() - margin, image.getHeight() - margin + temp);
            //y-axis
            canvas.drawLine(margin - temp, margin, margin - temp, image.getHeight() - margin + thickness);
            temp--;
        }
        
        drawXAxisLabels();
    }
    
    private void drawXAxisLabels(){
        for(int i = margin+50; i < 750; i+=60){
            this.canvas.drawString("|", i, this.height - margin + 15);
        }
        this.canvas.drawString("F", 98, this.height - margin + 30);
        this.canvas.drawString("D", 158, this.height - margin + 30);
        this.canvas.drawString("C-", 215, this.height - margin + 30);
        this.canvas.drawString("C", 278, this.height - margin + 30);
        this.canvas.drawString("C+", 335, this.height - margin + 30);
        this.canvas.drawString("B-", 395, this.height - margin + 30);
        this.canvas.drawString("B", 458, this.height - margin + 30);
        this.canvas.drawString("B+", 515, this.height - margin + 30);
        this.canvas.drawString("A-", 575, this.height - margin + 30);
        this.canvas.drawString("A", 638, this.height - margin + 30);
        this.canvas.drawString("A+", 695, this.height - margin + 30);
    }
    
    private void setBackground(Color color){
        for (int i = 0; i < this.image.getWidth(); ++i) {
            for (int j = 0; j < this.image.getHeight(); j++) {
                this.image.setRGB(i, j, color.getRGB());
            }
        }
    }
    
    public BufferedImage getImage(){
        return this.image;
    }
    
    private void drawRects(int[] gArr){
        getRatios(gArr);
        this.canvas.fillRect(margin+30, 550-(grades[0]*ratio), 40, (grades[0]*ratio)+5);
        this.canvas.drawString(""+gArr[0], 98, 548-(grades[0]*ratio));
        this.canvas.fillRect(margin+90, 550-(grades[1]*ratio), 40, (grades[1]*ratio)+5);
        this.canvas.drawString(""+gArr[1], 158, 548-(grades[1]*ratio));
        this.canvas.fillRect(margin+150, 550-(grades[2]*ratio), 40, (grades[2]*ratio)+5);
        this.canvas.drawString(""+gArr[2], 215, 548-(grades[2]*ratio));
        this.canvas.fillRect(margin+210, 550-(grades[3]*ratio), 40, (grades[3]*ratio)+5);
        this.canvas.drawString(""+gArr[3], 278, 548-(grades[3]*ratio));
        this.canvas.fillRect(margin+270, 550-(grades[4]*ratio), 40, (grades[4]*ratio)+5);
        this.canvas.drawString(""+gArr[4], 335, 548-(grades[4]*ratio));
        this.canvas.fillRect(margin+330, 550-(grades[5]*ratio), 40, (grades[5]*ratio)+5);
        this.canvas.drawString(""+gArr[5], 397, 548-(grades[5]*ratio));
        this.canvas.fillRect(margin+390, 550-(grades[6]*ratio), 40, (grades[6]*ratio)+5);
        this.canvas.drawString(""+gArr[6], 458, 548-(grades[6]*ratio));
        this.canvas.fillRect(margin+450, 550-(grades[7]*ratio), 40, (grades[7]*ratio)+5);
        this.canvas.drawString(""+gArr[7], 515, 548-(grades[7]*ratio));
        this.canvas.fillRect(margin+510, 550-(grades[8]*ratio), 40, (grades[8]*ratio)+5);
        this.canvas.drawString(""+gArr[8], 575, 548-(grades[8]*ratio));
        this.canvas.fillRect(margin+570, 550-(grades[9]*ratio), 40, (grades[9]*ratio)+5);
        this.canvas.drawString(""+gArr[9], 638, 548-(grades[9]*ratio));
        this.canvas.fillRect(margin+630, 550-(grades[10]*ratio), 40, (grades[10]*ratio)+5);
        this.canvas.drawString(""+gArr[10], 695, 548-(grades[10]*ratio));
    }
    
    private int getRatios(int[] gArr){
        int total=0;
        for(int i=0; i<gArr.length; i++){
            total+=gArr[i];
        }
        if (total > 0){
            this.ratio=450/total;
        }
        return total;
    }
}