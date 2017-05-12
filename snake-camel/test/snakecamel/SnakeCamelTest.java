package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelcaseでabcのキャメルケースが取得できる() {
		String expected="Abc";
		String actual=SnakeCamelUtil.snakeToCamelcase("abc");
		assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcaseでabc_defのキャメルケースが取得できる() {
		String expected="AbcDef";
		String actual=SnakeCamelUtil.snakeToCamelcase("abc_def");
		assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcaseでabc_def_ghのキャメルケースが取得できる() {
		String expected="AbcDefGh";
		String actual=SnakeCamelUtil.snakeToCamelcase("abc_def_gh");
		assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcaseでabc__def__ghのキャメルケースが取得できる() {
		String expected="AbcDefGh";
		String actual=SnakeCamelUtil.snakeToCamelcase("abc__def__gh");
		assertThat(actual,is(expected));
	}
	@Test
	public void snakeToCamelcaseで_abc_def__のキャメルケースが取得できる() {
		String expected="AbcDef";
		String actual=SnakeCamelUtil.snakeToCamelcase("_abc_def__");
		assertThat(actual,is(expected));
	}
	@Test
	public void camelToSnakecaseでAbcのスネークケースが取得できる() {
		String expected="abc";
		String actual=SnakeCamelUtil.camelToSnakecase("Abc");
		assertThat(actual,is(expected));
	}
	@Test
	public void camelToSnakecaseでAbcDefのスネークケースが取得できる() {
		String expected="abc_def";
		String actual=SnakeCamelUtil.camelToSnakecase("AbcDef");
		assertThat(actual,is(expected));
	}
	@Test
	public void camelToSnakecaseでAbcDefGhのスネークケースが取得できる() {
		String expected="abc_def_gh";
		String actual=SnakeCamelUtil.camelToSnakecase("AbcDefGh");
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
		String expected="Xyz";
		String actual=SnakeCamelUtil.capitalize("xyz");
		assertThat(actual,is(expected));
	}
	@Test
	public void capitalizeで引数が空文字の場合空文字が返される() {
		String expected="";
		String actual=SnakeCamelUtil.capitalize("");
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
		String expected="abc";
		String actual=SnakeCamelUtil.uncapitalize("Abc");
		assertThat(actual,is(expected));
	}
	@Test
	public void uncapitalizeで引数が空文字の場合空文字が返される() {
		String expected="";
		String actual=SnakeCamelUtil.uncapitalize("");
		assertThat(actual,is(expected));
	}
}
