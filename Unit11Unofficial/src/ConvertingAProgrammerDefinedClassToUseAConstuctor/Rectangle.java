package ConvertingAProgrammerDefinedClassToUseAConstuctor;

class Rectangle
{
    private Double length;
    private Double width;
    public void setLength(Double length) {
        this.length = length;
    }
    public void setWidth(Double width) {
        this.width = width;
    }
    public Double getLength() {
        return length;
    }
    public Double getWidth() {
        return width;
    }

    public Double calculatePerimeter() {
        return 2*this.length + 2*this.width;
    }

    public Double calculateArea() {
        return this.length * this.width;
    }
}