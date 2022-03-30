package br.edu.infnet.EmpresaACME.testes;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;

import br.edu.infnet.EmpresaACME.controller.ProdutoController;

public class ProdutoTeste {

	private static final String nomeBucket = "bucket-java-nuvem";
	private static final String caminhoArquivo = "imagens/lpmaia.jpg";
	private static final String caminhoLocalArquivo = "C:\\Users\\w4sabi\\Downloads\\imagem.jpg";
	private static final File caminhoLocalFile = new File("C:\\Users\\w4sabi\\Downloads\\imagem.jpg");

	@Autowired
	private ProdutoController produtoController;

	public static void main(String[] args) {

		AmazonS3 s3 = configurar();
		criarBucket(s3);
//		listarBuckets(s3);
//		uploadObjeto(s3);
		listarObjetos(s3);
//		downloadObjeto(s3);
		excluirObjeto(s3);
		excluirBucket(s3);
	}

	private static void excluirObjeto(AmazonS3 s3) {
		ProdutoController.excluirObjeto(s3, nomeBucket, caminhoArquivo);
	}

	private static void excluirBucket(AmazonS3 s3) {
		try {
			ProdutoController.excluirBucket(s3, nomeBucket);
		} catch (AmazonS3Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void downloadObjeto(AmazonS3 s3) {
		ProdutoController.baixarObjeto(s3, nomeBucket, caminhoArquivo,
				caminhoLocalArquivo);
	}

	private static void listarObjetos(AmazonS3 s3) {
		ProdutoController.listarObjetos(s3, nomeBucket);
	}

	private static void uploadObjeto(AmazonS3 s3) {
		try {
			ProdutoController.inserirObjeto(s3, nomeBucket, caminhoArquivo,
					caminhoLocalFile);
			System.out.println("Upload completo");
		} catch (AmazonS3Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void listarBuckets(AmazonS3 s3) {
		ProdutoController.listarBuckets(s3);
	}

	private static void criarBucket(AmazonS3 s3) {
		if (ProdutoController.isBucketCreated(s3, nomeBucket)) {
			System.out.println("Bucket já existe");
		} else {
			System.out.println("Bucket criado");
		}
	}

	public static AmazonS3 configurar() {
		AWSCredentials credentials = new BasicAWSCredentials("AKIAWNJYWBWLSAGVXVBF",
				"hrA3ZBYqpexWOVEdI8ZdxtYarvIVX1xo2k5tjSTl");

		AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials))
				.withRegion(Regions.SA_EAST_1).build();
		return s3;
	}
}
