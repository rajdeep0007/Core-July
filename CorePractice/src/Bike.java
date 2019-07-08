
public class Bike implements Cloneable{
private String name;
private int cost;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Bike [name=" + name + ", cost=" + cost + "]";
}
@Override
protected Object clone() throws CloneNotSupportedException
{
	return (Bike)super.clone();
	
}

}
