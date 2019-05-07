package com.btec.pontointeligente.api.response;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {
	
	//dados para retorno sucesso
	private T data;
	
	//erros em requisiçãoes
	private List<String> erros;
	
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public List<String> getErros() {
		if(this.erros == null) {
			this.erros = new ArrayList<String>();
		}
		return erros;
	}
	public void setErros(List<String> erros) {
		this.erros = erros;
	}

}
