package com.example.controllermoney.api.repository.listener;

import javax.persistence.PostLoad;

import com.example.controllermoney.api.ControllermoneyApiApplication;
import com.example.controllermoney.api.model.Lancamento;
import com.example.controllermoney.api.storage.S3;
import org.springframework.util.StringUtils;

public class LancamentoAnexoListener {
	
	@PostLoad
	public void postLoad(Lancamento lancamento) {
		if (StringUtils.hasText(lancamento.getAnexo())) {
			S3 s3 = ControllermoneyApiApplication.getBean(S3.class);
			lancamento.setUrlAnexo(s3.configurarUrl(lancamento.getAnexo()));
		}
	}

}
