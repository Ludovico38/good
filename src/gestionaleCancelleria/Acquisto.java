package gestionaleCancelleria;

public class Acquisto {
	private int idAcquisto;
	private String nomeDipendente;
	private String nomeProdotto;
	private String nomeFondo;
	private int qta;
	private float spesa;
	private String dataAcquisto;
	
	
	public Acquisto(int idAcquisto, String nomeDipendente, String nomeProdotto, String nomeFondo, int qta,
			float spesa, String dataAcquisto) {
		this.idAcquisto = idAcquisto;
		this.nomeDipendente = nomeDipendente;
		this.nomeProdotto = nomeProdotto;
		this.nomeFondo = nomeFondo;
		this.qta = qta;
		this.spesa = spesa;
		this.dataAcquisto = dataAcquisto;
	}


	public Acquisto() {
		super();
	}


	/**
	 * @return the idAcquisto
	 */
	public int getIdAcquisto() {
		return idAcquisto;
	}


	/**
	 * @param idAcquisto the idAcquisto to set
	 */
	public void setIdAcquisto(int idAcquisto) {
		this.idAcquisto = idAcquisto;
	}


	/**
	 * @return the nomeDipendente
	 */
	public String getNomeDipendente() {
		return nomeDipendente;
	}


	/**
	 * @param nomeDipendente the nomeDipendente to set
	 */
	public void setNomeDipendente(String nomeDipendente) {
		this.nomeDipendente = nomeDipendente;
	}


	/**
	 * @return the nomeProdotto
	 */
	public String getNomeProdotto() {
		return nomeProdotto;
	}


	/**
	 * @param nomeProdotto the nomeProdotto to set
	 */
	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}


	/**
	 * @return the nomeFondo
	 */
	public String getNomeFondo() {
		return nomeFondo;
	}


	/**
	 * @param nomeFondo the nomeFondo to set
	 */
	public void setNomeFondo(String nomeFondo) {
		this.nomeFondo = nomeFondo;
	}


	/**
	 * @return the qta
	 */
	public int getQta() {
		return qta;
	}


	/**
	 * @param qta the qta to set
	 */
	public void setQta(int qta) {
		this.qta = qta;
	}


	/**
	 * @return the spesa
	 */
	public float getSpesa() {
		return spesa;
	}


	/**
	 * @param spesa the spesa to set
	 */
	public void setSpesa(float spesa) {
		this.spesa = spesa;
	}


	/**
	 * @return the dataAcquisto
	 */
	public String getDataAcquisto() {
		return dataAcquisto;
	}


	/**
	 * @param dataAcquisto the dataAcquisto to set
	 */
	public void setDataAcquisto(String dataAcquisto) {
		this.dataAcquisto = dataAcquisto;
	}

}