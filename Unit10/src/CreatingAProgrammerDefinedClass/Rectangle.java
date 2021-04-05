package CreatingAProgrammerDefinedClass;

class Rectangle
{
    // Length of this rectangle.
    private Double length;
    // Width of this rectangle.
    private Double width;

    // Write set methods here.

    public void setLength(Double length) {
        this.length = length;
    }

    public void setWidth(Double width) {
        this.width = width;
    }


    // Write get methods here.

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }


    // Write the calculatePerimeter() and
    // calculateArea() methods here.
    public Double calculatePerimeter(Double len, Double wid) {
        Double perimeter = 2*len + 2*wid;
        return perimeter;
    }

    public Double calculateArea(Double len, Double wid) {
        Double area = len * wid;
        return area;
    }
}
