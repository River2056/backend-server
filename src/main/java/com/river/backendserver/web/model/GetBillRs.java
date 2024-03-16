package com.river.backendserver.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GetBillRs
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetBillRs {
    private Integer id;
    private String field1;
    private String field2;
    private String field3;
}
