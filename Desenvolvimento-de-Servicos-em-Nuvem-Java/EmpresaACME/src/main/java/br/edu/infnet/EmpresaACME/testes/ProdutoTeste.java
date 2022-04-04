package br.edu.infnet.EmpresaACME.testes;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.infnet.EmpresaACME.service.ProdutoService;

public class ProdutoTeste {

	private static final String nomeBucket = "java-bucket-at-storage";
	private static final String caminhoArquivo = "imagens/imagem.jpg";
	private static final String caminhoLocalArquivo = "D:\\wasabi\\Downloads\\imagem.jpg";
	private static final File caminhoLocalFile = new File("D:\\wasabi\\Downloads\\imagem.jpg");

	@Autowired
	private static ProdutoService produtoService;
	
	public static void main(String[] args) {

//		AmazonS3 s3 = configurar();
		
//		criarBucket(s3);
//		listarBuckets(s3);
//		uploadObjeto(s3);
//		listarObjetos(s3);
//		downloadObjeto(s3);
//		excluirObjeto(s3);
//		excluirBucket(s3);

	}

}
