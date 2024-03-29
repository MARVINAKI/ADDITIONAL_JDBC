package model;

import lombok.*;
import org.apache.commons.lang3.RandomStringUtils;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class City {
	private String id;
	private String cityName;

	public City(String cityName) {
		this.id = RandomStringUtils.randomAlphabetic(9);
		this.cityName = cityName;
	}
}
