public class Circumcircle {
	
    // jari jari
	public static float radius(float ax, float ay, float bx, float by, float cx, float cy){
		// Sisi Segitiga
        double a =  Math.hypot(bx - ax, by - ay);
        double b = Math.hypot(cx - ax, cy - ay);
        double c =  Math.hypot(bx - cx, by - cy);

        // Gradien Garis
        double x = (by-ay)/(bx-ax);
        double y = (cy-ay)/(cx-ax);
        double z = (cy-by)/(cx-bx);
		
        // Cek Kondisi Colinear
		if (x==y && y==z){
            return Float.NaN;
		}else{
			double E = Math.pow(10.0,6.0);
            double s = (0.5)*(a+b+c);
			double L = Math.sqrt(s * (s - a) * (s - b) * (s - c));
			double r = (Math.round((a*b*c)/(4*L)*E)/E);
			
			return (float) r;
        }
    }

    // Keliling
    public static float circumference(float ax, float ay, float bx, float by, float cx, float cy){
		double F = Math.pow(10.0,2.0);
        float r = radius(ax, ay, bx, by, cx, cy);
        float K = (float) (Math.round(2.0*Math.PI*r*F)/F);
        if (Float.isNaN(r)){
            return Float.NaN;
        } else{
            return K;
        }
    }

    // Area
    public static float area(float ax, float ay, float bx, float by, float cx, float cy){
		double G = Math.pow(10.0,2.0);
        float r = radius(ax, ay, bx, by, cx, cy);
        float A =  (float) (Math.round(Math.PI*r*r*G)/G);
        if (Float.isNaN(r)){
            return Float.NaN;
        } else{
            return A;
        }
    }
	
}