/**
 * 
 */

/**
 * 
 */
public class Sertar {

	private float latime, lungime, inaltime;
	
	/**
	 * @param latime
	 * @param l2
	 * @param h
	 */
	public Sertar(float l, float l2, float h) {
		this.latime = l;
		lungime = l2;
		inaltime = h;
	}

	@Override
	public String toString() {
		return "Sertar [latime=" + latime + ", lungime=" + lungime + ", inaltime=" + inaltime + "]";
	}

	/**
	 * @return the latime
	 */
	public float getLatime() {
		return latime;
	}

	/**
	 * @param latime the latime to set
	 */
	public void setLatime(float l) {
		this.latime = l;
	}

	/**
	 * @return the lungime
	 */
	public float getLungime() {
		return lungime;
	}

	/**
	 * @param lungime the lungime to set
	 */
	public void setLungime(float l) {
		lungime = l;
	}

	/**
	 * @return the h
	 * @deprecated Use {@link #getInaltime()} instead
	 */
	public float getH() {
		return getInaltime();
	}

	/**
	 * @return the h
	 */
	public float getInaltime() {
		return inaltime;
	}

	/**
	 * @param h the h to set
	 * @deprecated Use {@link #setInaltime(float)} instead
	 */
	public void setH(float h) {
		setInaltime(h);
	}

	/**
	 * @param h the h to set
	 */
	public void setInaltime(float h) {
		inaltime = h;
	}
	
	public void tipareste() {
		System.out.println(this);
	}
	
	/**
	 * This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sertar sertar1 = new Sertar(25, 34, 37);
		Sertar sertar2 = new Sertar(111, 112, 119);
		sertar1.tipareste();
		sertar2.tipareste();
	}

}
