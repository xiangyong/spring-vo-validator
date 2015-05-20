package com.jd.jr.validator.service;

import com.jd.jr.validator.inteceptor.ParaValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * User: yangkuan@jd.com
 * Date: 15-4-14
 * Time: 下午6:55
 */
@Service("itemService")
public class ItemService {
    private static final Logger logger = LoggerFactory.getLogger(ItemService.class);
    @ParaValidator(validatorNames = {"itemUtilVoValidator","testValidator"})
    public void save(ItemFullVo1 itemFullVo){
        logger.info("-------------------------");
    }
}
