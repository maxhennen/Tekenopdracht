package DomainClasses;

import java.io.File;

/**
 * Created by maxhe on 4-9-2017.
 */
public class Image extends DrawingItem {
    private File file;
    public File getFile(){return file;}
    public void setFile(File value){file = value;}

    private Point anchor;
    public Point getAnchor(){return anchor;}
    public void setAnchor(Point value){anchor = value;}

    private double width;
    public double getWidth(){return width;}
    public void setWidth(double value){width = value;}

    private double height;
    public double getHeight(){return height;}
    public void setHeight(double value){height = value;}
}
