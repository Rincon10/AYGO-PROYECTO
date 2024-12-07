package com.escuelaing.edu.co.distribuited_systems.batch_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatusCode;

/**
 * @author Ivan Camilo Rincon Saavedra
 * @version 1.0
 * @since 12/6/2024
 */
@Data
@AllArgsConstructor
@Builder
public class BatchResponse {
    private HttpStatusCode httpStatusCode;
    private String message;
}
