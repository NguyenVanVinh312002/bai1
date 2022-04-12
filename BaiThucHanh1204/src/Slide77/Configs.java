package Slide77;

public class Configs {
	public static final int so_luong_hinh_toi_thieu =0;
	public static final int so_luong_hinh_toi_da =5;
	
	public static final float Pi=3.14f;
	public static final float inch_cm =2.54f;
	public static final int don_vi_cm=1;
	public static final int don_vi_inc =2;
	public static int donvi=don_vi_cm;
	
	public static float CmToInch(float cm) {
		float inch=cm/inch_cm;
		return inch;
	}
	
	public static float InchToCm(float inch) {
		float cm=inch*inch_cm;
		return cm;
	}
	
}
