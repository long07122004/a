package com.example.sd18307.Rep;

import com.example.sd18307.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhvienInterpace extends JpaRepository<SinhVien,Integer> {
}
