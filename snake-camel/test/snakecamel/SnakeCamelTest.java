package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelcaseでa_aのキャメルケースが取得できる() {
		String expected="AA";
		String actual=SnakeCamelUtil.snakeToCamelcase("a_a");
		assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcaseでab_abのキャメルケースが取得できる() {
		String expected="AbAb";
		String actual=SnakeCamelUtil.snakeToCamelcase("ab_ab");
		assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcaseでab_ab_abのキャメルケースが取得できる() {
		String expected="AbAbAb";
		String actual=SnakeCamelUtil.snakeToCamelcase("ab_ab_ab");
		assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcaseで_a_aのキャメルケースが取得できる() {
		String expected="AA";
		String actual=SnakeCamelUtil.snakeToCamelcase("_a_a");
		assertThat(actual,is(expected));
	}
	@Test
	public void camelToSnakecaseでAbAbのスネークケースが取得できる() {
		String expected="ab_ab";
		String actual=SnakeCamelUtil.camelToSnakecase("AbAb");
		assertThat(actual,is(expected));
	}
	@Test
	public void camelToSnakecaseでAbAbAbのスネークケースが取得できる() {
		String expected="ab_ab_ab";
		String actual=SnakeCamelUtil.camelToSnakecase("AbAbAb");
		assertThat(actual,is(expected));
	}
	@Test
	public void capitalizeでaの頭文字を大文字にした文字列が取得できる() {
		String expected="A";
		String actual=SnakeCamelUtil.capitalize("a");
		assertThat(actual,is(expected));
	}
	@Test
	public void capitalizeでabの頭文字を大文字にした文字列が取得できる() {
		String expected="Ab";
		String actual=SnakeCamelUtil.capitalize("ab");
		assertThat(actual,is(expected));
	}
	@Test
	public void uncapitalizeでAの頭文字を小文字にした文字列が取得できる() {
		String expected="a";
		String actual=SnakeCamelUtil.uncapitalize("A");
		assertThat(actual,is(expected));
	}
	@Test
	public void uncapitalizeでAbの頭文字を小文字にした文字列が取得できる() {
		String expected="ab";
		String actual=SnakeCamelUtil.uncapitalize("Ab");
		assertThat(actual,is(expected));
	}
}
