package br.edu.infnet.EmpresaACME.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.S3ObjectSummary;

public class FornecedorController {

	public static void excluirObjeto(AmazonS3 s3, String nomeBucket, String caminhoBucket) {
		s3.deleteObject(nomeBucket, caminhoBucket);
	}

	public static void excluirBucket(AmazonS3 s3, String nomeBucket) {
		try {
			s3.deleteBucket(nomeBucket);
		} catch (AmazonS3Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void baixarObjeto(AmazonS3 s3, String nomeBucket, String caminhoBucket, String caminhoImagem) {
		S3Object s3Object = s3.getObject(nomeBucket, caminhoBucket);
		S3ObjectInputStream inputStream = s3Object.getObjectContent();
		try {
			FileUtils.copyInputStreamToFile(inputStream, new File(caminhoImagem));
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			;
		}
	}

	public static void listarObjetos(AmazonS3 s3, String nomeBucket) {
		System.out.println("Objetos do bucket " + nomeBucket);
		ObjectListing objectListing = s3.listObjects(nomeBucket);
		for (S3ObjectSummary os : objectListing.getObjectSummaries()) {
			System.out.println(os.getKey());
		}
	}

	public static void inserirObjeto(AmazonS3 s3, String nomeBucket, String caminhoBucket, File file) {
		s3.putObject(nomeBucket, caminhoBucket, file);
	}

	public static void listarBuckets(AmazonS3 s3) {
		List<Bucket> buckets = s3.listBuckets();
		System.out.println("Lista de buckes");
		for (Bucket bucket : buckets) {
			System.out.println(bucket.getName());
		}
	}

	public static boolean isBucketCreated(AmazonS3 s3, String nomeBucket) {
		if (s3.doesBucketExistV2(nomeBucket)) {
			return true;
		} else {
			s3.createBucket(nomeBucket);
			return false;
		}
	}

}
