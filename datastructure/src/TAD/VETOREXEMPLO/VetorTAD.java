package TAD.VETOREXEMPLO;

public class VetorTAD {
	public VetorTAD(int tamanho,int minimo,int maximo,int vaga,int repete) {
		this.tamanho = tamanho;
		this.minimo = minimo;
		this.maximo = maximo;
		this.vaga = vaga;
		this.repete = repete;
		
		this.dados = new int[this.tamanho];
		if(this.vaga != 0) {
			for(int i = 0; i < this.tamanho;i++) {
				
			}
		}
		
	}
	
	private final int tamanho;
	private final int minimo;
	private final int maximo;
	private final int vaga;
	private final int repete; // 0 = nao repete; 1 = pode ter repetição
	
	
	private int[] dados;
	
	/**
     * <br> ================================================================
     * <br> ARMAZENA UM NOVO VALOR EM DETERMINADA POSICAO
     * <br> ================================================================
     * <br> Retorna os seguintes codigos:
     * <br> 0 - armazenamento bem sucedido
     * <br> 1 - valor fora da faixa valida
     * <br> 2 - posição não existente no vetor
     * <br> 3 - posição ocupada (para armazenar é necessário estar vaga)
     * <br> 4 - caso não permita repetição e já existe o valor
     *
     * @param valor
     * @param posicao
     * @return
     */
	public int armazenar(int valor,int posicao) {
		
		if(!this.valorValido()) { // valor válido ?
			return 1;
		}
		
		if(!this.posicaoValida(posicao)) { // posição valida ?
			return 2;
		}
		
		if(this.dados[posicao] != this.vaga) { // posição está vaga ?
			return 3;
		}
		
		if(!this.podeRepetir()) {
			int[] existe = this.localizar(valor, nPrimeiros:0);
			if(existe[0] > 0) {
				return 4;
			}
		}
		
		this.dados[posicao] = valor; // ok até aqui -> armazenar
		
		return 0;
	}

	 /**
     * <br> ================================================================
     * <br> ALTERA O VALOR DE DETERMINADA POSICAO
     * <br> ================================================================
     * <br> Retorna os seguintes codigos:
     * <br> 0 - alteracao bem sucedida
     * <br> 1 - valor fora da faixa valida
     * <br> 2 - posicao nao existente no vetor
     * <br> 3 - posicao vaga (para alterar e' necessario estar alocada)
     * <br> 4 - caso nao permita repeticao e ja' existe o valor
     *
     * @param valor
     * @param posicao
     * @return
     */
	
	public int alterar(int valor,int posicao) {
		if (!this.valorValido(valor)) { // valor válido ?
			return 1;
		}
		
		if (!this.posicaoValida(posicao)) { // posicao válida?
			return 2;
		}
		
		if(this.dados[posicao] == this.vaga) { // posição contém um valor válido?
			return 3;
		}
		
		if(!this.podeRepetir()) {
			int[] existe = this.localizar(valor, nPrimeiross:0);
			if(existe[0] > 0) {
				return 4;
			}
		}
		
		this.dados[posicao] = valor; // ok até aqui -> armazenar
		
		return 0;
	}
	
	
}
