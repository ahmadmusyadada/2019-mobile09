package id.ac.polinema.recyclerviewsangatsederhana.models;

import android.graphics.Bitmap;

public class SuperHero {
    public String heroName;
    public int image;

    public SuperHero(String heroName, int image) {
        this.heroName = heroName;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}
