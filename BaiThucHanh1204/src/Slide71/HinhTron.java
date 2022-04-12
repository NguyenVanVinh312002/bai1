package Slide71;

public class HinhTron {
	private final float Pi=3.14f;
	private float r;
	public float getR() {
		return r;
	}
	public void setR(float r) {
		this.r = r;
	}
	public float TinhChuVi() {
		return 2*Pi*r;
	}
	public float TinhDienTich() {
		return Pi*r*r;
	}
	
	
}
