package biz.r2s.util;

import java.lang.reflect.InvocationTargetException;

import com.google.appengine.api.datastore.Key;

public class CommonsUtil {

	public static Key getIdByObjeto(Object obj){
		try {
			return (Key)obj.getClass().getMethod("getId").invoke(obj);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public static Object newObjeto(Class classe) {
		try {
			return classe.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return classe;
	}
}
