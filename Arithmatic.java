class Rectangle{
int length;
int width;

void insertCalculator(int l, int w){
length = l;
width = w;

}

void displayInfromation()
{
	System.out.println(length*width);
}
}

class Arithmatic
{

public static void main(String args[]){
Rectangle n1 = new Rectangle();
Rectangle n2 = new Rectangle();

n1.insertCalculator(100, 200);
n2.insertCalculator(200, 300);

n1.displayInfromation();
n2.displayInfromation();
}
}