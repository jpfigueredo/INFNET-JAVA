package br.com.consumingAPI;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="apiService")
public interface apiServiceProxy extends apiService{
	
	
	
}
