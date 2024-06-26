package dev.nipafx.ginevra.render;

import dev.nipafx.ginevra.html.Classes;
import dev.nipafx.ginevra.html.Element;
import dev.nipafx.ginevra.html.Heading;
import dev.nipafx.ginevra.html.Id;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static dev.nipafx.ginevra.html.HtmlElement.h1;
import static dev.nipafx.ginevra.render.HtmlRendererTest.RENDERER;
import static org.assertj.core.api.Assertions.assertThat;

class HeadingRendererTest {

	private static final String TAG = "h1";

	@Nested
	class Levels {

		@Test
		void h1() {
			var rendered = RENDERER.render(h1);
			assertThat(rendered).isEqualTo("<h1></h1>\n");
		}

		@Test
		void h2() {
			var rendered = RENDERER.render(h1);
			assertThat(rendered).isEqualTo("<h1></h1>\n");
		}

		@Test
		void h3() {
			var rendered = RENDERER.render(h1);
			assertThat(rendered).isEqualTo("<h1></h1>\n");
		}

		@Test
		void h4() {
			var rendered = RENDERER.render(h1);
			assertThat(rendered).isEqualTo("<h1></h1>\n");
		}

		@Test
		void h5() {
			var rendered = RENDERER.render(h1);
			assertThat(rendered).isEqualTo("<h1></h1>\n");
		}

		@Test
		void h6() {
			var rendered = RENDERER.render(h1);
			assertThat(rendered).isEqualTo("<h1></h1>\n");
		}

	}

	static class TestBasics implements HtmlRendererTest.TestBasics {

		@Override
		public String tag() {
			return TAG;
		}

	}

	@Nested
	class IdAndClasses extends TestBasics implements HtmlRendererTest.IdAndClasses<Heading> {

		@Override
		public Heading createWith(Id id, Classes classes) {
			return h1.id(id).classes( classes);
		}

	}

	@Nested
	class EmbeddedText extends TestBasics implements HtmlRendererTest.EmbeddedText<Heading> {

		@Override
		public Heading createWith(String text, Element... children) {
			return h1.text(text).children(children);
		}

	}

	@Nested
	class Children extends TestBasics implements HtmlRendererTest.Children<Heading> {

		@Override
		public Heading createWith(Element... children) {
			return h1.children(children);
		}

	}

}