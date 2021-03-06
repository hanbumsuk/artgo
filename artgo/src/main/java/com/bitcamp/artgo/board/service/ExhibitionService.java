package com.bitcamp.artgo.board.service;

import java.util.List;
import java.util.Map;
import com.bitcamp.artgo.board.model.ExhibitionDto;
import com.bitcamp.artgo.board.model.FileDto;

/**
* 파일명: ExhibitionService.java
* 설 명: 전시회 서비스 인터페이스 클래스
* 작성일: 2019. 1. 11.
* 작성자: 한 범 석
*/

public interface ExhibitionService {

  ExhibitionDto getExhibit(String bno);
  List<ExhibitionDto> getExhibitList(Map<String, String> param);
  String getImminentExhibit();
  List<ExhibitionDto> getNewExhibit();
  List<FileDto> getBannerList();
}