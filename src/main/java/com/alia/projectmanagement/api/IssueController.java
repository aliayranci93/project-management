package com.alia.projectmanagement.api;

/**
 * Created by Ali on Kas,2020
 */

import com.alia.projectmanagement.dto.IssueDto;
import com.alia.projectmanagement.service.impl.IssueService;
import com.alia.projectmanagement.util.ApiPaths;
import com.alia.projectmanagement.util.TPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/"+ApiPaths.IssueCtrl.CTRL)
@Api(value = ApiPaths.IssueCtrl.CTRL, description = "Issue Api'leri")
public class IssueController {

    private final IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;

    }

    @GetMapping("/pagination")
    @ApiOperation(value = "Sayfalandırma Operasyonu (Pagination)", response = IssueDto.class)
    public ResponseEntity<TPage<IssueDto>> getAllByPagination(Pageable pageable) {
        TPage<IssueDto> data = issueService.getAllPageable(pageable);
        return ResponseEntity.ok(data);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Id ye Göre Issue Getir", response = IssueDto.class)
    public ResponseEntity<IssueDto> getById(@PathVariable(value = "id", required = true) Long id) {
        IssueDto issueDto = issueService.getById(id);
        return ResponseEntity.ok(issueDto);
    }

    @PostMapping("")
    @ApiOperation(value = "Issue Oluştur", response = IssueDto.class)
    public ResponseEntity<IssueDto> createIssue(@Valid @RequestBody IssueDto issueDto) {
        return ResponseEntity.ok(issueService.save(issueDto));
    }

    @GetMapping("")
    @ApiOperation(value = "Tüm Issue Listele", response = IssueDto.class)
    public ResponseEntity<List<IssueDto>> getAll() {
        List<IssueDto> data = issueService.getAll();
        return ResponseEntity.ok(data);
    }



    @DeleteMapping("/{id}")
    @ApiOperation(value = "Issue Sil", response = IssueDto.class)
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok(issueService.delete(id));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Issue Güncelle", response = IssueDto.class)
    public ResponseEntity<IssueDto> updateIssue(@PathVariable(value = "id", required = true) Long id, @Valid @RequestBody IssueDto issue) {
        return ResponseEntity.ok(issueService.update(id, issue));
    }


}
