package com.example.mybatisexam.controller.exam01;

import com.example.mybatisexam.model.common.PageReq;
import com.example.mybatisexam.model.common.PageRes;
import com.example.mybatisexam.model.vo.Dept;
import com.example.mybatisexam.model.vo.Emp;
import com.example.mybatisexam.service.exam01.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * packageName : com.example.mybatisexam.controller.exam01
 * fileName : EmpController
 * author : GGG
 * date : 2023-10-12
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-12         GGG          최초 생성
 */
@Slf4j
@Controller
@RequestMapping("/exam01")
public class EmpController {
    @Autowired
    EmpService empService;

    @GetMapping("/emp")
    public String getEmpAll(
            @RequestParam(defaultValue = "") String ename
            , @RequestParam(defaultValue = "0") int page
            , @RequestParam(defaultValue = "3") int size
            , Model model
    ) {
//      todo: 페이징 요청 객체에 정보 저장
//        page : 현재페이지 번호, size : 1 페이지당 개수
        PageReq pageReq = new PageReq(page, size);

//      todo: 전체 조회 함수 호출
        PageRes<Emp> pageRes
                = empService.findByEnameContaining(ename, pageReq);
//      todo: jsp 정보전달( 부서배열, 페이징정보 )
        model.addAttribute("emp", pageRes.getContent()); // 부서배열
        model.addAttribute("currentPage", pageRes.getNumber()); // 현재 페이지 번호
        model.addAttribute("totalItems", pageRes.getTotalElements()); // 전체 테이블 건수
        model.addAttribute("totalPages", pageRes.getTotalPages()); // 전체 페이지 개수
        model.addAttribute("startPage", pageRes.getStartPage()); // 현재 시작 페이지 번호
        model.addAttribute("endPage", pageRes.getEndPage()); // 현재 끝 페이지 번호

        log.debug(model.toString()); // 로그 출력

        return "exam01/emp/emp_all.jsp";
    }
}
