package com.alia.projectmanagement.util;

import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

@Data
public class TPage<T> {

    private int number;
    //KAÇINCI SAYFA
    private int size;
    //FRONT ENT SİZE BİLGİSİ KAÇARLI GÖRMEK İSTEDİĞİN
    private Sort sort;
    //KOLONA GÖRE SIRALAMA İÇİN
    private int totalPages;
    //TOPLAMDA KAÇ SAYFA OLDU
    private Long totalElements;
    //KAÇ KAYIT VAR
    private List<T> content;
    //DÖNECEĞİMİZ DATA

    public void setStat(Page page, List<T> list) {
        this.number = page.getNumber();
        this.size = page.getSize();
        this.sort = page.getSort();
        this.totalPages = page.getTotalPages();
        this.totalElements = page.getTotalElements();
        this.content = list;
    }
}
