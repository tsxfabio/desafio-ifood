package br.com.ifood.converter;

import java.io.Serializable;

import br.com.ifood.models.Categoria;
import br.com.ifood.models.Endereco;
import br.com.ifood.models.Responsavel;

public class LojaConverter implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/* PROPERTIES */
	
	private int id_loja;
	private String nr_cnpj;
	private String nm_razao_social;
	private String nm_loja;
	private String nr_telefone;
	private String ds_email;
	private String cd_plano;
	private Categoria categoria_loja;
	private Endereco endereco_loja;
	private Responsavel responsavel_loja;
	
	/* CONSTRUCTOR */
	
	public LojaConverter() {}
	
	public LojaConverter(int id_loja, String nr_cnpj, String nm_razao_social, String nm_loja, String nr_telefone,
			String ds_email, String cd_plano, Categoria categoria_loja, Endereco endereco_loja, Responsavel responsavel_loja) {
		super();
		this.id_loja = id_loja;
		this.nr_cnpj = nr_cnpj;
		this.nm_razao_social = nm_razao_social;
		this.nm_loja = nm_loja;
		this.nr_telefone = nr_telefone;
		this.ds_email = ds_email;
		this.cd_plano = cd_plano;
		this.categoria_loja = categoria_loja;
		this.endereco_loja = endereco_loja;
		this.responsavel_loja = responsavel_loja;
	}

	/* GETTERS & SETTERS */
	
	public int getId_loja() {
		return id_loja;
	}
	
	public void setId_loja(int id_loja) {
		this.id_loja = id_loja;
	}
	
	public String getNr_cnpj() {
		return nr_cnpj;
	}
	
	public void setNr_cnpj(String nr_cnpj) {
		this.nr_cnpj = nr_cnpj;
	}
	
	public String getNm_razao_social() {
		return nm_razao_social;
	}
	
	public void setNm_razao_social(String nm_razao_social) {
		this.nm_razao_social = nm_razao_social;
	}
	
	public String getNm_loja() {
		return nm_loja;
	}
	
	public void setNm_loja(String nm_loja) {
		this.nm_loja = nm_loja;
	}
	
	public String getNr_telefone() {
		return nr_telefone;
	}
	
	public void setNr_telefone(String nr_telefone) {
		this.nr_telefone = nr_telefone;
	}
	
	public String getDs_email() {
		return ds_email;
	}
	
	public void setDs_email(String ds_email) {
		this.ds_email = ds_email;
	}
	
	public String getCd_plano() {
		return cd_plano;
	}
	
	public void setCd_plano(String cd_plano) {
		this.cd_plano = cd_plano;
	}
	
	public Categoria getCategoria_loja() {
		return categoria_loja;
	}
	
	public void setCategoria_loja(Categoria categoria_loja) {
		this.categoria_loja = categoria_loja;
	}

	public Endereco getEndereco_loja() {
		return endereco_loja;
	}

	public void setEndereco_loja(Endereco endereco_loja) {
		this.endereco_loja = endereco_loja;
	}

	public Responsavel getResponsavel_loja() {
		return responsavel_loja;
	}

	public void setResponsavel_loja(Responsavel responsavel_loja) {
		this.responsavel_loja = responsavel_loja;
	}
	
	/* METHODS */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria_loja == null) ? 0 : categoria_loja.hashCode());
		result = prime * result + ((cd_plano == null) ? 0 : cd_plano.hashCode());
		result = prime * result + ((ds_email == null) ? 0 : ds_email.hashCode());
		result = prime * result + ((endereco_loja == null) ? 0 : endereco_loja.hashCode());
		result = prime * result + id_loja;
		result = prime * result + ((nm_loja == null) ? 0 : nm_loja.hashCode());
		result = prime * result + ((nm_razao_social == null) ? 0 : nm_razao_social.hashCode());
		result = prime * result + ((nr_cnpj == null) ? 0 : nr_cnpj.hashCode());
		result = prime * result + ((nr_telefone == null) ? 0 : nr_telefone.hashCode());
		result = prime * result + ((responsavel_loja == null) ? 0 : responsavel_loja.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LojaConverter other = (LojaConverter) obj;
		if (categoria_loja == null) {
			if (other.categoria_loja != null)
				return false;
		} else if (!categoria_loja.equals(other.categoria_loja))
			return false;
		if (cd_plano == null) {
			if (other.cd_plano != null)
				return false;
		} else if (!cd_plano.equals(other.cd_plano))
			return false;
		if (ds_email == null) {
			if (other.ds_email != null)
				return false;
		} else if (!ds_email.equals(other.ds_email))
			return false;
		if (endereco_loja == null) {
			if (other.endereco_loja != null)
				return false;
		} else if (!endereco_loja.equals(other.endereco_loja))
			return false;
		if (id_loja != other.id_loja)
			return false;
		if (nm_loja == null) {
			if (other.nm_loja != null)
				return false;
		} else if (!nm_loja.equals(other.nm_loja))
			return false;
		if (nm_razao_social == null) {
			if (other.nm_razao_social != null)
				return false;
		} else if (!nm_razao_social.equals(other.nm_razao_social))
			return false;
		if (nr_cnpj == null) {
			if (other.nr_cnpj != null)
				return false;
		} else if (!nr_cnpj.equals(other.nr_cnpj))
			return false;
		if (nr_telefone == null) {
			if (other.nr_telefone != null)
				return false;
		} else if (!nr_telefone.equals(other.nr_telefone))
			return false;
		if (responsavel_loja == null) {
			if (other.responsavel_loja != null)
				return false;
		} else if (!responsavel_loja.equals(other.responsavel_loja))
			return false;
		return true;
	}
	
}
