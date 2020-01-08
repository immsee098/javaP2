package com.ez.herb.admin.controller;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ez.herb.category.model.CategoryService;
import com.ez.herb.category.model.CategoryVO;
import com.ez.herb.common.FileUploadUtil;
import com.ez.herb.common.PaginationInfo;
import com.ez.herb.common.SearchVO;
import com.ez.herb.common.Utility;
import com.ez.herb.event.model.EventProductService;
import com.ez.herb.event.model.EventProductVO;
import com.ez.herb.product.model.ProductListVO;
import com.ez.herb.product.model.ProductService;
import com.ez.herb.product.model.ProductVO;

@Controller
@RequestMapping("/admin/product")
public class AdminProductController {
	private static final Logger logger
		=LoggerFactory.getLogger(AdminProductController.class);
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private FileUploadUtil fileUtil;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private EventProductService eventProductService;
	
	@RequestMapping(value="/productWrite.do", method=RequestMethod.GET)
	public void pdWrite_get(Model model) {
		logger.info("관리자 - 상품등록 화면");
		
		List<CategoryVO> list=categoryService.selectCategory();
		logger.info("관리자-상품등록, 카테고리 조회 결과 list.size={}", list.size());
		
		model.addAttribute("list", list);		
	}
	
	@RequestMapping(value="/productWrite.do", method=RequestMethod.POST)
	public String pdWrite_post(@ModelAttribute ProductVO productVo,
			HttpServletRequest request, Model model) {
		logger.info("관리자 - 상품등록, 파라미터  vo={}", productVo);
		
		//이미지 파일 업로드		
		List<Map<String, Object>> list
			=fileUtil.fileUpload(request, FileUploadUtil.IMAGE_UPLOAD);
		
		String fileName="";
		for(Map<String, Object> map : list) {
			fileName=(String) map.get("fileName");
		}
		productVo.setImageURL(fileName);
		
		//db
		int cnt=productService.insertProduct(productVo);
		logger.info("상품 등록 결과, cnt={}", cnt);
		
		String msg="", url="/admin/product/productWrite.do";
		if(cnt>0) {
			msg="상품 등록되었습니다.";
		}else {
			msg="상품 등록 실패!";
		}
		
		model.addAttribute("msg", msg);
		model.addAttribute("url", url);
		
		return "common/message";
	}

	@RequestMapping("/productList.do")
	public String productList(@ModelAttribute EventProductVO searchVo,
			Model model) {
		logger.info("관리자 - 상품 목록, 파라미터 searchVo={}", searchVo);
		
		//[1] PaginationInfo
		PaginationInfo pagingInfo=new PaginationInfo();
		pagingInfo.setBlockSize(Utility.BLOCK_SIZE);
		pagingInfo.setCurrentPage(searchVo.getCurrentPage());
		pagingInfo.setRecordCountPerPage(Utility.RECORD_COUNT);
		
		//[2] SearchVO
		searchVo.setFirstRecordIndex(pagingInfo.getFirstRecordIndex());
		searchVo.setRecordCountPerPage(Utility.RECORD_COUNT);
				
		//db
		List<ProductVO> list=productService.selectProductAll(searchVo);
		logger.info("전체조회 결과, list.size={}", list.size());
		
		//totalRecord
		int totalRecord=productService.getTotalRecord(searchVo);
		logger.info("전체레코드 수 조회 결과, totalRecord={}", totalRecord);
		
		pagingInfo.setTotalRecord(totalRecord);
		
		model.addAttribute("list", list);
		model.addAttribute("pagingInfo", pagingInfo);
		
		return "admin/product/productList";
	}
	
	
	@RequestMapping("/deleteMulti.do")
	public String delMulti(@ModelAttribute ProductListVO pdListVo,
			HttpServletRequest request, Model model) {
		logger.info("선택한 상품 삭제, 파라미터 pdListVo={}", pdListVo);
		List<ProductVO> list=pdListVo.getPdItems();
		
		int cnt=productService.deleteMulti(list);
		logger.info("선택한 상품 삭제 결과, cnt={}", cnt);
		
		String msg="", url="/admin/product/productList.do";
		if(cnt>0) {
			//파일 삭제
			for(int i=0;i<list.size();i++) {
				ProductVO pdVo=list.get(i);
				int productNo=pdVo.getProductNo();
				
				logger.info("i={}, pdVo.productNo={}", i, pdVo.getProductNo());
				logger.info("pdVo.imageURL={}", pdVo.getImageURL());
				
				if(productNo!=0) {
					String path
					=fileUtil.getFilePath(request, FileUploadUtil.IMAGE_UPLOAD);
					
					File file
					=new File(path, pdVo.getImageURL());
					if(file.exists()) {
						boolean bool=file.delete();
						logger.info("이미지 삭제 여부 : {}", bool);
					}
				}
			}//for
			
			msg="선택한 상품들을 삭제하였습니다.";
		}else {
			msg="선택한 상품 삭제 중 문제가 발생했습니다.";
		}
		
		model.addAttribute("msg", msg);
		model.addAttribute("url", url);
		
		return "common/message";
	}
	
	@RequestMapping("/eventMulti.do")
	public String eventMulti(@ModelAttribute ProductListVO pdListVo,
			@RequestParam String eventSel, Model model) {
		logger.info("선택한 상품 이벤트로 등록, 파라미터 pdListVo={}", pdListVo);
		
		List<ProductVO> list=pdListVo.getPdItems();
		int cnt =eventProductService.insertEventProduct(list, eventSel);
		String msg="", url="/admin/product/productList.do";
		if(cnt>0) {
			msg="선택한 상품들을 해당 이벤트로 등록하였습니다.";
		}else {
			msg="선택한 상품들을 해당 이벤트로 등록하는 중 문제가 발생하였습니다.";
		}
		
		model.addAttribute("msg", msg);
		model.addAttribute("url", url);
		
		return "common/message";
	}
	
	
}



