package com.springdi.di;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;

public class LoggingDAOAspect {

	private Log log = LogFactory.getLog(getClass());
	
	public void before(JoinPoint joinPoint) {
		log.info("[기록 시작 target="+ joinPoint.getTarget()+"]");
		log.info("메서드="+ joinPoint.getSignature().getName());
		
		Object[] argsArr=joinPoint.getArgs();
		for(int i=0;i<argsArr.length;i++) {
			log.info(i+"번째 매개변수="+ argsArr[i]);
		}		
	}
	
	public void afterReturning(JoinPoint joinPoint) {
		log.info("[기록 종료 target="+ joinPoint.getTarget()+"]");
	}
	
	public void afterError(JoinPoint joinPoint) {
		log.info("DAO error : joinPoint="+joinPoint);
		
		Object[] arr =joinPoint.getArgs();
		for(int i=0;i<arr.length;i++) {
			log.info("DAO error-매개변수:"+ arr[i]);
		}
		
	}
	
	
}
