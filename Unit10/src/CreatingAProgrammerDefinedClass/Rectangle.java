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
    public Double calculatePerimeter() {
        return 2*this.length + 2*this.width;
    }

    public Double calculateArea() {
        return this.length * this.width;
    }
}