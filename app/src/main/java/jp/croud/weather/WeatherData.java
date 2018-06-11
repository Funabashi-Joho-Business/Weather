package jp.croud.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown=true) //クラス定義に含まれていないものは読み飛ばす
class WeatherData{
	public Date publicTime;
	public String title;
	static class Description{
		public String text;
		public Date publicTime;
	}
	public Description description;

	static class Forecasts{
		public String dateLabel;
		public String telop;
		public Date date;
		static class Temperature{
			static class A {
				public int celsius;
				public double fahrenheit;
			}
			public A min;
			public A max;
		}
		public Temperature temperature;
		static class Image{
			public int width;
			public String url;
			public String title;
			public int height;
		}
		public Image image;

	}
	public Forecasts[] forecasts;

}