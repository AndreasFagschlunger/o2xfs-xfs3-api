package at.o2xfs.xfs.v3.util;

import java.util.LinkedHashMap;
import java.util.Map;

public final class MapUtil {

	private MapUtil() {
		throw new AssertionError();
	}

	public static <T> Map<T, T> of(T... entries) {
		Map<T, T> result = new LinkedHashMap<>();
		for (int i = 0; i < entries.length; i++) {
			T key = entries[i++];
			T value = i < entries.length ? entries[i] : null;
			result.put(key, value);
		}
		return result;
	}
}
