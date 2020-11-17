package com.xworkz.collectionconcept.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class EditorTester {

	public static void main(String[] args) {
		
		//Remove VisualStudio from ArrayList
		
		Editor notepad = new Editor("Notepad", 50, "Editing txt file");
		Editor eclipse = new Editor("eclipse", 500, "Develop programs");
//		Editor visualstudio =  new Editor("VisualStudio", 400, "UI development");
		
		ArrayList<Editor> editorAL = new ArrayList<Editor>();
		
		editorAL.add(notepad);
		editorAL.add(new Editor("Notepad++", 63, "Edit all kind of text files"));
		editorAL.add(eclipse);
		editorAL.add(new Editor("VisualStudio", 400, "UI development"));
		
//		editorAL.remove(visualstudio);
		
//		for(Editor e : editorAL) {
//			Editor editor = e;
//			String name = editor.getName();
//			if(name.equals("VisualStudio")) {
//				//remove
//				editorAL.remove(e);
//			}
//		}
		System.out.println("Editors are: ");
		
		Iterator<Editor> itr = editorAL.iterator();
		while(itr.hasNext()) {
			Editor edr = itr.next();
			System.out.println(edr);
			if(edr.getName().equals("VisualStudio")) {
				itr.remove();
				System.out.println("Removed :"+ edr.getName());
			}
		}
		
		System.out.println("Final Editor List: ");
		System.out.println(editorAL);
		
		System.out.println("Iterating using List Iterator:");
		ListIterator<Editor> lsitr = editorAL.listIterator();
		
		while(lsitr.hasNext()) {
			Editor edr = lsitr.next();
			System.out.println(edr);
		}
		System.out.println("======================");
		while(lsitr.hasPrevious()) {
			Editor edr = lsitr.previous();
			System.out.println(edr);
		}
		
		
	}
}
