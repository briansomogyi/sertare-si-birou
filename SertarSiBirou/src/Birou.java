/**
 * 
 */

/**
 * 
 */
public class Birou {

	private float lungime, latime, inaltime;
	
	private Sertar sertar1, sertar2;
	
	/**
	 * @param lungime
	 * @param latime
	 * @param inaltime
	 * @param sertar1
	 * @param sertar2
	 */
	public Birou(float lungime, float latime, float inaltime, Sertar sertar1, Sertar sertar2) {
		this.lungime = lungime;
		this.latime = latime;
		this.inaltime = inaltime;
		this.sertar1 = sertar1;
		this.sertar2 = sertar2;
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
	public void setLungime(float lungime) {
		this.lungime = lungime;
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
	public void setLatime(float latime) {
		this.latime = latime;
	}

	/**
	 * @return the inaltime
	 */
	public float getInaltime() {
		return inaltime;
	}

	/**
	 * @param inaltime the inaltime to set
	 */
	public void setInaltime(float inaltime) {
		this.inaltime = inaltime;
	}

	/**
	 * @return the sertar1
	 */
	public Sertar getSertar1() {
		return sertar1;
	}

	/**
	 * @param sertar1 the sertar1 to set
	 */
	public void setSertar1(Sertar sertar1) {
		this.sertar1 = sertar1;
	}

	/**
	 * @return the sertar2
	 */
	public Sertar getSertar2() {
		return sertar2;
	}

	/**
	 * @param sertar2 the sertar2 to set
	 */
	public void setSertar2(Sertar sertar2) {
		this.sertar2 = sertar2;
	}

	@Override
	public String toString() {
		return "Birou [lungime=" + lungime + ", latime=" + latime + ", inaltime=" + inaltime + ", sertar1=" + sertar1
				+ ", sertar2=" + sertar2 + "]";
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
		Birou birou = new Birou(9, 10, 145, sertar1, sertar2);
		birou.tipareste();
	}

}
