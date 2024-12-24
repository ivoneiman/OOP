package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

public class WallPostImpl implements WallPost {

		private String text;
		private int likes;
		private boolean featured;
		
		public WallPostImpl() {
			
		}
		
		public WallPostImpl (String text, int likes, boolean featured) {
			this.text = text;
			this.likes = likes;
			this.featured = featured;
		}
		
		public String getText() {
			return this.text;
		}
		
		public void setText(String text) {
			this.text = text;
		}
	
		public int getLikes() {
			return this.likes;
		}
		
		public void like() {
			this.likes+= 1;
		}
		
		public void dislike() {
			if (likes > 0) {
				this.likes--;
			}
		}
		
		public boolean isFeatured() {
			return featured;
		}
		
		public void toggleFeatured() {
			if (this.featured) {
				this.featured=false;
			}
			else {
				this.featured=true;
			}
		}
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
