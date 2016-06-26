package biz.r2s.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Scope("singleton")
@Transactional(propagation = Propagation.SUPPORTS)
@Component
public class SpringBeansFactory implements ApplicationContextAware {
	private static ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		SpringBeansFactory.applicationContext = applicationContext;
	}

	public static Object getBean(String beanName) throws BeansException {
		return SpringBeansFactory.applicationContext.getBean(beanName);
	}

	public static <T> T getBean(Class<T> classe) throws BeansException {
		return SpringBeansFactory.applicationContext.getBean(classe);
	}

}
