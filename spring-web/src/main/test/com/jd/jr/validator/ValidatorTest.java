package com.jd.jr.validator;


import com.jd.jr.validator.service.CheckService;
import com.jd.jr.validator.service.ItemFullVo1;
import com.jd.jr.validator.service.ItemService;
import com.jd.jr.validator.springbean.ValidatorBean;
import com.jd.jr.validator.vo.ItemFullVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class) //
@ContextConfiguration({"/spring-config.xml"}) //
public class ValidatorTest {
 /*   @Autowired
    ValidatorBean nameValidator;*/
    @Autowired
    CheckService checkService;
    @Test
    public   void testValidator() throws IllegalAccessException {

        ItemFullVo1 itemFullVo = new ItemFullVo1();
        itemFullVo.setItemCode("12d3");
        itemFullVo.setSkuId("234");
        ApplicationContext ac1 = new ClassPathXmlApplicationContext("/spring-config.xml");
        ValidatorBean validatorBean = (ValidatorBean)ac1.getBean("itemUtilVoValidator");
        checkService.check(itemFullVo,validatorBean);

        WebApplicationContext cc = ContextLoader.getCurrentWebApplicationContext();
       // cc.getBean();
    }

    @Autowired
    ItemService itemService;
    @Test
    public   void testInteceptorValidator(){
        ItemFullVo1 itemFullVo = new ItemFullVo1();
        itemFullVo.setItemCode("12d3");
        itemFullVo.setSkuId("23");
        itemService.save(itemFullVo);
    }

    @Test
    public   void test1() throws IllegalAccessException {

        ApplicationContext ac1 = new ClassPathXmlApplicationContext("/spring-config.xml");

        CheckService testService=   ac1.getBean(CheckService.class);

    }
}
