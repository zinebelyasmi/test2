package helper;

import bean.Eleve;
import java.util.List;

import javafx.scene.control.TableView;

public class EleveFxHelper extends AbstractFxHelper<Eleve> {

    private static AbstractFxHelperItem[] titres;

    static {

        titres = new AbstractFxHelperItem[]{
            new AbstractFxHelperItem("ID","id"),
            new AbstractFxHelperItem("Nom", "nom"),
            new AbstractFxHelperItem("Prénom", "prenom"),
            new AbstractFxHelperItem("Age", "age"),
            new AbstractFxHelperItem("Genre", "genre"),};
    }

    public EleveFxHelper(TableView<Eleve> table, List<Eleve> list) {
        super(titres, table, list);
    }

    public EleveFxHelper(TableView<Eleve> table) {
        super(titres, table);
    }
    
      public EleveFxHelper(AbstractFxHelperItem[] abstractFxHelperItem, TableView<Eleve> table) {
        super(titres, table);
    }

}
