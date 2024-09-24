package com.example.sd18307.controller;

import com.example.sd18307.Rep.SinhvienInterpace;
import com.example.sd18307.entity.SinhVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller
public class SinhVienController {

   ArrayList<SinhVien> list = new ArrayList<>();

//    public SinhVienController() {
//        list.add(new SinhVien(1, "Nguyen Van A", "Ha Noi", "Nam", "Hoat dong"));
//        list.add(new SinhVien(3, "Nguyen Van A", "Ha Noi", "Nam", "Hoat dong"));
//
//    }
@Autowired
    SinhvienInterpace sinhvienInterpace;
    @GetMapping("/sinh-vien")
    public String sinhVien(Model model) {
        // lay danh sach sinh vien

        model.addAttribute("listSinhVien", sinhvienInterpace.findAll());
        return "sinh-vien";
    }

    @PostMapping("/sinh-vien")
    public String add(
            //HttpServletRequest request,
                      @ModelAttribute("sinhVien") SinhVien sinhVien
    ) {
//        Integer id = Integer.parseInt(request.getParameter("id"));
//        String hoTen = request.getParameter("hoTen");
//        String diaChi = request.getParameter("diaChi");
//        String gioiTinh = request.getParameter("gioiTinh");
//        String trangThai = request.getParameter("trangThai");
//        SinhVien sinhVien = new SinhVien(id, hoTen, diaChi, gioiTinh, trangThai);
        list.add(sinhVien);
        return "redirect:/sinh-vien";
    }
    @GetMapping("/sinh-vien/delete")
    public String delete(@RequestParam("id") Integer id){
        for (int i = 0 ;i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                list.remove(list.get(i));
            }
        }
        return "redirect:/sinh-vien";
    }
    @GetMapping("/sinh-vien/edit")
    public String detail(
            @RequestParam("id") Integer id , Model model
    ){
        SinhVien sinhViendetail = new SinhVien();
        for(SinhVien sv :list){
            if(sv.getId().equals(id)){
                sinhViendetail = sv;
            }
        }
        model.addAttribute("sinhVien",sinhViendetail);
        return "sinh-vien-detail";
    }
    @PostMapping("/sinh-vien/update")
    public String update(@ModelAttribute("sinhVien") SinhVien sinhVien){
        for (SinhVien sv:list){
            if(sv.getId().equals(sinhVien.getId())){
                sv.setDiaChi(sinhVien.getDiaChi());
                sv.setHoTen(sinhVien.getHoTen());
                sv.setGioiTinh(sinhVien.getGioiTinh());
                sv.setTrangThai(sinhVien.getTrangThai());
            }
        }
        return "redirect:/sinh-vien";
    }
}
