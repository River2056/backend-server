package com.river.backendserver.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.river.backendserver.web.model.GetBillRs;

/**
 * AppController
 */
@RestController
@RequestMapping("/api")
public class AppController {

    private static final String KEY = "12345678901234567890";

    @GetMapping("/get-bill/list")
    public List<GetBillRs> getBills() {
        List<GetBillRs> list = new ArrayList<>();

        GetBillRs bill = GetBillRs.builder()
                .id(1)
                .field1("111/01")
                .field2(KEY)
                .field3("2024/03/15")
                .build();

        GetBillRs bill2 = GetBillRs.builder()
                .id(2)
                .field1("111/02")
                .field2(KEY)
                .field3("2024/03/16")
                .build();

        GetBillRs bill3 = GetBillRs.builder()
                .id(3)
                .field1("111/03")
                .field2(KEY)
                .field3("2024/03/17")
                .build();

        list.add(bill);
        list.add(bill2);
        list.add(bill3);

        return list;
    }
}
