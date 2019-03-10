package com.test.asus.gdwiki.presenterer;

import android.content.Context;
import com.test.asus.gdwiki.modeler.model;
import com.test.asus.gdwiki.viewer.view;
import com.test.asus.gdwiki.R;
import java.util.ArrayList;
import java.util.List;

public class presenter {

    Context context;
    List<model> filmModels = new ArrayList<>();
    view viewer;
    public presenter(view view, Context context){
        this.viewer = view;
        this.context = context;
    }

    public void setData(){
        model film;

        film= new model("Gundam Char Counterattack",R.drawable.cc,"Mobile Suit Gundam: Char's Counterattack (機動戦士ガンダム 逆襲のシャア, Kidō Senshi Gandamu: Gyakushū no Shā) is an anime movie set in the primary Universal Century timeline of Gundam, taking place in UC 0093.");
        filmModels.add(film);
        film = new model("Gundam F91",R.drawable.fgo,"Mobile Suit Gundam F91 (機動戦士ガンダム Ｆ91 Kidō Senshi Gandamu Effu Kujūichi?) is a 1991 Japanese animated film. It was Gundam creator Yoshiyuki Tomino's attempt to launch a new Gundam saga, set thirty years after Char's Counterattack.");
        filmModels.add(film);
        film = new model("Gundam NT",R.drawable.nt,"Mobile Suit Gundam Narrative (機動戦士ガンダムＮＴナラティブ Kidō Senshi Gandamu Naratibu?) is an anime film that takes place a year after the events of Mobile Suit Gundam Unicorn.");
        filmModels.add(film);
        film = new model("Gundam Unicorn",R.drawable.unicorn,"Mobile Suit Gundam Unicorn (機動戦士ガンダム UC(ユニコーン) Kidō Senshi Gandamu Yunikōn?) is 2010 theatrical OVA series based on the novel series of the same name written by Japanese author Harutoshi Fukui, with character and mechanical designs provided by Yoshikazu Yasuhiko and Hajime Katoki, respectively, and music by Hiroyuki Sawano.");
        filmModels.add(film);
        film = new model("Gundam Stardust Memory",R.drawable.stardust,"Mobile Suit Gundam 0083: Stardust Memory (機動戦士ガンダム0083 STARDUST MEMORY Kidō Senshi Gandamu 0083 Stardust Memory?) is a 13-episode OVA series set in the Gundam's Early-Universal Century timeline. The characters were designed by Toshihiro Kawamoto. The series serves as a sequel to Mobile Suit Gundam and a prequel to the events of Mobile Suit Zeta Gundam.");
        filmModels.add(film);


        viewer.onSucsess(filmModels);
    }

}
