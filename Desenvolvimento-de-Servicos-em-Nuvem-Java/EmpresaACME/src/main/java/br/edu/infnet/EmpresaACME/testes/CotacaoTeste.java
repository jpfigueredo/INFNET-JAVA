package br.edu.infnet.EmpresaACME.testes;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.S3ObjectSummary;

public class CotacaoTeste {
private static final String NOMEBUCKET = "bucket-java-nuvem";
    
    public static void main(String[] args) {
    
        AmazonS3 s3 = configurar();
        criarBucket(s3);
        //listarBuckets(s3);
        //uploadObjeto(s3);
        listarObjetos(s3);
        //downloadObjeto(s3);
        excluirObjeto(s3);
        excluirBucket(s3);
    }
    
    public static void excluirObjeto(AmazonS3 s3) {
        
        s3.deleteObject(NOMEBUCKET, "imagens/lpmaia.jpg");
    }
    
    public static void excluirBucket(AmazonS3 s3) {
        
        try {
            s3.deleteBucket(NOMEBUCKET);
        }
        catch (AmazonS3Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void downloadObjeto(AmazonS3 s3) {
        
        S3Object s3Object = s3.getObject(NOMEBUCKET, "imagens/lpmaia.jpg");
        S3ObjectInputStream inputStream = s3Object.getObjectContent();
        try {
            FileUtils.copyInputStreamToFile(inputStream, new File("C:\\Users\\lpmaia\\Downloads\\lpmaia.jpg"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());;
        }
    }
    
    public static void listarObjetos(AmazonS3 s3) {
        
        System.out.println("Objetos do bucket " + NOMEBUCKET);
        ObjectListing objectListing = s3.listObjects(NOMEBUCKET);
        for (S3ObjectSummary os : objectListing.getObjectSummaries()) {
            System.out.println(os.getKey());
        }
    }
    
    public static void uploadObjeto(AmazonS3 s3) {
        
        try {
            s3.putObject(NOMEBUCKET, 
                "imagens/lpmaia.jpg", 
                new File("C:\\Users\\lpmaia\\Desktop\\lpmaia2.jpg"));
            System.out.println("Upload completo");
        }
        catch (AmazonS3Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void listarBuckets(AmazonS3 s3) {
        
        List<Bucket> buckets = s3.listBuckets();
        System.out.println("Lista de buckes");
        for (Bucket bucket : buckets) {
            System.out.println(bucket.getName());
        }
    }
    
    public static void criarBucket(AmazonS3 s3) {
        
        if (s3.doesBucketExistV2(NOMEBUCKET)) {
            System.out.println("Bucket já existe");
            return;
        }
        s3.createBucket(NOMEBUCKET);
        System.out.println("Bucket criado");
    }
    
    public static AmazonS3 configurar() {
        AWSCredentials credentials = new BasicAWSCredentials(
            "AKIAWNJYWBWLSAGVXVBF",
            "hrA3ZBYqpexWOVEdI8ZdxtYarvIVX1xo2k5tjSTl");
        
        AmazonS3 s3 = AmazonS3ClientBuilder.standard()
            .withCredentials(new AWSStaticCredentialsProvider(credentials))
            .withRegion(Regions.SA_EAST_1)
            .build();
        return s3;
    }
}
