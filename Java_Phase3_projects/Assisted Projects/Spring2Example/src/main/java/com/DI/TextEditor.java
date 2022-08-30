package com.DI;

public class TextEditor {
	//Dependency
		private SpellChecker sp;

		public TextEditor(){
		
		}

		public SpellChecker getSp() {
			return sp;
		}

		public void setSp(SpellChecker sp) {
			this.sp = sp;
		}
		
		public void spellCheck() {
			sp.checkSpelling();

}
}