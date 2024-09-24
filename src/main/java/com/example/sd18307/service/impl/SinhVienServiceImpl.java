package com.example.sd18307.service.impl;

import com.example.sd18307.entity.SinhVien;
import com.example.sd18307.service.SinhVienService;

import java.util.ArrayList;

public class SinhVienServiceImpl implements SinhVienService {

    ArrayList<SinhVien> list = new ArrayList<>();

    public SinhVienServiceImpl() {

    }

    @Override
    public ArrayList<SinhVien> getList() {
        return list;
    }

    @Override
    public void add(SinhVien sinhVien) {
        list.add(sinhVien);
    }


}
