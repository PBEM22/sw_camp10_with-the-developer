package com.developer.dbti.query.controller;

import com.developer.dbti.query.dto.ResponseDbtiDTO;
import com.developer.dbti.query.service.DbtiQueryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "dbti", description = "dbti API")
@Slf4j
@RestController
@RequestMapping("/dbti")
@RequiredArgsConstructor
public class DbtiQueryController {

    private final DbtiQueryService dbtiQueryService;

    @GetMapping("/result/{dbtiResult}")
    @Operation(summary = "성향에 맞는 dbti 목록 조회", description = "성향 테스트를 통해 나온 성향에 어울리는 dbti 목록을 조회합니다. ")
    public ResponseEntity<List<ResponseDbtiDTO>> dbtiResult(@PathVariable(name = "dbtiResult") String dbtiResult) {

        List<ResponseDbtiDTO> roles = dbtiQueryService.dbtiResult(dbtiResult);

        return ResponseEntity.ok(roles);
    }

    @GetMapping("/all")
    @Operation(summary = "모든 dbti 조회", description = "등록되어 있는 모든 dbti를 조회합니다.")
    public ResponseEntity<List<ResponseDbtiDTO>> findAll(){
        List<ResponseDbtiDTO> all = dbtiQueryService.findAll();

        return ResponseEntity.ok(all);
    }

}
