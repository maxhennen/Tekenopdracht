package DomainClasses;

import Enums.Color;

import java.util.ArrayList;

/**
 * Created by maxhe on 4-9-2017.
 */
public class Polygon extends DrawingItem {
    private ArrayList<Point> vertices;
    public ArrayList<Point> getVertices(){return vertices;}
    public void setVertices(ArrayList<Point> value){vertices = value;}

    private double weight;
    public double getWeight(){return weight;}
    public void setWeight(double value){weight = value;}

    public Polygon(Color color, ArrayList<Point> vertices, double weight){
        super(color);
        setVertices(vertices);
        setWeight(weight);
    }

    @Override
    public void paintUsing(IPainted iPainted) {
        iPainted.paint(this);
    }

    public String toString(){
        return "This polygon contains " + vertices.size() + " points and it weight " + weight;
    }
}
