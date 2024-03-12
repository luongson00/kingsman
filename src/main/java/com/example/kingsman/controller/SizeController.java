package com.example.kingsman.controller;

import com.example.kingsman.entities.Size;
import com.example.kingsman.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping("/size")
public class SizeController {
    @Autowired
    private SizeService sizeService;

    @GetMapping("/hien-thi")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(sizeService.getAll());
    }
//    @GetMapping("/hien-thi")
//    public String getAll(Model model) {
//        List<Size> sizeList = sizeService.getAll();
//        model.addAttribute("sizes", sizeList);
//        System.out.println("hahahahahaha: " + sizeList.toString());
//        return "/html/size/size-list";
//    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Size size) {
        return ResponseEntity.ok(sizeService.add(size));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Size size) {
        return ResponseEntity.ok(sizeService.update(size, id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        return ResponseEntity.ok(sizeService.delete(id));
    }

    @GetMapping("/tim-kiem")
    public ResponseEntity<?> timKiemSize(
            @RequestParam(required = false) String tenSize,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date ngayTao,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date ngayCapNhat,
            @RequestParam(required = false) Integer trangThai,
            Pageable pageable) {
        try {
            // Validation
            if (ngayTao != null && ngayCapNhat != null && ngayTao.after(ngayCapNhat)) {
                throw new IllegalArgumentException("Ngày tạo không thể sau ngày cập nhật");
            }

            // Thực hiện tìm kiếm
            Page<Size> result = sizeService.timKiemSize(tenSize, ngayTao, ngayCapNhat, trangThai, pageable);
            return ResponseEntity.ok(result);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Đã xảy ra lỗi trong quá trình xử lý yêu cầu");
        }
    }
}
