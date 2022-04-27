package shape;

import java.io.IOException;
import java.util.Scanner;

public class Point {
	protected char tenDiem=' ';
	protected float tungDo,hoanhDo;
	
	public char getTenDiem() {
		return tenDiem;
	}
	public void setTenDiem(char tenDiem) {
		this.tenDiem = tenDiem;
	}
	public float getTungDo() {
		return tungDo;
	}
	public void setTungDo(float tungDo) {
		this.tungDo = tungDo;
	}
	public float getHoanhDo() {
		return hoanhDo;
	}
	public void setHoanhDo(float hoanhDo) {
		this.hoanhDo = hoanhDo;
	}
	public Point(char tenDiem, float tungDo, float hoanhDo) {
		this.tenDiem = tenDiem;
		this.tungDo = tungDo;
		this.hoanhDo = hoanhDo;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);	
		try {
			System.out.println("nhap ten diem : ");
			tenDiem=(char) System.in.read();
		} catch (IOException e) {
			System.out.println("nhap gia tri sai");
		}
		System.out.println("nhap tung do: ");
		tungDo=sc.nextFloat();
		System.out.println("nhap hoanh do: ");
		hoanhDo=sc.nextFloat();	
	}
	public void in() {
		System.out.println("diem ban vua nhap la: "+tenDiem+"("+tungDo+","+hoanhDo+")");
	}
	
	
	
}
